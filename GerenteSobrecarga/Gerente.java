package GerenteSobrecarga;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Gerente extends JFrame{
    public JPanel contentPane;
    public List<String> gerenciamentoCadastro = new ArrayList<>();
    public JTextField nome = new JTextField();
    public JTextField email = new JTextField();
    public JTextField salario = new JTextField();

    public void run(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 300);

        contentPane = new JPanel();
        contentPane.setBackground(Color.decode("#000000"));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel titulo = new JLabel("Cadastrar Gerente");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(144, 25, 245, 45);
        contentPane.add(titulo);

        retornaLabel(new JLabel(), "Nome: ", 25, 91, 70, 14);
        retornaLabel(new JLabel(), "Email: ", 25, 122, 70, 14);
        retornaLabel(new JLabel(), "Salario: ", 25, 153, 70, 14);

        retornaText(nome, 10, 144, 89, 360, 20);
        retornaText(email, 10, 144, 120, 360, 20);
        retornaText(salario, 10, 144, 151, 360, 20);

        JButton cadastar = new JButton();
        retornaButton(cadastar, "Cadastrar", 90, 210, 100, 25);
        JButton limpar = new JButton();
        retornaButton(limpar, "Limpar", 200, 210, 100, 25);
        JButton listar = new JButton();
        retornaButton(listar, "Listar", 310, 210, 100, 25);

        cadastar.addActionListener(e -> {
            try{
                if(!nome.getText().isEmpty() || email.getText().contains("@") || !salario.getText().isEmpty()){
                    if(Double.parseDouble(salario.getText()) <= 1300){
                        gerenciamentoCadastro.add("{NOME: "+nome.getText()+", EMAIL: "+email.getText()+", SALARIO: "+salario.getText()+", BONUS: R$"+bonusSalario(15)+"}");
                    }
                    gerenciamentoCadastro.add("{NOME: "+nome.getText()+", EMAIL: "+email.getText()+", SALARIO: "+salario.getText()+", BONUS: R$"+bonusSalario()+"}");
                    System.out.println("GERENTE CADASTRADO COM SUCESSO!");
                }
            }catch (Exception ex){System.out.println("DADOS INCOMPATIVEIS!");}
        });
        limpar.addActionListener(e -> {nome.setText("");email.setText("");salario.setText("");});
        listar.addActionListener(e -> System.out.println(gerenciamentoCadastro));
    }

    public double bonusSalario(){
        return Double.parseDouble(salario.getText())*0.1;
    }

    public double bonusSalario(double porcentagem){
        return Double.parseDouble(salario.getText())*(porcentagem/100);
    }

    public void retornaLabel(JLabel label, String texto, int x, int y, int width, int height){
        label.setText(texto);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.WHITE);
        label.setBounds(x, y, width, height);
        contentPane.add(label);
    }

    public void retornaText(JTextField texto, int coluns, int x, int y, int width, int height){
        texto.setColumns(coluns);
        texto.setForeground(Color.BLACK);
        texto.setBounds(x, y, width, height);
        contentPane.add(texto);
    }

    public void retornaButton(JButton button, String texto, int x, int y, int width, int height){
        button.setText(texto);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(SystemColor.controlHighlight);
        button.setBounds(x, y, width, height);
        contentPane.add(button);
    }
}
