package org.example;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Student> al=new ArrayList<Student>();

        Student s1 = new Student(101,"Kim", 23);
        al.add(s1);
        Student s2 = new Student(102,"Lee",22);
        al.add(s2);
        al.add(new Student(103,"Park",25));

        //Traverse elements of arraylist(method #1)
        for( Student s : al){
            System.out.println(s.toString());
        }

        //Remove an object from arraylist
        al.remove(s2);
        System.out.println("One student removed!");

        //Traverse elements of arraylist(method #2)
        for(int i = 0; i<al.size(); i++){
            System.out.println(al.get(i).toString());
        }
    }
}