package com.csh.student_places;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.csh.student_places.entity.StudentInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentPlacesApplicationTests {

    @Test
    void contextLoads() {
        String filename = "D:\\Users\\HP\\Desktop\\1.xlsx";

        EasyExcel.read(filename, StudentInfo.class, new AnalysisEventListener<StudentInfo>() {
            // 每解析一行数据,该方法会被调用一次
            @Override
            public void invoke(StudentInfo studentInfo, AnalysisContext analysisContext) {
                System.out.println("解析数据为:" + studentInfo.toString());
            }
            // 全部解析完成被调用
            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("解析完成...");
                // 可以将解析的数据保存到数据库
            }
        }).sheet().doRead();

    }

}
