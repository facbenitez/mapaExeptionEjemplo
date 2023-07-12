package colisionPractica;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Mapa {

	private String ciudad;
	private Set<Vehiculo> vehiculoEnMapa;

	public Mapa(String ciudad) {
		this.ciudad = ciudad;
		this.vehiculoEnMapa = new HashSet<>();
	}

	public void agregarVehiculo(Vehiculo nuevoVehiculo) {
		if (!(validarVehiculo(nuevoVehiculo))) {
			vehiculoEnMapa.add(nuevoVehiculo);
		}
	}

	private boolean validarVehiculo(Vehiculo nuevoVehiculo) {
		if (vehiculoEnMapa.contains(nuevoVehiculo)) {
			return true;
		}
		return false;
	}

	public Integer getCantidadDeVehiculos() {
		return this.vehiculoEnMapa.size();
	}

	public boolean hayColicion() throws VehiculosColicionadosExeption {
		// hay colicion cuando 2 vehiculos tienen la misma latitud y longitud
		// busco en el mapa los vehiculo y comparo latitud y longitud
//
//		Iterator<Vehiculo> iterador = vehiculoEnMapa.iterator();
//		Vehiculo vehiculoAnterior = null;
//		boolean hayColicion = false;
//
//		while (iterador.hasNext()) {
//			Vehiculo vehiculoActual = iterador.next();
//			if (vehiculoAnterior != null && vehiculoAnterior.getLatitud().equals(vehiculoActual.getLatitud())
//					&& vehiculoAnterior.getLongitud().equals(vehiculoActual.getLongitud())) {
//
//				throw new ColitionException();
//			}
//			vehiculoAnterior = vehiculoActual;
//		}
//		return hayColicion;
//	}
		for (Vehiculo vehiculo : vehiculoEnMapa) {
			for (Vehiculo segundoVehiculo : vehiculoEnMapa) {
				if (!(vehiculo.equals(segundoVehiculo)) && vehiculo.getLatitud().equals(segundoVehiculo.getLatitud())
						&& vehiculo.getLongitud().equals(segundoVehiculo.getLongitud())) {

					VehiculosColicionadosExeption vehiculosColicionados = new VehiculosColicionadosExeption();
					vehiculosColicionados.agregarVehiculo(segundoVehiculo);
					vehiculosColicionados.agregarVehiculo(vehiculo);
					
					throw vehiculosColicionados;
				}
			}
		}
		return false;
		
//		TreeSet<Vehiculo> vehiculosSinColicion = new TreeSet<>(new OrdenPorLatitudYLongitud());
//		vehiculosSinColicion.addAll(vehiculoEnMapa);
//
//		if (this.vehiculoEnMapa.size() != vehiculosSinColicion.size()) {
//			throw new ColitionException();
//		}
//		return false;
	}
}
