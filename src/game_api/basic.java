package game_api;

import game_api.map.load_map;

import game_api.player.player_data_load;

import javax.swing.*;

public class basic {

    public static void game() {
        loading();
    }

    public static void loading() {
        player_data_load.player_data_load();
        load_map.loading_map();
    }

    public static void data_saveing() {

    }

    public static void exit_game() {
        data_saveing();
        JOptionPane.showMessageDialog(null, "게임을 종료합니다");
        System.exit(1);
    }

}
