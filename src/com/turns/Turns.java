package com.turns;

import com.cards.Cards;
import com.player.Player;

/**
 * Created by bluemit on 16-3-8.
 */
public class Turns {
    int next;
    Player p1;
    Player p2;
    Cards c0;
    public Turns(Player p1, Player p2,Cards c0)
    {
        this.p1=p1;
        this.p2=p2;
        this.c0=c0;
        for(int i=0;i<p1.handsLimit;++i)
        {
            p1.getcard(c0);
        }
        for(int i=0;i<p2.handsLimit;++i)
        {
            p2.getcard(c0);
        }

        int next=(int)(Math.random()*2);
        if(next==0)
        {
            System.out.println("玩家先行");
            startNext();
        }
        else
        {
            System.out.println("AI先行");
            startNext();
        }
    }

    void startNext()
    {
        if(next==0)
        {
            p1.takeAction();
            next=1;
        }
        else
        {
            p2.takeAction();
            next=0;
        }
    }
}
