package com.judge;

import com.player.Player;

/**
 * Created by bluemit on 16-3-8.
 */
public class Judge
{
    Player p1,p2;
    public Judge(Player p1,Player p2,int card0)
    {
        this.p1=p1;
        this.p2=p2;
        switch (card0)
        {
            case 1 :judge1();break;
            case 3 :judge2();
        }

    }


    void judge1()//杀
    {
        System.out.println(p1.name+"出了杀");
        p2.react1();
    }

    void judge2()//桃
    {
        System.out.println(p1.name+"出了桃");
    }

}
