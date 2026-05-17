package com.workspace.channel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//This annotation allows the class to become a db Table in the database specified in the application properties
@Entity
public class Password {

    //This annotation defines the property id as the Id of the Table.
    @Id
    //This annotation generates the Id value automatically. It's the identity(1,1) version of Spring Boot.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String origin;
    String username;
    String email;
    String password;
    String number;
    String identification;

    //It's necessary to create a method of this class to pass the data type the user will enter.
    //This is the data type which involves id, credential, email and username properties as fields.
    public Password(){

    }

    //Metodos Getter del field Id, como es generado automatico, el usuario debe acceder a el pero no poder modificarlo.
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
