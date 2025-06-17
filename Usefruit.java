public class Usefruit {
    public static void main(String[] args) {
        Fruit[] fruits = { new Apple(), new Orange(), new Melon(), new Mangosteen()};

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i].whatColor());
        }
    }
}
