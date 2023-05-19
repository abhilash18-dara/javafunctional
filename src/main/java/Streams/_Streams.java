package Streams;


import java.util.List;

public class _Streams {
    public static void main(String[] args) {
        /*List<Person> people = List.of(
                new Person("Abhilash",MALE)
        );*/
        class Person{
            private final String name;
            private final Gender gender;

            public Person(String name, Gender gender) {
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
            enum Gender {
                MALE,FEMALE;

            }
        }

    }

}
