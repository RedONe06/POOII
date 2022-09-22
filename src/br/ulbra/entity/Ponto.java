package br.ulbra.entity;
/**
 * @author Priscila Butzke
 */
public class Ponto {
    private int idPonto;
    private String nomePonto;
    private String ruaPonto;
    private int numeroPonto;
    private String cidadePonto;
    private String estadoPonto;
    private String contatoPonto;
    private String descricaoPonto;
    private String cepPonto;

    public Ponto() {
    }

    public Ponto(int idPonto, String nomePonto, String ruaPonto, int numeroPonto, String cidadePonto, String estadoPonto, String contatoPonto, String descricaoPonto) {
        this.idPonto = idPonto;
        this.nomePonto = nomePonto;
        this.ruaPonto = ruaPonto;
        this.numeroPonto = numeroPonto;
        this.cidadePonto = cidadePonto;
        this.estadoPonto = estadoPonto;
        this.contatoPonto = contatoPonto;
        this.descricaoPonto = descricaoPonto;
    }

    public int getIdPonto() {
        return idPonto;
    }

    public void setIdPonto(int idPonto) {
        this.idPonto = idPonto;
    }

    public String getNomePonto() {
        return nomePonto;
    }

    public void setNomePonto(String nomePonto) {
        this.nomePonto = nomePonto;
    }

    public String getRuaPonto() {
        return ruaPonto;
    }

    public void setRuaPonto(String ruaPonto) {
        this.ruaPonto = ruaPonto;
    }

    public int getNumeroPonto() {
        return numeroPonto;
    }

    public void setNumeroPonto(int numeroPonto) {
        this.numeroPonto = numeroPonto;
    }

    public String getCidadePonto() {
        return cidadePonto;
    }

    public void setCidadePonto(String cidadePonto) {
        this.cidadePonto = cidadePonto;
    }

    public String getEstadoPonto() {
        return estadoPonto;
    }

    public void setEstadoPonto(String estadoPonto) {
        this.estadoPonto = estadoPonto;
    }

    public String getContatoPonto() {
        return contatoPonto;
    }

    public void setContatoPonto(String contatoPonto) {
        this.contatoPonto = contatoPonto;
    }

    public String getDescricaoPonto() {
        return descricaoPonto;
    }

    public void setDescricaoPonto(String descricaoPonto) {
        this.descricaoPonto = descricaoPonto;
    }

    public String getCepPonto() {
        return cepPonto;
    }

    public void setCepPonto(String cepPonto) {
        this.cepPonto = cepPonto;
    }

    @Override

    
    public String toString() {
        return "Ponto{" + "idPonto=" + idPonto + ", nomePonto=" + nomePonto + ", ruaPonto=" 
                + ruaPonto + ", numeroPonto=" + numeroPonto + ", cidadePonto=" + cidadePonto 
                + ", estadoPonto=" + estadoPonto + ", contatoPonto=" + contatoPonto 
                + ", descricaoPonto=" + descricaoPonto + ", cepPonto=" + cepPonto + '}';
    
    }   
}
