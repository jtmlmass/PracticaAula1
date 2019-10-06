import controladores.UserController;
import modelos.Usuario;
import repositorios.UserRepository;
import spark.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        port(8080);
        //indicando los recursos publicos.
        //staticFiles.location("/META-INF/resources"); //para utilizar los WebJars.
        //staticFiles.location("");
        Configuration configuration = new Configuration(Configuration.getVersion());
        configuration.setClassForTemplateLoading(Main.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);

        Usuario admin = new Usuario("admin", "admin", "José");
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(admin);
        UserRepository userRepository = new UserRepository(usuarios);

        Spark.get("/login", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Login");
            return new ModelAndView(attributes, "login.ftl");
        }, freeMarkerEngine);

        Spark.get("/home", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Login");
            attributes.put("usuario", usuarios.get(0));
            return new ModelAndView(attributes, "home.ftl");
        }, freeMarkerEngine);
    }
}