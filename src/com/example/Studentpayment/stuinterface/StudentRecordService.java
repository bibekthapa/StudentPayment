/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Studentpayment.stuinterface;

import com.example.Studentpayment.entity.Student;
import java.util.List;

/**
 *
 * @author HOME
 */
public interface StudentRecordService {
     boolean add(Student student);
   List<Student> getall();
    
}
