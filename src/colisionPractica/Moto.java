package colisionPractica;

public class Moto extends Vehiculo {

	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS = 2;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(patente, velocidadMaxima, latitud, longitud);
		setCantidadMaximaDePasajeros(CAPACIDA_MAXIMA_DE_PASAJEROS);
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}

	@Override
	public String tipoDeVehiculo() {
		return "Moto";
	}

}
