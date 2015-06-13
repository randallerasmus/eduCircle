/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.Repository;

import educircle.domain.Demographics;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author RASCAL
 */
public interface EventRepository extends CrudRepository<Demographics,Long>
{
  
}
