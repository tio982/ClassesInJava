
class Account {



    public Account(String myAccount, String johnson, int myBalance){
        this.Balance = myBalance;
        this.ID = myAccount;

    }


    public String ID;
    String Name;
    int Balance;

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Account{" + "id='" + ID + ", name='" + Name + ", balance=" + Balance + '}';
    }
            }
