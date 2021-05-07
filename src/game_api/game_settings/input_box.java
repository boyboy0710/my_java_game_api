package game_api.game_settings;

import javax.swing.*;

public class input_box {

    public static String inputbox;

    public static void input_box(String name) {

         inputbox = JOptionPane.showInputDialog(name);
    }

}
