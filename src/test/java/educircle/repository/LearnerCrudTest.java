/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.repository;

import educirce.factories.LearnerFactory;
import educircle.domain.App;
import educircle.domain.Learner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author RASCAL
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class LearnerCrudTest {
    
    public Long id;
    public LearnerCrudTest() {
    }
    
    @Autowired
    private ClassroomRepository repository;
  
    @Test
    public void create() throws Exception {
        Learner stud = LearnerFactory
                .createLearner("Randall", 84122951,"Erasmus");
        repository.save(stud);
        id=stud.getId();
        Assert.assertNotNull(stud);
     
    }
        
   // @Test(dependsOnMethods = "create") 
    public void read() throws Exception {
        Learner stud = repository.findOne(id);
        Assert.assertNotNull(stud);

    }
    
   //@Test(dependsOnMethods = "read")
   @org.testng.annotations.Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Learner stud = repository.findOne(id);

        Learner studs = new Learner
                .Builder(LearnerIdNumber)
                .LearnerName(LearnerName)
                .LearnerSurname(LearnerSurname)
                .build();

        repository.save(studs);
    }
    
  // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Learner stud = repository.findOne(id);
        repository.delete(stud);
        Learner deletedstud = repository.findOne(id);
        Assert.assertNull(deletedstud);

    }
    
}

