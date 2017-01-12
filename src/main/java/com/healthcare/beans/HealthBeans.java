package com.healthcare.beans;

public class HealthBeans {
	private String language;
	private int segment_id;
	private int contract_id;
	private int plan_id; 
	private int contract_year;
	private String tier_label;
	private String tier_type_desc;
	
	public HealthBeans()
	{ }
	public HealthBeans(String language, int segment_id, int contract_id, int plan_id,int contract_year,String tier_label,String tier_type_desc)
	{
		super();
		this.language=language;
		this.segment_id=segment_id;
		this.contract_id=contract_id;
		this.plan_id=plan_id;
		this.contract_year=contract_year;
		this.tier_label=tier_label;
		this.tier_type_desc=tier_type_desc;
		
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getSegment_id() {
		return segment_id;
	}
	public void setSegment_id(int segment_id) {
		this.segment_id = segment_id;
	}
	public int getContract_id() {
		return contract_id;
	}
	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public int getContract_year() {
		return contract_year;
	}
	public void setContract_year(int contract_year) {
		this.contract_year = contract_year;
	}
	public String getTier_label() {
		return tier_label;
	}
	public void setTier_label(String tier_label) {
		this.tier_label = tier_label;
	}
	public String getTier_type_desc() {
		return tier_type_desc;
	}
	public void setTier_type_desc(String tier_type_desc) {
		this.tier_type_desc = tier_type_desc;
	}
}

