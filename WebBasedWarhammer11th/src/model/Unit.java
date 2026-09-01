package model;

public class Unit {
	Model[] unit;
	public Unit(int size) {
		unit = new Model[size];
	}
	
	public void addModel() {
		Model[] temp = new Model[unit.length + 1];
		
		for (int i = 0; i < temp.length; i++) {
			if (i < unit.length);
				temp[i] = unit [i];
			}
	}
	
	
		
}
