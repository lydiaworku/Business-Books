// Lydia Worku & Hemen Asfaw

class Purchase {

    static int invoice = 999;

    Client client;
    Item [] items;
    int date;
    Item tempItem;
    int total;


    public Purchase (Client client, int date, Item [] items){
        this.client = client;
        this.date = date;
        this.items = items;
        total = 0;
        for (Item i : items) {
            
            if (i.getCopiesDispo() > 0) {
                total = total + i.getPrice() + 1; // +1 for delivery cost
                i.decrementCopies();
            }
        }

        if (total > 0) {
        total = total + 2; // for handling cost 
        }

        invoice = invoice + 1;

        client.clientCredit = client.getCredit() - total;
            
        if (client.clientCredit < 0) {
            client.clientCredit = 0;
        }
        



    }

    public int getNumInvoice() {
        return invoice;
    }

    public int getTotalCost() {
        return total;
    }

    public int getDate() {
        return date;
    }

    public String getClientName() {
        return client.getName();
    }

    public boolean itemHere(Item targetItem) {
        boolean foundItem = false;
        for (Item i : items) {
            if (i.equals(targetItem)) {
                foundItem = true;
            }
        }
        return foundItem;
    }

    public String toString() {
        final String newLine = System.getProperty("line.separator");
        for (Item i : items) {
            tempItem = i;
        }
        return invoice + " " +  newLine + date + " " +  newLine +client.clientName + " " +  newLine +client.clientEmail + " " +  newLine + tempItem.title + " " +  newLine + tempItem.type + " " +  newLine+ total + newLine;
    }

    


}
