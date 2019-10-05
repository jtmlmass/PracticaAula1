package modelos;

public class Usuario {
    private String username;
    private String password;
    private String nombre;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(String username, String password, String nombre) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
