# Ti.GoogleSignIn (Android)
   
 Summary
---------------
Ti.GoogleSignIn is an open-source project to support the Google SignIn android-SDK in Appcelerator's Titanium Mobile.

Requirements
---------------
  - Titanium Mobile SDK 6.0.1.GA or later

Download + Setup
---------------

### Setup
Unpack the module and place it inside the `modules/android/` folder of your project.
Edit the modules section of your `tiapp.xml` file to include this module:
```xml
<modules>
    <module platform="android">ti.googlesignin</module>
</modules>
```

Initialize the module by setting the Google SignIn API key you can get from the Google API Console.
```javascript
var Google = require('ti.googlesignin');
Google.initialize({
    clientId: '<client-id>',
});
```
#### Methods
- [x] `signIn`
- [x] `signOut`


#### Events
- [x] `onsuccess`
- [x] `onerror`
- [x] `onsignout`