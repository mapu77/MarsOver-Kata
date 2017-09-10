package org.barcelonasoftwarecraftmanship.marsoverkata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverTest {
    @Test
    public void givenAnInitialPosition_whenAskForCurrentPosition_thenRoverReturnsTheInitialPosition() throws Exception {
        Rover rover = new Rover(new Position(3, 4));
        assertThat(rover.getCurrentPosition(), is(new Position(3, 4)));
    }

    @Test
    public void givenAnInitialOrientation_whenAskForCurrentOrientation_thenRoverReturnsInitialOrientation() throws Exception {
        Rover rover = new Rover(Orientation.EAST);
        assertThat(rover.getCurrentOrientation(), is(Orientation.EAST));
    }

    @Test
    public void givenNoInitialPosition_whenAskForCurrentPosition_thenRoverReturnsZeroZero() throws Exception {
        Rover rover = new Rover();
        assertThat(rover.getCurrentPosition(), is(new Position(0, 0)));
    }

    @Test
    public void givenNoInitialOrientation_whenAskForCurrentOrientation_thenRoverReturnsNorthOrientation() throws Exception {
        Rover rover = new Rover();
        assertThat(rover.getCurrentOrientation(), is(Orientation.NORTH));
    }

    @Test
    public void givenANorthOrientedRover_whenAskToMoveForward_thenRoversCurrentPositionReturnsZeroOne() throws Exception {
        Rover rover = new Rover(Orientation.NORTH);
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(0, 1)));
    }

    @Test
    public void givenAnEastOrientedRover_whenAskToMoveForward_thenRoversCurrentPositionReturnsOneZero() throws Exception {
        Rover rover = new Rover(Orientation.EAST);
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(1, 0)));
    }

    @Test
    public void givenASouthOrientedRover_whenAskToMoveForward_thenRoversCurrentPositionReturnsZeroMinusOne() throws Exception {
        Rover rover = new Rover(Orientation.SOUTH);
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(0, -1)));
    }

    @Test
    public void givenAWestOrientedRover_whenAskToMoveForward_thenRoversCurrentPositionReturnsMinusOneZero() throws Exception {
        Rover rover = new Rover(Orientation.WEST);
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(-1, 0)));
    }

    @Test
    public void givenANorthOrientedRover_whenAskToMoveForwardTwoTimes_thenRoversCurrentPositionReturnsZeroTwo() {
        Rover rover = new Rover(Orientation.NORTH);
        rover.moveForward();
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(0, 2)));
    }


    @Test
    public void givenANorthOrientedRover_whenAskToMoveBackward_thenRoversCurrentPositionReturnsZeroMinusOne() throws Exception {
        Rover rover = new Rover(Orientation.NORTH);
        rover.moveBackward();
        assertThat(rover.getCurrentPosition(), is(new Position(0, -1)));
    }

    @Test
    public void givenAnEastOrientedRover_whenAskToMoveBackward_thenRoversCurrentPositionReturnsMinusOneZero() throws Exception {
        Rover rover = new Rover(Orientation.EAST);
        rover.moveBackward();
        assertThat(rover.getCurrentPosition(), is(new Position(-1, 0)));
    }

    @Test
    public void givenASouthOrientedRover_whenAskToMoveBackward_thenRoversCurrentPositionReturnsZerosOne() throws Exception {
        Rover rover = new Rover(Orientation.SOUTH);
        rover.moveBackward();
        assertThat(rover.getCurrentPosition(), is(new Position(0, 1)));
    }

    @Test
    public void givenAWestOrientedRover_whenAskToMoveBackward_thenRoversCurrentPositionReturnsOneZero() throws Exception {
        Rover rover = new Rover(Orientation.WEST);
        rover.moveBackward();
        assertThat(rover.getCurrentPosition(), is(new Position(1, 0)));
    }
}
