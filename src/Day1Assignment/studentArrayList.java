package Day1Assignment;

import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private double grade;
    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGrade(){
        return grade;
    }
}
public class studentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

       //adding student object to the ArrayList
        students.add(new Student(" Aryan ", 21, 91.5));
        students.add(new Student(" Sasuke ", 20,87.9));
        students.add(new Student(" Obito ", 24,94.0));
        students.add(new Student(" Hinata ", 19, 88.5));
        students.add(new Student(" Kakashi ", 25, 89.9));

        //Finding average Grade
        double totalGrade = 0;
        for (Student student : students){
            totalGrade += student.getGrade();
        }
        double averageGrade = totalGrade / students.size();
        System.out.println(" Average grade of all students: " + averageGrade);

        //Finding Name and age of Grade over than 90
        System.out.println(" Students with grade higher than 90: ");
        for (Student student : students){
            if (student.getGrade() > 90){
                System.out.println(" Name :" + student.getName() + " Age: " + student.getAge());
            }
        }


    }
}
