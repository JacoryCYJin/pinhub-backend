package io.github.jacorycyjin.pinhub.backend.dto;

import io.github.jacorycyjin.pinhub.backend.po.UserPO;
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

public class UserDTO {

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
     * 创建时间
     */
    private LocalDateTime ctime;

    /**
     * 更新时间
     */
    private LocalDateTime mtime;

    /**
     * 从PO转换为DTO
     * 
     * @param userPO
     * @return
     */
    public static UserDTO fromPO(UserPO userPO) {
        if (userPO == null) {
            return null;
        }
        return new UserDTO(userPO.getUserId(), userPO.getNickname(), userPO.getAvatarUrl(), userPO.getStatus(),
                userPO.getCtime(), userPO.getMtime());
    }

    /**
     * 从DTO转换为PO
     * 
     * @param userDTO
     * @return
     */
    public static UserPO toPO(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        return new UserPO(null, userDTO.getUserId(), userDTO.getNickname(), userDTO.getAvatarUrl(), userDTO.getStatus(),
                0, userDTO.getCtime(), userDTO.getMtime());
    }

}
