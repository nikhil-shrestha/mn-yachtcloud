package com.lineocode.yachtcloud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;

import java.util.Date;

@Entity(name = "yacht")
@Introspected
@Table(name = "yachts")
@Data
public class YachtEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  @Column(name = "listing_for_charter")
  private Boolean listingForCharter;
  @Column(name = "listing_for_sale")
  private Boolean listingForSale;
  @Column(name = "build_year")
  private String buildYear;
  @Column(name = "refit_year")
  private String refitYear;

  private Integer length;

  @Column(name = "master_cabins")
  private Integer masterCabins;
  @Column(name = "double_cabins")
  private Integer doubleCabins;
  @Column(name = "twin_cabins")
  private Integer twinCabins;
  @Column(name = "triple_cabins")
  private Integer tripleCabins;
  @Column(name = "single_cabins")
  private Integer singleCabins;
  @Column(name = "extra_bunk_bed")
  private Integer extraBunkBed;
  @Column(name = "number_of_cabins")
  private Integer numberOfCabins;
  @Column(name = "number_of_passengers")
  private Integer numberOfPassengers;

  @Column(name = "sale_price")
  private Double salePrice;
  @Column(name = "charter_price")
  private Double charterPrice;

  @Column(name = "inclusive_terms")
  private String inclusiveTerms;
  @Column(name = "additional_costs")
  private String additionalTerms;

  @Column(name = "created_at")
  private Date createdAt;
  @Column(name = "updated_at")
  private Date updatedAt;

  private String category;
  private String images;
  private String about;
  private String accommodation;
  private String entertainment;

  @Column(name = "featured_title_1")
  private String featuredTitle1;
  @Column(name = "featured_description_1")
  private String featuredDescription1;
  @Column(name = "featured_image_1")
  private String featuredImage1;

  @Column(name = "featured_title_2")
  private String featuredTitle2;
  @Column(name = "featured_description_2")
  private String featuredDescription2;
  @Column(name = "featured_image_2")
  private String featuredImage2;

  @Column(name = "featured_title_3")
  private String featuredTitle3;
  @Column(name = "featured_description_3")
  private String featuredDescription3;
  @Column(name = "featured_image_3")
  private String featuredImage3;

  @Column(name = "featured_title_4")
  private String featuredTitle4;
  @Column(name = "featured_description_4")
  private String featuredDescription4;
  @Column(name = "featured_image_4")
  private String featuredImage4;

  @Column(name = "featured_title_5")
  private String featuredTitle5;
  @Column(name = "featured_description_5")
  private String featuredDescription5;
  @Column(name = "featured_image_5")
  private String featuredImage5;

  private String video;
  @Column(name = "main_image")
  private String mainImage;
  @Column(name = "side_images")
  private String sideImages;

  @Column(name = "no_of_members")
  private String noOfMembers;

  private String slug;

  private Boolean approved;
  private Boolean confirmable;
}
