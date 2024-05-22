package org.example;

public class Main {
    public static void main(String[] args) {
    }

    private static class Person {



        private String firstName;
        private String lastName;
        private int age;
        private String occupation;
        private String address;
        private String email;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(String firstName, String lastName, int age, String occupation, String address, String email) {

            this(firstName, lastName, age);

            this.occupation = occupation;
            this.address = address;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public boolean isTeen() {
            return age >= 13 && age <= 19;
        }
    }
}
