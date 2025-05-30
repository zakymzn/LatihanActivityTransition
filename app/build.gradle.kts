plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.dicoding.picodiploma.myrecyclerview"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.dicoding.picodiploma.myrecyclerview"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.constraintlayout:constraintlayout:2.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0") {
        exclude(group = "com.android.support", module = "support-annotations")
    }
    implementation("androidx.appcompat:appcompat:1.4.0")
    implementation("com.google.android.material:material:1.4.0")

    testImplementation("junit:junit:4.13.2")
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("com.github.bumptech.glide:glide:4.12.0")

}