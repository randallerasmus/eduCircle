/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.repository;

import educirce.factories.ClassroomFactory;
import educircle.domain.App;
import educircle.domain.Classroom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;

/**
 *
 * @author RASCAL
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ClassroomCrudTest 
{
    private Long id;
    
    @Autowired
    private ClassroomRepository repository;
  
    public ClassroomCrudTest() {
    }
    
    @Test
    public void create() throws Exception {
        Classroom admin = ClassroomFactory
                .createClassroom("Randall", "Erasmus","Mrs Lakay");
        repository.save(admin);
        id=admin.getId();
        Assert.assertNotNull(admin);
     
    }
        
   // @Test(dependsOnMethods = "create") 
    public void read() throws Exception {
        Classroom admin = repository.findOne(id);
        Assert.assertNotNull(admin);

    }
    
   //@Test(dependsOnMethods = "read")
   @org.testng.annotations.Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Classroom admin = repository.findOne(id);

        Classroom newclass = new Classroom
                .Builder(admin.getLearnerName())
                .copy(LearnerSurname)
                .TeacherName(TeacherName)
                .build();

        repository.save(newclass);
    }
    
  // @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Classroom admin = repository.findOne(id);
        repository.delete(admin);
        Classroom deletedadmin = repository.findOne(id);
        Assert.assertNull(deletedadmin);

    }
    
}
