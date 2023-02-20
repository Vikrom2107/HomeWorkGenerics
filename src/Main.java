public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox= new MagicBox<>(3);
        System.out.println(magicBox.add(15));
        magicBox.add(20);
//        magicBox.pick();
        magicBox.add(30);
        System.out.println(magicBox.add(50));
        magicBox.pick();
        System.out.println(((Object[])magicBox.getItems())[0]);

        MagicBox<String> magicBoxStr= new MagicBox<>(3);
        System.out.println(magicBoxStr.add("Игрушка"));
        magicBoxStr.add("Книга");
//        magicBox.pick();
        magicBoxStr.add("Палочка");
        System.out.println(magicBoxStr.add("Шляпа"));
        magicBoxStr.pick();
    }
}