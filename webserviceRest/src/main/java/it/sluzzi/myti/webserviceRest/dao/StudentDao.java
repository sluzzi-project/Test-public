package it.sluzzi.myti.webserviceRest.dao;

import org.springframework.stereotype.Repository;

import it.sluzzi.myti.webserviceRest.model.Student;
import it.sluzzi.myti.webserviceRest.model.Students;
 
@Repository
public class StudentDao 
{
    private static Students list = new Students();
     
    static
    {
        list.getStudentList().add(new Student(1,"Saverio","Luzzi","13/02/1976","Matematica:70;Italiano:60"));
        list.getStudentList().add(new Student(1,"Pippo","Pluto","05/06/1986","Matematica:78;Italiano:61"));
    }
     
    public Students getAllStudents() 
    {
        return list;
    }
     
    public void addStudent(Student student) {
        list.getStudentList().add(student);
    }
}