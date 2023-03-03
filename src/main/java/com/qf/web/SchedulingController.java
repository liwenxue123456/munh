package com.qf.web;

import com.qf.pojo.Scheduling;
import com.qf.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hygl")
public class SchedulingController {
    @Autowired
    private SchedulingService schedulingService;

    @GetMapping("/pbjhgl/pbmb/init")
    public List<Scheduling> findScheduling() {

        return schedulingService.findScheduling();
    }
    @GetMapping("/pbjhgl/pbmb/pbmb_sel")
    public List<Scheduling> findByCondition(Integer organId, String schedulingType, Integer deptNo, Integer did, String numClass, String numType, String week, String classes, String useful, String isHoliday) {
        System.out.println(organId);
        System.out.println(schedulingType);
        System.out.println(deptNo);
        System.out.println(did);
        System.out.println(numClass);
        System.out.println(numType);
        System.out.println(week);
        System.out.println(classes);
        System.out.println(useful);
        System.out.println(isHoliday);
        return  schedulingService.findByCondition(organId, schedulingType, deptNo, did, numClass, numType, week, classes, useful, isHoliday);

    }
    @PostMapping("/pbjhgl/pbmb/pbmb_save")
    public  Integer addScheduling(@RequestBody  Scheduling scheduling){
        return schedulingService.addScheduling(scheduling);
    }

}
