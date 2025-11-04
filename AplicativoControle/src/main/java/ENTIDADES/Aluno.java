/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTIDADES;

/**
 *
 * @author davio
 */
public class Aluno {
    private int id;
    private String nome_completo;
    private String serie;
    private String data_saida;
    private String hora;
    private String quem_autorizou;
    private String saiu_com_quem;
    private String motivo;
    private String saidaFeitaPor;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome_completo
     */
    public String getNome_completo() {
        return nome_completo;
    }

    /**
     * @param nome_completo the nome_completo to set
     */
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @return the data_saida
     */
    public String getData_saida() {
        return data_saida;
    }

    /**
     * @param data_saida the data_saida to set
     */
    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the quem_autorizou
     */
    public String getQuem_autorizou() {
        return quem_autorizou;
    }

    /**
     * @param quem_autorizou the quem_autorizou to set
     */
    public void setQuem_autorizou(String quem_autorizou) {
        this.quem_autorizou = quem_autorizou;
    }

    /**
     * @return the saiu_com_quem
     */
    public String getSaiu_com_quem() {
        return saiu_com_quem;
    }

    /**
     * @param saiu_com_quem the saiu_com_quem to set
     */
    public void setSaiu_com_quem(String saiu_com_quem) {
        this.saiu_com_quem = saiu_com_quem;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the saidaFeitaPor
     */
    public String getSaidaFeitaPor() {
        return saidaFeitaPor;
    }

    /**
     * @param saidaFeitaPor the saidaFeitaPor to set
     */
    public void setSaidaFeitaPor(String saidaFeitaPor) {
        this.saidaFeitaPor = saidaFeitaPor;
    }

}