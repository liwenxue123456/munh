package com.qf.dao;

import com.qf.pojo.Dept;

import java.util.List;

public interface DeptDao {
    List<Dept> selectByOrgan(int organId);
}
