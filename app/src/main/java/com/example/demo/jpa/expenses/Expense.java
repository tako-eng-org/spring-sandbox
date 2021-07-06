package com.example.demo.jpa.expenses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import com.example.demo.jpa.AbstractModel;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Expense extends AbstractModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id; // 支出明細id

  // @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer userId; // ユーザid

  // @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer categoryId; // 支出カテゴリid

  @Column(nullable = false)
  // TODO 型違う気がする。見直す
  private Timestamp expenseDate;

  private Integer expenseMemo; // 支出明細メモ

  @Column(nullable = false)
  private int expenseInt; // 支出明細額

  // 支出登録日付、更新日時はAbstractModelより作成する
}
