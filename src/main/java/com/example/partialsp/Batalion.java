package com.example.partialsp;

public interface Batalion {
    void accept(BatalionVisitor visitor);
    void setStrategy(BatalionStrategy strategy);
    void executeStrategy();

    void addMembers(int q);

    int getMembers();
}
