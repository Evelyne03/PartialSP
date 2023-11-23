package com.example.partialsp;

public class BatalionFactory {
    public static Batalion createBatalion(String type) {
        switch (type) {
            case "gnom":
                return new GnomBatalion(1);
            case "elf":
                return new ElfBatalion(1);
            case "ent":
                return new EntBatalion(1);
            default:
                throw new IllegalArgumentException("Tip necunoscut de batalion");
        }
    }
}
