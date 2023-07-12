package colisionPractica;;

public class Bicicleta extends Vehiculo {

	public Bicicleta(Double latitud, Double longitud) {
		super(latitud, longitud);
	}

	@Override
	public String tipoDeVehiculo() {
		return "Bicicleta";
	}

}
