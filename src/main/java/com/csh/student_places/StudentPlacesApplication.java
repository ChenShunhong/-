package com.csh.student_places;

import com.csh.student_places.gui.MainView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentPlacesApplication {

    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.mainview();
        SpringApplication.run(StudentPlacesApplication.class, args);

    }

}
