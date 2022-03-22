package TrafficLights;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class TrafficLights extends WindowProgram {

    /* The amount of time to pause between frames (50fps) */
    private static final double PAUSE_TIME = 4000;

    /* Size of the world */
    public static final int APPLICATION_WIDTH = 390;
    public static final int APPLICATION_HEIGHT = 730;

    public void run(){
        GRect trafficLightsBody = makeTrafficLightsBody();
        GOval redOval = makeRedOval();
        GOval yellowOval = makeYellowOval();
        GOval greenOval = makeGreenOval();

        add(trafficLightsBody);
        add(redOval);
        add(yellowOval);
        add(greenOval);

        liveTrafficLights(redOval, yellowOval, greenOval);

    }

    private void liveTrafficLights(GOval redOval, GOval yellowOval, GOval greenOval) {

        double time = 0;

        while (time != 100){
            redColorOn(redOval, greenOval, yellowOval);
            yellowColorOn(redOval, greenOval, yellowOval);
            greenColorOn(redOval, greenOval, yellowOval);

            time++;
        }
    }

    private void greenColorOn(GOval redOval, GOval greenOval, GOval yellowOval) {
        redOval.setColor(Color.black);
        yellowOval.setColor(Color.black);
        greenOval.setColor(Color.green);
        pause(2000);
        blindGreenColor(greenOval);
    }

    private void blindGreenColor(GOval greenOval) {
        for (int i = 1; i < 4; i++){
            greenOval.setColor(Color.black);
            pause(500);
            greenOval.setColor(Color.green);
            pause(500);
        }
    }

    private void yellowColorOn(GOval redOval, GOval greenOval, GOval yellowOval) {
        redOval.setColor(Color.black);
        yellowOval.setColor(Color.yellow);
        greenOval.setColor(Color.black);
        pause(2000);
        blindYellowColor(yellowOval);
    }

    private void blindYellowColor(GOval yellowOval) {
        for (int i = 1; i < 4; i++){
            yellowOval.setColor(Color.black);
            pause(500);
            yellowOval.setColor(Color.yellow);
            pause(500);
        }
    }

    private void redColorOn(GOval redOval, GOval greenOval, GOval yellowOval) {
        redOval.setColor(Color.red);
        yellowOval.setColor(Color.black);
        greenOval.setColor(Color.black);
        pause(2000);
        blindRedColor(redOval);
    }

    private void blindRedColor(GOval redOval) {
        for (int i = 1; i < 4; i++){
            redOval.setColor(Color.black);
            pause(500);
            redOval.setColor(Color.red);
            pause(500);
        }
    }

    private GOval makeGreenOval() {
        GOval greenOval = new GOval(120, 460, 150, 150);
        greenOval.setFilled(true);

        return greenOval;
    }

    private GOval makeYellowOval() {
        GOval yellowOval = new GOval(120, 290, 150, 150);
        yellowOval.setFilled(true);

        return yellowOval;
    }

    private GOval makeRedOval() {
        GOval redOval = new GOval(120, 120, 150, 150);
        redOval.setFilled(true);

        return redOval;
    }

    private GRect makeTrafficLightsBody() {
        GRect trafficLightsBody = new GRect(100, 100, 190, 530);

        return trafficLightsBody;
    }

}
