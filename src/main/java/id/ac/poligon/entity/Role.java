package id.ac.poligon.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Role {

    @Id

    private String id;
    private String role;

    // @OneToMany
    // private List<User> user;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
