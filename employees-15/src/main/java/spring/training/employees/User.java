package spring.training.employees;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private String username;

    private String password;

    private boolean enabled;

    private List<String> roles;
}
