package com.bilibiliad.proxy;

public class MenQing {
    public static  void main(String[] args){
        JiaShi jiaShi = new JiaShi();
        WangPo wangPo = new WangPo(jiaShi);

        wangPo.makeEyes();
        wangPo.happyWithU();
    }
}
