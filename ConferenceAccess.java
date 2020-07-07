import java.util.Scanner;
import java.util.Random;

// Written by Chidiadi Anyanwu

public class ConferenceAccess {

    //Message for blacklisted folks
    static void blacklisted(){

        System.out.println("Sorry, your name is blacklisted.");
    }
    //Message for VIP folks
    static void VIP(){

        System.out.println("You're on our VIP list!");
    }
    //The welcome message with a random seat number that is selected from an array of 30 seats
    static void welcomeMessage(String name) {
        Random randomseat = new Random();
        int seats[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        for (int i = 0; i < 1; i++) {
            seats[i] = randomseat.nextInt(seats.length);
            System.out.println("Hello " + name + ", welcome to the best conference in the world. Your seat number is " + seats[i] + ".");
        }
    }

    //Checking age and cross-checking name with blacklist and VIP list
    static void display (String name,int age){
            if (age >= 18) {
                String blacklist[] = {"Irene", "Victor", "Stephen", "James", "Charles"};
                for(int n = 0; n < blacklist.length; n++) {
                    if (name.equalsIgnoreCase(blacklist[n])) {
                        blacklisted();
                    }
                }
                String VIPlist[] = {"Kiki", "Akachukwu", "Nnamdi", "Chidiadi", "Lani"};
                for(int v = 0; v < VIPlist.length; v++) {
                    if (name.equalsIgnoreCase(VIPlist[v])) {
                        VIP();
                        welcomeMessage(name);
                    }
                }
            }
            //This was the code I initially used before I decided to use an array.
                /*
                if (name.equalsIgnoreCase("Irene")) {
                    blacklisted();
                } else if (name.equalsIgnoreCase("Victor")) {
                    blacklisted();
                } else if (name.equalsIgnoreCase("Stephen")) {
                    blacklisted();
                } else if (name.equalsIgnoreCase("James")) {
                    blacklisted();
                } else if (name.equalsIgnoreCase("Charles")) {
                    blacklisted();
                } else if (name.equalsIgnoreCase("Kiki")) {
                    VIP();
                    welcomeMessage(name);
                } else if (name.equalsIgnoreCase("Akachukwu")) {
                    VIP();
                    welcomeMessage(name);
                } else if (name.equalsIgnoreCase("Nnamdi")) {
                    VIP();
                    welcomeMessage(name);
                } else if (name.equalsIgnoreCase("Chidiadi")) {
                    VIP();
                    welcomeMessage(name);
                } else {
                    welcomeMessage(name);
                }*/

            else {
                System.out.println("Sorry, you're not old enough to attend this important conference. We apologise for any inconveniences.");
            }
    }




  
    public static void main(String[] args) {
        /*For the inputs. They're all called from the main method, here. The main method then
        calls the "display()" method which checks the names and ages and then invokes the "VIP()" method,
        "blacklist()" method and "welcomeMessage()" method to display the VIP message, blacklist message and
        the welcome message — which includes a random seat number which is chosen from an array inside the
        "welcomeMessage()" method.
         */

        Scanner entry = new Scanner(System.in);
        int age;
        String name;

        System.out.println("Enter your name: ");
        name = entry.nextLine();

        System.out.println("Enter your age: ");
        age = entry.nextInt();

        display(name, age);



    }

}