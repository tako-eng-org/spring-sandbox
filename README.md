# Spring Sandbox

## Required

- Docker 18.09 or later
- Docker Compose
- Visual Studio Code
  - Remote - Container (Extension)

## Getting Started

```sh
# Open in Visual Studio Code Dev Container
cd app
./gradlew build
./gradlew bootRun

# open in browser
http://localhost:8080

# phpMyAdmin
http://localhost:8081
```

## Debugging

- Press `F5` key
- Set Break Point to source code
- Open in browser `http://localhost:8080`

---

## 環境構築メモ

[SpringとMySQLの接続](https://spring.pleiades.io/guides/gs/accessing-data-mysql/)

## MySQLの操作

```sh
# VSCodeからだとappコンテナの中なので、別のコンソールを立ち上げて実行
$ docker-compose exec mysql bash
$ mysql -u root -p
Enter password: ここで password と入力

# データベースの選択
mysql> use spring

# テーブル一覧
mysql> show tables;

# テーブル構造の確認
mysql> desc users;

# select
mysql> select * from users;
```
