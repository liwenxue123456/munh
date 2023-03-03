package com.qf.dao;


import com.qf.pojo.TimeTemplate;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.Time;
import java.util.List;

public interface TimeTemplateDao {
    List<TimeTemplate> findTimeTemplate();

    Integer addTimeTemplate(TimeTemplate timeTemplate);

    Integer deleteTimeTemplate(int timeTemplateId);

    Integer updateTimeTemplate(TimeTemplate timeTemplate);

    TimeTemplate showOneTimeTemplate(int timeTemplateId);

    List<TimeTemplate> findByCondition(@Param("templateName") String templateName, @Param("templateBelong") String templateBelong, @Param("useful") Integer userful, @Param("organId") Integer organId, @Param("deptNo") Integer deptId, @Param("did") Integer did);

    Integer removeMove(int[] ids);
}
