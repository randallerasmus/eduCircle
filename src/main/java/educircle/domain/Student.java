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
public abstract class Student implements Person
{
    public Integer identityNr;
    public Integer Grade;

    public Integer getidentityNr() {
        return identityNr;
    }
   
    public Integer getGrade() {
        return Grade;
    }
       public Student(Builder builder) { 
         this.Grade=builder.Grade; 
        this.identityNr=builder.identityNr; 
     } 
 
 
     public static class Builder{ 
         private Integer Grade;
         private Integer identityNr;
       
             public Builder (Integer value){ 
             this.Grade=value; 
             return this; 
         } 
 
     public Builder identityNr(Integer value){ 
             this.identityNr=value; 
             return this; 
         } 
  
         public Builder copy(Student value){ 
             this.Grade=value.Grade; 
             this.identityNr=value.identityNr; 
           
             return this; 
         } 
 
 
         public Student build(){ 
             return new Student(this); 
         } 
}
