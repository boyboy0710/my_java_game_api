package game_api.player;

import game_api.game_settings.load_File;

import java.util.Properties;

import static game_api.player.player_data.player_name;

public class player_data_load {

    public static void player_data_load() {

        Properties pro= new Properties();
        load_File.File_load();

        player_name = pro.getProperty("player_name");

    }

}
