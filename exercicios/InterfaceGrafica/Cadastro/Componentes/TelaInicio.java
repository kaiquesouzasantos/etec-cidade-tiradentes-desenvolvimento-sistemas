package InterfaceGrafica.Cadastro.Componentes;
import javax.swing.*;

public class TelaInicio extends Tela {
	public TelaInicio(){
		JFrame frame = new JFrame();
		retornaFrame(frame, "INICIO", 350, 400);

		JPanel panel = new JPanel();
		retornaPanel(panel, 0, 0, 350, 400);
		retornaLabel("BEM VINDO", 110, 15, 250, 50, panel);

		JButton btnLogin = new JButton();
		retornaButton(btnLogin, "LOGIN", 90, 100, 160, 40, panel);

		btnLogin.addActionListener(e -> {
			frame.setVisible(false);
			new TelaLogin();
		});

		JButton btnCadastro = new JButton();
		retornaButton(btnCadastro, "CADASTRAR-SE",90, 150, 160, 40, panel);

		btnCadastro.addActionListener(e -> {
			frame.setVisible(false);
			new TelaCadastro();
		});

		JButton btnSair = new JButton("Sair");
		retornaButton(btnSair, "SAIR", 90, 200, 160, 40, panel);

		btnSair.addActionListener(e -> System.exit(0));

		adicionaPanel(new JPanel[]{panel}, frame);
	}
}
