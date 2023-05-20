package HW.class22.Java;

public class main {

        public static void main(String[] args) {
            // Create two Dog objects
            Dog dog1 = new Dog("Buddy", 10.5);
            Dog dog2 = new Dog("Max", 15.2);

            // Print details of the first dog
            System.out.println("Details of Dog 1:");
            System.out.println("Name: " + dog1.getDogName());
            System.out.println("Weight: " + dog1.getDogWeight() + " kg");
            System.out.println("Breed: " + Dog.getDogBreed());
            System.out.println();

            // Print details of the second dog
            System.out.println("Details of Dog 2:");
            System.out.println("Name: " + dog2.getDogName());
            System.out.println("Weight: " + dog2.getDogWeight() + " kg");
            System.out.println("Breed: " + Dog.getDogBreed());
        }
    }

