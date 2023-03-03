package com.qf.service.Impl;

import com.qf.dao.DeptDao;
import com.qf.pojo.Dept;
import com.qf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
   @Autowired
   private DeptDao deptDao;
    @Override
    public List<Dept> selectByOrgan(int organId) {
        return  deptDao.selectByOrgan(organId);
    }
}
