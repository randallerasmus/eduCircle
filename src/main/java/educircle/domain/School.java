/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;

/**
 *
 * @author RASCAL
 */

public class School 
{
    public String Name;
    public String Surname;
    public String Race;
    public String Gender;
    public String Grade;
    public Integer StudentNr;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String Race) {
        this.Race = Race;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public Integer getStudentNr() {
        return StudentNr;
    }

    public void setStudentNr(Integer StudentNr) {
        this.StudentNr = StudentNr;
    }

  
}
