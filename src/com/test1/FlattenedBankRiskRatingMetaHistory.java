package com.test1;

public class FlattenedBankRiskRatingMetaHistory {
	private String historyDate;
	private String metadataCratedDate;
	private String riskRatingMeta;
	private String origin;
	private String auditFlag;
	private boolean auditDone;
	private String auditType;
	private String actedBy;
	private String auditSource;
	private String updatedFromSource;
	private String removedFromSource;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FlattenedBankRiskRatingMetaHistory() {

	}

	public FlattenedBankRiskRatingMetaHistory(String historyDate, String metadataCratedDate, String riskRatingMeta,
			String origin, String auditFlag, boolean auditDone, String auditType, String actedBy, String auditSource,
			String updatedFromSource, String removedFromSource, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.historyDate = historyDate;
		this.metadataCratedDate = metadataCratedDate;
		this.riskRatingMeta = riskRatingMeta;
		this.origin = origin;
		this.auditFlag = auditFlag;
		this.auditDone = auditDone;
		this.auditType = auditType;
		this.actedBy = actedBy;
		this.auditSource = auditSource;
		this.updatedFromSource = updatedFromSource;
		this.removedFromSource = removedFromSource;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getHistoryDate() {
		return historyDate;
	}

	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
	}

	public String getMetadataCratedDate() {
		return metadataCratedDate;
	}

	public void setMetadataCratedDate(String metadataCratedDate) {
		this.metadataCratedDate = metadataCratedDate;
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

	public String getAuditFlag() {
		return auditFlag;
	}

	public void setAuditFlag(String auditFlag) {
		this.auditFlag = auditFlag;
	}

	public boolean isAuditDone() {
		return auditDone;
	}

	public void setAuditDone(boolean auditDone) {
		this.auditDone = auditDone;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getActedBy() {
		return actedBy;
	}

	public void setActedBy(String actedBy) {
		this.actedBy = actedBy;
	}

	public String getAuditSource() {
		return auditSource;
	}

	public void setAuditSource(String auditSource) {
		this.auditSource = auditSource;
	}

	public String getUpdatedFromSource() {
		return updatedFromSource;
	}

	public void setUpdatedFromSource(String updatedFromSource) {
		this.updatedFromSource = updatedFromSource;
	}

	public String getRemovedFromSource() {
		return removedFromSource;
	}

	public void setRemovedFromSource(String removedFromSource) {
		this.removedFromSource = removedFromSource;
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
