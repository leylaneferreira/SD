package Controller;

import Model.BancoDeDados;

/**
 *
 * @author Iago Rodrigues
 */
public class ControleBD {

    BancoDeDados bd;

    public ControleBD() {
        bd = new BancoDeDados();
    }

    public String gravar(String nome, String senha) {
        try {
            bd.abrirConexao();
            bd.gravarUsuario(nome, senha);
            bd.fecharConexao();
            return "Cadastrado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao tentar cadastrar usuário.";
        }
    }

}
