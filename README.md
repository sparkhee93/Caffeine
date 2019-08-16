# End of Life

## Caffeine

Caffeine is for keeping your screen on for a defined time value.

This updated Caffeine keeps you awake for infinite only.

## Steps on building APK

1. Download Android Studio
2. Then run "git clone https://github.com/sparkhee93/Caffeine.git"
3. Import the download Caffeine folder inside Android Studio
4. Wait for all the dependencies to be resolved. Some SDK might have to be downloaded, which Android Studio will take care of.
*** If Android Studio suggests updating Gradle version, DON'T UPDATE as that can potentially mess things up when building ***
5. Run Build > Build Bundle(s)/APK(s) > Build APK(s).
6. Once APK is build, find a way to send the file over to your phone (I used Dropbox since Gmail doesn't allow sending executable files, like .apk). This should be under Caffine/app/build/outputs/apk/debug/app-debug.apk.
7. Open the APK file on your phone and finish installing.
8. Caffeine should only toggle between infinity and inactive now.

### Known issues
- App crashes on some devices while switching from infinite mode to inactive.
