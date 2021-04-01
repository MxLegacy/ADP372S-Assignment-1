/*
 Author: Tatum De Wet 218069227
 */
package za.ac.cput.studentaccount;

import java.util.*;

public class Student {

    private String studName;
    private int studNum;
    private String course;
    private double fees;

    public Student(){

    }

    public Student (String studName, int studNum, String course, double fees){
        this.studName = studName;
        this.studNum = studNum;
        this.course = course;
        this.fees = fees;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudNum() {
        return studNum;
    }

    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void payment(double payment){
        fees = fees - payment;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void show()
    {
        System.out.println();
        System.out.println("Student Number: " + studNum);
        System.out.println("Student Name: " + studName);
        System.out.println("Course: " + course);
        System.out.println("Fees: " + fees);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", studNum=" + studNum +
                ", course='" + course + '\'' +
                ", fees=" + fees +
                '}';
    }
}