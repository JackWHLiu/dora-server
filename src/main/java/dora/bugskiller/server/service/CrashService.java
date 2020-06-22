package dora.bugskiller.server.service;

import dora.bugskiller.server.pojo.CrashInfo;

import java.util.List;

public interface CrashService {

    void saveCrashInfo(CrashInfo crashInfo);

    List<CrashInfo> getCrashInfos();

    CrashInfo getLatestCrashInfo();

    void deleteCrashInfos();
}
