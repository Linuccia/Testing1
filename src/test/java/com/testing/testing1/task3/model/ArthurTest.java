package com.testing.testing1.task3.model;

import com.testing.testing1.task3.exception.NoBodyPartException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArthurTest {

    private Arthur arthur;
    private Head head;

    @BeforeEach
    void setUp() {
        arthur = new Arthur();
        head = new Head("бесплотная");
    }

    @Test
    void arthurFeelTest() throws NoBodyPartException {
        arthur.toFeel(head);
        assertEquals("Артур неожиданно почувствовал, как на его бесплотная голова", arthur.getCurrentAction());
    }

    @Test
    void arthurFeelNullTest() {
        assertThrows(NoBodyPartException.class,
                () -> arthur.toFeel(null)
        );
    }

    @Test
    void arthurGuessTest() {
        arthur.toGuess();
        assertEquals("Артур догадался, что это было", arthur.getCurrentAction());
    }

    @Test
    void arthurMoveTest() {
        arthur.toMove();
        assertEquals("Артур начал медленно, но неуклонно двигаться к пульту", arthur.getCurrentAction());
    }

}
