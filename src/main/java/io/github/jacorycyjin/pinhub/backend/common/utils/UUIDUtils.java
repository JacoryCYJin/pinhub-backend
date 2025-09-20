package io.github.jacorycyjin.pinhub.backend.common.utils;

import java.util.UUID;

/**
 * UUID工具类
 * 
 * @author Jacoryjin
 * @date 2025/9/20
 */

public class UUIDUtils {

    /**
     * 生成UUID
     * 
     * @return
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
