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
public class TimesLot implements Serializable {
    private  Integer timesLotId;
    private  Integer templateId;
    private  String classes;
    private  String timeSlotCode;
    @DateTimeFormat(pattern="hh:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="hh:mm",timezone = "GMT+8")
   private Date start;
    @DateTimeFormat(pattern="hh:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="hh:mm",timezone = "GMT+8")
    private Date end;
    @DateTimeFormat(pattern="hh:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="hh:mm",timezone = "GMT+8")
    private Date takeNumStart;
    @DateTimeFormat(pattern="hh:mm")//年月日yyyy-MM-dd,小时分钟 hh:mm
    @JsonFormat(pattern="hh:mm",timezone = "GMT+8")
    private Date takeNumEnd;
    private  Integer pjkbsc;
    private  Integer sjdhys;
}
