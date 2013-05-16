/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magnata;

import logicaJogo.AguardaInicioJogo;
import logicaJogo.Estado;


/**
 *
 * @author PC
 */
public class Jogo {
    private Estado estado;
    
    public Jogo(){
        estado=new AguardaInicioJogo(); 
    }
    
    public void Desistir(){
        estado=estado.Desistir();
    }
    public void Terminar(){
        estado=estado.Terminar();
    }
    public void Cancelar(){
        estado=estado.Cancelar();
    }
    public void AdquirirEscritura(){
        estado=estado.AdquirirEscritura();
    }
    public void ConstruirPropriedade(){
        estado=estado.ConstruirPropriedade();
    }
    public void FimTurno(int tipofim){
        estado=estado.FimTurno(tipofim);
    }
    public void VenderCarta(){
        estado=estado.VenderCarta();
    }
    public void TrocarRecurso(){
        estado=estado.TrocarRecurso();
    }
    public void AvancaConstrucao(){
        estado=estado.AvancaConstrucao();
    }
    public void ComecarJogo(){
        estado=estado.ComecarJogo();
    }
    public void FinalizaJogo(){
        estado=estado.FinalizaJogo();
    }
    public void EscolherJogada(){
        estado=estado.EscolherJogada();
    }
    public void ComecarTurno(){
        estado=estado.ComecarTurno();
    }
    public void defineNomeJogador(int num, String nome){
        estado=estado.defineNomeJogador(num, nome);
    }
    public void escolheTokenEscritura(){
        estado=estado.escolheTokenEscritura();
    }
    public void escolheRecursoTroca(){
        estado=estado.escolheRecursoTroca();
    }
    
    
    
}
