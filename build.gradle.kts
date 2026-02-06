plugins {
    `maven-publish`
}

group = "com.github.codehospital"
version = "1.0.11"

// Disable publishing for root project
publishing {
    publications.clear()
}
