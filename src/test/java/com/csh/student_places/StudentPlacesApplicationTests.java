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
            // ÿ����һ������,�÷����ᱻ����һ��
            @Override
            public void invoke(StudentInfo studentInfo, AnalysisContext analysisContext) {
                System.out.println("��������Ϊ:" + studentInfo.toString());
            }
            // ȫ��������ɱ�����
            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("�������...");
                // ���Խ����������ݱ��浽���ݿ�
            }
        }).sheet().doRead();

    }

}
