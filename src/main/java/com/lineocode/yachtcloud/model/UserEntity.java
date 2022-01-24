package com.lineocode.yachtcloud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Entity(name = "user")
@Introspected
@Table(name = "users")
@Data
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;
  @Column(name = "family_name")
  private String familyName;

  @Column(name = "mobile_phone")
  private String mobilePhone;

  @Column(name = "office_phone")
  private String officePhone;

  @Column(name = "home_phone")
  private String homePhone;

  private String email;
  private String password;
}
