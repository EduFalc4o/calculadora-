import javax.swing.*;

public class MainForm {

    private JTextField txtNome;

    private JLabel lblNome;

    private JButton btnValidar;

    private JLabel txtResultado;

    private JPanel MainPanel;

    public static void main(String[] args) {

        //cria a minha tela
        JFrame frame = new JFrame("Minha primeira tela");
        //mostra qual painel vai ser assistido
        frame.setContentPane((new MainForm().MainPanel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha tv no tamanho do meu painel
        frame.pack();
        //frame.setSize(500, 500)
        //Ligar tv
        frame.setVisible(true);
    }
}
