package InterfaceGrafica.Cadastro.Componentes;
import javax.swing.*;

public class TelaCadastro extends Tela {
	public TelaCadastro() {
		JFrame frame = new JFrame();
		retornaFrame(frame, "TELA DE CADASTRO", 450, 600);
		
		// TITULO
		JPanel panelTitulo = new JPanel();
		retornaPanel(panelTitulo, 0, 0, 450, 60);
		retornaLabel("CADASTRAR-SE", 140, 10, 200, 50, panelTitulo);
		
		// CAMPOS
		JPanel panelCampos = new JPanel();
		retornaPanel(panelCampos, 0, 60, 450, 400);

		retornaLabel("NOME: ", 5, 10, 200, 20, panelCampos);
		JTextField txtNome = new JTextField();
		retornaText(txtNome, 5, 35, 210, 25, panelCampos);

		retornaLabel("CPF: ", 220, 10, 200, 20, panelCampos);
		JTextField txtCpf = new JTextField();
		retornaText(txtCpf, 220, 35, 210, 25, panelCampos);

		retornaLabel("CIDADE: ", 5, 70, 180, 20, panelCampos);
		JTextField txtCidade = new JTextField();
		retornaText(txtCidade, 5, 95, 210, 25, panelCampos);

		retornaLabel("BAIRRO: ", 220, 70, 180, 20, panelCampos);
		JTextField txtBairro = new JTextField();
		retornaText(txtBairro, 220, 95, 210, 25, panelCampos);

		retornaLabel("RUA: ", 5, 130, 180, 20, panelCampos);
		JTextField txtRua = new JTextField();
		retornaText(txtRua, 5, 155, 165, 25, panelCampos);

		retornaLabel("COMPL: ", 175, 130, 130, 20, panelCampos);
		JTextField txtComplemento = new JTextField();
		retornaText(txtComplemento, 175, 155, 130, 25, panelCampos);

		retornaLabel("ESTADO: ", 310, 130, 130, 20, panelCampos);

		JComboBox cboEstado = new JComboBox<>();
		String[] estado = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		retornaCombobox(cboEstado, estado, 310, 155, 120, 25, panelCampos);

		retornaLabel("TELEFONE 1: ", 5, 190, 130, 20, panelCampos);
		JTextField txtTelefone1 = new JTextField();
		retornaText(txtTelefone1, 5, 215, 210, 25, panelCampos);

		retornaLabel("TELEFONE 2: ", 220, 190, 130, 20, panelCampos);
		JTextField txtTelefone2 = new JTextField();
		retornaText(txtTelefone2, 220, 215, 210, 25, panelCampos);

		retornaLabel("EMAIL: ", 5, 250, 130, 20, panelCampos);
		JTextField txtEmail = new JTextField();
		retornaText(txtEmail, 5, 275, 210, 25, panelCampos);

		retornaLabel("DT. NASC: ", 220, 250, 130, 20, panelCampos);
		JTextField txtDataNasc = new JTextField();
		retornaText(txtDataNasc, 220, 275, 210, 25, panelCampos);

		retornaLabel("SENHA: ", 5, 305, 130, 20, panelCampos);
		JPasswordField txtSenha = new JPasswordField();
		retornaText(txtSenha, 5, 330, 210, 25, panelCampos);

		retornaLabel("CONFIRMAR: ", 220, 305, 150, 20, panelCampos);
		JPasswordField txtConfirmSenha = new JPasswordField();
		retornaText(txtConfirmSenha, 220, 330, 210, 25, panelCampos);

		JCheckBox checkboxMostrar = new JCheckBox();
		retornaCheckbox(checkboxMostrar, "MOSTRAR", 5, 360, 200, 20, panelCampos);
		
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
		retornaPanel(panelBotoes,0, 460, 450, 140);

		JButton btnVoltar = new JButton();
		retornaButton(btnVoltar, "VOLTAR", 40, 0, 170, 40, panelBotoes);

		btnVoltar.addActionListener(e -> {
			frame.setVisible(false);
			new TelaInicio();
		});
		
		JButton btnCadastrar = new JButton();
		retornaButton(btnCadastrar, "CADASTRAR", 215, 0, 170, 40, panelBotoes);

		adicionaPanel(new JPanel[]{panelTitulo, panelCampos, panelBotoes}, frame);
	}
}