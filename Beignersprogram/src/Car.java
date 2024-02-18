public class Car {

        // Instance variables
        String make;
        String model;
        int year;

        // Constructor
        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        // Method to display car information
        public void displayInfo() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }

        public static void main(String[] args) {
            // Creating an object of the Car class using the constructor
            Car myCar = new Car("Toyota", "Camry", 2022);

//myCar.make="siyaCar";
//myCar.model="champ";                                     to avoiding this we can use constructor
//myCar.year=2023;
            // Calling a method to display information about the car
            myCar.displayInfo();
        }
    }


