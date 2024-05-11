import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadDataFromJSON {

    public HashMap<Integer, Item> readAllItemsToHashMap(String fileName) {

        HashMap<Integer, Item> hm = new HashMap();

        Gson gson = new Gson();

        try (Reader reader = new FileReader(fileName)) {

            hm = gson.fromJson(reader, new TypeToken<HashMap<Integer, Item>>() {
            }.getType());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return hm;
    }

    public ArrayList<Warehouse> readAllWarehouseEntries(String fileName) {

        ArrayList<Warehouse> arr = new ArrayList();

        Gson gson = new Gson();

        try (Reader reader = new FileReader(fileName)) {

            arr = gson.fromJson(reader, new TypeToken<ArrayList<Warehouse>>() {
            }.getType());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

}