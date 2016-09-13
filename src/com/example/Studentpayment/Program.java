
package com.example.Studentpayment;

import com.example.Studentpayment.entity.Student;
import com.example.Studentpayment.implementer.StudentRecServiceImpl;
import com.example.Studentpayment.stuinterface.StudentRecordService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Program {

   
    public static void main(String[] args) {
        
        List<Student> stdList=new ArrayList<Student>();
         StudentRecordService stdservice=new StudentRecServiceImpl();
        
        try{
        File file = new File("C:/users/home/desktop/java/sample.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line="";
        while((line=br.readLine())!=null)
        {
            Student student=new Student();
             
               String tokens[]=line.split(",");
               student.setId(Integer.parseInt(tokens[0]));
               student.setFirstName(tokens[1]);
               student.setLastName(tokens[2]);
               student.setEmail(tokens[3]);
              stdservice.add(student);
            System.out.println(line);
           
        }
            System.out.println( stdservice.toString());
        br.close();
        
        
        }catch(IOException ioe)
        {
        ioe.printStackTrace();
        }
        
         
    }
    
}
