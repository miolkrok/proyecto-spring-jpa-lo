package ec.edu.uce.modelo.deberes;

import java.math.BigDecimal;

public class CuentaHabienteVIPTO {
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String numeroCuenta;
	private String tipo;
	private BigDecimal saldo;
	
	public CuentaHabienteVIPTO() {
		// TODO Auto-generated constructor stub
		
	}

	public CuentaHabienteVIPTO(String cedula, String nombre, String apellido, String numeroCuenta, String tipo,
			BigDecimal saldo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCuenta = numeroCuenta;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaHabienteVIPTO [" + cedula + " - " + nombre + " - " + apellido
				+ " - " + numeroCuenta + " - " + tipo + " - " + saldo + "]";
	}
	
	

}
