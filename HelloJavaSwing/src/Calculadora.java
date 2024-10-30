import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    private JTextField textField1;
    private JTextField textField2;
    private JButton btnSomar;
    private JTextField btnResultado;
    private JButton btnLimpar;
    private JLabel txtPrimeiroValor;
    private JLabel txtSegundoValor;
    private JLabel txtResultado;
    private JPanel panelMain;

    public Calculadora(){

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            //peguei informação da tela
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());
            //processei
               Integer soma = primeiro + segundo;
            //mandei pra tela o resultado
               txtResultado.setText(soma.toString());



            }
        });



    }





    public static void main(String[] args) {

        JFrame frame = new JFrame("minha calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.pack();
        frame.setVisible(true);
    }

}
