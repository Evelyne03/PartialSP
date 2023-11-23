package com.example.partialsp;

public class DefenseStrategy extends BatalionStrategy{
    @Override
    public void execute(Batalion batalion) {
        String batalionType = batalion.getClass().getSimpleName().replace("Batalion", "");
        System.out.println("Apărând pozițiile cu batalionul de " + batalionType.toLowerCase() +"!");

        if(batalionType.toLowerCase().equals("gnom"))
            System.out.println("Gnomii isi folosesc scuturile pentru a forma un zid impenetrabil!");
        else if(batalionType.toLowerCase().equals("elf"))
            System.out.println("Elfii se aduna, creand un val de protectie in jurul lor!");
        else if(batalionType.toLowerCase().equals("ent"))
            System.out.println("Entii creeaza un zid cu ajutorul puterilor mistice!");
    }
}
