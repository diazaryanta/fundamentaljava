plugins {
    id("java")
    id("application")
}


group = "org.example"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}


tasks.test {
    useJUnitPlatform()
}


tasks.named<JavaExec>("run") {
    mainClass.set("org.example.TestKalkulator")
}


tasks.register<JavaExec>("operasiMatematika") {
    group = "test custom"
    description = "Run OperasiMatematika - Test operasi aritmatika dengan tipe data Integer"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.OperasiMatematika")
}




tasks.register<JavaExec>("runBelajar") {
    group = "application"
    description = "Run BelajarFundamental"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("org.example.Fundamental")
}