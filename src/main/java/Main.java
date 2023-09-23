import javax.swing.*;

public class Main {
    //metoda uruchamia okno interfejsu startowego
    public static void main(String args[]){
        JFrame frame = new JFrame("EDYTOR ŚPIEWNIKÓW");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StartInterface_Swing editor = new StartInterface_Swing();
        frame.getContentPane().add(editor.panel);
        frame.pack();
        frame.setVisible(true);
    }
}
