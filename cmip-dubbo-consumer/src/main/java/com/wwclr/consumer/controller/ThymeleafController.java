package com.wwclr.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.wwclr.api.bean.BusDrugDetailBean;
import com.wwclr.api.bean.BusMemberBean;
import com.wwclr.api.bean.BusUserBean;
import com.wwclr.api.bean.DrugPostRecordBean;
import com.wwclr.api.service.BusDrugDetailInterface;
import com.wwclr.api.service.BusMembersInterface;
import com.wwclr.api.service.BusUserInterface;
import com.wwclr.api.service.DrugPostRecordInterface;
import com.wwclr.consumer.entity.Student;
import com.wwclr.consumer.utils.BaseService;
import com.wwclr.consumer.utils.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangwu on 2019/3/12.
 */
@Controller
@RequestMapping("/th")
public class ThymeleafController extends BaseService{
        private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

        @Reference
        BusUserInterface busUserInterface;
        @Reference
        DrugPostRecordInterface drugPostRecordInterface;
        @Reference
        BusDrugDetailInterface busDrugDetailInterface;
        @Reference
        BusMembersInterface busMembersInterface;

        @Autowired
        private StringRedisTemplate redisTemplate;

//        @RequestMapping("/student")
//        public String student(ModelMap modelMap){
//                modelMap.addAttribute("name","wangwu");
//                Student student=new Student("123","supermanager",18,new Date());
//                Student student1=new Student("456","wang6",28,new Date());
//                Student student2=new Student("789","wang7",38,new Date());
//                student.setDes("<h1 style='color: green'>hello everyone</h1>");
//                List<Student>  list = new ArrayList<Student>();
//                list.add(student);
//                list.add(student1);
//                list.add(student2);
//                modelMap.addAttribute("studentList",list);
//                modelMap.addAttribute("student",student);
//                return "thymeleaf/student";
//        }

        /**
         * 进入主页
         */
        @RequestMapping("/index")
        public Object index(BusUserBean busUserBean){
                ModelAndView modelAndView=new ModelAndView();
                try {
                        if(!StringUtils.isEmpty(busUserBean.getUserName())){
                                        if(redisTemplate.hasKey(busUserBean.getUserName())){
                                                redisTemplate.delete(busUserBean.getUserName());
                                        }
                        }
                        List<DrugPostRecordBean> drugPostRecordBeanList=drugPostRecordInterface.findTopThreeRecord();
                        List<BusDrugDetailBean> busDrugDetailBeanList=busDrugDetailInterface.findAllBusDrug();
                        modelAndView.addObject("drugPostRecordBeanList",drugPostRecordBeanList);
                        modelAndView.addObject("busDrugDetailBeanList",busDrugDetailBeanList);
                        modelAndView.setViewName("thymeleaf/index");
//                        LOGGER.info("ThymeleafController  index  bean={}", JSONObject.toJSON(bean));
                }catch (Exception e){
                        e.printStackTrace();
                }
             return  modelAndView;
        }



//        /**
//         * 注册
//         */
//        @RequestMapping("/register")
//        @ResponseBody
//        public Object register(BusUserBean busUserBean){
//                try{
//                        ModelAndView modelAndView=new ModelAndView();
//                        Integer successSave=busUserInterface.saveUser(busUserBean);
//                        LOGGER.info("ThymeleafController  register  {}", JSONObject.toJSON(successSave));
//                        return new Integer(1).equals(successSave)?true:false;
////                        modelAndView.addObject("user",bean);
////                        modelAndView.setViewName("thymeleaf/index");
////                        return bean;
//                }catch (Exception e){
//                        e.printStackTrace();
//                }
//                return null;
//        }

        /**
         * 注册成功跳转到提醒页
         */
        @RequestMapping("/registerPage")
        public Object registerPage(BusUserBean busUserBean){
                try{
                        ModelAndView modelAndView=new ModelAndView();
                        BusUserBean busUserBean1=busUserInterface.findUserByUserName(busUserBean);
                        if(!StringUtils.isEmpty(busUserBean1)){
                                modelAndView.addObject("registerStatus",0);
                                modelAndView.addObject("message","该用户名已存在，请返回重新输入");
                        }else {
                                busUserBean.setUserId(getUserId());
                                busUserBean.setRole(0);//非会员角色
                                busUserBean.setCreateTime(new Date());
                                busUserBean.setLogicalDeleted(true);
                                busUserInterface.saveUser(busUserBean);
                                modelAndView.addObject("registerStatus",1);
                                modelAndView.addObject("message","注册成功");
                        }
//                        LOGGER.info("ThymeleafController  registerPage  {}", JSONObject.toJSON(successSave));
                        modelAndView.setViewName("thymeleaf/registerPage");
                        return modelAndView;
                }catch (Exception e){
                        e.printStackTrace();
                }
                return null;
        }



        /**
         * 登陆验证账号密码
         */
        @RequestMapping("/login")
        @ResponseBody
        public Object login(BusUserBean busUserBean){
                try{
                        ModelAndView modelAndView=new ModelAndView();
                        BusUserBean bean=busUserInterface.findUserByUserNameAndPassWord(busUserBean);
                        if(StringUtils.isEmpty(bean)){
                                modelAndView.addObject("user",false);
//                        modelAndView.setViewName("thymeleaf/index");
                                return "账号或密码错误";
                        }
//                        modelAndView.addObject("user",bean);
//                        modelAndView.setViewName("thymeleaf/index");
                        LOGGER.info("ThymeleafController  login  bean={}", JSONObject.toJSON(bean));
                        return bean;
                }catch (Exception e){
                        e.printStackTrace();
                }
              return null;
        }

        /**
         * 登陆成功跳转主页
         */
        @RequestMapping("/loginForIndex")
        public Object loginForIndex(BusUserBean busUserBean){
                ModelAndView modelAndView=new ModelAndView();
                try{
                        BusUserBean bean=busUserInterface.findUserByUserNameAndPassWord(busUserBean);
                        BusMemberBean busMemberBean=new BusMemberBean();
                        busMemberBean.setUserId(bean.getUserId());
                        busMemberBean=busMembersInterface.findMemberByUserId(busMemberBean);
                        List<DrugPostRecordBean> drugPostRecordBeanList=drugPostRecordInterface.findTopThreeRecord();
                        List<BusDrugDetailBean> busDrugDetailBeanList=busDrugDetailInterface.findAllBusDrug();
                        modelAndView.addObject("user",bean);
                        modelAndView.addObject("busMemberBean",busMemberBean);
                        modelAndView.addObject("drugPostRecordBeanList",drugPostRecordBeanList);
                        modelAndView.addObject("busDrugDetailBeanList",busDrugDetailBeanList);
                        modelAndView.setViewName("thymeleaf/index");
                        LOGGER.info("ThymeleafController  loginForIndex  bean={}", JSONObject.toJSON(bean));
                }catch (Exception e){
                        e.printStackTrace();
                }
                return modelAndView;
        }

        /**
         //         * 生成userId--日期+随机4位字符串
         //         */
        public String getUserId(){
                Date nowDate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                // 生成文件名
                return  sdf.format(nowDate) + HttpUtil.getRandomStringByLength(4);
        }


}
