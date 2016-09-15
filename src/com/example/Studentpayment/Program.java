package com.example.Studentpayment;

import com.example.Studentpayment.controller.StudentController;
import com.example.Studentpayment.entity.Student;
import com.example.Studentpayment.implementer.StudentPaymentServiceImpl;
import com.example.Studentpayment.implementer.StudentRecServiceImpl;
import com.example.Studentpayment.stuinterface.StudentPaymentService;
import com.example.Studentpayment.stuinterface.StudentRecordService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        StudentRecordService stdservice = new StudentRecServiceImpl();
        StudentPaymentService stdpayservice=new StudentPaymentServiceImpl();
        StudentController controller=new StudentController(stdservice,stdpayservice);
        controller.add();
        controller.showall();
        controller.remAmount();
        
        

        

    }}
