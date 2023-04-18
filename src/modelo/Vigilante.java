/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author IFPR
 */
public class Vigilante extends Pessoa{
    private String horaDeEntrada, horadeSaida, nome,cpf;
    private String login,senha;

    public String getLogin() {
        return login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @return the horaDeEntrada
     */
    public String getHoraDeEntrada() {
        return horaDeEntrada;
    }

    /**
     * @param horaDeEntrada the horaDeEntrada to set
     */
    public void setHoraDeEntrada(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    /**
     * @return the horadeSaida
     */
    public String getHoradeSaida() {
        return horadeSaida;
    }

    /**
     * @param horadeSaida the horadeSaida to set
     */
    public void setHoradeSaida(String horadeSaida) {
        this.horadeSaida = horadeSaida;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
