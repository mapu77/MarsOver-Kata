package org.barcelonasoftwarecraftmanship.marsoverkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PositionTest {
    @Test
    public void givenTwoEqualPositions_WhenAskForEquality_ThenTheyAreComparedToEqual() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(1, 2);
        assertEquals(p1, p2);
    }

    @Test
    public void givenTwoDifferentPositions_WhenAskForEquality_ThenTheyAreComparedToNotEqual() {
        Position p1 = new Position(1, 2);
        Position p2 = new Position(1, 3);
        assertNotEquals(p1, p2);
    }
}
