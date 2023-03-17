package com.smart.anno;

import org.springframework.stereotype.Component;

/**
 * @Author ws
 * @create 2023/3/16 15:26
 * @Description
 */
//以下注解等同于<bean id="userDao" class="com.smart.anno.UserDao"/>
@Component("userDao")
public class UserDao {
}
