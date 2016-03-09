package com.player;

import com.cards.Cards;
import com.judge.Judge;

import java.util.Scanner;

/**
 * Created by bluemit on 16-3-7.
 */
public class Player {
    public static int counts=0;
    public String name;
    public int id;
    public int hp;
    public int []hands;
    public int handsNum;
    public int handsLimit;
    boolean isAI;
    Cards c0;
    public Player opponent;
    public Player(String name,boolean isAI,Cards c0)
    {
        this.name=name;
        this.id=counts;
        this.isAI=isAI;
        counts+=1;
        handsNum=0;
        handsLimit=4;
        this.hp=4;
        this.hands=new int[handsLimit+10];
        this.c0=c0;
        printInfo();
    }
    public void getCard(Cards c0)
    {
        hands[handsNum]=c0.cardHeap[c0.heapHead];
        handsNum+=1;
        c0.heapHead+=1;
        c0.checkHeap();
    }

    public int popCard(int cardIndex)
    {
        int poped=hands[cardIndex-1];
        hands[cardIndex-1]=hands[handsNum-1];
        handsNum-=1;
        return poped;
    }

    public void takeAction()
    {
        printInfo();
        showAvail();
        System.out.print("  请输入您要出的牌的序号：");
        if (!isAI)
        {
            Scanner sc=new Scanner(System.in);
            int cardIndex=sc.nextInt();
            int pushed=popCard(cardIndex);
            Judge judgex=new Judge(this, this.opponent, pushed);
        }
        else
        {

        }

    }

    public void react1()
    {
        if(!isAI)
        {
            System.out.print("是否出闪？输入0表示放弃");

            Scanner sc=new Scanner(System.in);
            int cardIndex=sc.nextInt();
            if(cardIndex==0)
            {
                hp-=1;
            }
            else
            {

            }
        }

    }
    void printInfo()
    {
        System.out.print('\n');
        System.out.print("姓名："+name);
        System.out.print("  ");
        System.out.print("HP：");
        System.out.print(hp);
        System.out.print("  ");
        for(int i=0;i<handsNum;++i)
        {
            System.out.print('[');
            System.out.print(i+1);
            System.out.print(']');
            System.out.print(c0.convertCard(hands[i]));
        }
        System.out.print('\n');
    }

    void showAvail()
    {
        System.out.print("可以出的牌有：");
        for(int i=0;i<handsNum;++i)
        {
            if(hands[i]==1 | (hp<4 && hands[i]==3))
            {
                System.out.print('[');
                System.out.print(i+1);
                System.out.print(']');
                System.out.print(c0.convertCard(hands[i]));
            }
        }
    }
//    void show
}
