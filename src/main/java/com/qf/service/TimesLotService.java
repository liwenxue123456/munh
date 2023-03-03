package com.qf.service;

import com.qf.pojo.TimesLot;

import java.util.List;

public interface TimesLotService {
    List<TimesLot> findTimeLot();
    Integer deleteTimeLot(int timeslotId);
    Integer addTimesLot(TimesLot timesLot);
    Integer updateTimesLot(TimesLot timesLot);
    List<TimesLot> selectById(Integer id);

}
