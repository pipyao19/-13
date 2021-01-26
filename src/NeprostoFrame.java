import java.awt.*;
import java.awt.event.*;
class NeprostoFrame extends Frame{
    NeprostoFrame (String s){
        super (s);
        setSize(400, 150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new NeprostoFrame("Моя программка");
    }

}
