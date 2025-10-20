public class Administrador extends Usuario{
    public Administrador(String nombre, String contraseña) {
        super(nombre, contraseña);
    }

    public boolean creacionUsuario(){
        return true;
    }

    public String backUp(){
        return "backup..";
    }

    public String permisosUsuario(){
        return "Permisos de administrador";
    }

    @Override
    public String toString() {
        return "Administrador{} " + super.toString();
    }
}
