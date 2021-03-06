/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.vo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Samsung
 */
public class Cliente {
    
    private String nome;
    private String ra;
    private String ip;
    private String porta;
    private String senha;
    private int salaAtual;
    private Map<Integer, String> salasVotadas;
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    private String curso;
    private String periodo;

    public Cliente(String nome, String ra, String senha, String curso, String periodo, String ip, String porta) {
        this.salaAtual = -1;
        this.nome = nome;
        this.ra = ra;
        this.ip = ip;
        this.porta = porta;
        this.senha = senha;
        this.curso = curso ;
        this.periodo = periodo;
        salasVotadas = new HashMap<>();
    }

    public Cliente() {
        this.salaAtual = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public int getSalaAtual() {
        return salaAtual;
    }

    public void setSalaAtual(int salaAtual) {
        this.salaAtual = salaAtual;
    }
    
    public void addVoto(Integer idSala, String opcao){
        salasVotadas.put(idSala, opcao);
    }
    
    public String jaVotouNaSala(int idSala){
        return salasVotadas.get(idSala);
    }
    
}
