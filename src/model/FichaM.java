/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Leopo
 */
public class FichaM implements Serializable{
    private String nome;
    private String sobrenome;
    private String autor2;
    private String autor3;
    private boolean maisAutores;
    private String titulo;
    private String subTitulo;
    private int ano;
    private String codigoCutter;
    private String orientador;
    private boolean orientadora;
    private String coorientador;
    private boolean coorientadora;
    private String trabalho;
    private String curso;
    private int numPaginas;
    private String ilutrações;
    private String palavra1;
    private String palavra2;
    private String palavra3;
    private int tamanhoFonte;

    public FichaM(String nome, String sobrenome, String autor2, String autor3, boolean maisAutores, String titulo, String subTitulo, int ano, String codigoCutter, String orientador, boolean orientadora, String coorientador, boolean coorientadora, String trabalho, String curso, int numPaginas, String ilutrações, String palavra1, String palavra2, String palavra3, int tamanhoFonte) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.autor2 = autor2;
        this.autor3 = autor3;
        this.maisAutores = maisAutores;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.ano = ano;
        this.codigoCutter = codigoCutter;
        this.orientador = orientador;
        this.orientadora = orientadora;
        this.coorientador = coorientador;
        this.coorientadora = coorientadora;
        this.trabalho = trabalho;
        this.curso = curso;
        this.numPaginas = numPaginas;
        this.ilutrações = ilutrações;
        this.palavra1 = palavra1;
        this.palavra2 = palavra2;
        this.palavra3 = palavra3;
        this.tamanhoFonte = tamanhoFonte;
    }

    public FichaM() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getAutor2() {
        return autor2;
    }

    public void setAutor2(String autor2) {
        this.autor2 = autor2;
    }

    public String getAutor3() {
        return autor3;
    }

    public void setAutor3(String autor3) {
        this.autor3 = autor3;
    }

    public boolean isMaisAutores() {
        return maisAutores;
    }

    public void setMaisAutores(boolean maisAutores) {
        this.maisAutores = maisAutores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCodigoCutter() {
        return codigoCutter;
    }

    public void setCodigoCutter(String codigoCutter) {
        this.codigoCutter = codigoCutter;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public boolean isOrientadora() {
        return orientadora;
    }

    public void setOrientadora(boolean orientadora) {
        this.orientadora = orientadora;
    }

    public String getCoorientador() {
        return coorientador;
    }

    public void setCoorientador(String coorientador) {
        this.coorientador = coorientador;
    }

    public boolean isCoorientadora() {
        return coorientadora;
    }

    public void setCoorientadora(boolean coorientadora) {
        this.coorientadora = coorientadora;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIlutrações() {
        return ilutrações;
    }

    public void setIlutrações(String ilutrações) {
        this.ilutrações = ilutrações;
    }

    public String getPalavra1() {
        return palavra1;
    }

    public void setPalavra1(String palavra1) {
        this.palavra1 = palavra1;
    }

    public String getPalavra2() {
        return palavra2;
    }

    public void setPalavra2(String palavra2) {
        this.palavra2 = palavra2;
    }

    public String getPalavra3() {
        return palavra3;
    }

    public void setPalavra3(String palavra3) {
        this.palavra3 = palavra3;
    }

    public int getTamanhoFonte() {
        return tamanhoFonte;
    }

    public void setTamanhoFonte(int tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
    }
    
    
}
