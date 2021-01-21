import hintergrundsachgen.Switch;

public class App {
    public static void main(String[] args) {
        Switch licht = new Switch();
        licht.setState(Switch.State.ON);
        licht.push();
    }
}
