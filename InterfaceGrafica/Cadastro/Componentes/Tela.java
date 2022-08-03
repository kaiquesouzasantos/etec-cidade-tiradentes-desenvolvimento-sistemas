package InterfaceGrafica.Cadastro.Componentes;
import javax.swing.*;
import java.awt.*;

abstract class Tela {
    public void retornaFrame(JFrame frame, String titulo, int width, int height){
        frame.setTitle(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLayout(null);
    }

    public void adicionaPanel(JPanel[] panels, JFrame frame){
        for(JPanel panel:panels){
            frame.add(panel);
        }

        frame.setVisible(true);
    }

    public void retornaPanel(JPanel panel, int x, int y, int width, int height){
        panel.setBounds(x, y, width, height);
        panel.setBackground(new Color(0, 0, 0));
        panel.setLayout(null);
    }

    public void retornaButton(JButton button, String texto, int x, int y, int width, int height, JPanel panel){
        button.setText(texto);
        button.setBounds(x, y, width, height);
        button.setBackground(new Color(220,220,220));
        button.setFont(new Font("Corbel", Font.BOLD, 16));
        button.setFocusable(false);
        panel.add(button);
    }

    public void retornaLabel(String texto, int x, int y, int width, int height, JPanel panel){
        JLabel label = new JLabel();
        label.setText(texto);
        label.setBounds(x, y, width, height);
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font("Corbel", Font.BOLD, 18));
        panel.add(label);
    }

    public void retornaText(JTextField texto, int x, int y, int width, int height, JPanel panel){
        texto.setBounds(x, y, width, height);
        texto.setFont(new Font("Corbel", Font.BOLD, 16));
        panel.add(texto);
    }

    public void retornaCheckbox(JCheckBox box, String texto, int x, int y, int width, int height, JPanel panel){
        box.setText(texto);
        box.setBounds(x, y, width, height);
        box.setBackground(new Color(220,220,220));
        box.setFont(new Font("Corbel", Font.BOLD, 14));
        box.setFocusable(false);
        panel.add(box);
    }

    public void retornaCombobox(JComboBox combo, String[] texto, int x, int y, int width, int height, JPanel panel){
        combo = new JComboBox<>(texto);
        combo.setBounds(x, y, width, height);
        combo.setBackground(new Color(220,220,220));
        combo.setFont(new Font("Corbel", Font.BOLD, 14));
        combo.setFocusable(false);
        panel.add(combo);
    }
}
