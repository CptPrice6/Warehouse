import java.util.ArrayList;
import java.util.HashMap;

public class Util {

    public void printList(ArrayList list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();

    }

    public void printHashMap(HashMap<Integer, Item> itemsHM) {
        for (HashMap.Entry entry : itemsHM.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();
    }

    public void findNamesAndPriceById(HashMap<Integer, Item> itemsHM, ArrayList<Warehouse> warehouseEntriesList) {
        for (Warehouse entry : warehouseEntriesList) {
            int id = entry.getItemId();
            if (itemsHM.containsKey(id)) {
                Item item = itemsHM.get(id);
                String name = item.getName();
                float price = item.getPrice();
                entry.setItemName(name);
                entry.setItemPrice(price);
            }

        }

    }

    public void printCompleteWarehouseEntries(HashMap<Integer, Item> itemsHM,
            ArrayList<Warehouse> warehouseEntriesList) {

        for (HashMap.Entry entry : itemsHM.entrySet()) {
            int id = (int) entry.getKey();
            String name = "";
            int amountIn = 0, amountOut = 0;
            float priceIn = 0, priceOut = 0;

            for (Warehouse w : warehouseEntriesList) {
                if (id == w.getItemId()) {
                    name = w.getItemName();
                    if (w.getInOut() == 1) {
                        amountIn += w.getAmount();
                        priceIn += w.getItemPrice() * w.getAmount();
                    } else {
                        amountOut += w.getAmount();
                        priceOut += w.getItemPrice() * w.getAmount();
                    }
                }
            }

            System.out.println("itemId=" + id + ", " + "itemName=" + name + ", " + "amountIn=" + amountIn + ", "
                    + "totalPriceIn="
                    + priceIn + ", "
                    + "amountOut=" + amountOut + ", " + "totalPriceOut=" + priceOut + ", " + "amountLeft="
                    + (amountIn - amountOut));

        }

    }
}
