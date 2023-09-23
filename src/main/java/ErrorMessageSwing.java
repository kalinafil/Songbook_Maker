import javax.swing.*;
//klasa tworzy panel z wiadomością błędu
public class ErrorMessageSwing {
    JPanel panel = new JPanel();
    JLabel err;
    public ErrorMessageSwing(String error){
        initialize(error);
    }
    private void initialize(String error){
        err = new JLabel(error);
        panel.add(err);
    }
}
