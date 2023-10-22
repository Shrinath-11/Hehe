package Set01;

class checkingAccount {
    public int amount;

    public checkingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }
}

class x {
    public static void main(String[] args) {
        checkingAccount ac = new checkingAccount((int) (Math.random() * 1000));
        
        ac.amount=0;
        System.out.println(ac.getAmount());
    }
}
