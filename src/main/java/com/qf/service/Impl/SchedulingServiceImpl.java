package com.qf.service.Impl;

import com.qf.dao.SchedulingDao;
import com.qf.pojo.Scheduling;
import com.qf.service.SchedulingService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchedulingServiceImpl implements SchedulingService {
    @Autowired
    private SchedulingDao schedulingDao;

    @Override
    public List<Scheduling> findScheduling() {
        return schedulingDao.findScheduling();
    }

    @Override
    public List<Scheduling> findByCondition(Integer organId, String schedulingType, Integer deptNo, Integer did, String numClass, String numType, String week, String classes, String useful, String isHoliday) {
       return  schedulingDao.findByCondition(organId, schedulingType, deptNo, did, numClass, numType, week, classes, useful, isHoliday);
    }

    @Override
    public Integer addScheduling(Scheduling scheduling) {
        return  schedulingDao.addScheduling(scheduling);
    }
}
