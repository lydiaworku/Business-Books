// Lydia Worku & Hemen Asfaw

class Client {

    String clientName;
    String clientEmail;
    String clientPwd;
    int clientCredit;

    public Client (String clientName, String clientEmail, String clientPwd) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPwd = clientPwd;
        this.clientCredit = 10;

    }

    public String getName() {
        return clientName;
    }
    
    public String getEmail() {
        return clientEmail;
    }

    public int getCredit() {
        return clientCredit;
    }

    public void setEmail (String newEmail) {
        this.clientEmail = newEmail;
    }

    public boolean verifyPassword (String pwd) {
        boolean verify = false;
        if (pwd.equals(this.clientPwd)) {
            verify = true;
        }
        return verify;
    }

    public boolean changePassword(String oldPwd, String newPwd){
        boolean pwdCheck = false;
        if (oldPwd == this.clientPwd){
            pwdCheck = true;
            this.clientPwd = newPwd;
        }
        return pwdCheck;
        }


    public boolean reduceCredit(int amountCredit){
        boolean credcheck = false;
        if(amountCredit < this.clientCredit){
            this.clientCredit = this.clientCredit - amountCredit; 
            credcheck = true;
        }
        return credcheck;

    }


}