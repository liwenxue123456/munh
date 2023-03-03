package com.qf.dao;

import com.qf.pojo.Organ;

import java.util.List;

public interface OrganDao {
    List<Organ> findOrgan();
    Integer addOrgan(Organ organ);
    Integer updateOrgan(Organ organ);
    Organ  findByOne(Integer id);
    Integer deleteOrgan(Integer id);
    Integer deleteMove(Integer[] ids);
    List<Organ> findByCondition(Organ organ);

}
