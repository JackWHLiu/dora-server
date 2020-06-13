package dora.bugskiller.console.controller;

import dora.bugskiller.console.pojo.CrashInfo;
import dora.bugskiller.console.pojo.Result;
import dora.bugskiller.console.service.CrashService;
import dora.bugskiller.console.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@Api(tags = "crash", description = "Crash模块")
public class CrashController {

    @Autowired
    CrashService crashService;

    @ApiOperation("保存客户端的崩溃信息")
    @RequestMapping(value = "/saveCrashInfo", method = RequestMethod.POST)
    public void saveCrashInfo(CrashInfo crashInfo) {
        crashService.saveCrashInfo(crashInfo);
    }

    @ApiOperation("获取客户端的所有崩溃信息")
    @RequestMapping(value = "/crash", method = RequestMethod.GET)
    public Result<List<CrashInfo>> crash() {
        return new ResultUtil<List<CrashInfo>>().setData(crashService.getCrashInfos());
    }
}
