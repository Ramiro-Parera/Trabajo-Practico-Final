public class Conserje extends Usuario{
    public Conserje(String nombre, String contraseña) {
        super(nombre, contraseña);
    }

    @Override
    public String toString() {
        return "Conserje{} " + super.toString();
    }

    public boolean creacionUsuario(){
        return true;
    }

    public String backUp(){
        return "Backup";
    }

    public String permisosUsuario(){
        return "Permisos";
    }
}
