# Ti.GoogleSignIn (Android)   
<img src="example/demo.gif" height="500" alt="Google SignIn" />   

## Summary
Ti.GoogleSignIn is an open-source project to support the Google SignIn Android-SDK in Appcelerator's Titanium Mobile.
The iOS version with API-parity is available at [@hansemannn/Ti.GoogleSignIn](https://github.com/hansemannn/titanium-google-signin).

## Requirements
  * Titanium SDK 6.0.1.GA+


## Permissions in manifest
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.GET_ACCOUNTS" />
<uses-permission android:name="android.permission.USE_CREDENTIALS" />
```

## Setup
Unpack the module and place it inside the `modules/android/` folder of your project.
Edit the `modules` tag of your `tiapp.xml` file & add these below two lines (add `ti.playservices` if not already added):
```xml
<modules>
    <module platform="android">ti.googlesignin</module>
    <module platform="android">ti.playservices</module>
</modules>
```

##### If you are using other Ti modules like ti.cloudpush, ti.map, or firebase.core, then ***ti.playservices*** will support them all to avoid duplicate JAR conflicts errors.

`#### PLEASE NOTE!`
**You will need to use the Web ClientID from Google instead of a Android one.**

   
## Obtaining a SHA-1 with Titanium
In order to use Google Sign In in your app you will need to provide an SHA-1 certificate fingerprint for Google Console.
You will need to provide a debug and a distribution SHA-1 fingerprint for your app. On Titanium, the debug SHA-1
has to be generated from the `dev_keystore` file from your Titanium SDK android folder located at "mobilesdk/<platform>/<sdk_version>/android/dev_keystore".
On macOS for example it would rely on: "~/Library/Application\ Support/Titanium/mobilesdk/osx/6.0.2.GA/android/dev_keystore".   
And an command line example for it would be:   
```
keytool -list -v -keystore ~/Library/Application\ Support/Titanium/mobilesdk/osx/6.0.2.GA/android/dev_keystore
```   

You can follow same instructions used to configure a map in your Android app from [Appcelerator Docs](http://docs.appcelerator.com/platform/latest/#!/guide/Google_Maps_v2_for_Android-section-src-36739898_GoogleMapsv2forAndroid-ObtainandAddaGoogleAPIKey).   

This repo also [includes a video](https://github.com/AppWerft/Ti.GoogleSignIn/blob/master/example/How%20to%20create%20Android%20keys.mov) on how to create an Android app on Firebase and Google Developers Console to better explain the process.   
As Appcelerator's documentation recommends, when submitting your app to Google Play Store you will need to create a production .keystore file, so don't forget to create another SHA-1 for this key and remember to add it also as another "fingerprint" on Firebase.   
Note that some users have reported problems when submitting new apps to the Play Store, where the Google Login stop working on production. A solution found was to get another SHA-1 fingerprint from the Google Play app's dashboard and add this fingerprint to Firebase.
These fingerprints could be found on your Google Play Console, under the "Release Management" menu on the left and then on "App signing".
Here is an example on how it looks like:   
<img src="example/play_store_sha1.png" width="483" alt="Google Play Console" />   

#### Hint:

If you receive an error `12500` you might need to set the `support email` in your project on firebase (settings - general - support email)

## Example
Initialize the module by setting the Google SignIn API key you can get from the Google API Console.   
Note that you will need to use the Web ClientID from Google instead of a Android one.   

```js
var Google = require('ti.googlesignin');
Google.initialize({
    clientID: '<client-id>', //  Web application client ID, not androidID !!!!
    onLogin : function(res) {
        console.log(result);
    }
});

Google.addEventListener('connect', function(e) {});

Google.addEventListener('login', function(e) {
    console.log(' ***** DEBUG: ' + JSON.stringify(e));
    //ANDROID RESPONSE:
    /*
    {
       "familyName": "Family",
       "givenName": "Person",
       "fullName": "Person Name",
       "accountName": "user@domain.com",
       "token": "abc",
       "email": "user@domain.com",
       "displayName": "User Name",
       "photo": "https://lh5.googleusercontent.com/-F58Ul6-zinE/AAAAAAAAAAI/AAAAAAAAAAAA/123456789/abc-d/photo.jpg",
       // to get large-sized photos, append this '?sz=500' in 'photo' value to get 500x500 picture like this:
       // "https://lh5.googleusercontent.com/-F58Ul6-zinE/AAAAAAAAAAI/AAAAAAAAAAAA/123456789/abc-d/photo.jpg?sz=350"
    }
    */
});
Google.signIn();
```

## Methods
- [x] `signIn`
- [x] `signOut`

## Events
- [x] `login`
- [x] `error`
- [x] `connect`
- [x] `disconnect`

## Constants

- [x] SIGN_IN_REQUIRED
- [x] SUCCESS
- [x] SUCCESS_CACHE
- [x] TIMEOUT
