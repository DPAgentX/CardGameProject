package cardapp;

/*
*Factory.java
*creates a player object
*author: Deepkumar Patel, Harsh Pravinbhai Goti, Bikranta Singha
*created: 10th July, 2021
*modified: 12th August, 2021
*/

public class Factory {
    
    public Factory(){
        
    }
    
    /*
     * @return player
    */
    public static Player createPlayer(String type)
    {
        Player player = null;
        player = new Player(type);
        return player;
    }
    
}
