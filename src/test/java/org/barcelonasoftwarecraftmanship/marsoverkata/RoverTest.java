package org.barcelonasoftwarecraftmanship.marsoverkata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverTest {
    @Test
    public void givenAnInitialPoint_whenAskForCurrentPosition_thenRoverReturnsTheInitialPosition() throws Exception {
        Rover rover = new Rover(3,4);
        assertThat(rover.getX(), is(3));
        assertThat(rover.getY(), is(4));
    }

    @Test
    public void givenAnInitialOrientation_whenAskForCurrentOrientation_thenRoverReturnsInitialOrientation() throws Exception {
        Rover rover = new Rover(Orientation.NORTH);
        assertThat(rover.getCurrentOrientation(), is(Orientation.NORTH));
    }

    @Test
    public void givenNoInitialPosition_whenAskForCurrentPosition_thenRoverReturnsZeroZero() throws Exception {
        Rover rover = new Rover();
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void givenAnInitialOrientation_whenAskForCurrentOrientation_thenRoverReturnsNorthOrientation() throws Exception {
        Rover rover = new Rover();
        assertThat(rover.getCurrentOrientation(), is(Orientation.NORTH));
    }
}
