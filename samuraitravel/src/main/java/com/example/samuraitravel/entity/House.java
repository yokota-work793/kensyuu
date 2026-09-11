package com.example.samuraitravel.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

/**
 * 民泊情報 Entity
 */
@Entity
@Table(name = "houses")
@Data
public class House {
	
	/**
	 * ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	/**
	 * 民泊名
	 */
	@Column(name = "name")
	private String name;
	
	/**
	 * 民泊画像のファイル名
	 */
	@Column(name = "image_name")
	private String imageName;
	
	/**
	 * 民泊の説明
	 */
	@Column(name = "description")
	private String description;
	
	/**
	 * 一泊あたりの宿泊料金
	 */
	@Column(name = "price")
	private Integer price;
	
	/**
	 * 定員
	 */
	@Column(name = "capacity")
	private Integer capacity;
	
	/**
	 * 郵便番号
	 */
	@Column(name = "postal_code")
	private Integer postalCode;
	
	/**
	 * 住所
	 */
	@Column(name = "address")
	private String address;
	
	/**
	 * 電話番号
	 */
	@Column(name = "phone_number")
	private String phoneNumber;
	
	/**
	 * 作成日時
	 */
	@Column(name = "created_at", insertable = false, updatable = false)
	private Timestamp createdAt;
	
	/**
	 * 更新日時
	 */
	@Column(name = "updated_at", insertable = false, updatable = false)
	private Timestamp updatedAt;

}
