package io.github.jacorycyjin.pinhub.backend.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import io.github.jacorycyjin.pinhub.backend.mapper.UserMapper;
import io.github.jacorycyjin.pinhub.backend.po.UserPO;
import io.github.jacorycyjin.pinhub.backend.dto.UserDTO;
import io.github.jacorycyjin.pinhub.backend.service.UserService;

/**
 * @author Jacoryjin
 * @date 2025/9/20
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDTO findUser(String userId) {
        UserPO userPO = userMapper.findUser(userId);
        return UserDTO.fromPO(userPO);
    }
}
