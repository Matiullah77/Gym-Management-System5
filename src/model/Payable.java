package model;

// NEW: interface Payable (requirement #2)
public interface Payable {
    double calculatePayment(); // NEW: must be implemented by Member & Trainer
}
