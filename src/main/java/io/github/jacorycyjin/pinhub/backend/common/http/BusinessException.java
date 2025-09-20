package io.github.jacorycyjin.pinhub.backend.common.http;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务异常类
 * 
 * @author Jacoryjin
 * @date 2025/9/20
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 构造函数
     * 
     * @param errorCode
     * @param message
     */
    public BusinessException(Integer errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * 构造函数
     * 
     * @param errorCode
     * @param message
     * @param cause
     */
    public BusinessException(Integer errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }
}
