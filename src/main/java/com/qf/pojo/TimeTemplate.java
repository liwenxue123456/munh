package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TimeTemplate implements Serializable {
     private  int timeTemplateId;
     private  String templateName;
     private  String templateBeLong;
     private  String amTime;
    @DateTimeFormat(pattern="HH:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="HH:mm",timezone = "GMT+8")
     private Date amStart;
    @DateTimeFormat(pattern="HH:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="HH:mm",timezone = "GMT+8")
     private  Date amStop;
     private  String pmTime;
    @DateTimeFormat(pattern="HH:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="HH:mm",timezone = "GMT+8")
     private  Date  pmStart;
    @DateTimeFormat(pattern="HH:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="HH:mm",timezone = "GMT+8")
    private int  useFul;
    @DateTimeFormat(pattern="HH:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="HH:mm",timezone = "GMT+8")
    private  Date  pmStop;
    private Dept dept;
    private Doctor doctor;
    private  Organ organ;
}
