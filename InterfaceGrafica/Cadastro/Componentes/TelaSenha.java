package InterfaceGrafica.Cadastro.Componentes;
import javax.swing.*;

public class TelaSenha extends Tela {
	public TelaSenha() {
		JFrame frame = new JFrame();
		retornaFrame(frame, "REDEFINICAO DE SENHA", 300, 380);
		
		// TITULO
		JPanel panelTitulo = new JPanel();
		retornaPanel(panelTitulo, 0, 0, 300, 60);
		retornaLabel("TROCAR SENHA", 60, 10, 200, 50, panelTitulo);
		
		// CAMPOS
		JPanel panelCampos = new JPanel();
		retornaPanel(panelCampos, 0, 60, 300, 140);

		retornaLabel("NOVA SENHA: ", 5, 0, 200, 20, panelCampos);
		JPasswordField txtSenha = new JPasswordField();
		retornaText(txtSenha, 5, 25, 270, 25, panelCampos);

		retornaLabel("CONFIRMAR: ", 5, 55, 250, 20, panelCampos);
		JPasswordField txtConfirmSenha = new JPasswordField();
		retornaText(txtConfirmSenha, 5, 80, 270, 25, panelCampos);

		JCheckBox checkboxMostrar = new JCheckBox("Mostrar senha");
		retornaCheckbox(checkboxMostrar, "MOSTRAR", 5, 110, 150, 15, panelCampos);
		
		checkboxMostrar.addActionListener(e -> {
			if(checkboxMostrar.isSelected()) {
				(txtSenha).setEchoChar((char)0);
				(txtConfirmSenha).setEchoChar((char)0);
			}else {
				(txtSenha).setEchoChar('*');
				(txtConfirmSenha).setEchoChar('*');
			}
		});
		
		// BOTOES
		JPanel panelBotoes = new JPanel();
		retornaPanel(panelBotoes, 0, 200, 300, 180);

		JButton btnVoltar = new JButton();
		retornaButton(btnVoltar, "VOLTAR", 5, 0, 130, 35, panelBotoes);

		btnVoltar.addActionListener(e -> {
			frame.setVisible(false);
			new TelaInicio();
		});
		
		JButton btnAlterar = new JButton();
		retornaButton(btnAlterar, "ALTERAR", 140, 0, 140, 35, panelBotoes);

		adicionaPanel(new JPanel[]{panelTitulo, panelCampos, panelBotoes}, frame);
	}
}