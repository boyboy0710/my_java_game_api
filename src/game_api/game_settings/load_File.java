package game_api.game_settings;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class load_File {

    public static void File_load() {
        Properties pro= new Properties();

        try {
            pro.load(new FileInputStream("src/game_api/resources/player_data.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
            game_erorr.game_erorr();
        }
    }

}
