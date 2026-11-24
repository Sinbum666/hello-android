# Hello Android

A minimal Android app that displays “Hello Android！” centered on a white screen.

## Build in GitHub Actions

1. Sign in to GitHub and create a **new empty repository** (for example `hello-android`). Do not initialize it with a README, license, or `.gitignore`.
2. Extract this ZIP on your computer. Open the extracted `hello-android` folder.
3. Upload the *contents* of that folder to the repository's root. Include the hidden `.github` folder and its `workflows/build-apk.yml` file. On GitHub, use **Add file → Upload files**.
4. Commit the upload to the `main` branch.
5. Open the repository's **Actions** tab. The workflow named **Build Android APK** should start automatically. If prompted, enable Actions.
6. Wait for a green check. Open the completed run and download `hello-android-debug-apk` under **Artifacts**.
7. Unzip that artifact. The APK is `app-debug.apk`. Transfer it to your Android phone and install it. You may need to allow installation from your browser or file manager.

The output is a **debug APK** for testing and sideloading, not a Play Store release-signed build.
