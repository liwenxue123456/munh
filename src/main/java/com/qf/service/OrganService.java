package com.qf.service;

import com.qf.pojo.Organ;

import java.util.List;

public interface OrganService {
    List<Organ> findOrgan();
    Integer addOrgan(Organ organ);
    Integer updateOrgan(Organ organ);
    Integer deleteOrgan(Integer id);
    Organ  findByOne(Integer id);
    Integer deleteMove(Integer[] ids);
    List<Organ> findByCondition(Organ organ);


}
