package AbF;

public class AConV implements AFruitAndVegetables{
	public Vegetables CreateV() {
		return new cabbage();
	}
	public Fruit CreateF() {
		return null;
	}
}
