package com.qf.dao;

import com.qf.pojo.Doctor;

import java.util.List;

public interface DoctorDao {
    List<Doctor> findByDeptNo(int deptNo);
}
