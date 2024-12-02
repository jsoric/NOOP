package pckg_macro;

import java.util.ArrayList;

public class MacroTest {
    public static void main(String[] args) {
        GarageDoorOpen gdo = new GarageDoorOpen();
        GarageLightOn glo = new GarageLightOn();
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(gdo);
        commands.add(glo);
        MacroCmdFST macro = new MacroCmdFST(commands);
        macro.run();
        macro.undo();
        macro.run();
    }
}
