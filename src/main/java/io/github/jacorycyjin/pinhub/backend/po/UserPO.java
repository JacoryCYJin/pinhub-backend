package io.github.jacorycyjin.pinhub.backend.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Jacoryjin
 * @date 2025/9/20
 */

@AllArgsConstructor
@Data
@NoArgsConstructor

public class UserPO {

    /**
     * 用户ID，自增主键
     */
    private Long id;

    /**
     * 用户UUID，全球唯一标识
     */
    private String userId;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 头像URL
     */
    private String avatarUrl;

    /**
     * 用户状态：1=正常，0=禁用
     */
    private Integer status;

    /**
     * 是否删除：0=未删除，1=已删除
     */
    private Integer deleted;

    /**
     * 注册时间
     */
    private LocalDateTime ctime;

    /**
     * 更新时间
     */
    private LocalDateTime mtime;
}
