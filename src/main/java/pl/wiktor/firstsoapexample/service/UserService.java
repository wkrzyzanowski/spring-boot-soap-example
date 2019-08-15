package pl.wiktor.firstsoapexample.service;

import org.springframework.stereotype.Service;
import pl.wiktor.first_soap_example.User;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Service
public class UserService {

    private static final HashMap<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        User peter = new User();
        peter.setName("Peter");
        peter.setEmpId(1);
        peter.setSalary(2000.0);

        users.put(peter.getName(), peter);

        User katja = new User();
        katja.setName("Katja");
        katja.setEmpId(2);
        katja.setSalary(1500.0);

        users.put(katja.getName(), katja);

        User adolf = new User();
        adolf.setName("Peter");
        adolf.setEmpId(3);
        adolf.setSalary(2500.99);

        users.put(adolf.getName(), adolf);
    }

    public User getUser(String name) {
        return users.get(name);
    }

}
