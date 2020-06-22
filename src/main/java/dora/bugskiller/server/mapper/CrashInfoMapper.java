package dora.bugskiller.server.mapper;

import dora.bugskiller.server.pojo.CrashInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrashInfoMapper {

    int insert(CrashInfo crashInfo);

    List<CrashInfo> selectAll();

    CrashInfo selectOne();

    void deleteAll();
}