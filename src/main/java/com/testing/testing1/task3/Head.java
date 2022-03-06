package com.testing.testing1.task3;

public class Head extends BodyPart{

    public Head(String description) {
        super(description);
    }

    public static class Hair implements Action {

        private String currentAction;

        @Override
        public void toMove() {
            currentAction = "зашевелились " + this;
        }

        public String getCurrentAction() {
            return currentAction;
        }

        @Override
        public String toString() {
            return "волосы";
        }
    }

    @Override
    public String toString() {
        return description + " голова";
    }

}
