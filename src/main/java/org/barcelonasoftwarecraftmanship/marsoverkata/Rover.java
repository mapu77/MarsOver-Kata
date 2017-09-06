package org.barcelonasoftwarecraftmanship.marsoverkata;

public class Rover {
    private Integer x;
    private Integer y;
    private Orientation currentOrientation;
    private Position currentPosition;

    public Rover() {
        this.x = 0;
        this.y = 0;
        this.currentOrientation = Orientation.NORTH;
    }

    public Rover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rover(Orientation orientation) {
        this.currentOrientation = orientation;
    }

    public Rover(Position position) {

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

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }
}
