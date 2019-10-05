import controladores.UserController;
import modelos.Usuario;
import repositorios.UserRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.ArrayList;
import freemarker.template.Configuration;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(8080);
        //indicando los recursos publicos.
        //staticFiles.location("/META-INF/resources"); //para utilizar los WebJars.
        staticFiles.location("/publico");
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario admin = new Usuario("admin", "admin", "José");
        UserRepository userRepository = new UserRepository(usuarios);
        new Ruteo().aplicarRuteo();
        new UserController().ruteoLogin();
    }
}