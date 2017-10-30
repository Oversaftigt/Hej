/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.*;

/**
 *
 * @author User
 */
public class Player {

    private int numberOfPlayers;
    private ArrayList<String> names;
    Scanner input = new Scanner(System.in);
    private int tal;
    private Field currentField;
    
    public ArrayList givePlayersNames() {
        System.out.println("There can be up to 5 players in this game.\nPlease enter the number of players wanted:");

        
        //This first input determines the number of players, and the input has to be an integer from 1 to 5
        while (numberOfPlayers <= 0 || numberOfPlayers > 5) {
            if (input.hasNextInt() == true) {
                numberOfPlayers = input.nextInt();
            }
            if (numberOfPlayers==1 || numberOfPlayers==2 || numberOfPlayers==3 || numberOfPlayers==4 || numberOfPlayers==5){
                break;
            }
            System.out.println("Please enter an integer between 1 and 5");
            input.nextLine();
        }

        //Name the players
        ArrayList<String> names = new ArrayList<String>(numberOfPlayers);
        System.out.println(numberOfPlayers + " players in this game.");
        for (int i = 1; i < numberOfPlayers + 1; i++) {
            System.out.println("______________________________________");
            System.out.println("\nEnter the name of player " + i + ":");

            names.add(input.next());

            System.out.println(names.get(i - 1) + " has joined the game.");
            
        }
        return names;
    }

    public ArrayList getNames(){
        
        return names;
    }

    

}
