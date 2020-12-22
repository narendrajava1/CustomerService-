package com.naren.intract.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "customer")
@EqualsAndHashCode(callSuper = true)

public class CustomerEntity extends BaseEntity{
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long customerId;
	@Column
	private String customerName;
//	private DemographicEntity demographic;
//	private OrderEntity 

}
