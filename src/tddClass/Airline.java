package tddClass;

import java.util.Objects;
import java.util.Scanner;

public class Airline {

    Scanner userInput = new Scanner(System.in);

    private boolean[] seats;
    private int firstClassSeats;
    private int economyClassSeats;
    private int[] bookFlight;

    private boolean setSeats;

    public Airline(int seats, int bookFlight) {
        this.seats = new boolean[seats];
        this.bookFlight = new int[bookFlight];
    }


//    public void setSeats(int seats) {
//        this.seats = new boolean[seats];
//        this.bookFlight = new String[bookFlight];


//    public boolean getSeats() {
//        return true;
    //   }

    public void economyClassSeats() {
        for (int i = 10; i <= seats.length; i--) {
            if (i >= 6)
                economyClassSeats = i;
        }
    }

    public void setFirstClassSeats() {
        for (int i = 0; i <= seats.length - 5; i++) {
            firstClassSeats = i;
        }
    }

    public void takeSeats(int passenger){
        for (int i = 0; i <= seats.length - 5; i++) {
            setSeats = seats[passenger];
        }

//        private boolean getPassengerSeats() {
//            return ;
//        }

    }

    public int getFirstClass() {
        return firstClassSeats;
    }

    public int economySeats() {
        return economyClassSeats;
    }

    public void firstClassSeat() {
        for (int counter = 0; counter <= bookFlight.length - 1; counter++) {
            if (counter <= 1) {
                firstClassSeats = counter;
            }
        }
    }

    public int getFirstClassSeat() {
        return firstClassSeats;
    }

    public int geteconomySeats() {
        return economyClassSeats;
    }

    public void seteconomySeats() {
        for (int counter = 2; counter <= bookFlight.length; counter--) {
            if (counter >= 2) {
                economyClassSeats = counter;
            }
        }
    }



    public static void main(String[] args) {
        Airline airline = new Airline(10, 1);
        airline.takeSeats(1);
    }


}
// System.out.println("Book a seat:'\n' 1 for firstClass '\n' 2 for Economy");