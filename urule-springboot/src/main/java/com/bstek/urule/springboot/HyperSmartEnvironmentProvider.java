package com.bstek.urule.springboot;

import com.bstek.urule.console.DefaultUser;
import com.bstek.urule.console.EnvironmentProvider;
import com.bstek.urule.console.User;
import com.bstek.urule.console.servlet.RequestContext;
import com.einwin.framework.model.UserInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//import com.einwin.auth.client.AuthClient;

/**
 * User: kevin.jiang
 * QQ: 861383731
 * Date: 2017/12/13
 * Time: 11:19
 */

@Component
public class HyperSmartEnvironmentProvider implements EnvironmentProvider {
    @Override
    public User getLoginUser(RequestContext context) {

        String userId = context.getRequest().getHeader(UserInfo.KEY_ID);
        String userName = context.getRequest().getHeader(UserInfo.KEY_USERNAME);
        String corpCode = context.getRequest().getHeader(UserInfo.KEY_CORPCODE);
        System.out.println("========================================== userId : " + userId);
        System.out.println("========================================== userName : " + userName);
        System.out.println("========================================== corpCode : " + corpCode);

        /**
        如果用戶有权限访问当前的菜单，则设置为管理员？？  好像没有必要呢
         */
        DefaultUser user=new DefaultUser();
        user.setCompanyId(corpCode);
        user.setUsername(userName);
        user.setAdmin(true);
        return user;

    }
    @Override
    public List<User> getUsers() {
        DefaultUser user1=new DefaultUser();
        user1.setCompanyId("hypersmart");
        user1.setUsername("user1");
        user1.setAdmin(true);
        DefaultUser user2=new DefaultUser();
        user2.setCompanyId("bstek");
        user2.setUsername("user2");
        DefaultUser user3=new DefaultUser();
        user3.setCompanyId("hypersmart");
        user3.setUsername("user3");
        List<User> users=new ArrayList<User>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
        return users;
    }
}