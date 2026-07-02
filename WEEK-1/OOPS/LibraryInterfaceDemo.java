package oops.week1;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        // ---------------- Test Case 1 ----------------

        KidUser kid = new KidUser();

        System.out.println("Kid User Test Case 1");
        kid.age = 10;
        kid.registerAccount();

        kid.bookType = "Kids";
        kid.requestBook();

        System.out.println();

        System.out.println("Kid User Test Case 2");
        kid.age = 18;
        kid.registerAccount();

        kid.bookType = "Fiction";
        kid.requestBook();

        System.out.println();

        // ---------------- Test Case 2 ----------------

        AdultUser adult = new AdultUser();

        System.out.println("Adult User Test Case 1");
        adult.age = 5;
        adult.registerAccount();

        adult.bookType = "Kids";
        adult.requestBook();

        System.out.println();

        System.out.println("Adult User Test Case 2");
        adult.age = 23;
        adult.registerAccount();

        adult.bookType = "Fiction";
        adult.requestBook();
    }
}