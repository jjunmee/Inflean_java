package access.ex;

public class Item {
    private String itemNm;
    private int itemAt;
    private int itemQt;

    public Item(String itemNm, int itemAt, int itemQt) {
        this.itemNm = itemNm;
        this.itemAt = itemAt;
        this.itemQt = itemQt;
    }

    public String getItemNm(){
        return itemNm;
    }

    public int getItemTotalAt(){
        return itemAt * itemQt;
    }
}
