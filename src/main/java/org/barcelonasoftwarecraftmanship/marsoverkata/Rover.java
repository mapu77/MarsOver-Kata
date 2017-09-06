package org.barcelonasoftwarecraftmanship.marsoverkata;

public class Rover {
    private Integer x;
    private Integer y;
    private Orientation currentOrientation;

    public Rover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rover(Orientation orientation) {
        this.currentOrientation = orientation;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Orientation getCurrentOrientation() {
        return currentOrientation;
    }

    public void setCurrentOrientation(Orientation currentOrientation) {
        this.currentOrientation = currentOrientation;
    }
}
