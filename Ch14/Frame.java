package Ch14;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    public Frame() {
        setTitle("프레임 아이콘");          // 프레임 제목 설정
        setSize(400, 200);          // 프레임 크기 설정

        JPanel panel = new JPanel();            // 패널 설정
        panel.setBackground(Color.PINK);        // 패널 색상 설정
        add(panel);                             // 프레임에 패널 추가

        setIconImage(new ImageIcon("cat.JPEG").getImage());  // 프레임 아이콘
        setVisible(true);                     // 프레임 보이기 설정
    }

    public static void main(String[] args) {
        new Frame();
    }
}
