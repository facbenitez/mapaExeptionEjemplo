package colisionPractica;

import java.util.Comparator;

public class OrdenPorLatitudYLongitud implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo primerVehiculo, Vehiculo segundoVehiculo) {
		if (primerVehiculo.getLatitud().compareTo(segundoVehiculo.getLatitud()) == 0) {
			return primerVehiculo.getLongitud().compareTo(segundoVehiculo.getLongitud());
		}

//		if( primerVehiculo.getLatitud().compareTo(segundoVehiculo.getLatitud()) == 0 ){
////	
//			VehiculosColicionadosExeption vehiculosColicionados = new VehiculosColicionadosExeption();
//			vehiculosColicionados.agregarVehiculo(segundoVehiculo);
//			vehiculosColicionados.agregarVehiculo(primerVehiculo);
//			
//			throw vehiculosColicionados;
////		}
		return primerVehiculo.getLatitud().compareTo(segundoVehiculo.getLatitud());
	}
}
