package org.barcelonasoftwarecraftmanship.marsoverkata;

public class Rover {
    private Position currentPosition;
    private Orientation currentOrientation;

    public Rover() {
        this.currentPosition = new Position(0, 0);
        this.currentOrientation = Orientation.NORTH;
    }

    public Rover(Orientation orientation) {
        this.currentOrientation = orientation;
        this.currentPosition = new Position(0, 0);
    }

    public Rover(Position position) {
        this.currentPosition = position;
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

    public void moveForward() {
        switch (currentOrientation) {
            case NORTH:
                this.currentPosition = new Position(0, currentPosition.getY() + 1);
                break;
            case EAST:
                this.currentPosition = new Position(currentPosition.getX() + 1, 0);
                break;
            case SOUTH:
                this.currentPosition = new Position(0, currentPosition.getY() - 1);
                break;
            case WEST:
                this.currentPosition = new Position(currentPosition.getX() - 1, 0);
        }
    }
}
