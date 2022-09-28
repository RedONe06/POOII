package br.ulbra.entity;

public class Usuario {

    private int idUsu;
    private String nomeUsu;
    private String emailUsu;
    private String senhaUsu;
    private String foneUsu;
    private int sexoUsu;
    private String cepUsu;
    private String logradouroUsu;
    private String bairroUsu;
    private String cidadeUsu;
    private String estadoUsu;
    private String numeroUsu;
    
    public Usuario() {
    }

    public Usuario(int idUsu, String nomeUsu, String emailUsu, String senhaUsu,
            String foneUsu, int sexoUsu, String cepUsu, String logradouroUsu,
            String bairroUsu, String cidadeUsu, String estadoUsu, String numeroUsu) {
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.emailUsu = emailUsu;
        this.senhaUsu = senhaUsu;
        this.foneUsu = foneUsu;
        this.sexoUsu = sexoUsu;
        this.cepUsu = cepUsu;
        this.logradouroUsu = logradouroUsu;
        this.bairroUsu = bairroUsu;
        this.cidadeUsu = cidadeUsu;
        this.estadoUsu = estadoUsu;
        this.numeroUsu = numeroUsu;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getFoneUsu() {
        return foneUsu;
    }

    public void setFoneUsu(String foneUsu) {
        this.foneUsu = foneUsu;
    }

    public int getSexoUsu() {
        return sexoUsu;
    }

    public void setSexoUsu(int sexoUsu) {
        this.sexoUsu = sexoUsu;
    }

    public String getCepUsu() {
        return cepUsu;
    }

    public void setCepUsu(String cepUsu) {
        this.cepUsu = cepUsu;
    }

    public String getLogradouroUsu() {
        return logradouroUsu;
    }

    public void setLogradouroUsu(String logradouroUsu) {
        this.logradouroUsu = logradouroUsu;
    }

    public String getBairroUsu() {
        return bairroUsu;
    }

    public void setBairroUsu(String bairroUsu) {
        this.bairroUsu = bairroUsu;
    }

    public String getCidadeUsu() {
        return cidadeUsu;
    }

    public void setCidadeUsu(String cidadeUsu) {
        this.cidadeUsu = cidadeUsu;
    }

    public String getEstadoUsu() {
        return estadoUsu;
    }

    public void setEstadoUsu(String estadoUsu) {
        this.estadoUsu = estadoUsu;
    }

    public String getNumeroUsu() {
        return numeroUsu;
    }

    public void setNumeroUsu(String numeroUsu) {
        this.numeroUsu = numeroUsu;
    }

    @Override
    public String toString() {
        return " ID:    " + this.idUsu
                + " Nome:  " + this.nomeUsu
                + " E-mail:" + this.emailUsu
                + " Senha: " + this.senhaUsu
                + " Fone:  " + this.foneUsu
                + " Sexo:  " + this.sexoUsu;
    }
}
