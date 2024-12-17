
package AccountTask;

public class Account {
        private String name;
        private double balance;
        private String pin;

        public Account(String name, String pin ) {
            this.name = name;
            this.pin = pin;
        }


        public void deposit(double amount) {
            this.balance += amount;
        }

         public void withdraw(double amount, String pin) {
            validatePin(pin);
            if(amount > this.balance) throw new IllegalArgumentException("Amount to withdraw is higher");
            this.balance -= amount;
        }

        public double getBalance() {
            return this.balance;
        }
        private void validatePin(String pin) {
            if (!pin.equals(this.pin)) {
                throw new IllegalArgumentException("PIN does not match");

            }
        }

}
