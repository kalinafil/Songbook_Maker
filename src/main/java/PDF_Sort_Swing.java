import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//klasa implementuje okno sortera dokumentów PDF
public class PDF_Sort_Swing {
    JPanel panel = new JPanel(new BorderLayout());
    JPanel p1 = new JPanel(new FlowLayout());
    JLabel destL;
    JTextField destT;
    JButton Sort;

    //konstruktor przyjmuje jako argument wywołania ścieżkę do pliku, który ma być posortowany
    public PDF_Sort_Swing(String SRC){
        initialize(SRC);
    }
    private void initialize(String SRC){
        destL = new JLabel("Zapisz w ");
        p1.add(destL);
        destT = new JTextField("", 20);
        p1.add(destT);
        Sort = new JButton("Sortuj");
        panel.add(p1, BorderLayout.NORTH);
        panel.add(Sort, BorderLayout.SOUTH);

        //przycisk uruchamia sortowanie pliku, który znajdzie się po posortowaniu po adresem podanym w "destT"
        Sort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Songbook_PDF.PagePrintSort(SRC, destT.getText());
                }
                catch (IOException ex) {
                    Songbook_Swing.errorMessage("Błąd odczytu lub zapisu");
                }
            }
        });
    }
}
