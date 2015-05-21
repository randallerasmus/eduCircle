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
public class Subject 
{
    private String SubjectName;
    private Integer SubjectCode;
    
    private Subject()
    {
    }
    
    public String getSubjectName() {
        return SubjectName;
    }
    public Integer getSubjectCode() {
        return SubjectCode;
    }
    
    public Subject (Builder builder)
    {
        this.SubjectName=builder.SubjectName;
        this.SubjectCode=builder.SubjectCode;
        return this;
        }
    
    public static class Builder 
    {
      private String SubjectName;
        private Integer SubjectCode;  
    }
     public Builder SubjectName(String SubjectName)
    {
        this.SubjectName = SubjectName;
        return this;
    }
    
    public Builder SubjectCode(Integer value){
        this.SubjectCode=value;
        return this;
    }
    public Subject copy (Subject value)
    {
         this.SubjectName=value.SubjectName;
         this.SubjectCode=value.SubjectCode;
         
         return this;
    }
      
   public Subject build()
           
    {
        return new Subject(this);
        
    }
}
