package org.example.ClasesATestear;

public class AvionComercial extends Avion {
    public AvionComercial(int capacidadCombustible, int consumoCombustible) {
        super(capacidadCombustible, consumoCombustible);
    }

    public int volar(int distancia) {
        int combustibleNecesario = distancia * consumoCombustible;

        return combustibleNecesario;
    }
}
