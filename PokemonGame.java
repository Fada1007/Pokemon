import java.io.*;
import java.util.Scanner;

public class PokemonGame {

    public static void main(String[] args) {
        Pokemon Charecter = new Pokemon(); 
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome" + " " + name);
        Charecter.showStatus();
    }
}