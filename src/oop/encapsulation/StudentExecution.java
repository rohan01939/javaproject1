package oop.encapsulation;

import java.sql.SQLOutput;

public class StudentExecution {

    public static void main(String[] args) {
        Student student = new Student();

        student.setid(13);
        int newid = student.getid();
        System.out.println(newid);

    }

}
