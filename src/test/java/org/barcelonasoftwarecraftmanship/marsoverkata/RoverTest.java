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
    public void givenANorthOrientedRoverAndAForwardMove_whenAskForCurrentPosition_thenRoverReturnsZeroOne() throws Exception {
        Rover rover = new Rover();
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(0, 1)));
    }

    @Test
    public void givenAnEastOrientedRoverAndAForwardMove_whenAskForCurrentPosition_thenRoverReturnsOneZero() throws Exception {
        Rover rover = new Rover(Orientation.EAST);
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(1, 0)));
    }

    @Test
    public void givenASouthOrientedRoverAndAForwardMove_whenAskForCurrentPosition_thenRoverReturnsZeroMinusOne() throws Exception {
        Rover rover = new Rover(Orientation.SOUTH);
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(0, -1)));
    }

    @Test
    public void givenAWestOrientedRoverAndAForwardMove_whenAskForCurrentPosition_thenRoverReturnsMinusOneZero() throws Exception {
        Rover rover = new Rover(Orientation.WEST);
        rover.moveForward();
        assertThat(rover.getCurrentPosition(), is(new Position(-1, 0)));
    }
}
