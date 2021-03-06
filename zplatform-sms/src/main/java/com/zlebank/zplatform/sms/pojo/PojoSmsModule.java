package com.zlebank.zplatform.sms.pojo;
// default package
// Generated 2016-1-11 14:40:39 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSmsModule generated by hbm2java
 */
@Entity
@Table(name = "t_sms_module")
public class PojoSmsModule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7450262988962198634L;
	private String moduletype;
	private Integer valiytime;
	private String modulecont;

	public PojoSmsModule() {
	}

	public PojoSmsModule(String moduletype) {
		this.moduletype = moduletype;
	}

	public PojoSmsModule(String moduletype, Integer valiytime, String modulecont) {
		this.moduletype = moduletype;
		this.valiytime = valiytime;
		this.modulecont = modulecont;
	}

	@Id
	@Column(name = "MODULETYPE", unique = true, nullable = false, length = 4)
	public String getModuletype() {
		return this.moduletype;
	}

	public void setModuletype(String moduletype) {
		this.moduletype = moduletype;
	}

	@Column(name = "VALIYTIME", precision = 5, scale = 0)
	public Integer getValiytime() {
		return this.valiytime;
	}

	public void setValiytime(Integer valiytime) {
		this.valiytime = valiytime;
	}

	@Column(name = "MODULECONT", length = 128)
	public String getModulecont() {
		return this.modulecont;
	}

	public void setModulecont(String modulecont) {
		this.modulecont = modulecont;
	}

}
