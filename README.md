# Ti.GoogleSignIn (Android)   
<img src="example/demo.gif" height="500" alt="Google SignIn" />   

## Summary
Ti.GoogleSignIn is an open-source project to support the Google SignIn Android-SDK in Appcelerator's Titanium Mobile.
The iOS version with API-parity is available at [@hansemannn/Ti.GoogleSignIn](https://github.com/hansemannn/titanium-google-signin).

## Requirements
  * Titanium SDK 6.0.1.GA+

## Setup
Unpack the module and place it inside the `modules/android/` folder of your project.
Edit the modules section of your `tiapp.xml` file to include this module:
```xml
<modules>
    <module platform="android">ti.googlesignin</module>
</modules>
```

## Example
Initialize the module by setting the Google SignIn API key you can get from the Google API Console.
```js
var Google = require('ti.googlesignin');
Google.initialize({
    clientID: '<client-id>',
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
    }
    */
});
Google.signIn();
```

## Obtaining a SSH with Titanium
In order to use Google Sign In in your app you will need to provide an SHA-1 certificate fingerprint for Google Console.
You will need to provide a debug and a distribution SHA-1 fingerprint for your app. On Titanium, the debug SHA-1
has to be generated from the `dev_keystore` file from your Titanium SDK android folder located at "mobilesdk/<platform>/<sdk_version>/android/dev_keystore".
On macOS for example it would rely on: "~/Library/Application\ Support/Titanium/mobilesdk/osx/6.0.2.GA/android/dev_keystore".   
And an command line example for it would be:   
```
keytool -list -v -keystore ~/Library/Application\ Support/Titanium/mobilesdk/osx/6.0.2.GA/android/dev_keystore
```   

You can follow same instructions used to configure a map in your Android app from [Appcelerator Docs](http://docs.appcelerator.com/platform/latest/#!/guide/Google_Maps_v2_for_Android-section-src-36739898_GoogleMapsv2forAndroid-ObtainandAddaGoogleAPIKey).

## Methods
- [x] `signIn`
- [x] `signOut`

## Events
- [x] `login`
- [x] `error`
- [x] `disconnect`
