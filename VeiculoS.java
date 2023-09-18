package PROJETOVEICULOSESTAGIARIO;

import java.time.LocalDate;

public abstract class VeiculoS implements IImpressao{
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String chassi;
    protected LocalDate AnoModelo;
    protected LocalDate AnoFabricacao;
    protected int eixo;
    protected double PesoLiquido;
    protected double PesoTotal;
    protected int assentos;
    protected String rodas;
    protected double fabricante;
    protected String potencia;
    protected String TipoCombustivel;
    protected String EstadoUF;
    protected String CidadeUF;
    protected String TipoVeiculo;
    protected int QtdeMotores;
    protected int QtdeOcupantes;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public LocalDate getAnoModelo() {
        return AnoModelo;
    }
    public void setAnoModelo(LocalDate anoModelo) {
        AnoModelo = anoModelo;
    }
    public LocalDate getAnoFabricacao() {
        return AnoFabricacao;
    }
    public void setAnoFabricacao(LocalDate anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }
    public int getEixo() {
        return eixo;
    }
    public void setEixo(int eixo) {
        this.eixo = eixo;
    }
    public double getPesoLiquido() {
        return PesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        PesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return PesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        PesoTotal = pesoTotal;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String getRodas() {
        return rodas;
    }
    public void setRodas(String rodas) {
        this.rodas = rodas;
    }
    public double getFabricante() {
        return fabricante;
    }
    public void setFabricante(double fabricante) {
        this.fabricante = fabricante;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return TipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        TipoCombustivel = tipoCombustivel;
    }
    public String getEstadoUF() {
        return EstadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        EstadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return CidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        CidadeUF = cidadeUF;
    }
    public String getTipoVeiculo() {
        return TipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }
    public int getQtdeMotores() {
        return QtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        QtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return QtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        QtdeOcupantes = qtdeOcupantes;
    }
    
    public VeiculoS(int codigo, String nome, String modelo, String cor, String chassi, LocalDate anoModelo,
            LocalDate anoFabricacao, int eixo, double pesoLiquido, double pesoTotal, int assentos, String rodas,
            double fabricante, String potencia, String tipoCombustivel, String estadoUF, String cidadeUF,
            String tipoVeiculo, int qtdeMotores, int qtdeOcupantes) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        AnoModelo = anoModelo;
        AnoFabricacao = anoFabricacao;
        this.eixo = eixo;
        PesoLiquido = pesoLiquido;
        PesoTotal = pesoTotal;
        this.assentos = assentos;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        TipoCombustivel = tipoCombustivel;
        EstadoUF = estadoUF;
        CidadeUF = cidadeUF;
        TipoVeiculo = tipoVeiculo;
        QtdeMotores = qtdeMotores;
        QtdeOcupantes = qtdeOcupantes;
    }
    
    
}

