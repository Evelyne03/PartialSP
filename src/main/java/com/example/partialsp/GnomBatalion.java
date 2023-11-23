package com.example.partialsp;

public class GnomBatalion extends BatalionUmanoid {
    private int quantity;
    private BatalionStrategy strategy;

    public GnomBatalion(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addMembers(int q){
        quantity+=q;
        System.out.println("S-au alaturat " + q + " gnomi batalionului!");
    }

    @Override
    public int getMembers()
    {
        return quantity;
    }

    @Override
    public void accept(BatalionVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setStrategy(BatalionStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void executeStrategy() {
        strategy.execute(this);
    }
}
