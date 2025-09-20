package io.github.jacorycyjin.pinhub.backend.mapper;

import io.github.jacorycyjin.pinhub.backend.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Jacory
 * @date 2025/9/20
 */

@Mapper
public interface UserMapper {

    UserPO findUser(String userId);
}
