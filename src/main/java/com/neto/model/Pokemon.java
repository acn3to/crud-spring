package com.neto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Pokemon {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 20, nullable = false)
  private String name;
  
  @Column(length = 20, nullable = false)
  private String type1;

  @Column(length = 20, nullable = false)
  private String type2;

  @Column(length = 4, nullable = false)
  private Long healthPoint;

  @Column(length = 4, nullable = false)
  private Long attack;

  @Column(length = 4, nullable = false)
  private Long speed;
}
