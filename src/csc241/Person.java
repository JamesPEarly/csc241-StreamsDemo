package csc241;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
    private String lastName, firstName;
    private LocalDate birthday;

    public Person(String lastName, String firstName, int year, int month, int day){
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = LocalDate.of(year, month, day);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public int compareTo(Person other) {
        int compareVal = this.lastName.compareTo(other.getLastName());
        if (compareVal != 0) {
            return compareVal;
        }
        // Same last names, use first name comparison
        return this.firstName.compareTo(other.getFirstName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName     + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
