package br.rpinfo.challenge.user.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//Classe requisito para a finalidade do projeto, com as variáveis, getters, setters e constructors necessários,
//também representada como tabela no database.
@Entity
public class ServiceOrder implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String equipmentType;
	private String equipmentBrand;
	private String equipmentProblem;
	private LocalDateTime startDate;
	private LocalDateTime finalDate;
	private String problemConclusion;


	public ServiceOrder() {
		super();
	}

	public ServiceOrder(int id, String name, String address, String phone, String email, String equipmentType,
			String equipmentBrand, String equipmentProblem, LocalDateTime startDate, LocalDateTime finalDate,
			String problemConclusion) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.equipmentType = equipmentType;
		this.equipmentBrand = equipmentBrand;
		this.equipmentProblem = equipmentProblem;
		this.startDate = startDate;
		this.finalDate = finalDate;
		this.problemConclusion = problemConclusion;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getEquipmentBrand() {
		return equipmentBrand;
	}

	public void setEquipmentBrand(String equipmentBrand) {
		this.equipmentBrand = equipmentBrand;
	}

	public String getEquipmentProblem() {
		return equipmentProblem;
	}

	public void setEquipmentProblem(String equipmentProblem) {
		this.equipmentProblem = equipmentProblem;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(LocalDateTime finalDate) {
		this.finalDate = finalDate;
	}

	public String getProblemConclusion() {
		return problemConclusion;
	}

	public void setProblemConclusion(String problemConclusion) {
		this.problemConclusion = problemConclusion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
