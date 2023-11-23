package com.example.partialsp;

public class ElfBatalion extends BatalionUmanoid {
    private int quantity;

    public ElfBatalion(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addMembers(int q){
        quantity+=q;
        System.out.println("S-au alaturat " + q + " elfi batalionului!");
    }

    @Override
    public int getMembers()
    {
        return quantity;
    }

    private BatalionStrategy strategy;
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
