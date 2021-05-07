package game_api.player;


import game_api.game_settings.input_box;
import game_api.map.load_map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import static game_api.game_settings.game_erorr.game_erorr;
import static game_api.game_settings.input_box.inputbox;
import static game_api.game_settings.load_File.File_load;
import static game_api.player.player_data.player_name;

public class first_play {

    public static void first_play() {

        Properties pro= new Properties();
        File_load();

        input_box.input_box("사용할 닉네임을 입력하세요");
        player_name = inputbox;

         pro.setProperty("player_name", player_name);
        try {
            pro.save( new FileOutputStream("src/game_api/resources/player_data.properties"),"");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
            game_erorr();
        }
        System.out.println("player_name:" + player_name);


        // 프레임 생성
        JFrame frm = new JFrame("play_game");

        // 프레임 크기 설정
        frm.setSize(350, 300);

        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 설정
        frm.getContentPane().setLayout(null);

        // 버튼 생성
        JButton btn1 = new JButton("예");
        JButton btn2 = new JButton("아니오");

        // ★ 버튼 위치와 크기 설정
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);

        // ★ 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);

        btn1.addActionListener(event -> {
            load_map.loading_map();
        });

        btn2.addActionListener(event -> {
            frm.dispose();
            first_play();
        });

        // ★ 라벨 설정
        JLabel lbl = new JLabel();
        lbl.setBounds(110, 200, 274, 50);
        lbl.setText("위 내용이 맞습니까?");
        frm.getContentPane().add(lbl);

        // ★ 라벨 설정
        JLabel name = new JLabel();
        name.setBounds(135, 50, 274, 50);
        name.setText("이름:" + player_name);
        frm.getContentPane().add(name);

        // 프레임이 보이도록 설정
        frm.setVisible(true);
    }

}
