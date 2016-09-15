/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Studentpayment.implementer;

import com.example.Studentpayment.entity.Student;
import com.example.Studentpayment.stuinterface.StudentPaymentDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class StudentPaymentDaoImpl extends StudentRecDaoImpl implements StudentPaymentDao {

    double rem;

    @Override
    public double remAmount(Student s) {
            return (s.getTotAmount()-s.getPaidAmount());
    }

    @Override
    public String toString() {
        return "StudentPaymentDaoImpl{" + "rem=" + rem + '}';
    }
}
