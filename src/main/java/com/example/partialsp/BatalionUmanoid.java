package com.example.partialsp;

public class BatalionUmanoid implements Batalion{
    protected BatalionStrategy strategy;

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

    @Override
    public void addMembers(int q)
    {

    }

    @Override
    public int getMembers()
    {
        return 0;
    }
}
