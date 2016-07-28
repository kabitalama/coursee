/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.course;

import com.company.course.dao.CourseDAO;
import com.company.course.dao.impl.CourseDAOimpl;
import com.company.course.entity.Course;
import java.util.Scanner;

/**
 *
 * @author Kabi
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CourseDAO courseDAO = new CourseDAOimpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. List");
            System.out.println("4. Search All");
            System.out.println("5. Exit");
            System.out.println("Enter your choice[1-5]");
            //int ch=input.nextInt(); reducing one line code
            switch (input.nextInt()) {

                case 1:
                    System.out.println("Add Subject");
                    Course s = new Course();
                    System.out.println("Enter ID");
                    s.setId(input.nextInt());
                    System.out.println("Enter Name");
                    s.setName(input.next());
                    System.out.println("Enter Description");
                    s.setDescription(input.next());
                    System.out.println("Enter teacherName");
                    s.setTeacherName(input.next());
                    System.out.println("Enter Status");
                    s.setStatus(input.nextBoolean());

                    if (courseDAO.insert(s)) {
                        System.out.println("Inserted Succesfully");
                    } else {
                        System.out.println("Data Full");
                    }

                    break;

                case 2:
                    System.out.println("To Delete");
                    int id = input.nextInt();
                    System.out.println("Please Enter id ");
                    if (courseDAO.delete(id)) {
                        System.out.println("Deleted Succesfully");
                    }

                    break;

                case 3:
                    System.out.println("Listing all Courses");
                    Course[] subjects = courseDAO.getAll();
                    for (int i = 0; i < subjects.length; i++) {
                        Course subject = subjects[i];
                        if (subject != null) {
                            System.out.println("ID" + subject.getId());
                            System.out.println("Name" + subject.getName());
                            System.out.println("Description" + subject.getDescription());
                            System.out.println("TeacherName" + subject.getTeacherName());

                        }
                    }
                    break;

                case 4:
                    
                    break;

                case 5:
                    System.out.println("Do you really want to exxit[y/n] ");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }
                    break;

            }
        }

    }

}
