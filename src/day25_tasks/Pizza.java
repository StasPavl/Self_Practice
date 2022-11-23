package day25_tasks;

public class Pizza {
        public char size;
        public int numberOfCheeseTopping;
        public int numberOfPepperoniTopping;

        public double calcCost() {
            double totalPrice = 0;
            switch (size) {
                case 'S':
                case 's':
                    totalPrice = 10 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
                    break;
                case 'M':
                case 'm':
                    totalPrice = 12 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
                    break;
                case 'L':
                case 'l':
                    totalPrice = 14 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
                    break;
                default:
                    System.err.println("Invalid size: " + size);
            }

            return totalPrice;
        }

        public String toString() {
            return "Pizza{" +
                    "size=" + size +
                    ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                    ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                    ", total price=" + calcCost() +
                    '}';
        }

        public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
            this.size = size;
            this.numberOfCheeseTopping = numberOfCheeseTopping;
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }
    }




/*
Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
