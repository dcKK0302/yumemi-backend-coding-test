### 環境変数の設定

`.env` を作成してください。

```bash
# .env
DB_URL=jdbc:mariadb://localhost:3306/(データベース名を入力してください)
DB_USERNAME=(ユーザー名を入力してください)
DB_PASSWORD=(パスワードを入力してください)
```

### 起動方法

1. XAMMP
	* MySQLのActions列にある Start ボタンを押してください
2. Spring Boot
	* com.example.demo.YumemiBackendApplication のファイルを開き、実行(Ctrl + F11)してください
