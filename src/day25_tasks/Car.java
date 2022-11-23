package day25_tasks;

public class Car {
        public String make, model,color;
        public int year;
        public double price;

        public Car(String make, String model, String color, int year, double price) {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.price = price;


        }






        public String toString() {
            return "car{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    '}';
        }
    }

