package io.github.jacorycyjin.pinhub.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.jacorycyjin.pinhub.backend.common.http.Result;
import io.github.jacorycyjin.pinhub.backend.dto.UserDTO;
import io.github.jacorycyjin.pinhub.backend.vo.UserVO;
import jakarta.annotation.Resource;
import io.github.jacorycyjin.pinhub.backend.service.UserService;

/**
 * @author Jacoryjin
 * @date 2025/9/20
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/find")
    public Result<UserVO> findUser(@RequestParam String userId) {
        UserDTO userDTO = userService.findUser(userId);
        return Result.success(UserVO.fromDTO(userDTO));
    }
}
