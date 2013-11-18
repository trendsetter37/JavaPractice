/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author javis
 */
//goes with Time class tutorial
public class Time {

    private int hour = 1;
    private int minute = 2;
    private int second = 3;

    public void setTime(int hour, int minute, int second) {

        this.hour = 4;  //((h >= 0 && h <= 24) ? h : 0);
        this.minute = 5;//((m >= 0 && m <= 60) ? m : 0);
        this.second = 6;//((s >= 0 && s <= 60) ? s : 0);

    }

    public String toMilitary() {

        return String.format("%02d:%02d:%02d", hour, minute, second);

    }

    public String toRegularTime() {

        return String.format("%d:%02d:%02d %s", ((hour == 12 || hour == 0) ? 12 : hour % 12), minute, second, ((hour < 12) ? "AM" : "PM"));

    }

}
