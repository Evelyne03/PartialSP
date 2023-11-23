package com.example.partialsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class PartialSpApplication {

    public static void main(String[] args) {

        //SpringApplication.run(PartialSpApplication.class, args);

        Batalion gnomBatalion = BatalionFactory.createBatalion("gnom");
        gnomBatalion.addMembers(99);
        System.out.println("Sunt " + gnomBatalion.getMembers() + " gnomi in batalion");
        gnomBatalion.setStrategy(new AtackStrategy());
        gnomBatalion.executeStrategy();
        gnomBatalion.setStrategy(new DefenseStrategy());
        gnomBatalion.executeStrategy();

        Batalion elfBataion = BatalionFactory.createBatalion("elf");
        Batalion entBataion = BatalionFactory.createBatalion("ent");

        elfBataion.addMembers(999);
        System.out.println("Sunt " + elfBataion.getMembers() + " elfi in batalion");
        elfBataion.setStrategy(new AtackStrategy());
        elfBataion.executeStrategy();
        elfBataion.setStrategy(new DefenseStrategy());
        elfBataion.executeStrategy();


        entBataion.addMembers(49);
        System.out.println("Sunt " + entBataion.getMembers() + " enti in batalion");
        entBataion.setStrategy(new AtackStrategy());
        entBataion.executeStrategy();
        entBataion.setStrategy(new DefenseStrategy());
        entBataion.executeStrategy();


        int nrTotal = elfBataion.getMembers() + entBataion.getMembers() +
                gnomBatalion.getMembers();

        System.out.println("In toata armata dispunem de " + nrTotal + " unitati");

        BatalionVisitor visitor = new BatalionStatusVisitor();
        gnomBatalion.accept(visitor);
        elfBataion.accept(visitor);
        entBataion.accept(visitor);
    }

}
