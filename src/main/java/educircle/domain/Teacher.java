/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;
import java.io.Serializable;

/**
 *
 * @author RASCAL
 */
public class Teacher implements Serializable
{
    public String SubjectTitle;
    public Integer ContactNr;

    public String getSubjectTitle() {
        return SubjectTitle;
    }

     public Integer getContactNr() {
        return ContactNr;
    }

  public Teacher (Builder builder)
  {
      this.SubjectTitle=builder.SubjectTitle;
      this.ContactNr=builder.ContactNr;
  }    
    public static class Builder{ 
         private String SubjectTitle;
         private Integer ContactNr;
    }
       
 
         public Builder SubjectTitle(String value) { 
             this.SubjectTitle = value; 
             return this; 
         } 
  
         public Builder ContactNr(Integer value){ 
             this.ContactNr=value; 
             return this; 
         } 
 
          public Teacher copy(Teacher value){ 
             this.SubjectTitle=value.SubjectTitle;
             this.ContactNr=value.ContactNr; 
            return this; 
         } 
 
 
         public Teacher build(){ 
             return new Teacher(this); 
         } 
}
