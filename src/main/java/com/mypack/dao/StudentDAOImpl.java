package com.mypack.dao;

import org.springframework.stereotype.Repository;

import com.mypack.dto.StudentDTO;

@Repository ("studentDao")
public class StudentDAOImpl implements StudentDAO
{
    public StudentDTO createNewStudent()
    {
        StudentDTO e = new StudentDTO();
        e.setId(1);
        e.setFirstName("Lokesh");
        e.setLastName("Gupta");
        return e;
    }
}