package repositorios;

import modelos.Usuario;

import java.util.ArrayList;

public class UserRepository {
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public UserRepository(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
