package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int cnt = 0;

    public void addItem(Item item){
        if(cnt > items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        this.items[cnt++] = item;
    }

    public void displayItems(){
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < cnt; i++) {
            System.out.println("상품명 : " + items[i].getItemNm() + ", 합계 : " + items[i].getItemTotalAt());
            total += items[i].getItemTotalAt();
        }
        System.out.println("전체 가격 합 : " + total);
    }
}
