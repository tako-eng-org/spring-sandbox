package com.example.demo.controller;

import java.util.List;

import com.example.demo.jpa.categories.Category;
import com.example.demo.jpa.categories.CategoryRepository;
import com.example.demo.jpa.users.User;
import com.example.demo.jpa.users.UserRepository;
import com.example.demo.jpa.expenses.Expense;
import com.example.demo.jpa.expenses.ExpenseRepository;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.sql.Timestamp;

@Controller
public class HomeController {
  @Autowired
  UserRepository userRepository;
  CategoryRepository categoryRepository;

  // // 一覧表示処理
  // @GetMapping(value = "/") // URIを指定する
  // public String index(Model model, User user) {
  // List<User> users = userRepository.findAll();
  // model.addAttribute("users", users);
  // return "index";
  // }

  /**
   * 
   * 
   * @param model
   * @param category
   * @return 数値が偶数ならtrue
   */
  // 一覧表示処理
  @GetMapping(value = "/") // URIを指定する
  public String index(final Model model, final Category category) {
    // viewと共有する変数の定義
    model.addAttribute("category", new Category());
    // ページのentityを取得する
    // https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/PagingAndSortingRepository.html?is-external=true#findAll-org.springframework.data.domain.Pageable-
    // final List<Category> list = CategoryRepository.findAll();
    // model.addAttribute("allRecords", list);
    return "list"; // viewのファイル名を拡張子なしで記述する
  }

  // 登録処理
  @PostMapping(value = "/register")
  public String register(@ModelAttribute final Expense expense, final Model model) {
    expense.setCreatedDate(new Timestamp(System.currentTimeMillis()));
    expense.setLastModifiedDate(new Timestamp(System.currentTimeMillis()));
    // ExpenseRepository.save(expense);
    // return index(model, todo);
    // index -> register -> index
    // index -> submit -> register -> ブラウザにredirect指示(indexへ) -> index表示
    return "redirect:/";
  }

  // 削除処理
  @PostMapping(value = "/remove")
  public String remove(final int id[], final Model model) { // ここの"id"は/のname="id"
    for (final int removeId : id) {
      // todoRepository.deleteById(removeId);
      System.out.println("test");
      ;
    }
    return "redirect:/";
  }

}
