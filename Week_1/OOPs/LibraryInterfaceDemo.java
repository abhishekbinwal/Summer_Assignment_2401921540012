// OOPs TOPIC — INTERFACE

// A library needs to develop an online application for two types of
// users/roles, Adults and children. Both of these users should be able to
// register an account.

// My Approach :

//  A interface and its 2 abstract methods . 1 class for adults and 1 class for
// children which implements the interface and its methods containing some
// attributes and methods to display the details of the users.
// main class and main method to create objects of both classes and call the
// methods to display the details of the users. which will be tested by some
// test cases.

// START

import java.util.*;
import java.io.*;

interface LibraryUser {
    void registerAccount();

    void requestBook();
}

class KidUser implements LibraryUser {
    int age;
    String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser {
    int age;
    String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test case 1: KidUser
        KidUser kid1 = new KidUser(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();

        KidUser kid2 = new KidUser(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        // Test case 2: AdultUser
        AdultUser adult1 = new AdultUser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        AdultUser adult2 = new AdultUser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}
