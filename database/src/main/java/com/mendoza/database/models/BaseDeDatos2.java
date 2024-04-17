package com.mendoza.database.models;

import java.util.ArrayList;

public class BaseDeDatos2 implements ICRUD{
    private ArrayList<Student> students2 = new ArrayList<>();

    @Override
    public void guardarStudent(Student student) {
        students2.add(student);
    }

    @Override
    public void actualizarStudent(Student student) {
        for (Student e : students2) {
            if (e.getId() == student.getId()) {
                e.setNombre(student.getNombre());
                e.setApellido(student.getApellido());
                return;
            }
        }
    }

    public void printStudents() {
        System.out.println("Estudiantes en Database01:");
        for (Student s : students2) {
            System.out.println(s);
        }
    }

    @Override
    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students2);
    }
}
