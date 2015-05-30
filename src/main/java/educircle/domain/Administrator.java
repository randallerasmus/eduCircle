package educircle.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author RASCAL
 */
@Entity
    public class Administrator implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int EmpNo;

    public int getEmpNo() {
        return EmpNo;
    }
    public Long getId() {
        return id;
    }

    public Administrator ()
    {
        
    }
    public Administrator (Builder builder){
        this.id=builder.id;
        this.EmpNo=builder.EmpNo;
     
        
    }
    public static class Builder
    {
        private Integer EmpNo;
        private Long id;
        
    
    
    public Builder (Integer EmpNo)
    {
        this.EmpNo=EmpNo;
       
        
    }
    
    public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
     public Builder copy (Builder value){
        this.id=value.id;
        this.EmpNo=value.EmpNo;
     return this;
        
    }
    public Administrator build()
    {
        return new Administrator(this);
    }
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "educircle.domain.Subject[ id=" + id + " ]";
    }
    
}
