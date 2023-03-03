package com.qf.web;

import com.qf.pojo.Dept;
import com.qf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hygl")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("/cspzgl/sjdpz/get_ksxx")
    public  List<Dept> selectByOrganId(int organId){
        return  deptService.selectByOrgan(organId);
    }
}
