package com.kosmo.advance.ex.silseub;

import javax.swing.*;
import java.io.IOException;



public class S11GuiGameClient2 extends JFrame {



    public static void main(String[] args) {
        try {
            new S11GuiGameClient("127.0.0.1",5555);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
