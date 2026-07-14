package oops.week3;

import java.util.Random;

abstract class Compartment {

    public abstract String notice();
}

// First Class
class FirstClass extends Compartment {

    public String notice() {
        return "Welcome to First Class Compartment.";
    }
}

// Ladies
class Ladies extends Compartment {

    public String notice() {
        return "Ladies Compartment - Reserved for Women.";
    }
}

// General
class General extends Compartment {

    public String notice() {
        return "Welcome to General Compartment.";
    }
}

// Luggage
class Luggage extends Compartment {

    public String notice() {
        return "Luggage Compartment - Goods Only.";
    }
}

class TestCompartment {

    public static void main(String[] args) {

        Random random = new Random();

        Compartment[] coach = new Compartment[10];

        for (int i = 0; i < coach.length; i++) {

            int num = random.nextInt(4) + 1;

            switch (num) {

                case 1:
                    coach[i] = new FirstClass();
                    break;

                case 2:
                    coach[i] = new Ladies();
                    break;

                case 3:
                    coach[i] = new General();
                    break;

                case 4:
                    coach[i] = new Luggage();
                    break;
            }
        }

        System.out.println("------ Train Compartments ------");

        for (int i = 0; i < coach.length; i++) {

            System.out.println("Compartment " + (i + 1) + ": " + coach[i].notice());

        }
    }
}