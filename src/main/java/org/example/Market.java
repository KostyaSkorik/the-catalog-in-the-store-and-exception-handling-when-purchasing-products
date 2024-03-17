package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Market {

    private String title;
    private HashMap<String,Integer> catalog;
    private int openingHour;
    private int closingHour;

    public Market(String title){
        this.title=title;
    }

    public HashMap<String, Integer> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<String, Integer> catalog) {
        this.catalog = catalog;
    }

    public String getTitle() {
        return title;
    }

    public int getOpeningHour() {
        return openingHour;
    }

    public int getClosingHour() {
        return closingHour;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOpeningHour(int openingHour) {
        this.openingHour = openingHour;
    }

    public void setClosingHour(int closingHour) {
        this.closingHour = closingHour;
    }

    public ArrayList<String> sale(Person p, ArrayList<String> bucket) throws MarketException{
        ArrayList<String> purchases = new ArrayList<>();
        int wallet = p.getBudget();
        for (String product : bucket){
            if (getCatalog().containsKey(product)){
                wallet=wallet-this.catalog.get(product);
                if (wallet<0){
                    throw new MarketException("Недостаточно средств для покупки");
                }
                if(p.getAge()<18){
                    if (product.equals("Пиво") || product.equals("Вино") || product.equals("Шампанское")){
                        throw new MarketException("Ещё маленький");

                    }
                }
                purchases.add(product);
                p.setBudget(wallet);
            }else {
                System.out.println("К сожалению "+ product + " сейчас нет в магазине");
            }

        }

        return purchases;
    }
}
