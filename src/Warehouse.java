public class Warehouse {

    private String date;
    private int itemId;
    private String itemName;
    private float itemPrice;
    private int amount;
    private int in_out;

    public Warehouse(String date, int itemId, int amount, int in_out) {
        if (itemId < 0)
            throw new IllegalArgumentException();
        this.date = date;
        this.itemId = itemId;
        this.amount = amount;
        this.in_out = in_out;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getInOut() {
        return in_out;
    }

    public void setInOut(int in_out) {
        this.in_out = in_out;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Warehouse [date=" + date + ", itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice
                + ", amount=" + amount + ", in_out=" + in_out + "]";
    }

}
