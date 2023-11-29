package com.csh.student_places.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentInfo {//原有学生信息

    @ExcelProperty(value = "序号", index = 0)
    private int id;

    @ExcelProperty(value = "姓名", index = 1)
    private String name;

    @ExcelProperty(value = "班级", index = 2)
    private String class1;

    @ExcelProperty(value = "组合", index = 3)
    private String group;

    @ExcelProperty(value = "日语", index = 4)
    private String japan;

    @ExcelProperty(value = "学生编号", index = 5)
    private String stuid;

    @ExcelProperty(value = "分班分", index = 6)
    private String grade;


}
