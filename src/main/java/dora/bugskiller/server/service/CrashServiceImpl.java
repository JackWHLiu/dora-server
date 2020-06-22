package dora.bugskiller.server.service;

import dora.bugskiller.server.mapper.CrashInfoMapper;
import dora.bugskiller.server.pojo.CrashInfo;
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

    @Override
    public CrashInfo getLatestCrashInfo() {
        return crashInfoMapper.selectOne();
    }

    @Override
    public void deleteCrashInfos() {
        crashInfoMapper.deleteAll();
    }
}
