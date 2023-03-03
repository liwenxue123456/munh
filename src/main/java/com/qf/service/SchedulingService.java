package com.qf.service;

import com.qf.dao.SchedulingDao;
import com.qf.pojo.Scheduling;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchedulingService {
    List<Scheduling> findScheduling();
    List<Scheduling> findByCondition(
            @Param("organId") Integer organId,
            @Param("schedulingType") String schedulingType,
            @Param("deptNo") Integer deptNo,
            @Param("did") Integer did,
            @Param("numClass") String numClass,
            @Param("numType") String numType,
            @Param("week") String week,
            @Param("classes") String classes,
            @Param("useful") String useful,
            @Param("isHoliday") String isHoliday
    );
    Integer addScheduling(Scheduling scheduling);

}
