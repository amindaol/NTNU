package edu.ntnu.idi.idatt;

public class StudentTest {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student("Emma", 5);

        System.out.println(student1);

        student1.okAntOppg(3);

        System.out.println(student1);
    }

}
