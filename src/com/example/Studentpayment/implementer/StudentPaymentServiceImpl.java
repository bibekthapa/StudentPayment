/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Studentpayment.implementer;

import com.example.Studentpayment.entity.Student;
import com.example.Studentpayment.stuinterface.StudentPaymentDao;
import com.example.Studentpayment.stuinterface.StudentPaymentService;

/**
 *
 * @author HOME
 */
public class StudentPaymentServiceImpl extends StudentRecServiceImpl implements StudentPaymentService {
        StudentPaymentDao std=new StudentPaymentDaoImpl();
    @Override
    public double remAmount(Student student) {
        return std.remAmount(student);
    }

    @Override
    public String toString() {
        return "StudentPaymentServiceImpl{" + "std=" + std + '}';
    }
    
}
