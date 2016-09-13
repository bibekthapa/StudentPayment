
package com.example.Studentpayment.implementer;

import com.example.Studentpayment.entity.Student;
import com.example.Studentpayment.stuinterface.StudentRecDao;
import java.util.ArrayList;
import java.util.List;



public class StudentRecDaoImpl implements StudentRecDao {
    
    List<Student> stdList=new ArrayList<Student>();

    @Override
    public boolean add(Student student) {
        return stdList.add(student);
    }

    @Override
    public List<Student> getall() {
        return stdList;
    }

    @Override
    public String toString() {
        return "StudentRecDaoImpl{" + "stdList=" + stdList + '}';
    }
    
}
