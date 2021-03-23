package com.hau.o;

import com.hau.o.GraduateStudent;
import com.hau.o.Student;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("001","Jack", 60, 80);
        stu.print();
        GraduateStudent gst = new GraduateStudent( "1001", "Mary", 60, 60, 50);
        gst.print();
    }
}
