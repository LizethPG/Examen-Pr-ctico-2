package com.training.finalexam.finalexam.Model;

public enum LegCount {
    ZERO_LEGS("ZERO_LEGS"),
    TWO_LEGS ("TWO_LEGS"),
    FOUR_LEGS("FOUR_LEGS");

    private String leg;

    LegCount(String leg){
        this.leg = leg;

        public String leg() {
            return leg;
        }
    }
}
