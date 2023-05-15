public abstract class CreditCard {
    private int debt;
    public CreditCard(int debt) {
        this.debt = debt;
    }

    public void pay(int amount) {
        this.debt = this.debt + amount;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getDebt() {
        return debt;
    }
}
