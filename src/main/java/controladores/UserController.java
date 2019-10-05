package controladores;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.*;

public class UserController {
    public static String renderFreemarker(Map<String, Object> model, String templatePath) {
        return new FreeMarkerEngine().render(new ModelAndView(model, templatePath));
    }

    public void ruteoLogin(){
        get("/login", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Login");
            return renderFreemarker(attributes, "/login.ftl");
        });
    }
}
