package bankbranches;
import java.util.ArrayList;


public class Bank{ 
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            System.out.println("Branch: " + branchName + ",  created successfully.");
            return true;
        }
        System.out.print(branchName + "\nAlready exists.");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch selectedBranch = findBranch(branchName);
        if (selectedBranch != null) {
           if (selectedBranch.findCustomer(customerName) == null ) {
               selectedBranch.addCustomer(customerName, initialAmount);
               System.out.print("Customer: " + customerName + " registered successfully.\nInitial amount: " + initialAmount);
               return true;
           } else {
               System.out.println(customerName + " is already registered." + branchName);
               return false;
           }
       } else {
            System.out.println("Branch - " + branchName + " - not found.");
            return false;
       }
    }

    
    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch selectedBranch = findBranch(branchName);
        if (selectedBranch != null) {
            Customer selectedCustomer = selectedBranch.findCustomer(customerName);
            if (selectedCustomer != null) {
                selectedCustomer.addTransaction(amount);
                System.out.println(amount + " accept.");
                return true;
            } else {
                System.out.println("Customer " + customerName + " not found.");
                return false;
            }
        } else {
            System.out.println("Branch - " + branchName + " - not found.");
            return false;
        }

    }
    
    
    public Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    
    public boolean printCustomers(String branchName, boolean listTransactions) {
        Branch selectedBranch = findBranch(branchName);
        if (selectedBranch != null) {
            System.out.println(selectedBranch.getName() + ": customer data ");
            ArrayList<Customer> branchCustomers = selectedBranch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer currentCustomer = branchCustomers.get(i);
                System.out.println("Name: " + currentCustomer.getName());
                if (listTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = currentCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("No. : " + (j+1) + ": " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}    