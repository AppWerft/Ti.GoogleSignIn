Ti.GoogleSignIn
===============

This is the Android version of Hans` [iOS version of To.GoogleSignIn](https://github.com/hansemannn/ti.googlesignin)	


Usage
-----

Following [this instruction](https://developers.google.com/identity/sign-in/android/start) you have to go to google api console and download the *google-services.json* and download to Resources folder or app/assets folder (Alloy). 

Add this to your manifest (tiapp.xml)
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.GET_ACCOUNTS" />
<uses-permission android:name="android.permission.USE_CREDENTIALS" />
<meta-data android:name="com.google.android.gms.version" android:value="@integer/google_play_services_version" />
```
