package Example_Mart;

public class MartTest {
    public static void main(String[] args) {
        Store store = new Store();

        Buyer buyer1 = new Buyer("현명", store);
        Buyer buyer2 = new Buyer("중민", store);
        Buyer buyer3 = new Buyer("재준", store);
        Buyer buyer4 = new Buyer("민석", store);
        Buyer buyer5 = new Buyer("정훈", store);
        Buyer buyer6 = new Buyer("윤호", store);
        Buyer buyer7 = new Buyer("재석", store);
        Buyer buyer8 = new Buyer("형돈", store);
        Buyer buyer9 = new Buyer("명수", store);
        Buyer buyer10 = new Buyer("준하", store);

        Seller seller = new Seller(store);
        seller.setDaemon(true);

        buyer1.start();
        buyer2.start();
        buyer3.start();
        buyer4.start();
        buyer5.start();
        buyer6.start();
        buyer7.start();
        buyer8.start();
        buyer9.start();
        buyer10.start();
        seller.start();

    }

}
