#!/bin/bash

APPID=ti.googlesignin
VERSION=4.0.0

# cp android/assets/* iphone/

rm -rvf ~/Library/Application\ Support/Titanium/modules/android/$APPID/$VERSION/*

cd android;rm -rf build/classes;ti --platform android build --build-only --sdk 8.0.0.GA; unzip -uo  dist/$APPID-android-$VERSION.zip  -d  ~/Library/Application\ Support/Titanium/; cd ..
# cd android;rm -rf build/classes;ant; unzip -uo  dist/$APPID-android-$VERSION.zip  -d  ~/Library/Application\ Support/Titanium/; cd ..

zip -d ~/Library/Application\ Support/Titanium/modules/android/$APPID/$VERSION/compassview.jar org/appcelerator/titanium/gen/bindings.json;

# cp android/dist/$APPID-android-$VERSION.zip .
# cp iphone/$APPID-iphone-$VERSION.zip .
