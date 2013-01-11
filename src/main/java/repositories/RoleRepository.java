package repositories;

import entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 30.11.12
 * Time: 19:26
 */
public interface RoleRepository extends JpaRepository<Role, String> {

}
