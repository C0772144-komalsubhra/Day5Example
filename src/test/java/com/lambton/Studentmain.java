package com.lambton;
import java.time.LocalDate;
import java.time.Month;
public class Studentmain {
    public static void main(String[] args) {
        Student[] listOfStudents = new Student[2];

        //First Student Object
        LocalDate s1BirthDate =  LocalDate.of(1993, Month.NOVEMBER, 29);
        Student s1 = new Student(1,"komal","subhra", s1BirthDate ,Gender.FEMALE,
                new float[]{50.0f, 20.0f, 40, 70, 60});

        listOfStudents[0] = s1;

        LocalDate s2BirthDate =  LocalDate.of(1992, Month.MARCH, 25);
        Student s2 = new Student(2,"Geet","Sharma", s2BirthDate ,Gender.FEMALE,
                new float[]{50.0f, 80.0f, 50, 70, 60});

        listOfStudents[1] = s2;

        for(Student s: listOfStudents)
        {
            s.calculateTotalMarks();
            s.calculatePercentage();
            s.calculateResult();
            s.printData();
        }
    }
    }

