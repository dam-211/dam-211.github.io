import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MySimpleGUI gui = new MySimpleGUI();
    }
}

class MySimpleGUI extends JFrame {

    public MySimpleGUI() {
        setSize(300, 300);
        setTitle("My Simple GUI");
        setVisible(true);
    }
}
