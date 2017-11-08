/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.vo;

import java.util.ArrayList;

/**
 *
 * @author felipesoares
 */
public class Sala {

    private String criador_ra;
    private String criador_nome;
    private String nome;
    private String descricao;
    private final int id;
    private String inicio;
    private String fim;
    private Boolean status = true;
    private int mensagens;
    private ArrayList<Voto> opcoes = new ArrayList<>();

    public Sala(int id, String criador_ra, String criador_nome, String nome, String descricao, String fim, ArrayList<Voto> opcoes) {
        this.criador_ra = criador_ra;
        this.criador_nome = criador_nome;
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
        this.inicio = String.valueOf(System.currentTimeMillis()/1000);
        this.fim = String.valueOf(fim);
        this.mensagens = 0;
        this.opcoes = opcoes;

    }

    public ArrayList<Voto> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(ArrayList<Voto> opcoes) {
        this.opcoes = opcoes;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getMensagens() {
        return mensagens;
    }

    public void setMensagens(int mensagens) {
        this.mensagens = mensagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCriador_ra() {
        return criador_ra;
    }

    public void setCriador_ra(String criador_ra) {
        this.criador_ra = criador_ra;
    }

    public String getCriador_nome() {
        return criador_nome;
    }

    public void setCriador_nome(String criador_nome) {
        this.criador_nome = criador_nome;
    }

    public int getId() {
        return id;
    }

    
}
