package fr.wildcodeschool.idetest;
import javax.swing.*;
import java.io.IOException;
import java.net.*;

public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("https://pbs.twimg.com/profile_images/697717251194150913/JaV7TAyN.jpg"))));
        jf.pack();
        jf.setVisible(true);
    }
}
