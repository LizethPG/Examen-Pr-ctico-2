package com.training.finalexam.finalexam.Model;

public enum Terrain {
    WATER ("ZERO_LEGS"),
    EARTH ("TWO_LEGS"),
    SKY("FOUR_LEGS");

    private String habitat;

    Terrain(String habitat){
        this.habitat = habitat;

        public String habitat(){
            return habitat;
        }
    }
    }
