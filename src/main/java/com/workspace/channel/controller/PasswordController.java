package com.workspace.channel.controller;

import com.workspace.channel.model.Password;
import com.workspace.channel.repository.PasswordRepository;
import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PasswordController {

    private final PasswordRepository repository;

    public PasswordController(PasswordRepository repository){
        this.repository = repository;
    }

    //@GetMapping(name="endpoint") is the @Get("/endpoint") for graphql
    @QueryMapping(name = "password")  // Si omites "name", se usa el nombre del método ("getPasswordPoint")
    public List<Password> allPasswords() {
        //This retrieves all the data available in the database by returning a repository object with the method findAll
        return repository.findAll();
    }

    //@MutationMapping(name="method") is the @PostMapping("/addStudent") for graphql
    @MutationMapping(name = "addPassword")
    //The @Argument annotation determine the fields that need to be sent as part of the data type, defined in the type Mutation.
    public Password addPassword(@Argument String origin,
                                @Argument String username,
                                @Argument String email,
                                @Argument String password,
                                @Argument String number,
                                @Argument String identification) {

        Password pwd = new Password();

        pwd.setOrigin(origin);
        pwd.setUsername(username);
        pwd.setEmail(email);
        pwd.setPassword(password);
        pwd.setNumber(number);
        pwd.setIdentification(identification);

        return repository.save(pwd);
    }
}
