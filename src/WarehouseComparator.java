import java.util.Comparator;

public class WarehouseComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Warehouse warehouseEntry1 = (Warehouse) o1;
        Warehouse warehouseEntry2 = (Warehouse) o2;

        String itemName1 = warehouseEntry1.getItemName();
        String itemName2 = warehouseEntry2.getItemName();

        if (itemName1 != itemName2) {
            return itemName1.compareTo(itemName2);
        } else {
            int inOrOut1 = warehouseEntry1.getInOut();
            int inOrOut2 = warehouseEntry2.getInOut();
            return inOrOut2 - inOrOut1;
        }

    }

}
