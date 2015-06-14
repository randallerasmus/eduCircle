package educircle.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author RASCAL
 */
@Embeddable
    public class Contact implements Serializable {
   
    private String cellNumber;
    private String homeNumber;

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getCellNumber() {
        return cellNumber;
    }
    public Contact ()
    {
        
    }
    public Contact (Builder builder){
        this.cellNumber=builder.cellNumber;
        this.homeNumber=builder.homeNumber;
    }
    public static class Builder
    {
        private String cellNumber;
        private String homeNumber;

        public Builder (String cellNumber)
    {
        this.cellNumber=cellNumber;
    }
   
    public Builder homeNumber (String value)
    {
        this.homeNumber=value;
        return this;
    }
     public Builder copy (Builder value){
       this.cellNumber=value.cellNumber;
        this.homeNumber=value.homeNumber;
     return this;
        
    }
    public Contact build()
    {
        return new Contact(this);
    }

    }
}