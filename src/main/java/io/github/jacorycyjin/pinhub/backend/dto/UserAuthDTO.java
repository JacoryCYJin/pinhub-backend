package io.github.jacorycyjin.pinhub.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jacoryjin
 * @date 2025/9/20
 */

@AllArgsConstructor
@Data
@NoArgsConstructor

public class UserAuthDTO {

    /**
     * 认证UUID，全球唯一标识
     */
    private String userAuthId;

    /**
     * 关联的用户ID
     */
    private Long userId;

    /**
     * 登录类型: 1=微信, 2=手机号, 3=邮箱
     */
    private Integer identityType;

    /**
     * 登录标识: openid/手机号/邮箱
     */
    private String identifier;

    /**
     * 凭证: 微信可为空，手机号/邮箱存密码Hash
     */
    private String credential;

}
