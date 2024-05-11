import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Util utility = new Util();
        ReadDataFromJSON dataReader = new ReadDataFromJSON();
        MergeSort srt = new MergeSort();

        ArrayList<Warehouse> warehouseEntriesJSON = dataReader.readAllWarehouseEntries("./JSON_files/Warehouse.json");
        System.out.println("Unsorted warehouse entries:");
        utility.printList(warehouseEntriesJSON);
        HashMap<Integer, Item> itemsHMJSON = dataReader.readAllItemsToHashMap("./JSON_files/ItemsHM.json");
        System.out.println("Items hashmap:");
        utility.printHashMap(itemsHMJSON);

        utility.findNamesAndPriceById(itemsHMJSON, warehouseEntriesJSON);

        srt.sort(warehouseEntriesJSON, new WarehouseComparator(),
                warehouseEntriesJSON.size());

        System.out.println("Sorted warehouse entries:");
        utility.printList(warehouseEntriesJSON);

        System.out.println("Complete warehouse entries:");
        utility.printCompleteWarehouseEntries(itemsHMJSON, warehouseEntriesJSON);

    }

}
