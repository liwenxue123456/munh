package com.qf.web;

import com.qf.pojo.Doctor;
import com.qf.service.DoctorService;
import com.qf.util.TreeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hygl")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @GetMapping("/cspzgl/sjdpz/get_ryxx")
    public List<Doctor> findDoctor(int deptNo){

        return doctorService.findByDeptNo(deptNo);
    }
    @GetMapping("/pbjhgl/pbmb/listys")
    public List<TreeResult> getTreeData() {

        return doctorService.getTreeDate();
    }
}
