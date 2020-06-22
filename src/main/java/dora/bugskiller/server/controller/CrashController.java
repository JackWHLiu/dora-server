package dora.bugskiller.server.controller;

import dora.bugskiller.server.pojo.CrashInfo;
import dora.bugskiller.server.pojo.Result;
import dora.bugskiller.server.service.CrashService;
import dora.bugskiller.server.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Api(tags = "crash", description = "Crash模块")
public class CrashController {

    @Autowired
    CrashService crashService;

    @ApiOperation("保存客户端的崩溃信息")
    @RequestMapping(value = "/saveCrashInfo", method = RequestMethod.POST)
    public Result<String> saveCrashInfo(CrashInfo crashInfo) {
        try {
            crashService.saveCrashInfo(crashInfo);
            return new ResultUtil<String>().setData("保存成功！");
        } catch (Exception e) {
            return new ResultUtil<String>().setErrorMsg(e.getMessage());
        }
    }

    @ApiOperation("获取客户端的最新崩溃信息")
    @RequestMapping(value = "/latestCrash", method = RequestMethod.GET)
    public Result<CrashInfo> latestCrash() {
        return new ResultUtil<CrashInfo>().setData(crashService.getLatestCrashInfo());
    }

    @ApiOperation("获取客户端的所有崩溃信息")
    @RequestMapping(value = "/crash", method = RequestMethod.GET)
    public Result<List<CrashInfo>> crash() {
        return new ResultUtil<List<CrashInfo>>().setData(crashService.getCrashInfos());
    }
}
