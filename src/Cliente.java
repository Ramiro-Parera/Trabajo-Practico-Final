import java.util.Objects;

public class Cliente extends Usuario{
    private int dni;
    private String nacionalidad;
    private String domicilio;

    public Cliente(String nombre, String contraseña, int dni, String nacionalidad, String domicilio) {
        super(nombre, contraseña);
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return dni == cliente.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dni);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni=" + dni +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", domicilio='" + domicilio + '\'' +
                "} " + super.toString();
    }

    public String historialCliente(){
        return "Buen cliente";
    }
}
