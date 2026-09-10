package com.example.demo.service;

// Model 具体的な処理を記述する

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

/**
 *  ユーザー情報 Service
 */
@Service
public class UserService {

	/**
	 *  ユーザー情報 Repository
	 */
	@Autowired // 自動で取得してセットしてくれる仕組み（DI）を指定するアノテーション
	UserRepository userRepository;
	
	public List<User> searchAll() {
		// ユーザーTBLの内容を全検索
		return userRepository.findAll();
	}
}
