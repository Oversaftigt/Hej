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
public class monopoly {
    
    private Player players= new Player();
    
    private ArrayList playerList;
    
    public void play(){
        System.out.println("Welcome to monopoly.");
        
        playerList=players.givePlayersNames();
        
    }
}
