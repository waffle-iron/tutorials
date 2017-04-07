package uk.co.jamesmcguigan.patterns.structural.composite;

public class Column extends Composite {

    public Column(final int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}
