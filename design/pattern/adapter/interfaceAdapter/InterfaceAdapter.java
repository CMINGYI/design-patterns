package pattern.adapter.interfaceAdapter;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InterfaceAdapter {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
            }
        });
    }
}
