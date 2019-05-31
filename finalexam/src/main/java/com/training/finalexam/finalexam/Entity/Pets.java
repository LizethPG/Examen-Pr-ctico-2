package com.training.finalexam.finalexam.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Pets extends DatabaseObject{
    private String petsName;
    private String raceName;
    private String animalType;
}
