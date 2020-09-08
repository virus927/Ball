package ru.mirea;
import java.lang.*;


public class TestBall {
    public static void main (String[]args){
        ball d1 = new ball ("красный","баскетболла",1,10);
        ball d2 = new ball ("синий","валейболла",20,13);
        ball d3 = new ball ("белый","футболла",30,15);
        d1.intoRebound();
        d2.intoRebound();
        d3.intoRebound();

    }
}
