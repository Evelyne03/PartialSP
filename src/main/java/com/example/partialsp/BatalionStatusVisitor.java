package com.example.partialsp;

public class BatalionStatusVisitor implements BatalionVisitor{
    /*@Override
    public void visit(GnomBatalion gnom) {
        System.out.println("Verificând batalionul de gnomi");
    }

    @Override
    public void visit(ElfBatalion elf) {
        System.out.println("Verificând batalionul de elfi");
    }*/

    @Override
    public void visit(EntBatalion ent) {
        System.out.println("Verificând batalionul de enti");
    }

    @Override
    public void visit(BatalionUmanoid um) {
        if(um instanceof GnomBatalion)
            System.out.println("Verificând batalionul de gnomi");
        else System.out.println("Verificând batalionul de elfi");
    }
}
