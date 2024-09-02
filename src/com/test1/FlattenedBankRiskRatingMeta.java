package com.test1;

public class FlattenedBankRiskRatingMeta {
	private String countryCode;
	private String riskRatingMeta;
	private String origin;
	private String template;
	private boolean modelPartitionType;
	private Integer riskRatingSystem;
	private boolean flatRiskRatingType;
	private String faltRiskRatingSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FlattenedBankRiskRatingMeta() {

	}

	public FlattenedBankRiskRatingMeta(String countryCode, String riskRatingMeta, String origin, String template,
			boolean modelPartitionType, Integer riskRatingSystem, boolean flatRiskRatingType,
			String faltRiskRatingSystem, String creationDate, String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.riskRatingMeta = riskRatingMeta;
		this.origin = origin;
		this.template = template;
		this.modelPartitionType = modelPartitionType;
		this.riskRatingSystem = riskRatingSystem;
		this.flatRiskRatingType = flatRiskRatingType;
		this.faltRiskRatingSystem = faltRiskRatingSystem;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRiskRatingMeta() {
		return riskRatingMeta;
	}

	public void setRiskRatingMeta(String riskRatingMeta) {
		this.riskRatingMeta = riskRatingMeta;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public boolean isModelPartitionType() {
		return modelPartitionType;
	}

	public void setModelPartitionType(boolean modelPartitionType) {
		this.modelPartitionType = modelPartitionType;
	}

	public Integer getRiskRatingSystem() {
		return riskRatingSystem;
	}

	public void setRiskRatingSystem(Integer riskRatingSystem) {
		this.riskRatingSystem = riskRatingSystem;
	}

	public boolean isFlatRiskRatingType() {
		return flatRiskRatingType;
	}

	public void setFlatRiskRatingType(boolean flatRiskRatingType) {
		this.flatRiskRatingType = flatRiskRatingType;
	}

	public String getFaltRiskRatingSystem() {
		return faltRiskRatingSystem;
	}

	public void setFaltRiskRatingSystem(String faltRiskRatingSystem) {
		this.faltRiskRatingSystem = faltRiskRatingSystem;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}