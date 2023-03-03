package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Scheduling implements Serializable {
    private Integer schedulingId;
    private String schedulingType;
    private Organ organ;
    private Dept dept;
    private Doctor doctor;
    private String numClass;
    private String numType;
    private String week;
    private String classes;
    private String timeCode;
    private Integer sjdHys;
    private Integer addNumAble;
    private String isHoliday;
    private String numWindow;
    private String useful;
}
