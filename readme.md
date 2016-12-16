# これは何？

[第8回「いきいき ✕ 忘年会」](https://rd-lesson.doorkeeper.jp/events/52783)
でのLTで利用したサンプルコードです。

[Example Geb and Gradle Project](https://github.com/geb/geb-example-gradle)プロジェクトをベースにしています。

## 使い方

下記のコマンドで、それぞれのブラウザで動きます。

    ./gradlew chromeTest
    ./gradlew firefoxTest
    ./gradlew phantomJsTest

全部のブラウザで動かすには下記のコマンドを実行してください。

    ./gradlew test

Windowsユーザーの方は、 `./gradlew` を `gradlew.bat` に置き換えてください。
