package spring.training.employees;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private String username;

    private String password;

    @Column(name = "is_enabled")
    private boolean enabled;

    @ElementCollection
    @CollectionTable(name = "authorities",
      joinColumns = @JoinColumn(name = "username"))
    @Column(name = "authority")
    private List<String> roles;
}
