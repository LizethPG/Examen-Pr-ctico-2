package com.training.finalexam.finalexam.Entity;

//import com.training.finalexam.finalexam.;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.tool.schema.extract.spi.ExtractionContext;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Persona extends DatabaseObject {

    @Column(name = "name", nullable = false)
    private String Name;
    private Integer age;

    @OneToMany(fetch = FetchType.LAZY)//Realiza la conexion con lista de pets
    private List<Pets> pets;

    @Column(name = "uuid", nullable = false, updatable = false)//Realiza la identificación con el ID
    private String uniqueId;

    public Persona (String Name, Integer age, String uuid) {
        this.Name = Name;
        this.age = age;
        this.uniqueId = uuid;
    }

    public Persona(String Name, String uuid) { //Jerarquía de llenado de la tabla
        this(Name, null, uuid);
    }

    public Persona() {
    }
}

