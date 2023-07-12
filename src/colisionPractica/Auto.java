package colisionPractica;;

public class Auto extends Vehiculo {

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(patente, cantidadMaximaDePasajeros, velocidadMaxima, latitud, longitud);
	}

	@Override
	public String tipoDeVehiculo() {
		return "Auto";
	}


}
