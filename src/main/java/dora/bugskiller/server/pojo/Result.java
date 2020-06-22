package dora.bugskiller.server.pojo;

import java.io.Serializable;

/**
 * 前后端交互数据标准。
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功标志。
     */
    private boolean ok;

    /**
     * 返回代码。
     */
    private Integer code;

    /**
     * 失败消息。
     */
    private String msg;

    /**
     * 时间戳。
     */
    private long timestamp = System.currentTimeMillis();

    /**
     * 结果对象。
     */
    private T result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

