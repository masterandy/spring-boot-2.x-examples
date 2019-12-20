package com.yi.redshift.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yi.redshift.model.GameLogRealtime;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 实时数据数据库操作
 *
 * @author huangwenyi
 */
@Repository
public interface GameLogRealtimeMapper extends BaseMapper<GameLogRealtime> {
    /**
     * 通过注解sql查询
     * @return
     */
    @Select("SELECT * FROM game_log_realtime WHERE dt = #{dt, jdbcType=DATE} LIMIT 100")
    List<GameLogRealtime> selectListBySQL(String dt);
}
