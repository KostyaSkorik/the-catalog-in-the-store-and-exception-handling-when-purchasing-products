package org.example;

import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Person prs = new Person();
        prs.setAge(19);
        prs.setBudget(5000);
        Market myMarket = new Market("Magnit");
        myMarket.setOpeningHour(11);
        myMarket.setClosingHour(23);
        HashMap<String,Integer> ctgl = new HashMap<>();
        //каталог магазина
        ctgl.put("Конфеты",50);
        ctgl.put("Колбаса",80);
        ctgl.put("Сыр",140);
        ctgl.put("Шампанское",600);
        ctgl.put("Яйца",120);
        ctgl.put("Вино", 800);
        ctgl.put("Молоко", 110);
        ctgl.put("Йогурт", 300);
        ctgl.put("Сливки", 400);
        ctgl.put("Каша", 100);
        ctgl.put("Лук", 200);
        myMarket.setCatalog(ctgl);

        //Корзина покупателя состоящая из того, что он хочет купить
        ArrayList<String> bucket = new ArrayList<>();
        bucket.add("Шампанское");
        bucket.add("Сыр");
        bucket.add("Вишня");
        bucket.add("Йогурт");
        bucket.add("Кекс");
        bucket.add("Сливки");


        try {
            System.out.println(myMarket.sale(prs,bucket));
            System.out.println("Осталось денег: "+prs.getBudget());
        }catch (MarketException ex){
            System.out.println("Ошибка при покупке");
            System.out.println(ex.getMessage());
            System.out.println("Осталось денег: "+prs.getBudget());
        }



    }
}