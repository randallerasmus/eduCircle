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
    public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cellNumber;
    private String homeNumber;

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getcellNumber() {
        return cellNumber;
    }
    public Long getId() {
        return id;
    }

    public Contact ()
    {
        
    }
    public Contact (Builder builder){
        this.id=builder.id;
        this.cellNumber=builder.cellNumber;
        this.homeNumber=builder.homeNumber;
     
        
    }
    public static class Builder
    {
        private String cellNumber;
        private String homeNumber;
        private Long id;
        
    
    
    public Builder (String cellNumber)
    {
        this.cellNumber=cellNumber;
    }
    
    public Builder id(Long value)
    {
        this.id=value;
        return this;
    }
    public Builder homeNumber (String value)
    {
        this.homeNumber=value;
        return this;
    }
     public Builder copy (Builder value){
        this.id=value.id;
        this.cellNumber=value.cellNumber;
        this.homeNumber=value.homeNumber;
     return this;
        
    }
    public Contact build()
    {
        return new Contact(this);
    }

        public Object Name(String Name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "educircle.domain.Contact[ id=" + id + " ]";
    }
    
}
