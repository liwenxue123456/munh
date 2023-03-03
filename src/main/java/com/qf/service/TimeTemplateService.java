package com.qf.service;


import com.qf.pojo.TimeTemplate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TimeTemplateService {
    List<TimeTemplate> findTimeTemplate();

    Integer deleteTimeTemplate(int timeTemplateId);

    Integer addTimeTemplate(TimeTemplate timeTemplate);

    Integer updateTimeTemplate(TimeTemplate timeTemplate);

    TimeTemplate showOneTimeTemplate(int timeTemplateId);

    List<TimeTemplate> findByCondition(@Param("templateName") String templateName, @Param("templateBelong") String templateBelong, @Param("useful") Integer userful, @Param("organId") Integer organId, @Param("deptNo") Integer deptId, @Param("did") Integer did);

    Integer removeMove(int[] ids);

}
