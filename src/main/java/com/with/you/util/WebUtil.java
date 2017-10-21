package com.with.you.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Controller 返回值 封装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebUtil <T> {
    private int code;
    private String msg;
    private T data;

    public static WebUtil success() {
        return success(null);
    }

    public static <T>  WebUtil success(T data) {
        return new WebUtil(200, "success", data);
    }

    public static <T>  WebUtil fail(T data) {
        return new WebUtil(200, "fail", data);
    }

}
