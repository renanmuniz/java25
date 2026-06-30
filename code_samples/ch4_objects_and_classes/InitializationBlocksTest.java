package ch4_objects_and_classes;

public class InitializationBlocksTest {
    void main() {
        InitializationBlocks init1 = new InitializationBlocks("9876");

        IO.println(init1.getBalance()); // should print 100.0 because of the initialization block

        init1.deposit(50.0);
        IO.println(init1.getBalance()); // should print 150.0 after deposit

        init1.withdraw(50.0);
        IO.println(init1.getBalance()); // should print 100.0 after withdrawal
    }
}
