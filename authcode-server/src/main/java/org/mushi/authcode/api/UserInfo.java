package org.mushi.authcode.api;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author mushishi
 * @Date 2019/7/23-10:05
 */
@Data
public class UserInfo implements Serializable {


    private String username;

    private String password;

    private String name;

    private String email;

}
