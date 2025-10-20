public class HabitacionPremium extends Habitacion{
    public HabitacionPremium(boolean isDisponible, float precio, int capacidad, int piso, Tamaño tamaño) {
        super(isDisponible, precio, capacidad, piso, tamaño);
    }

    @Override
    public String toString() {
        return "HabitacionPremium{} " + super.toString();
    }

    public String servicioHotel(){
        return "Llevando comida...";
    }
}
