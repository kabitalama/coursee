/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.course.dao.impl;

import com.company.course.dao.CourseDAO;
import com.company.course.entity.Course;

/**
 *
 * @author Kabi
 */
public class CourseDAOimpl implements CourseDAO {
    private int counter=1;
    private Course[] subjectList= new Course[10];

    @Override
    public boolean insert(Course p) {
        if(counter==subjectList.length){
            return false;
        }
        subjectList[counter]=p;
        counter++;
        return true;
    }

    @Override
    public boolean update(Course p) {
        return true;
    }

    @Override
    public boolean delete(int id) {
         for(int i=0;i<subjectList.length;i++){
        Course p=subjectList[i];
        if(p!=null && p.getId()==id){
            subjectList[i]=null;
            return true;
        
        }
    
    }
         return false;
    }

    @Override
    public Course getById(int id) {
             for(int i=0;i<subjectList.length;i++){
        Course p=subjectList[i];
        if(p!=null && p.getId()==id){
            subjectList[i]=null;
            return p;
        
        }
    
    }
         return null;
        
    }

    @Override
    public Course[] getAll() {
        return subjectList;
    }
    
}
