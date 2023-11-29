package com.csh.student_places.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class PlaceStudent {

    @ExcelProperty(value = "姓名")
    private  String name;

    @ExcelProperty(value = "班级")
    private String class1;

    @ExcelProperty(value = "组合")
    private String group;

    @ExcelProperty(value = "学生编号")
    private String stuid;

    @ExcelProperty(value = "考场")
    private int  place;

    @ExcelProperty(value = "座位号")
    private int seatnumber;

    @ExcelProperty(value = "考生号")
    private String testid;
}
