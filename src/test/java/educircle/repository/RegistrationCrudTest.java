/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.repository;

import educirce.factories.RegistrationFactory;
import educircle.domain.App;
import educircle.domain.Registration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;

/**
 *
 * @author RASCAL
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class RegistrationCrudTest {
    
    public Long id;
    
    
    @Autowired
    private RegistrationRepository repository;
    
    public RegistrationCrudTest() {
    }
  @Test
    public void create() throws Exception {
        Registration reg = RegistrationFactory
                .createRegistration(,"Donald","Butler","donaldduck@gmail.com","Grade 10",);
        repository.save(reg);
        id=reg.getId();
        Assert.assertNotNull(reg);
     
    }
        
   // @Test(dependsOnMethods = "create") 
    public void read() throws Exception {
        Registration reg = repository.findOne(id);
        Assert.assertNotNull(reg);

    }
    
   //@Test(dependsOnMethods = "read")
   @org.testng.annotations.Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Registration reg = repository.findOne(id);

        Registration register = new Registration
                .Builder(LearnerIdNumber)
                .LearnerName(LearnerName)
                .LearnerSurname(LearnerSurname)
                .ParentEmail(ParentEmail)
                .grade(grade)
                .build();

        repository.save(register);
    }
    
  // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Registration reg = repository.findOne(id);
        repository.delete(reg);
        Registration deletedreg = repository.findOne(id);
        Assert.assertNull(deletedreg);

    }
    
}

