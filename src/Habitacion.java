public class Habitacion {

    /// ATRIBUTOS

    private int idHabitacion;
    private static int contador = 1;
    private boolean isDisponible;
    float precio;

    int capacidad;
    int piso;
    Tamaño tamaño;

    /// CONSTRUCTOR

    public Habitacion(boolean isDisponible, float precio, int capacidad, int piso, Tamaño tamaño) {
        this.idHabitacion = contador++;
        this.isDisponible = isDisponible;
        this.precio = precio;
        this.capacidad = capacidad;
        this.piso = piso;
        this.tamaño = tamaño;
    }

    /// GETTERS

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPiso() {
        return piso;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    /// METODOS

    public String limpieza() {return "Está limpio";}

    public String reparacion() {return "Está reparado";}

    public String desinfeccion() {return "Está desinfectado";}


}
