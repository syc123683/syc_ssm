package com.syc.ssm.domain;

import java.util.Date;

public class SysUser {
    private Integer id;

    private String name;

    private Date birthday;

    private String address;

    private Integer partId;

    
    private SysPart sysPart;
    
    
    
    public SysPart getSysPart() {
		return sysPart;
	}



	public void setSysPart(SysPart sysPart) {
		this.sysPart = sysPart;
	}



	public Integer getId() {
        return id;
    }

    
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }
}