import java.util.Random;

public class MagicBox <T>{
    public T[] items;

    public  MagicBox (int amount) {
        items = (T[]) new Object[amount];

    }

    public boolean add (T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int numEmpty = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                numEmpty += 1;
            }
        }
        if (numEmpty != 0) {
            throw  new RuntimeException("Коробка не полна, осталось заполнить " + numEmpty + " ячеек.");
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
    public T[] getItems() {
        return items;
    }
}
