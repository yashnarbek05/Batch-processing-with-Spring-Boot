package com.company.appbanch.processor;

import com.company.appbanch.model.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student,Student> {
    @Override
    public Student process(Student student) throws Exception {
        return student;
    }
}
