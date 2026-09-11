package com.example.samuraitravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;

// JpaRepository<エンティティのクラス型,主キーのデータ型>
public interface HouseRepository extends JpaRepository<House, Integer> {
	
}
