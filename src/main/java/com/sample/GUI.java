package com.sample;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI extends JFrame{
    public static JFrame jframe;

    public static void showStart() {
        JOptionPane.showMessageDialog(jframe, "Electronic Music for people who don't like electronic music","Start",JOptionPane.PLAIN_MESSAGE);
    }
    public static String questionWindow(String[] possible, String question) {
        String answer;
        String[] answers = possible;
        String[] koniec = {"koniec"};
        int selected;
        if(answers == null) {
            selected = JOptionPane.showOptionDialog(null, question, "Question", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, koniec, null);
            return "Koniec!";
        }else {
            selected = JOptionPane.showOptionDialog(null,
                    question,
                    "Question",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    answers,
                    null);
        }

        answer = answers[selected];

        return answer;
    }

    public static void showInit(String album) {
        JOptionPane.showMessageDialog(null,album);
    }

}

