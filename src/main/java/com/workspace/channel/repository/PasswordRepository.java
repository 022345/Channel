package com.workspace.channel.repository;

import com.workspace.channel.model.Password;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interfaces are usually used as a blueprint.
// But in this case these have the purpose to extend the JpaRepository class to then through
// Spring generate all the code needed in the other layers

//1] This interfaces extends the JpaRepository receiving the parameters
// (object of the Password which define the data that should be received and it's properties, Integer because the ID is Integer type).
@Repository
public interface PasswordRepository extends JpaRepository<Password, Integer> {
    /*

    La interfaz PasswordRepository hereda los metodos de la clase JpaRepository.
    Spring Data JPA genera automáticamente una clase que implementa esa interfaz.
    Esa clase contiene código real (escrito por Spring, no por ti) que traduce
    llamadas como:

    repository.findById(1) → SELECT ... FROM password WHERE id=1

    repository.findAll() → SELECT ... FROM password

    repository.save(p) → INSERT INTO password ... o UPDATE ...

    repository.deleteById(1) → DELETE FROM password WHERE id=1

    */
}
