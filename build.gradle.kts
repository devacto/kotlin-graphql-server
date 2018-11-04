plugins {
    application
    kotlin("jvm") version "1.3.0"
}

application {
    mainClassName = "codes.victor.graphql.GraphQLServerKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}