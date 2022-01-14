package ec.edu.uce.modelo;

public class Carro {
	
	private Integer idCarro;
	private String nombrePropietario;
	private String marca;
	private String placa;
	private Integer precioCarro;
	
	//Metodos SET y GET
	public Integer getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Integer getPrecioCarro() {
		return precioCarro;
	}
	public void setPrecioCarro(Integer precioCarro) {
		this.precioCarro = precioCarro;
	}


	
}
