/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Studentpayment.implementer;

import com.example.Studentpayment.entity.Student;
import com.example.Studentpayment.stuinterface.StudentRecDao;
import com.example.Studentpayment.stuinterface.StudentRecordService;
import java.util.List;

/**
 *
 * @author HOME
 */
public class StudentRecServiceImpl implements StudentRecordService {
            StudentRecDao std=new StudentRecDaoImpl();
    @Override
    public boolean add(Student student) {
       return std.add(student);
    }

    @Override
    public String toString() {
        return "StudentRecServiceImpl{" + "std=" + std + '}';
    }

    @Override
    public List<Student> getall() {
        return std.getall();
    }
    
}
