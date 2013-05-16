/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaJogo;

/**
 *
 * @author Daniela
 */
public class AguardaAvancarContrucao extends Estado{

    @Override
    public Estado Desistir() {
        return this;
    }

    @Override
    public Estado Terminar() {
        return new AguardaTipoJogada();
    }

    @Override
    public Estado Cancelar() {
        return new AguardaTipoJogada();
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
    
    @Override
    public Estado EscolherJogada(){
        //metodo do jogo para escolher carta e vende-la
        return new AguardaTipoJogada();
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
    public Estado escolheTokenEscritura(){
        return this;
    }
    
    @Override
    public Estado escolheRecursoTroca(){
        return this;
    }
}
