package com.qf.web;

import com.qf.pojo.Organ;
import com.qf.service.OrganService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hygl")
public class OrganController {
    @Autowired
    private OrganService organService;

    @GetMapping("/cspzgl/sjdpz/get_jgxx")
    public List<Organ> findOrgan() {
        return organService.findOrgan();
    }

    @PostMapping("/add")
    public Integer addOrgan(@RequestBody Organ organ) {
        return organService.addOrgan(organ);

    }

    @PostMapping("/update")
    public Integer updateOrgan(@RequestBody Organ organ) {
        System.out.println(organ);
        return organService.updateOrgan(organ);

    }

    @GetMapping("/findOne")
    public Organ findOrgan(Integer organId) {

        return organService.findByOne(organId);
    }
    @GetMapping("/delete")
    public  Integer delete(Integer organId){
        return  organService.deleteOrgan(organId);
    }
    @GetMapping("/deleteMove")
    public  Integer deleteMove(Integer[] organId){
        return  organService.deleteMove(organId);
    }

    @GetMapping("/findByCondition")
    public List<Organ> findByCondition(Organ organ) {

        return organService.findByCondition(organ);
    }
}