package com.company;
import com.cards.*;
import com.player.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int scode=0;
        System.out.println("按任意键开始游戏");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNext())
        {
            Player a = new Player(false);
        }
        Player b = new Player(true);
        System.out.print("玩家添加成功！");
        Cards game0=new Cards();

    }
}
