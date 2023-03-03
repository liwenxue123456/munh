package com.qf.service.Impl;

import com.qf.dao.OrganDao;
import com.qf.pojo.Organ;
import com.qf.service.OrganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrganServiceImpl implements OrganService {
   @Autowired
   private OrganDao organDao;
    @Override
    public List<Organ> findOrgan() {
        return  organDao.findOrgan();
    }

    @Override
    public Integer addOrgan(Organ organ) {
        return  organDao.addOrgan(organ);
    }

    @Override
    public Integer updateOrgan(Organ organ) {
        return organDao.updateOrgan(organ);
    }

    @Override
    public Integer deleteOrgan(Integer id) {
        return  organDao.deleteOrgan(id);
    }

    @Override
    public Organ findByOne(Integer id) {
       return  organDao.findByOne(id);
    }

    @Override
    public Integer deleteMove(Integer[] ids) {
        return  organDao.deleteMove(ids);
    }

    @Override
    public List<Organ> findByCondition(Organ organ) {
        return  organDao.findByCondition(organ);
    }
}
