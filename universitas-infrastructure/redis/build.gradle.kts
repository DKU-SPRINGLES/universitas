import org.springframework.boot.gradle.tasks.bundling.BootJar

val jar: Jar by tasks
val bootJar: BootJar by tasks

jar.enabled = true
bootJar.enabled = false

dependencies {
    implementation(project(":universitas-common"))
    implementation(project(":universitas-domain"))
    implementation(project(":universitas-usecase"))
}
