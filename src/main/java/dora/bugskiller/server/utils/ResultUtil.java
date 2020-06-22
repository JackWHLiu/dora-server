package dora.bugskiller.server.utils;

import dora.bugskiller.server.pojo.Result;

public class ResultUtil<T> {

    private Result<T> result;

    public ResultUtil() {
        result = new Result<>();
        result.setOk(true);
        result.setMsg("success");
        result.setCode(200);
    }

    public Result<T> setData(T t) {
        this.result.setCode(200);
        this.result.setResult(t);
        return this.result;
    }

    public Result<T> setData(T t, String msg) {
        this.result.setResult(t);
        this.result.setMsg(msg);
        this.result.setCode(200);
        return this.result;
    }

    public Result<T> setErrorMsg(String msg) {
        this.result.setOk(false);
        this.result.setMsg(msg);
        this.result.setCode(500);
        return this.result;
    }

    public Result<T> setErrorMsg(Integer code, String msg) {
        this.result.setOk(false);
        this.result.setCode(code);
        this.result.setMsg(msg);
        return this.result;
    }
}

