package com.company;
import com.cards.*;
import com.player.*;
import com.turns.Turns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("按0开始游戏");
        Scanner sc=new Scanner(System.in);
        if(sc.nextInt()==0) {}
        Cards game0=new Cards();
        Player p01 = new Player("玩家",false,game0);
        Player p02 = new Player("AI",true,game0);
        p01.opponent=p02;
        p02.opponent=p01;
        System.out.print("\n玩家添加成功！");
        Turns turn0= new Turns(p01,p02,game0);

    }
}
