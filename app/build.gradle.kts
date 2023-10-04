plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
val koinVersion = "3.5.0"

android {
    namespace = "io.github.septianrin.coinsync"
    compileSdk = 33

    defaultConfig {
        applicationId = "io.github.septianrin.coinsync"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.github.AnyChart:AnyChart-Android:1.1.5")
    implementation("io.insert-koin:koin-android:$koinVersion")
    implementation("io.insert-koin:koin-androidx-scope:$koinVersion")
    implementation("io.insert-koin:koin-androidx-viewmodel:$koinVersion")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.jakewharton.timber:timber:5.0.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation("io.reactivex.rxjava3:rxandroid:3.0.2")
    implementation("io.reactivex.rxjava3:rxjava:3.1.5")
    testImplementation("org.mockito:mockito-core:3.+")
    testImplementation("org.robolectric:robolectric:4.9")
}