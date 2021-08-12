/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

/**
 *
 * @author deep2
 */
public class Factory {
    
    public static Player createPlayer(String type)
    {
        Player player = null;
        player = new Player(type);
        return player;
    }
    
}
