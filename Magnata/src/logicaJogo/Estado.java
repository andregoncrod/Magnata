/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaJogo;

/**
 *
 * @author Daniela
 */
public abstract class Estado {
    public abstract Estado Desistir();
    public abstract Estado Terminar();
    public abstract Estado Cancelar();
    public abstract Estado AdquirirEscritura();
    public abstract Estado ConstruirPropriedade();
    public abstract Estado FimTurno(int tipofim);
    public abstract Estado VenderCarta();
    public abstract Estado TrocarRecurso();
    public abstract Estado AvancaConstrucao();
    public abstract Estado ComecarJogo();
    public abstract Estado FinalizaJogo();
    public abstract Estado EscolherJogada();
    public abstract Estado ComecarTurno();
    abstract public Estado defineNomeJogador(int num, String nome);
    abstract public Estado escolheTokenEscritura();
    abstract public Estado escolheRecursoTroca();
}
