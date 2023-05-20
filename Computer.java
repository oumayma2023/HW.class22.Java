package HW.class22.Java;

    // Parent class: Computer
    class Computer {
        private String brand;
        private String model;
        private int price;

        public Computer(String brand, String model, int price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getPrice() {
            return price;
        }

        // Common method
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: $" + price);
        }

        // Method to be overridden in subclasses
        public void boot() {
            System.out.println("Booting up...");
        }
    }

    // Subclass: Apple
    class Apple extends Computer {
        private String os;

        public Apple(String model, int price, String os) {
            super("Apple", model, price);
            this.os = os;
        }

        // Override boot method
        @Override
        public void boot() {
            System.out.println("Starting macOS...");
        }

        // Specific method
        public void launchAppStore() {
            System.out.println("Launching App Store...");
        }
    }

    // Subclass: Lenovo
    class Lenovo extends Computer {
        private String processor;

        public Lenovo(String model, int price, String processor) {
            super("Lenovo", model, price);
            this.processor = processor;
        }

        // Override boot method
        @Override
        public void boot() {
            System.out.println("Starting Windows...");
        }

        // Specific method
        public void activateTrackPoint() {
            System.out.println("Activating TrackPoint...");
        }
    }

    // Subclass: HP
    class HP extends Computer {
        private boolean touchScreen;

        public HP(String model, int price, boolean touchScreen) {
            super("HP", model, price);
            this.touchScreen = touchScreen;
        }

        // Override boot method
        @Override
        public void boot() {
            System.out.println("Starting Windows...");
        }

        // Specific method
        public void enableTouchScreen() {
            System.out.println("Enabling Touch Screen...");
        }
    }

    // Subclass: Dell
    class Dell extends Computer {
        private String color;

        public Dell(String model, int price) {
            super("Dell", model, price);
            this.color = color;
        }

        // Override boot method
        @Override
        public void boot() {
            System.out.println("Starting Windows...");
        }

        // Specific method
        public void changeColor(String newColor) {
            System.out.println("Changing color to " + newColor + "...");
            this.color = newColor;
        }
    }

    class Main {
        public static void main(String[] args) {
            // Create an array to store Computer objects
            Computer[] computers = new Computer[4];

            // Create objects of child classes and store them in the array
            computers[0] = new Apple("MacBook Pro", 1999, "macOS");
            computers[1] = new Lenovo("ThinkPad X1 Carbon", 1499, "Intel Core i7");
            computers[2] = new HP("Pavilion x360", 999, true);
            computers[3] = new Dell("XPS 15", 179);
        }
    }