package com.example.partialsp;

public class AtackStrategy extends BatalionStrategy{
    @Override
    public void execute(Batalion batalion) {
        String batalionType = batalion.getClass().getSimpleName().replace("Batalion", "");
        System.out.println("Atacând inamicul cu batalionul de " + batalionType.toLowerCase() + "!");
        if(batalionType.toLowerCase().equals("gnom"))
            System.out.println("Gnomii isi ascut topoarele si merg spre lupta!");
        else if(batalionType.toLowerCase().equals("elf"))
            System.out.println("Elfii isi pregatesc arcurile, trimitand o ploaie de sageti!");
        else if(batalionType.toLowerCase().equals("ent"))
            System.out.println("Entii se ridica mareti, atacand cu puterea lor mistica!");
    }
}
