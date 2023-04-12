// Lydia Worku & Hemen Asfaw

class Journal {

static Purchase [] purchases;
static int numPurchases;
static int maxSize;


public static void initialize(int max){
    maxSize = max;
    numPurchases = 0;
    purchases = new Purchase[maxSize];
}
public static boolean add(Purchase aPurchase){
    boolean added = false;
    if(numPurchases == maxSize){
        System.out.print("Max value has been reached!");
    }
    else{
        purchases[numPurchases] = aPurchase;
        numPurchases ++;
        added = true;
    }
    return added;

}
public static int [] purchasesForClient(Client client){
    int index = 0;
    int [] clientPurchases = new int [maxSize]; 
    for (Purchase i : purchases) {
        if (i.getClientName() == client.clientName){
            clientPurchases[index] = i.getTotalCost();
            index ++;
        }
    }
    return clientPurchases;
}
public static void displayPurchasesItem(Item anItem) {
    for (Purchase i : purchases) {
        if (i.itemHere(anItem)){
            System.out.println(i.getClientName() + " " + i.getDate());
        }
    }
}
public static int calculatesTotalPurchases() {
    int sum =  0;
    for (Purchase i : purchases) {
        sum += i.getTotalCost();
    }
    return sum;
}
}