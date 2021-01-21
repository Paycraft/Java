package hintergrundsachgen;

public class Switch {
    public enum State {
        ON,
        OFF,
}
    private State state = State.OFF;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void push() {
        switch (state) {
            case ON:
                System.out.println("The Lamp is on");
                break;
            case OFF:
                System.out.println("The Lamp is off");
                break;
        }
    }


}
