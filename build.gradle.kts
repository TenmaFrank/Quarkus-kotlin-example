import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    id("io.quarkus")
    kotlin("jvm") version "1.7.20"
}

repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-spring-web")
    implementation("io.quarkus:quarkus-resteasy-jackson")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-kubernetes")
    implementation("io.quarkus:quarkus-container-image-docker:2.13.3.Final")
    implementation("commons-beanutils:commons-beanutils:1.9.4")
    implementation("commons-codec:commons-codec:1.15")
    implementation("io.quarkus:quarkus-smallrye-openapi")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("io.quarkus:quarkus-config-yaml:2.13.3.Final")
    implementation("io.quarkus:quarkus-rest-client:2.13.3.Final")
    implementation("io.quarkus:quarkus-rest-client-jackson:2.13.3.Final")
    implementation(files("C:/Users/fj23p/.m2/repository/com/elektra/RemesasUtils/1.0.0/RemesasUtils-1.0.0.jar"))
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")
    implementation(kotlin("stdlib-jdk8"))
}

group = "com.baz.naive.bayes"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}