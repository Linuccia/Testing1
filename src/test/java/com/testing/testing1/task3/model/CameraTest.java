package com.testing.testing1.task3.model;

import com.testing.testing1.task3.model.Camera;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CameraTest {

    private Camera camera;

    @BeforeEach
    void setUp() {
        camera = new Camera();
    }

    @Test
    void cameraMoveTest() {
        camera.toMove();
        assertEquals("камера наезжала при съемке", camera.getCurrentAction());
    }

}
