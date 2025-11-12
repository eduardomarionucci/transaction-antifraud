package domain.model;

import java.time.LocalDateTime;
import java.util.List;

public class Analise {
    String identificador;
    double scoreRisco;
    List<Regra> regrasAcionadas;
    LocalDateTime timestamp;
    StatusAnalise status;
}
