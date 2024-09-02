package com.test1;

public class FlattenedBankRiskRating {
	private String countryCode;
	private String riskRatingMeta;
	private String origin;
	private String flatRiskRatingControl;
	private String premiumPayment;
	private boolean automaticSource;
	private String originIndicator;
	private String manualSource;
	private String manualSourceIndicator;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FlattenedBankRiskRating() {

	}

	public FlattenedBankRiskRating(String countryCode, String riskRatingMeta, String origin,
			String flatRiskRatingControl, String premiumPayment, boolean automaticSource, String originIndicator,
			String manualSource, String manualSourceIndicator, String creationCr, String modifiedCr,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.riskRatingMeta = riskRatingMeta;
		this.origin = origin;
		this.flatRiskRatingControl = flatRiskRatingControl;
		this.premiumPayment = premiumPayment;
		this.automaticSource = automaticSource;
		this.originIndicator = originIndicator;
		this.manualSource = manualSource;
		this.manualSourceIndicator = manualSourceIndicator;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
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

	public String getFlatRiskRatingControl() {
		return flatRiskRatingControl;
	}

	public void setFlatRiskRatingControl(String flatRiskRatingControl) {
		this.flatRiskRatingControl = flatRiskRatingControl;
	}

	public String getPremiumPayment() {
		return premiumPayment;
	}

	public void setPremiumPayment(String premiumPayment) {
		this.premiumPayment = premiumPayment;
	}

	public boolean isAutomaticSource() {
		return automaticSource;
	}

	public void setAutomaticSource(boolean automaticSource) {
		this.automaticSource = automaticSource;
	}

	public String getOriginIndicator() {
		return originIndicator;
	}

	public void setOriginIndicator(String originIndicator) {
		this.originIndicator = originIndicator;
	}

	public String getManualSource() {
		return manualSource;
	}

	public void setManualSource(String manualSource) {
		this.manualSource = manualSource;
	}

	public String getManualSourceIndicator() {
		return manualSourceIndicator;
	}

	public void setManualSourceIndicator(String manualSourceIndicator) {
		this.manualSourceIndicator = manualSourceIndicator;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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
