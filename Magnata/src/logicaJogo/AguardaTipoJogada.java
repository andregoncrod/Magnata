/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaJogo;

/**
 *
 * @author Daniela
 */
public class AguardaTipoJogada extends Estado{

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
        return new AguardaAdquirirEscritura(/*Jogador jogador*/);
    }

    @Override
    public Estado ConstruirPropriedade() {
        return new AguardaConstruirPropriedade();
    }

    @Override
    public Estado FimTurno(int tipofim) {
        //return Jogo.verficatipofim();
        if(tipofim==0) {
            return new TerminaJogo();
        }
        else if(tipofim==1) {
            return new AguardaEscolheRecurso();
        }
        else if(tipofim==3) {
            return this;
        }
        return this;
    }

    @Override
    public Estado VenderCarta() {
        return new AguardaVenderCarta();
    }

    @Override
    public Estado TrocarRecurso() {
        return new AguardaTrocaRecurso();
    }

    @Override
    public Estado AvancaConstrucao() {
        return new AguardaAvancarContrucao();
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
    public Estado ComecarTurno(){return this;}
    
    @Override
    public Estado EscolherJogada(){
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
