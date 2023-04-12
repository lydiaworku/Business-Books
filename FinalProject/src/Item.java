// Lydia Worku & Hemen Asfaw

class Item {

    static final int BOOK = 0;
    static final int DVD = 1;
    static final int GAME = 2;


    int type;
    String title;
    int price;
    int copies;

        public Item (int type, String title, int price, int copies) {
            this.type = type;
            this.title = title;
            this.price = price;
            this.copies = copies;

        }
    
        public int getType() {
            return type;
        }
        
        public String getTitle() {
            return title;
        }
    
        public int getPrice() {
            return price;
        }
    
        public void setPrice(int newPrice) {
            this.price = newPrice;
        }
    
        public int getCopiesDispo() {
            return copies;
        }
    
        public boolean decrementCopies(){
            boolean decrement = false;
            if(this.copies > 0){
                decrement = true;
                this.copies = this.copies - 1;
            }
            else{
                System.out.print("Error: No copies of " + this.title + " available");
            }
            return decrement; 
        }
    
        public void incrementCopies(){
            this.copies = this.copies +1;
        }
    
        public static String typeToString(int type){
            String whatType = "";
            if (type == 0) {
                whatType = "Book";}
            else if (type == 1) {
                whatType = "DVD";}
            else {
                whatType = "Video game";
            }
            return whatType;
            }
    
    
    }
    
