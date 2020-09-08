package ru.mirea;
import java.lang.*;
import java.lang.Math;

public class ball{
    private String color;
    private String type;
    private int h;
    private int v;

    public ball(String n,String a,int q,int w){
        color=n;
        type=a;
        h=q;
        v=w;
    }
    public ball(String n,String a){
        color =n;
        type =a;
        h=0;
        v=0;
    }
    public ball(){
        color="qwe";
        type= "rty";
        h=0;
        v=0;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setH(int h){
        this.h=h;
    }
    public void setH2(int v){
        this.v=v;
    }
    public String getColor(String color){
        return color;
    }
    public String getType(){
        return type;
    }
    public int getH(int h){
        return h;
    }
    public int getV(int v){
        return v;
    }
    public String toString(){
        return this.color+", color"+this.type;
    }
    public void intoRebound(){
        System.out.println("Цвет: "+ color + ". Он преднозначен для: "+type);
        System.out.println("Зададим значения для каждого из мячей. 1.)баскетбольный летит с высоты 1 метра со скоросью 10м/c^2. 2.)валейбольный с 20 со скоростью 13. 3.) футбольный с 30 со скоростью 15: "+ (h+(v*v/20)));
    }
}
