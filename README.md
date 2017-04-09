# Ti.GoogleSignIn (Android)
   
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

## Exampe
Initialize the module by setting the Google SignIn API key you can get from the Google API Console.
```js
var Google = require('ti.googlesignin');
Google.initialize({
    clientId: '<client-id>',
});
```

## Methods
- [x] `signIn`
- [x] `signOut`

## Events
- [x] `login`
- [x] `error`
- [x] `disconnect`
