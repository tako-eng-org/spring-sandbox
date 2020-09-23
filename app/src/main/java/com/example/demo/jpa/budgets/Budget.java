package com.example.demo.jpa.budgets;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import com.example.demo.jpa.AbstractModel;

@Entity
@Getter
@Setter
public class Budget extends AbstractModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id; // 月予算id

  // @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer userId; // ユーザid

  @Column(nullable = false)
  // TODO 年月までを入力する型
  private String budgetYearMonth; // 予算年月

  @GeneratedValue(strategy = GenerationType.AUTO)
  private int budgetForMonth; // 月予算額

  // 作成日時(月予算登録日時)、更新日時はAbstractModelより作成する
}
