package dora.bugskiller.console.mapper;

import dora.bugskiller.console.pojo.CrashInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrashInfoMapper {

    int insert(CrashInfo crashInfo);

    List<CrashInfo> selectAll();
}