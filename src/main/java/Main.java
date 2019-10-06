import modelos.Usuario;
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
        staticFiles.location("publico");

        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario admin = new Usuario("admin", "admin", "José");
        Configuration configuration=new Configuration(Configuration.getVersion());
        configuration.setClassForTemplateLoading(Main.class, "/publico/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);
        //staticFiles.location("/templates");
        Spark.get("/login", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Login");
            return new ModelAndView(attributes, "login.ftl");
        }, freeMarkerEngine);

        /*UserRepository userRepository = new UserRepository(usuarios);
        new Ruteo().aplicarRuteo();
        new UserController().ruteoLogin();*/
    }
}