package ru.mulyukin.homework.lesson9;

public class User {
    private String surname;
    private String name;
    private String lastname;
    private int yearOfBirth;
    private String email;

    public User(String surname, String name, String lastname, int yearOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void info(){
        System.out.println("ФИО: " + surname + " " + name + " " + lastname + "\n" + "Год рождения: " + yearOfBirth + "\n" + "email: " + email);
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}
