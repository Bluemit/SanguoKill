package com.cards;
//import java.util.Random;
/**
 * Created by bluemit on 16-3-7.
 */
public class Cards {
    public int [] cardHeap;
    int [] washedCardHeap;
    int [] b;
    public int heapHead;
    int cardsNum;
    public Cards()
    {
        cardsNum=30;
        heapHead=0;
        createCards();
        washCards();
    }

    void createCards()
    {
        cardHeap=new int[cardsNum];
        for(int i=0;i<15;++i)
        {
            cardHeap[i]=1;//杀
        }
        for(int i=15;i<24;++i)
        {
            cardHeap[i]=2;//闪
        }
        for(int i=24;i<30;++i)
        {
            cardHeap[i]=3;//桃
        }
        washedCardHeap=new int[cardsNum];
        b=new int [cardsNum];
    }

    public void washCards()
    {
        int time=cardsNum;
        while(time>0)
        {
            int p=(int)(Math.random()*cardsNum-0.5);
            if(b[p]==0)
            {
                b[p] += 1;
                washedCardHeap[cardsNum-time]=cardHeap[p];
                System.out.print(convertCard(cardHeap[p]));
                time-=1;
            }
        }
    }

    public void checkHeap()
    {
        if(heapHead==cardsNum-1)
        {
            washCards();
            heapHead=0;
        }
    }

    public String convertCard(int num)
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
