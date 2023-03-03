package com.qf.dao;

import com.qf.pojo.TimesLot;

import java.util.List;

public interface TimesLotDao {
    List<TimesLot> findTimeLot();
    Integer deleteTimeLot(int timeslotId);
    Integer addTimesLot(TimesLot timesLot);
    Integer updateTimesLot(TimesLot timesLot);
    List<TimesLot> selectById(Integer id);
}
