package com.player;

import com.cards.Cards;

import java.util.Scanner;

/**
 * Created by bluemit on 16-3-7.
 */
public class Player {
    public static int counts=0;
    public String name;
    int id;
    public int hp;
    int []hands;
    public int handsNum;
    public int handsLimit;
    boolean isAI;
    Cards c0;
    public Player(String name,boolean isAI,Cards c0)
    {
        this.name=name;
        this.id=counts;
        this.isAI=isAI;
        counts+=1;
        handsNum=0;
        handsLimit=4;
        this.hp=4;
        this.hands=new int[handsLimit+3];
        this.c0=c0;
        printinfo();
    }
    public void getcard(Cards c0)
    {
        hands[handsNum]=c0.cardHeap[c0.heapHead];
        handsNum+=1;
        c0.checkHeap();
    }
    public void takeAction()
    {
        printinfo();
        if (!isAI)
        {
            Scanner sc=new Scanner(System.in);
            int cardIndex=sc.nextInt();
        }

    }
    void printinfo()
    {
        System.out.print('\n');
        System.out.print("姓名："+name);
        System.out.print("HP：");
        System.out.print(hp);
        for(int i=0;i<handsNum;++i)
        {
            System.out.print(c0.convertCard(hands[i]));
        }
    }
}
