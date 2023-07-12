package colisionPractica;

import java.util.ArrayList;

public class VehiculosColicionadosExeption extends ColitionException {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	public void agregarVehiculo(Vehiculo nuevoVehiculo) {
		this.vehiculos.add(nuevoVehiculo);
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
}
