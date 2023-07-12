package colisionPractica;

import java.util.Objects;

public abstract class Vehiculo {

	private Integer cantidadMaximaDePasajeros;
	private String patente;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;

	private Integer cantidadDePasajerosPorVagon;
	private Integer cantidadDeVagones;

	public Vehiculo(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
		this.latitud = latitud;
		this.longitud = longitud;
	}

//MOTO
	public Vehiculo(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
		this.latitud = latitud;
		this.longitud = longitud;
	}

// BICICLETA
	public Vehiculo(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	// TREN
	public Vehiculo(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima,
			Double latitud, Double longitud) {
		this.setCantidadDeVagones(cantidadDeVagones);
		this.setCantidadDePasajerosPorVagon(cantidadDePasajerosPorVagon);
		this.velocidadMaxima = velocidadMaxima;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public abstract String tipoDeVehiculo();

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLonguitud(Double longitud) {
		this.longitud = longitud;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(patente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(patente, other.patente);
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Vehiculo [latitud=" + latitud + ", longitud=" + longitud + "]";
	}

}
