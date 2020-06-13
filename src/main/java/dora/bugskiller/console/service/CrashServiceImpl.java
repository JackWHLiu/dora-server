package dora.bugskiller.console.service;

import dora.bugskiller.console.pojo.CrashInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrashServiceImpl implements CrashService {

    @Override
    public void saveCrashInfo(CrashInfo crashInfo) {

    }

    @Override
    public List<CrashInfo> getCrashInfos() {
        return null;
    }
}
