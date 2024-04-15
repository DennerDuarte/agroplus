package br.com.fiap.agroplus.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_INFOS_REGIAO")
public class InfoRegiao {

	@Id
	@Column(name="ID_INFOS_REGIAO")
	private Long id;
	
	@Column(name="NR_TEMPERATURA")
	private Double temperatura;
	
	@Column(name="NR_UMIDADE")
	private Double umidade;
	
	@Column(name="NR_PRECIPITACAO")
	private Double precipitacao;
	
	@Column(name="DT_INFO")
	private LocalDate dataInfo;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	
	public Double getUmidade() {
		return umidade;
	}
	
	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}
	
	public Double getPrecipitacao() {
		return precipitacao;
	}
	
	public void setPrecipitacao(Double precipitacao) {
		this.precipitacao = precipitacao;
	}
	
	public LocalDate getDataInfo() {
		return dataInfo;
	}
	
	public void setDataInfo(LocalDate dataInfo) {
		this.dataInfo = dataInfo;
	}
}
