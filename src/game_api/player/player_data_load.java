package game_api.player;

import game_api.game_settings.load_File;

import java.util.Properties;


public class player_data_load {

    static String player_name;
    public static boolean play_log;

    public static void player_data_load() {

        Properties pro= new Properties();
        load_File.File_load("src/game_api/resources/player_data.properties");

        player_name = pro.getProperty("player_name");


    }

}
