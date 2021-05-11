package AbF;

public class BConF implements BFruitAndVegetables {
	public Fruit CreateF() {
		return new Banana();
	}
	public Vegetables CreateV() {
		return null;
	}
}
