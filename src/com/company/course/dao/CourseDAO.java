/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.course.dao;

import com.company.course.entity.Course;

/**
 *
 * @author Kabi
 */
public interface CourseDAO {
     boolean insert(Course p);
     boolean update(Course p);
     boolean delete(int id);
     Course getById(int id);
     Course[] getAll();
    
}
