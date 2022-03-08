package sv.edu.udb.ejerciciopoo;

public class Celular {
	//Propiedades
	private String Marca;
	private String Modelo;	
	private String TamanioPantalla;
	private String Color;
	private int CantidadCamaras;
	private double Costo;
	private double Precio;
	
	
	//Constructor o constructores
	public Celular(String modelo, String marca, String tamanioPantalla, String color, int cantidadCamaras, double costo,
			double precio) {
		super();
		Modelo = modelo;
		Marca = marca;
		TamanioPantalla = tamanioPantalla;
		Color = color;
		CantidadCamaras = cantidadCamaras;
		Costo = costo;
		Precio = precio;
	}


	//Setter y Getters
	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public String getTamanioPantalla() {
		return TamanioPantalla;
	}


	public void setTamanioPantalla(String tamanioPantalla) {
		TamanioPantalla = tamanioPantalla;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public int getCantidadCamaras() {
		return CantidadCamaras;
	}


	public void setCantidadCamaras(int cantidadCamaras) {
		CantidadCamaras = cantidadCamaras;
	}


	public double getCosto() {
		return Costo;
	}


	public void setCosto(double costo) {
		Costo = costo;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}

	

	
}
