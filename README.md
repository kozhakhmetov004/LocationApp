# This program is executed initially in Android studio, with some adjustments in build.gradle.kts (Module: APP):
# dependencies {
#    implementation("androidx.core:core-ktx:1.13.1")
#    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")
#    implementation("androidx.activity:activity-compose:1.9.1")
#    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
#    implementation("androidx.compose.ui:ui")
#    implementation("androidx.compose.ui:ui-graphics")
#    implementation("androidx.compose.ui:ui-tooling-preview")
#    implementation("androidx.compose.material3:material3")
#    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.5")
#    implementation("com.google.android.gms:play-services-location:21.3.0")
#    implementation("com.google.android.gms:play-services-maps:19.0.0")
#    testImplementation("junit:junit:4.13.2")
#    androidTestImplementation("androidx.test.ext:junit:1.2.1")
#    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
#    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
#    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
#    debugImplementation("androidx.compose.ui:ui-tooling")
#    debugImplementation("androidx.compose.ui:ui-test-manifest")
# }
# And adjustment in AndroidManifest.xml:
# <uses-permission android:name="android.permission.INTERNET"/>
# <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
# <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
# after adding these adjustments, the program should work well with virtual Devices that can be launched in Android Studio

