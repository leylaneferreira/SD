package Controller;

import Model.BancoDeDados;

/**
 *
 * @author Iago Rodrigues
 */
public class ControleBD {

    private final BancoDeDados bd;
    
    public ControleBD(String serverIPDB) {
        bd = new BancoDeDados(serverIPDB);
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

    public boolean login(String nome, String senha) {
        try {
            bd.abrirConexao();
            if (bd.logarUsuario(nome, senha)) {
                bd.fecharConexao();
                return true;
            }
            bd.fecharConexao();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
