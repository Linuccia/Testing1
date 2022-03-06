package com.testing.testing1.task3;

public class Arthur implements Action{

    private String currentAction;

    public void toFeel(BodyPart bodyPart) throws NullPointerException {
        if (bodyPart == null) {
            throw new NullPointerException(this + " ничего не почувствовал");
        }
        currentAction = this + " неожиданно почувствовал, как на его " + bodyPart;
    }

    public void toGuess() {
        currentAction = this + " догадался, что это было";
    }

    @Override
    public void toMove() {
        currentAction = this + " начал медленно, но неуклонно двигаться к пульту";
    }

    public String getCurrentAction() {
        return currentAction;
    }

    @Override
    public String toString() {
        return "Артур";
    }

}
