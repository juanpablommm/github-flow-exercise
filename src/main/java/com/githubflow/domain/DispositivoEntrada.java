package com.githubflow.domain;

public class DispositivoEntrada {

	private String tipoEntrada;
	private String marca;

	public DispositivoEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dispositivo de Entrada ");
		builder.append(tipoEntrada);
		builder.append(", marca:");
		builder.append(marca);
		return builder.toString();
	}
}
