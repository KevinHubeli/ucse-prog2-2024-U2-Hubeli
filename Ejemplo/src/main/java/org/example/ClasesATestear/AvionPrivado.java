package org.example.ClasesATestear;

public class AvionPrivado extends Avion {
    public AvionPrivado(int capacidadCombustible, int consumoCombustible) {
        super(capacidadCombustible, consumoCombustible);
    }

    public int volar(int distancia) {
        int combustibleNecesario = (distancia * consumoCombustible) + (getCapacidadCombustible() / 2);

        return combustibleNecesario;
    }
}
