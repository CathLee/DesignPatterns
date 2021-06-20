public class Client {
    public static void main(String[] args) {
        Factory factor = new Factory();
        Fruit fruit = factor.CreatFruit("B");
        fruit.eat();
    }

    public String factory(String fruitname) {
        if (fruitname.equals("Apple"))
            return "Apple";
        if (fruitname.equals("Banana"))
            return "Banana";
        return null;
    }
}
