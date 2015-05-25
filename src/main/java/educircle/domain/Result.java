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
public class Result implements Serializable
{
    public String StudentName;
    public String SubjectName;
    public Double StudentMarks;

    public String getStudentName() {
        return StudentName;
    }
    
            
    public String getSubjectName() {
        return SubjectName;
    }

    public Double getStudentMarks() {
        return StudentMarks;
    }

    public Result(Builder builder)
    {
        this.StudentName=builder.StudentName;
        this.SubjectName=builder.SubjectName;
        this.StudentMarks=builder.StudentMarks;
     }
    public static class Builder{
        private String StudentName;
        private String SubjectName;
        private Double StudentMarks;
    }
    
    private Builder (String StudentName)
    {
        this.StudentName=StudentName;
        
    }
    private Builder SubjectName (String value)
    {
        this.SubjectName=value;
        return this;
    }
    public Builder StudentMarks(Double value)
    {
        this.StudentMarks=value;
        return this;
    }
    public Builder copy(Result value){
        this.StudentName=value.getStudentName();
        this.SubjectName=value.getSubjectName();
        this.StudentMarks=value.getStudentMarks();
        return this;
        
    }
    public Result build()
    {
        return new Result(this);
    }
}
