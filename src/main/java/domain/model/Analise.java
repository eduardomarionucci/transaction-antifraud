package domain.model;

import domain.rule.StatusAnalise;

import java.util.List;

public class Analise {
    String identificador;
    double scoreRisco;
    List<Regra> regrasAcionadas;
    DateTime timestamp;
    StatusAnalise status;
}
