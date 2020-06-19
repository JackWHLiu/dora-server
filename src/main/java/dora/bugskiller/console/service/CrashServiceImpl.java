package dora.bugskiller.console.service;

import dora.bugskiller.console.mapper.CrashInfoMapper;
import dora.bugskiller.console.pojo.CrashInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrashServiceImpl implements CrashService {

    @Autowired
    CrashInfoMapper crashInfoMapper;

    @Override
    public void saveCrashInfo(CrashInfo crashInfo) {
        crashInfoMapper.insert(crashInfo);
    }

    @Override
    public List<CrashInfo> getCrashInfos() {
        return crashInfoMapper.selectAll();
    }
}
