package com.qf.service.Impl;

import com.qf.dao.TimesLotDao;
import com.qf.pojo.TimesLot;
import com.qf.service.TimesLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TimeLotServiceImpl implements TimesLotService {
   @Autowired
   private TimesLotDao timesLotDao;
    @Override
    public List<TimesLot> findTimeLot() {
        return  timesLotDao.findTimeLot();
    }

    @Override
    public Integer deleteTimeLot(int timeslotId) {
        return  timesLotDao.deleteTimeLot(timeslotId);
    }

    @Override
    public Integer addTimesLot(TimesLot timesLot) {
        return  timesLotDao.addTimesLot(timesLot);
    }

    @Override
    public Integer updateTimesLot(TimesLot timesLot) {
        return  timesLotDao.updateTimesLot(timesLot);
    }

    @Override
    public List<TimesLot> selectById(Integer id) {
        return  timesLotDao.selectById(id);
    }
}
