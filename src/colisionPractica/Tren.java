package colisionPractica;

public class Tren extends Vehiculo {

	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(cantidadDeVagones, cantidadDePasajerosPorVagon, velocidadMaxima, latitud, longitud);
	}

	@Override
	public String tipoDeVehiculo() {
		return "tren";
	}

}
