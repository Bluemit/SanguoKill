package com.player;

/**
 * Created by bluemit on 16-3-7.
 */
public class Player {
    public static int counts=0;
    int id;
    int hp;
    int []hands;
    int handsnum;
    boolean isAI;
    public Player(boolean isAI)
    {
        this.id=counts;
        this.isAI=isAI;
        counts+=1;
    }
    void getcards()
    {
        
    }
    void printinfo()
    {

    }
}
