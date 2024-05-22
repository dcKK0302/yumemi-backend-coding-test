package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class YumemiBackendApplication {

	public static void main(String[] args) {
        // .envファイルを読み込む
        Dotenv dotenv = Dotenv.configure().load();
        System.setProperty("DB_URL", dotenv.get("DB_URL"));
        System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

        // 環境変数（.env）が正しく読み込まれているかを確認する
        System.out.println("DB_URL: " + System.getProperty("DB_URL"));
        System.out.println("DB_USERNAME: " + System.getProperty("DB_USERNAME"));
        System.out.println("DB_PASSWORD: " + System.getProperty("DB_PASSWORD"));

        SpringApplication.run(YumemiBackendApplication.class, args);
    }

}
