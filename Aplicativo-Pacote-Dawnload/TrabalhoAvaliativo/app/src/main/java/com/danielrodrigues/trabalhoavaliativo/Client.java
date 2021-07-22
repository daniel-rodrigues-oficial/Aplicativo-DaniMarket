package com.danielrodrigues.trabalhoavaliativo;

public class Client {

    private String name, specialty, birthDate, hour;
    private byte age, day;

    //private double hour;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return  "Nome: " + this.name +
                "\nIdade: " + this.age +
                "\ndata de nasciento: "+ this.birthDate +
                "\nEspecialidade: "+ this.specialty +
                "\nHorario: " + this.hour +
                "\nDia: " +this.day;

    }
}
