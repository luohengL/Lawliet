package com.luoh.lawliet.demo.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: luoh
 * @Date: 2019-07-17 20:34
 * @Description:
 */
public class MainTest {


    /**
     *
     *
     *
     * PECS
     * :  Producer extends and Consumer super
     * @param args
     */
    public static void main(String[] args) {



        Fruit f =new Apple();
        /**
         *放苹果的盘子不是放水果的盘子
         */

        //Plate<Fruit> plate=new Plate<Apple>(new Apple());
        Plate<Apple> plate1=new Plate<Apple>(new Apple());
        Plate<? extends Fruit> plate2=new Plate<Apple>(new Apple());
        Fruit apple=plate2.getIterm();
      //  plate2.setIterm(new Apple());
       // plate2.setIterm(new Fruit());

        //Plate<? super Fruit> plate3=new Plate<Apple>(new Apple());
        Plate<? super Fruit> plate3=new Plate<Food>(new Apple());

        plate3.setIterm(new Apple());
        // plate3.setIterm(new Meat());
      //  Fruit apple3=  plate3.getIterm();
        plate3.setIterm(new Fruit());
        plate3.setIterm(new RedApple());
     //   plate3.setIterm(new Food());

      //  List<? extends Fruit>  list=new ArrayList<Apple>(new Apple());


    }
}
