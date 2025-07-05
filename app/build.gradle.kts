plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.example.optimization.buildtime"
    compileSdk = 35

    flavorDimensions += "version"

    productFlavors {
        create("itest1") {
            dimension = "version"
            applicationIdSuffix = ".prod1"
            versionNameSuffix = "-prod1"
        }
        create("itest2") {
            dimension = "version"
            applicationIdSuffix = ".prod2"
            versionNameSuffix = "-prod2"
        }
        create("itest3") {
            dimension = "version"
            applicationIdSuffix = ".prod3"
            versionNameSuffix = "-prod3"
        }
        create("itest4") {
            dimension = "version"
            applicationIdSuffix = ".prod4"
            versionNameSuffix = "-prod4"
        }
        create("itest5") {
            dimension = "version"
            applicationIdSuffix = ".prod5"
            versionNameSuffix = "-prod5"
        }
        create("itest6") {
            dimension = "version"
            applicationIdSuffix = ".prod6"
            versionNameSuffix = "-prod6"
        }
        create("itest7") {
            dimension = "version"
            applicationIdSuffix = ".prod7"
            versionNameSuffix = "-prod7"
        }
        create("itest8") {
            dimension = "version"
            applicationIdSuffix = ".prod8"
            versionNameSuffix = "-prod8"
        }
        create("itest9") {
            dimension = "version"
            applicationIdSuffix = ".prod9"
            versionNameSuffix = "-prod9"
        }
        create("itest10") {
            dimension = "version"
            applicationIdSuffix = ".prod10"
            versionNameSuffix = "-prod10"
        }
        create("itest11") {
            dimension = "version"
            applicationIdSuffix = ".prod11"
            versionNameSuffix = "-prod11"
        }
        create("itest12") {
            dimension = "version"
            applicationIdSuffix = ".prod12"
            versionNameSuffix = "-prod12"
        }
        create("itest13") {
            dimension = "version"
            applicationIdSuffix = ".prod13"
            versionNameSuffix = "-prod13"
        }
        create("itest14") {
            dimension = "version"
            applicationIdSuffix = ".prod14"
            versionNameSuffix = "-prod14"
        }
        create("itest15") {
            dimension = "version"
            applicationIdSuffix = ".prod15"
            versionNameSuffix = "-prod15"
        }
        create("itest16") {
            dimension = "version"
            applicationIdSuffix = ".prod16"
            versionNameSuffix = "-prod16"
        }
        create("itest17") {
            dimension = "version"
            applicationIdSuffix = ".prod17"
            versionNameSuffix = "-prod17"
        }
        create("itest18") {
            dimension = "version"
            applicationIdSuffix = ".prod18"
            versionNameSuffix = "-prod18"
        }
        create("itest19") {
            dimension = "version"
            applicationIdSuffix = ".prod19"
            versionNameSuffix = "-prod19"
        }
        create("itest20") {
            dimension = "version"
            applicationIdSuffix = ".prod20"
            versionNameSuffix = "-prod20"
        }
        create("itest21") {
            dimension = "version"
            applicationIdSuffix = ".prod21"
            versionNameSuffix = "-prod21"
        }
        create("itest22") {
            dimension = "version"
            applicationIdSuffix = ".prod22"
            versionNameSuffix = "-prod22"
        }
        create("itest23") {
            dimension = "version"
            applicationIdSuffix = ".prod23"
            versionNameSuffix = "-prod23"
        }
        create("itest24") {
            dimension = "version"
            applicationIdSuffix = ".prod24"
            versionNameSuffix = "-prod24"
        }
        create("itest25") {
            dimension = "version"
            applicationIdSuffix = ".prod25"
            versionNameSuffix = "-prod25"
        }
        create("itest26") {
            dimension = "version"
            applicationIdSuffix = ".prod26"
            versionNameSuffix = "-prod26"
        }
        create("itest27") {
            dimension = "version"
            applicationIdSuffix = ".prod27"
            versionNameSuffix = "-prod27"
        }
        create("itest28") {
            dimension = "version"
            applicationIdSuffix = ".prod28"
            versionNameSuffix = "-prod28"
        }
        create("itest29") {
            dimension = "version"
            applicationIdSuffix = ".prod29"
            versionNameSuffix = "-prod29"
        }
        create("itest30") {
            dimension = "version"
            applicationIdSuffix = ".prod30"
            versionNameSuffix = "-prod30"
        }
        create("itest31") {
            dimension = "version"
            applicationIdSuffix = ".prod31"
            versionNameSuffix = "-prod31"
        }
        create("itest32") {
            dimension = "version"
            applicationIdSuffix = ".prod32"
            versionNameSuffix = "-prod32"
        }
        create("itest33") {
            dimension = "version"
            applicationIdSuffix = ".prod33"
            versionNameSuffix = "-prod33"
        }
        create("itest34") {
            dimension = "version"
            applicationIdSuffix = ".prod34"
            versionNameSuffix = "-prod34"
        }
        create("itest35") {
            dimension = "version"
            applicationIdSuffix = ".prod35"
            versionNameSuffix = "-prod35"
        }
        create("itest36") {
            dimension = "version"
            applicationIdSuffix = ".prod36"
            versionNameSuffix = "-prod36"
        }
        create("itest37") {
            dimension = "version"
            applicationIdSuffix = ".prod37"
            versionNameSuffix = "-prod37"
        }
        create("itest38") {
            dimension = "version"
            applicationIdSuffix = ".prod38"
            versionNameSuffix = "-prod38"
        }
        create("itest39") {
            dimension = "version"
            applicationIdSuffix = ".prod39"
            versionNameSuffix = "-prod39"
        }
        create("itest40") {
            dimension = "version"
            applicationIdSuffix = ".prod40"
            versionNameSuffix = "-prod40"
        }
        create("itest41") {
            dimension = "version"
            applicationIdSuffix = ".prod41"
            versionNameSuffix = "-prod41"
        }
        create("itest42") {
            dimension = "version"
            applicationIdSuffix = ".prod42"
            versionNameSuffix = "-prod42"
        }
        create("itest43") {
            dimension = "version"
            applicationIdSuffix = ".prod43"
            versionNameSuffix = "-prod43"
        }
        create("itest44") {
            dimension = "version"
            applicationIdSuffix = ".prod44"
            versionNameSuffix = "-prod44"
        }
        create("itest45") {
            dimension = "version"
            applicationIdSuffix = ".prod45"
            versionNameSuffix = "-prod45"
        }
        create("itest46") {
            dimension = "version"
            applicationIdSuffix = ".prod46"
            versionNameSuffix = "-prod46"
        }
        create("itest47") {
            dimension = "version"
            applicationIdSuffix = ".prod47"
            versionNameSuffix = "-prod47"
        }
        create("itest48") {
            dimension = "version"
            applicationIdSuffix = ".prod48"
            versionNameSuffix = "-prod48"
        }
        create("itest49") {
            dimension = "version"
            applicationIdSuffix = ".prod49"
            versionNameSuffix = "-prod49"
        }
        create("itest50") {
            dimension = "version"
            applicationIdSuffix = ".prod50"
            versionNameSuffix = "-prod50"
        }
    }

    defaultConfig {
        applicationId = "com.example.optimization.buildtime"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}