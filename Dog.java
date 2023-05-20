package HW.class22.Java;

public class Dog {

        private String dogName;
        private double dogWeight;
        private static String dogBreed = "Mutt";

        // Constructor to initialize instance variables
        public Dog(String dogName, double dogWeight) {
            this.dogName = dogName;
            this.dogWeight = dogWeight;
        }

        // Getter method for dogName
        public String getDogName() {
            return dogName;
        }

        // Getter method for dogWeight
        public double getDogWeight() {
            return dogWeight;
        }

        // Getter method for dogBreed
        public static String getDogBreed() {
            return dogBreed;
        }

        // Method to display the details of the dog
        public void displayDetails() {
            System.out.println("Dog Name: " + dogName);
            System.out.println("Dog Weight: " + dogWeight + " kg");
            System.out.println("Dog Breed: " + dogBreed);
        }
    }

