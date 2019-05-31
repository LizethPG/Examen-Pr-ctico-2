package com.training.finalexam.finalexam.Entity;

import com.training.finalexam.finalexam.Model.LegCount;
import com.training.finalexam.finalexam.Model.Terrain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
public class AnimalType extends DatabaseObject{
    @Enumerated(EnumType.STRING)
    @Column(name = "leg_count")
    private LegCount legCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "terrain")
    private Terrain terrain;
}
