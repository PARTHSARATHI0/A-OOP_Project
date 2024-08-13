package Game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void testValidMoves() {
        ticTacToe.buttons[0].doClick();
        assertEquals("X", ticTacToe.buttons[0].getText());

        ticTacToe.buttons[1].doClick();
        assertEquals("O", ticTacToe.buttons[1].getText());
    }

    @Test
    void testInvalidMoves() {
        ticTacToe.buttons[0].doClick();
        assertEquals("X", ticTacToe.buttons[0].getText());

        ticTacToe.buttons[0].doClick();
        assertEquals("X", ticTacToe.buttons[0].getText()); 
    }

    @Test
    void testWinConditions() {
        ticTacToe.buttons[0].doClick(); 
        ticTacToe.buttons[3].doClick(); 
        ticTacToe.buttons[1].doClick(); 
        ticTacToe.buttons[4].doClick(); 
        ticTacToe.buttons[2].doClick(); 
        }
}
