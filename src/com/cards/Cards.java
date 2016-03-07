package com.cards;
//import java.util.Random;
/**
 * Created by bluemit on 16-3-7.
 */
public class Cards {
    public int [] cardHeap;
    int [] washedCardHeap;
    int [] b;
    public Cards()
    {
        createCards();
        washCards();
    }

    void createCards()
    {
        cardHeap=new int[20];
        for(int i=0;i<10;++i)
        {
            cardHeap[i]=1;//杀
        }
        for(int i=10;i<16;++i)
        {
            cardHeap[i]=2;//闪
        }
        for(int i=16;i<20;++i)
        {
            cardHeap[i]=3;//桃
        }
        washedCardHeap=new int[20];
        b=new int [20];
    }

    void washCards()
    {
        int time=20;
        while(time>0)
        {
            int p=(int)(Math.random()*20-0.5);
            if(b[p]==0)
            {
                b[p] += 1;
                washedCardHeap[20-time]=cardHeap[p];
                System.out.print(convertCard(cardHeap[p]));
            }
        }
    }


    String convertCard(int num)
    {
        switch (num)
        {
            case 1:return "杀";
            case 2:return "闪";
            case 3:return "桃";
        }
        return "出错";
    }

}
