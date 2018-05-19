package cadastro_clientes;

import javax.swing.JOptionPane;

/**
 *
 * @author richard
 */
public class Cadastro_clientes {

    static long[] cpf = new long[10];
    static String[] nome = new String[10];
    static String[] endereco = new String[10];
    static long[] tel = new long[10];
    static String pesquisar_cliente;
    static int a = 0;

    public static void main(String[] args) {

        int opcao;
        JOptionPane.showMessageDialog(null, "Bem vindo");

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(" Escolha uma opção \n 1-Cadastro dos clientes \n 2-Pesquisar clientes \n "
                    + "3-Visualizar clientes \n 4-Atualizar cadastro \n 5-Remover clientes \n 0-Sair"));

            switch (opcao) {
                case 1:
                    a++;
                    nome[a] = JOptionPane.showInputDialog("Entre com o nome do cliente " + a);
                    cpf[a] = Long.parseLong(JOptionPane.showInputDialog("Entre com o CPF do cliente " + a));
                    endereco[a] = JOptionPane.showInputDialog("Entre com o endereço do cliente " + a);
                    tel[a] = Long.parseLong(JOptionPane.showInputDialog("Entre com o telefone do cliente " + a));
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    break;
                case 2:
                    String atribuir = "";
                    pesquisar_cliente = JOptionPane.showInputDialog("Informe o CPF do cliente!");

                    for (int b = 0; b < cpf.length; b++) {
                        if (Long.parseLong(pesquisar_cliente) == cpf[b]) {

                            atribuir = nome[b] + " " + cpf[b] + " " + endereco[b] + " " + tel[b];
                            JOptionPane.showMessageDialog(null, atribuir);
                        }
                    }
                  
                    break;
                case 3:
                    String separador = "";

                    for (int c = 0; c < cpf.length; c++) {
                        if (!(cpf[c] == 0)) {
                            separador += nome[c] + " " + cpf[c] + " " + endereco[c] + " " + tel[c] + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, separador);
                    break;

                case 4:
                    pesquisar_cliente = JOptionPane.showInputDialog("Entre com o CPF do cliente!");

                    for (int e = 0; e < cpf.length; e++) {
                        if (Long.parseLong(pesquisar_cliente) == cpf[e]) {
                            nome[e] = JOptionPane.showInputDialog("Novo nome do cliente");
                            cpf[a] = Long.parseLong(JOptionPane.showInputDialog("Novo CPF do cliente "));
                            endereco[a] = JOptionPane.showInputDialog("Novo endereço do cliente ");
                            tel[a] = Long.parseLong(JOptionPane.showInputDialog("Novo telefone do cliente "));
                            JOptionPane.showMessageDialog(null, "Modificado com sucesso!");
                        }
                    }

                    break;

                case 5:
                    pesquisar_cliente = JOptionPane.showInputDialog("Entre com o CPF do Cliente!");

                    for (int d = 0; d < cpf.length; d++) {
                        if (Long.parseLong(pesquisar_cliente) == cpf[d]) {
                            nome[d] = null;
                            cpf[d] = 0;
                            endereco[d] = null;
                            tel[d] = 0;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                    break;
            }
        } while (opcao != 0);
    }

}
