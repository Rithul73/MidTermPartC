/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Choose your favourite genre from the following list:");
        // Example genres
        String[] genres = {"Action", "Romance", "Comedy", "Horror"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        int genreChoice = scanner.nextInt();
        
        // Assuming user enters a valid choice for simplicity
        String favouriteGenre = genres[genreChoice - 1];
        
        System.out.println(name + "Your user profile was created, " + ". Your favourite genre is " + favouriteGenre + ".");
    }
}
// Edited by Rithul Chandran on 21st Feb, 2:45
