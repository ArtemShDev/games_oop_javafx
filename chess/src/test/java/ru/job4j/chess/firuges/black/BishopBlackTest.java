package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure figure = new BishopBlack(Cell.C8);
        assertThat(figure.position(), is(Cell.C8));
    }

    @Test
    public void wayCorrect() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] steps = figure.way(Cell.G5);
        assertThat(steps, is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void wayIncorrect() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] steps = figure.way(Cell.G7);
    }

    @Test
    public void copy() {
        Figure figure = new BishopBlack(Cell.C8);
        figure = figure.copy(Cell.E6);
        assertThat(figure.position(), is(Cell.E6));
    }
}