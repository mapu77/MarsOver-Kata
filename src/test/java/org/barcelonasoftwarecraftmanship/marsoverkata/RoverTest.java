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
}
