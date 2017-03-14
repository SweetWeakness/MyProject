package com.company;

/**
 * Created by Илюха on 04.03.2017.
 */
import static com.company.Game.minY;

public class Hero {
    static double ACC = 19.8;
    int x;
    int y;

    double Vx;
    double Vy;
    double ay;
    double ax;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setVy(double vy) {
        Vy = vy;
    }

    public void setAy(double ay) {
        this.ay = ay;
    }

    public void setAx(double ax) {
        this.ax = ax;
    }

    public Sprite image;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public double getVy() {
        return Vy;
    }

    public double getAy() {
        return ay;
    }

    public double getAx() {
        return ax;
    }

    public Hero(int x, int y,double vy, double ay, double ax) {
        this.x = x;
        this.y = y;
        Vy = vy;
        this.ay = ay;
        this.ax = ax;
    }

    public void calculatePhisics(double delta){
        if (y > minY) {
            Vy=0;
            y = minY;
        }else{
            Vy += ACC*delta;
        }
        y += (int)Vy*delta;
        System.out.println(y+" "+Vy);

    }
}
