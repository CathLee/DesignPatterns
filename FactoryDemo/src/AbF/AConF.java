package AbF;

public class AConF implements AFruitAndVegetables{
	public Fruit CreateF() {
		return new Apple();
	}
	public Vegetables CreateV() {
		return null;
	}

}

