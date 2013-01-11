package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 31.10.12
 * Time: 17.34
 */
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "roleName")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String id) {
        name = id;
    }
}
