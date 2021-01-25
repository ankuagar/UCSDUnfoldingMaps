package module6;

import processing.core.PConstants;
import processing.core.PGraphics;

public interface ShowTitle {

    public default void showTitle(PGraphics pg, String id, float x, float y) {

        int TRI_SIZE = 5;
        pg.pushStyle();
        pg.fill(255, 255, 255);
        pg.textSize(12);
        pg.rectMode(PConstants.CORNER);
        pg.rect(x, y-TRI_SIZE-39, pg.textWidth(id)+6, 39);
        pg.fill(0, 0, 0);
        pg.textAlign(PConstants.LEFT, PConstants.TOP);
        pg.text(id, x+3, y-TRI_SIZE-33);
        pg.popStyle();
    }

}
