/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.repository;

import educirce.factories.RegistrationFactory;
import educircle.domain.App;
import educircle.domain.Registration;
import educircle.domain.Subject;
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
public class SubjectCrudTest {
    
    public Long id;
    
    
    @Autowired
    private SubjectRepository repository;
    
    public SubjectCrudTest() {
    }
  @Test
    public void create() throws Exception {
        Subject subs = SubjectFactory
                .createSubject(,"Donald",12345);
        repository.save(subs);
        id=subs.getId();
        Assert.assertNotNull(subs);
     
    }
        
   // @Test(dependsOnMethods = "create") 
    public void read() throws Exception {
        Subject subs = repository.findOne(id);
        Assert.assertNotNull(subs);

    }
    
   //@Test(dependsOnMethods = "read")
   @org.testng.annotations.Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Subject subs = repository.findOne(id);

        Subject sub = new Subject
                .Builder(subjectName)
                .subjectCode(subjectCode)
                .build();
        

        repository.save(sub);
    }
    
  // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Subject subs = repository.findOne(id);
        repository.delete(subs);
        Subject deletedsubs = repository.findOne(id);
        Assert.assertNull(deletedsubs);

    }
    
}

