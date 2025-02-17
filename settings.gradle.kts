import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel

rootProject.name = "otus_java"
include("hw01-gradle")
include("hw04-generics")

pluginManagement {

    val jgitver: String by settings
    val dependencyManagement: String by settings
    val springframeworkBoot: String by settings
    val johnrengelmanShadow: String by settings
    val jib: String by settings
    val protobufVer: String by settings
    val sonarlint: String by settings
    val spotless: String by settings

    plugins {
        id("fr.brouillard.oss.gradle.jgitver") version jgitver
        id("io.spring.dependency-management") version dependencyManagement
        id("org.springframework.boot") version springframeworkBoot
        id("com.github.johnrengelman.shadow") version johnrengelmanShadow
        id("com.google.cloud.tools.jib") version jib
        id("com.google.protobuf") version protobufVer
        id("name.remal.sonarlint") version sonarlint
        id("com.diffplug.spotless") version spotless

    }

}
include("hw06-annotations")
include("L08-gc")
include("L10-aop")
include("L-solid")
include("L16-io")
include("L15-structuralPatterns")
include("L18-jdbc")
include("L21-jpql")
include("L24-webServer")
include("L22-cache")
include("L25-di")
include("L31-executors")
include("L28-springDataJdbc")
include("L31-executors")
include("L33-concurrentCollections")
include("L34-multiprocess")
include("L38-webflux-chat")
include("L38-webflux-chat:client-service")
include("L38-webflux-chat:datastore-service")
