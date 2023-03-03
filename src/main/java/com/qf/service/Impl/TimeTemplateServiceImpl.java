package com.qf.service.Impl;

import com.qf.dao.TimeTemplateDao;
import com.qf.pojo.TimeTemplate;
import com.qf.service.TimeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TimeTemplateServiceImpl implements TimeTemplateService {
    @Autowired
    private TimeTemplateDao timeTemplateDao;


    @Override
    public List<TimeTemplate> findTimeTemplate() {
        return timeTemplateDao.findTimeTemplate();
    }

    @Override
    public Integer deleteTimeTemplate(int timeTemplateId) {
        return  timeTemplateDao.deleteTimeTemplate(timeTemplateId);
    }

    @Override
    public Integer addTimeTemplate(TimeTemplate timeTemplate) {
        return  timeTemplateDao.addTimeTemplate(timeTemplate);
    }

    @Override
    public Integer updateTimeTemplate(TimeTemplate timeTemplate) {
       return  timeTemplateDao.updateTimeTemplate(timeTemplate);
    }

    @Override
    public TimeTemplate showOneTimeTemplate(int timeTemplateId) {
        return timeTemplateDao.showOneTimeTemplate(timeTemplateId);
    }

    @Override
    public List<TimeTemplate> findByCondition(String templateName, String templateBelong, Integer userful, Integer organId, Integer deptId, Integer did) {
        return  timeTemplateDao.findByCondition(templateName, templateBelong, userful, organId, deptId, did);
    }

    @Override
    public Integer removeMove(int[] ids) {
        return  timeTemplateDao.removeMove(ids);
    }


}
