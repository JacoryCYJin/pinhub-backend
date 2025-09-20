package io.github.jacorycyjin.pinhub.backend.common.enums;

/**
 * 用户认证类型枚举
 * 
 * @author Jacory
 * @date 2025/9/20
 */
public enum UserAuthEnum {

    /**
     * 微信登录
     */
    WECHAT(1, "微信"),

    /**
     * 手机号登录
     */
    PHONE(2, "手机号"),

    /**
     * 邮箱登录
     */
    EMAIL(3, "邮箱");

    private final Integer code;
    private final String desc;

    UserAuthEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 根据code获取枚举
     */
    public static UserAuthEnum getByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (UserAuthEnum authEnum : values()) {
            if (authEnum.getCode().equals(code)) {
                return authEnum;
            }
        }
        return null;
    }
}
