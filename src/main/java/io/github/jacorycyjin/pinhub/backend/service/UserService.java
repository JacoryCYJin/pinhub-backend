package io.github.jacorycyjin.pinhub.backend.service;

import io.github.jacorycyjin.pinhub.backend.dto.UserDTO;

/**
 * @author Jacoryjin
 * @date 2025/9/20
 */

public interface UserService {

    UserDTO findUser(String userId);
}
