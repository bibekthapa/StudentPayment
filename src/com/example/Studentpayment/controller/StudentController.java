/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Studentpayment.controller;

import com.example.Studentpayment.entity.Student;
import com.example.Studentpayment.implementer.StudentRecServiceImpl;
import com.example.Studentpayment.stuinterface.StudentRecordService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author HOME
 */
public class StudentController {
    
    private StudentRecordService stdservice;

    public StudentController() {
    }

    public StudentController(StudentRecordService stdservice) {
        this.stdservice = stdservice;
    }
    
   public void add()
    {
    try {
            File file = new File("C:/users/home/desktop/java/sample.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                Student student = new Student();

                String tokens[] = line.split(",");
                student.setId(Integer.parseInt(tokens[0]));
                student.setFirstName(tokens[1]);
                student.setLastName(tokens[2]);
                student.setEmail(tokens[3]);
                stdservice.add(student);
                System.out.println(line);

            }
            System.out.println(stdservice.toString());
            br.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
   
        public void showall()
        {
                for(Student s: stdservice.getall())
                {
                        System.out.println(s.toString());
                }
        
        }
    
    }

