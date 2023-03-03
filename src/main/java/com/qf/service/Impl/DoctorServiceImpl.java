package com.qf.service.Impl;

import com.qf.dao.DeptDao;
import com.qf.dao.DoctorDao;
import com.qf.dao.OrganDao;
import com.qf.pojo.Dept;
import com.qf.pojo.Doctor;
import com.qf.pojo.Organ;
import com.qf.service.DoctorService;
import com.qf.util.TreeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private OrganDao organDao;

    @Override
    public List<Doctor> findByDeptNo(int deptNo) {
        return doctorDao.findByDeptNo(deptNo);
    }

    @Override
    public List<TreeResult> getTreeDate() {
        List<TreeResult> treeResultList = new ArrayList<>();
        List<Organ> organs = organDao.findOrgan();
        for (Organ organ : organs) {
            TreeResult treeResult = new TreeResult();
            treeResult.setId(organ.getOrganId());
            treeResult.setLabel(organ.getOrganName());
            treeResultList.add(treeResult);
            List<TreeResult> treeResultList1 = new ArrayList<>();
            List<Dept> depts = deptDao.selectByOrgan(organ.getOrganId());
            for (Dept dept : depts) {
                TreeResult treeResult1 = new TreeResult();
                treeResult1.setId(dept.getDeptNo());
                treeResult1.setLabel(dept.getDeptName());
                treeResultList1.add(treeResult1);
                List<TreeResult> treeResultList2 = new ArrayList<>();
                List<Doctor> doctors = doctorDao.findByDeptNo(dept.getDeptNo());
                for (Doctor doctor : doctors) {
                    TreeResult treeResult2 = new TreeResult();
                    treeResult2.setId(doctor.getDid());
                    treeResult2.setLabel(doctor.getDName());
                    treeResultList2.add(treeResult2);
                }
                treeResult1.setChildren(treeResultList2);

            }
            treeResult.setChildren(treeResultList1);

        }
        return treeResultList;

    }
}