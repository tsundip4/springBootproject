package com.example.restApi.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int roll;
    String name;
    int fee;

    public Student(){

    }
    public Student(int roll, String name,int fee) {
        this.roll = roll;
        this.name = name;
        this.fee = fee;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
