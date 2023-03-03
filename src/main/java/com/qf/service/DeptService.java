package com.qf.service;

import com.qf.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> selectByOrgan(int organId);

}
