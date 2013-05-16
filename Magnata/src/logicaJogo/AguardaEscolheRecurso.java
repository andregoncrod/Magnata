/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaJogo;

/**
 *
 * @author Daniela
 */
public class AguardaEscolheRecurso extends Estado{

    @Override
    public Estado Desistir() {
        return new TerminaJogo();
    }

    @Override
    public Estado Terminar() {
        return this;
    }

    @Override
    public Estado Cancelar() {
        return this;
    }

    @Override
    public Estado AdquirirEscritura() {
        return this;
    }

    @Override
    public Estado ConstruirPropriedade() {
        return this;
    }

    @Override
    public Estado FimTurno(int tipofim) {
        return this;
    }

    @Override
    public Estado VenderCarta() {
        return this;
    }

    @Override
    public Estado TrocarRecurso() {
        return this;
    }

    @Override
    public Estado AvancaConstrucao() {
       return this;
    }

    @Override
    public Estado ComecarJogo() {
        return this;
    }

    @Override
    public Estado FinalizaJogo() {
        return this;
    }
    
    public Estado ComeçarTurno(){
        return new AguardaTipoJogada();
    }
    
    @Override
    public Estado EscolherJogada(){
        return this;
    }
    
    @Override
    public Estado ComecarTurno(){
        return this;
    }
    
    @Override
    public Estado defineNomeJogador(int num, String nome){
        return this;
    }
    
    @Override
    public Estado escolheTokenEscritura(/*Naipe naipe1,Naipe naipe2*/){
        //metodo escolher entre dois tokens
        return new AguardaTipoJogada();
    }
    
    @Override
    public Estado escolheRecursoTroca(){
        return this;
    }
}
