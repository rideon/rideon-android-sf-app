ant clean release;
zipalign -f -v 4 bin/CommuteBuddyMainActivity-release.apk bin/CommuteBuddyMainActivity-release-out.apk;
adb install -r bin/CommuteBuddyMainActivity-release-out.apk;
