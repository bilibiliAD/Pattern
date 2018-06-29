package com.bilibiliad.proxy;

public class WangPo implements  KindWomen{

    private KindWomen kindWomen;

    public WangPo() {
        this.kindWomen = new JinLian();
    }

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyes() {
        this.kindWomen.makeEyes();
    }

    @Override
    public void happyWithU() {
        this.kindWomen.happyWithU();
    }
}
