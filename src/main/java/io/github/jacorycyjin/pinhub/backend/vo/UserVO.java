package io.github.jacorycyjin.pinhub.backend.vo;

import io.github.jacorycyjin.pinhub.backend.dto.UserDTO;
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

public class UserVO {

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
     * 从DTO转换为VO
     * @param userDTO
     * @return
     */
    public static UserVO fromDTO(UserDTO userDTO) {
        return new UserVO(userDTO.getUserId(), userDTO.getNickname(), userDTO.getAvatarUrl(), userDTO.getStatus(), userDTO.getCtime(), userDTO.getMtime());
    }
}
