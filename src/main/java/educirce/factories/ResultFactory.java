/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educirce.factories;

import educircle.domain.Result;

/**
 *
 * @author RASCAL
 */
public class ResultFactory 
{
   
    public static Result createResult(String StudentName,String SubjectName,Double StudentMarks)
    {
        Result mark = new Result
                .Builder(StudentName)
                .StudentMarks(StudentMarks)
                .SubjectName(SubjectName)
                .build();
        return mark;
    }
    
}
