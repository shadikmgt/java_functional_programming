package org.sadik;

import java.util.ArrayList;
import java.util.List;

import static org.sadik.Main.Gender.FEMALE;
import static org.sadik.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Sadik", MALE),
                new Person("Shaheen", FEMALE),
                new Person("iqbal", FEMALE),
                new Person("Milon", MALE),
                new Person("Sakil", FEMALE)
        );
        System.out.println("//Imperative approach: ");
//Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        System.out.println("//Declarative approach: ");
//Declarative approach
        List<Person> females2 =  people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .toList();
        females2.forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;
        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
    }

