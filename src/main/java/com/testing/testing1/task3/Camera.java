package com.testing.testing1.task3;

public class Camera implements Action{

    private String currentAction;

    @Override
    public void toMove() {
        currentAction = this + " наезжала при съемке";
    }

    public String getCurrentAction() {
        return currentAction;
    }

    @Override
    public String toString() {
        return "камера";
    }

}
