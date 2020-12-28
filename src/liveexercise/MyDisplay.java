package liveexercise;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
    public void setup() {
        size(400, 400);
        background(233, 200, 200);
    }

    public void draw() {

        fill(255, 255, 0);
        ellipse(width/2,height/2,width -10, height-10);
        fill(0,0,0);
        ellipse(125,125,40, 15);
        ellipse(275,125,40, 15);
        noFill();
        arc(width/2, height/2 + 75, 75, 45, 0, PI);

    }
    public static void main (String[] args) {
        //Add main method for running as application
        PApplet.main(new String[]{"--present", "liveexercise.MyDisplay"});
    }
}
