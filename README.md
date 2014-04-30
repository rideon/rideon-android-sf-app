- local.properties, ant.properties and build.properties need to be created manually on local system.
- The above 3 properties files need to be created in ../properties folder.
- If you decide to choose another folder, build.xml need to be updated accordingly.

local.properties
```sh
sdk.dir=PATH_TO_android-sdk-macosx
#sdk.dir=/opt/android-sdk-macosx
```

ant.properties
```sh
source.dir=src
# points to the android source code
gen.dir=gen
# points to the android gen directory
resource.dir=res
# points to the res directory
asset.dir=assets
# points to the assets directory
external.libs.dir=lib
# points to the lib directory
native.libs.dir=lib
# points to the native libs
# points to a place where your classes are compiled and the Android packages are placed
key.store=PATH_TO_KEYSTORE #Edit this value to provide proper keystore path
key.alias=EDIT_THIS_VALUE
key.store.password=EDIT_THIS_VALUE
key.alias.password=EDIT_THIS_VALUE
```


rideon-sf-android-app.properties
```sh
target=android-17
android.library.reference.1=PATH_TO_android-sdk-macosx/extras/google/google_play_services/libproject/google-play-services_lib
android.library.reference.2=PATH_TO_android-sdk-macosx/extras/android/support/v7/appcompat
android.library.reference.3=PATH_TO_rideon-android-lib
```
