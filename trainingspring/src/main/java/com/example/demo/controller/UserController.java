package com.example.demo.controller;

// Controller フロントエンドとバックエンドの入出力の管理を行う

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {

	/**
	 * ユーザー情報 Servise
	 */
	@Autowired
	private UserService userService;
	
	/**
	 * ユーザー情報一覧画面を表示
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@GetMapping(value = "/user/list")
	public String displayList(Model model) {
		List<User> userlist = userService.searchAll();
		model.addAttribute("userlist", userlist);
		return "user/list";
	}
	
	/**
	 * ユーザー情報詳細画面を表示
	 * @param id 表示するユーザーID
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@GetMapping("/user/{id}")
	public String displayView(@PathVariable Long id, Model model) {
		return "user/view";
	}
	
	/*
	// @RequestMapping どのようなURLやHTTPメソッドでアクセスされたときに、どの処理を実行するかを紐付けるためのアノテーション
	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public String displayList(Model model) {
		List<User> userlist = userService.searchAll();
		model.addAttribute("userlist", userlist);
		return "user/list";
	}
	*/
}
