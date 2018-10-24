import javax.swing.*;

public class InventarioMedicina{

    private JPanel jpanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton agregarButton;
    private JButton mostrarButton;
    private JButton eliminarButton;

    public static void main(String[] args) {

        JFrame jframe = new JFrame("Inventario");
        jframe.setContentPane(new InventarioMedicina().jpanel);
     //   jframe.setContentPane(new InventarioMedicina().jpanel);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);

    }





}
