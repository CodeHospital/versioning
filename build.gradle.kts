plugins {
    `maven-publish`
}

group = "com.codehospital"
version = "1.0.8"

// Disable publishing for root project
publishing {
    publications.clear()
}
