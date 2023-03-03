package com.qf.service;

import com.qf.pojo.Doctor;
import com.qf.util.TreeResult;

import java.util.List;

public interface DoctorService {
    List<Doctor> findByDeptNo(int deptNo);
    List<TreeResult> getTreeDate();
}
