package com.naren.intract.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {
	@Column
	@CreationTimestamp
	private ZonedDateTime createdDateTime;
	@Column
	@UpdateTimestamp
	private ZonedDateTime updatedDateTime;
	

}
