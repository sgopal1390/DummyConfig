/**
 * 
 */
package com.mavenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nextalytics-10
 *
 */
@Entity
@Table(name = "test")
public class TestEntity {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "msg")
	private String msg;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
