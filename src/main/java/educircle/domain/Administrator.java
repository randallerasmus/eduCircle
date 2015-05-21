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
public abstract class Administrator implements Person
{
    private int Empno;

    public int getEmpno() {
        return Empno;
    }
    
    public Administrator(Builder builder)
    {
        this.Empno=builder.Empno;
    }
    public static class Builder
    {
        private int Empno;
    }
    public Builder(int Empno)
    {
        this.Empno=Empno;
    }
    public Administrator build()
    {
        return new Administrator(this);
    }
}
