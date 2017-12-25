package com.hypersmart.service;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: kevin.jiang
 * QQ: 861383731
 * Date: 2017/12/20
 * Time: 10:28
 */

@Service("houseOwnerService")
public class HouseOwnerService {

    @ExposeAction("打印房产业主生日")
    public void printContent(String username,Date birthday){
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(birthday!=null){
            System.out.println(username+"今年已经"+sd.format(birthday)+"岁了!");
        }else{
            System.out.println("Hello "+username+"");
        }
    }

    @ActionId("sayHello")
    public String sayHello(String username){
        System.out.println("hello "+username);
        return "hello"+username;
    }

}