package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca = marca;
		this.estado = estado;
		}
	
	public void setMarca(Marca marc) {
		marca = marc;
		}
	public void setControl(Control contr) {
		control = contr;
		}
	public void setPrecio(int prec) {
		precio = prec;
		}
	public void setVolumen(int vol) {
		volumen = vol;
		}
	public void setCanal(int can) {
		canal = can;
		}
	public Marca getMarca() {
		return marca;
		}
	public Control getControl() {
		return control;
		}
	public int getPrecio() {
		return precio;
		}
	public int getVolumen() {
		return volumen;
		}
	public int getCanal() {
		return canal;
		}
	public int getNumTV() {
		return numTV;
		}
	public boolean getEstado() {
		return estado;
		}
	public void setEstado(boolean estad) {
		estado = estad;
		}
	
	public void turnOn() {
		estado = true;
		}
	public void turnOff() {
		estado = false;
		}
	public void canalUp() {
		if(canal >= 1 && canal < 120) {
			if(estado == true) {
		canal++;
		}	
			}
		}
	public void canalDown() {
		if(canal > 1 && canal <= 120) {
			if(estado == true) {
		++canal;
		}
			}
		}
	public void volumenUp() {
		if(volumen >= 0 && volumen < 7) {
			if(estado == true) {
				volumen++;
		}
			}
		}
	public void volumenDown() {
		if(volumen > 0 && volumen <= 7) {
			if(estado == true) {
		++volumen;
		}
			}
		}
	}