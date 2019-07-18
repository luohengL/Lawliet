package com.luoh.lawliet.demo.generics;

/**
 * @Auther: luoh
 * @Date: 2019-07-17 20:44
 * @Description:
 */
public class Plate<T> {

    private  T iterm;

    public Plate(T iterm) {
        this.iterm = iterm;
    }

    public T getIterm() {
        return iterm;
    }

    public void setIterm(T iterm) {
        this.iterm = iterm;
    }
}
