
public class Minion {
	private String name; 
		private int eyes; 
		private String color; 
		private String master;
		
Minion(String name, int eyes, String color, String master) {
this.name = name;
this.eyes = eyes;
this.color = color;
this.master = master;

}
public String getName() {
	return this.name;
}
public int getEyes() {
	return this.eyes;
}
public String getColor() {
	return this.color;
}
public void setMaster(String m) {
	this.master = m;
}
public String getMaster() {
	return this.master;
}
}
