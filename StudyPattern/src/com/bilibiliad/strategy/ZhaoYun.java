package com.bilibiliad.strategy;

public class ZhaoYun {

    public static void main(String[] args) {
        Context context;

        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new BackDoor()); //拿到妙计
        context.operate(); //拆开执行
        System.out.println("\n\n\n\n\n\n\n\n");

        System.out.println("-----------拆第二个了-------------");
        context = new Context(new GivenGreenLight());
        context.operate(); //执行了第二个锦囊了
        System.out.println("\n\n\n\n\n\n\n\n");

        System.out.println("-----------孙权的小兵追了，咋办？拆第三个------------ - ");
                context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
        System.out.println("\n\n\n\n\n\n\n\n");
    }


}
