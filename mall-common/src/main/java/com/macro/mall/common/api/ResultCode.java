package com.macro.mall.common.api;

/**
 * 鏋氫妇浜嗕竴浜涘父鐢ˋPI鎿嶄綔鐮�
 * Created by macro on 2019/4/19.
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "鎿嶄綔鎴愬姛"),
    FAILED(500, "鎿嶄綔澶辫触"),
    VALIDATE_FAILED(404, "鍙傛暟妫�楠屽け璐�"),
    UNAUTHORIZED(401, "鏆傛湭鐧诲綍鎴杢oken宸茬粡杩囨湡"),
    FORBIDDEN(403, "娌℃湁鐩稿叧鏉冮檺");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
