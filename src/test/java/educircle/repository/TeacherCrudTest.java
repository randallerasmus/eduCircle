/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.repository;

import educirce.factories.LearnerFactory;
import educircle.domain.App;
import educircle.domain.Learner;
import educircle.domain.Teacher;
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
public class TeacherCrudTest {
    
    public Long id;
    public TeacherCrudTest() {
    }
    
    @Autowired
    private TeacherRepository repository;
  
    @Test
    public void create() throws Exception {
        Teacher peer = TeacherFactory
                .createTeacher("Information Systems", 0784951,"black","male","Mrs Lakay");
        repository.save(peer);
        id=peer.getId();
        Assert.assertNotNull(peer);
     
    }
        
   // @Test(dependsOnMethods = "create") 
    public void read() throws Exception {
        Learner peer = repository.findOne(id);
        Assert.assertNotNull(peer);

    }
    
   //@Test(dependsOnMethods = "read")
   @org.testng.annotations.Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Learner peer = repository.findOne(id);

        Teacher educators = new Teacher
                .Builder(subjectTitle)
                .contactNumber(contactNumber)
                .race(race)
                .gender(gender)
                .TeacherName(TeacherName)
                .build();

        repository.save(educators);
    }
    
  // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Learner peer = repository.findOne(id);
        repository.delete(peer);
        Learner deletedpeer = repository.findOne(id);
        Assert.assertNull(deletedpeer);

    }
    
}

