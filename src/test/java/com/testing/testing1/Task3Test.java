package com.testing.testing1;

import com.testing.testing1.task3.Arthur;
import com.testing.testing1.task3.Camera;
import com.testing.testing1.task3.Head;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    private Arthur arthur;
    private Head head;
    private Camera camera;
    private Head.Hair hair;

    @BeforeEach
    void setUp() {
        arthur = new Arthur();
        head = new Head("бесплотная");
        camera = new Camera();
        hair = new Head.Hair();
    }

    @Test
    void headDescriptionTest() {
        assertEquals("бесплотная", head.getDescription());
    }

    @Test
    void arthurFeelTest() {
        arthur.toFeel(head);
        assertEquals("Артур неожиданно почувствовал, как на его бесплотная голова", arthur.getCurrentAction());
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

    @Test
    void cameraMoveTest() {
        camera.toMove();
        assertEquals("камера наезжала при съемке", camera.getCurrentAction());
    }

    @Test
    void hairMoveTest() {
        hair.toMove();
        assertEquals("зашевелились волосы", hair.getCurrentAction());
    }

}
