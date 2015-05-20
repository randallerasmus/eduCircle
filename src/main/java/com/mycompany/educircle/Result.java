/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.educircle;

/**
 *
 * @author RASCAL
 */
public class Result 
{
    public String StudentName;
    public String SubjectName;
    public Double StudentMarks;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public Double getStudentMarks() {
        return StudentMarks;
    }

    public void setStudentMarks(Double StudentMarks) {
        this.StudentMarks = StudentMarks;
    }
}
