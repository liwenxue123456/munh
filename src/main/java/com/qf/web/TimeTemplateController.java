package com.qf.web;

import com.qf.pojo.TimeTemplate;
import com.qf.service.TimeTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hygl")
public class TimeTemplateController {
    @Autowired
    private TimeTemplateService timeTemplateService;

    @GetMapping("/cspzgl/sjdpz/init")
    public List<TimeTemplate> findTimeTemplate() {
        return timeTemplateService.findTimeTemplate();
    }

    @PostMapping("/cspzgl/sjdpz/sjdmb_del")
    public String deleteTimeTemplate(@RequestBody TimeTemplate timeTemplate) {
        int row = timeTemplateService.deleteTimeTemplate(timeTemplate.getTimeTemplateId());
        if (row != 0) {
            return "success";
        } else {
            return "filed";
        }
    }

    @PostMapping("/cspzgl/sjdpz/sjdmb_save")
    public String addTimeTemplate(@RequestBody TimeTemplate timeTemplate) {
        System.out.println(timeTemplate);
        int row = timeTemplateService.addTimeTemplate(timeTemplate);
        System.out.println(timeTemplate);
        if (row != 0) {
            return "success";
        } else {
            return "filed";
        }
    }

    @PostMapping("/cspzgl/sjdpz/sjdmb_update")
    public String updateTimeTemplate(@RequestBody TimeTemplate timeTemplate) {
        System.out.println(timeTemplate);
        int row = timeTemplateService.updateTimeTemplate(timeTemplate);
        if (row != 0) {
            return "success";
        } else {
            return "filed";
        }
    }
    @PostMapping("/cspzgl/sjdpz/selOne")
    public TimeTemplate findTimeTemplate(int timeTemplateId) {
        return  timeTemplateService.showOneTimeTemplate(timeTemplateId);
    }
    @GetMapping("/cspzgl/sjdpz/sjdmb_sel")
    public  List<TimeTemplate> findByCondition(String templateName, String templateBelong, Integer userful, Integer organId, Integer deptId, Integer did){
        return  timeTemplateService.findByCondition(templateName, templateBelong, userful, organId, deptId, did);
    }
    @GetMapping("/cspzgl/sjdpz/sjdmb_delMove")
    public Integer  removeMove(int[] timeTemplateId){
        Integer row =timeTemplateService.removeMove(timeTemplateId);
        return row;

      }


}
