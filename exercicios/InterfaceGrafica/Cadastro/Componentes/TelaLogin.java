package InterfaceGrafica.Cadastro.Componentes;
import javax.swing.*;

public class TelaLogin extends Tela {
	public TelaLogin() {
		JFrame frame = new JFrame();
		retornaFrame(frame, "LOGIN", 350, 380);

		// TITULO
		JPanel panelTitulo = new JPanel();
		retornaPanel(panelTitulo, 0, 0, 350, 60);

		retornaLabel("LOGIN", 135, 10, 250, 50, panelTitulo);
		
		// CAMPOS
		JPanel panelCampos = new JPanel();
		retornaPanel(panelCampos, 0, 60, 350, 170);

		retornaLabel("EMAIL: ", 5, 0, 250, 50, panelCampos);
		JTextField txtEmail = new JTextField();
		retornaText(txtEmail, 5, 40, 320, 25, panelCampos);

		retornaLabel("SENHA: ", 5, 60, 250, 50, panelCampos);

		JPasswordField txtSenha = new JPasswordField();
		retornaText(txtSenha, 5, 100, 320, 25, panelCampos);

		JCheckBox checkboxLembrar = new JCheckBox();
		retornaCheckbox(checkboxLembrar, "LEMBRAR", 5, 130, 130, 20, panelCampos);

		JCheckBox checkboxMostrar = new JCheckBox("Mostrar senha");
		retornaCheckbox(checkboxMostrar, "MOSTRAR", 140, 130, 150, 20, panelCampos);
		
		checkboxMostrar.addActionListener(e -> {
				if(checkboxMostrar.isSelected()) {
					(txtSenha).setEchoChar((char)0);
				}else {
					(txtSenha).setEchoChar('*');
				}
		});
		
		// BOTOES
		JPanel panelBotoes = new JPanel();
		retornaPanel(panelBotoes, 0, 230, 350, 170);

		JButton btnVoltar = new JButton();
		retornaButton(btnVoltar, "VOLTAR",5, 0, 100, 35, panelBotoes);

		btnVoltar.addActionListener(e -> {
			frame.setVisible(false);
			new TelaInicio();
		});

		JButton btnEsqSenha = new JButton("Esqueci Senha");
		retornaButton(btnEsqSenha, "ESQUECI SENHA", 110, 0, 120, 35, panelBotoes);

		btnEsqSenha.addActionListener(e -> {
			frame.setVisible(false);
			new TelaSenha();
		});

		JButton btnEntrar = new JButton("Entrar");
		retornaButton(btnEntrar, "ENTRAR", 235, 0, 95, 35, panelBotoes);

		adicionaPanel(new JPanel[]{panelTitulo, panelCampos, panelBotoes}, frame);
	}
}
