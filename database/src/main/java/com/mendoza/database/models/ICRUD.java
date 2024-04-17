package com.mendoza.database.models;

import java.util.ArrayList;

public interface ICRUD {
    void guardarStudent(Student student);
    void actualizarStudent(Student student);

    ArrayList<Student> getStudents();
}
