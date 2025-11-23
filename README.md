mysql -u matsufuji -p
| コマンド                                                      | 用途                    | 補足                                           |
| --------------------------------------------------------- | --------------------- | -------------------------------------------- |
| `./gradlew bootRun`                                       | アプリを起動                | ソースをコンパイルして `Spring Boot` アプリを実行             |
| `./gradlew build`                                         | ビルド（Jar作成）            | 成果物（`.jar`ファイル）を `build/libs/` に出力           |
| `./gradlew clean`                                         | ビルド成果物の削除             | `build` フォルダを丸ごと削除（クリーンビルド前に使う）              |
| `./gradlew test`                                          | テスト実行                 | JUnit などの自動テストを実行                            |
| `./gradlew bootJar`                                       | 実行可能Jarファイル作成         | `build/libs/xxx.jar` が生成され、`java -jar`で起動できる |
| `./gradlew dependencies`                                  | 依存関係の一覧表示             | どんなライブラリが入っているか確認できる                         |
| `./gradlew tasks`                                         | 利用可能なタスク一覧を表示         | プロジェクト内で使えるGradleタスクを一覧表示                    |
| `./gradlew flywayMigrate`                                 | FlywayによるDBマイグレーション実行 | DBに `V__` ファイルが適用される（Flywayプラグイン使用時）         |
| `./gradlew bootBuildImage`                                | Dockerイメージを作成         | Spring Bootが自動でDockerビルドを行う（Buildpacks使用）    |
| `./gradlew bootRun --args='--spring.profiles.active=dev'` | 特定の環境で起動              | `application-dev.yml` などを使う場合に便利             |
| `./gradlew --stop`                                        | 実行中のGradle Daemon停止   | メモリ解放や不具合対処に使用                               |
