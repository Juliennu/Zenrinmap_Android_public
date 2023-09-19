# いつもNAVI API 3.0
- [Version 1.3.10](https://support.e-map.ne.jp/manuals/android-sdk/?q=node/194)
- [Manual for Development](https://support.e-map.ne.jp/manuals/android-sdk/?q=menu_develop)
- [API Reference](https://support.e-map.ne.jp/manuals/ref/Android/)

# Authentication
- `ApplicationEx.java` にクライアントID(Key)、OAuth認証（秘密鍵）の入力が必要です。
- 「いつもNAVI API 設定完了通知書」を確認し、上記のキーを入力してください。

# Environment
- Macbook
  - Chip: Apple M1 Pro
  - OS: Venture 13.4.1
- Android Studio 
  - Version: Android Studio Flamingo | 2022.2.1 Patch 2
- Android Device
  - Model: Nexus6
  - OS: Android 7.1.1
- Android Emulator
  - Model: Pixel3a
  - OS: Android 14
- Android Target Version
  - minSdk: 21
  - targetSdk: 33

# Situation
- 以下の動作環境で認証エラーが発生しMapが表示されない状態です。
- 以下のretがZDCMAP_FAILED_AUTH(3)->認証エラーになり、地図が表示されませんでした。

```java
private final String SERVER_DOMAIN = "https://test.core.its-mo.com";
private final String YOUR_CONSUMER_KEY = "書類の値";
private final String YOUR_CONSUMER_SECRET = "書類の値";
int ret = MapInitializer.initialize(getApplicationContext(),
    SERVER_DOMAIN,
    YOUR_CONSUMER_KEY,
    YOUR_CONSUMER_SECRET
);
```
- 位置情報取得のパーミッション許可は現状必要ない認識で設定しておりません。
