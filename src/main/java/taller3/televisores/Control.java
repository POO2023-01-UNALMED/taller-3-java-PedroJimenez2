package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		tv.setEstado(true);
	}
	public void turnOff() {
		tv.setEstado(false);
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public void enlazar(TV telev) {
		tv = telev;
		tv.setControl(this);
	}
	public void setTv(TV t) {
		tv = t;
	}
	public TV getTv() {
		return tv;
	}
}
