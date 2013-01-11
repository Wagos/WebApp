package services;

import entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.RoleRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 29.11.12
 * Time: 10:31
 */
@Service
@Transactional

public class RolesService {

    @Autowired
    private RoleRepository roleRepository;

    public void addRoles(List<Role> roles) {
        roleRepository.save(roles);
    }

    @SuppressWarnings("uncheked")
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

}
