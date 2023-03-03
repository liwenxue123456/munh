package com.qf.web;

import com.qf.pojo.TimesLot;
import com.qf.service.TimesLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hygl")
public class TimeLotController {
    @Autowired
    private TimesLotService timesLotService;

    @GetMapping("/cspzgl/sjdmx/init")
    public List<TimesLot> findTimeLot() {
        return timesLotService.findTimeLot();
    }

    @PostMapping("/cspzgl/sjdpz/sjdmx_del")
    public Integer deleteTimeLot(@RequestBody TimesLot timesLot) {
        System.out.println(timesLot.getTimesLotId());
       return  timesLotService.deleteTimeLot(timesLot.getTimesLotId());

    }
    @PostMapping("/cspzgl/sjdpz/sjdmx_save")
    public  Integer addTimeLot(@RequestBody TimesLot timesLot){
             return timesLotService.addTimesLot(timesLot);

    }

    @PostMapping("/cspzgl/sjdpz/sjdmx_update")
    public  Integer updateTimeLot(@RequestBody TimesLot timesLot){
        System.out.println(timesLot);
        return timesLotService.updateTimesLot(timesLot);

    }

    @GetMapping("/cspzgl/sjdpz/sjdmx_sel")
    public  List<TimesLot> showById(Integer id){
//        System.out.println(id);
        return  timesLotService.selectById(id);
    }
}
