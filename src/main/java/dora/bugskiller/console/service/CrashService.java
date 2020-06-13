package dora.bugskiller.console.service;

import dora.bugskiller.console.pojo.CrashInfo;

import java.util.List;

public interface CrashService {

    void saveCrashInfo(CrashInfo crashInfo);

    List<CrashInfo> getCrashInfos();
}
