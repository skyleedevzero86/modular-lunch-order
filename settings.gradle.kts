plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "lunch-service"

include(
    "lunch-common",
    "lunch-core",
    "lunch-domain",
    "lunch-api",
    "lunch-batch",
    "lunch-admin",
    "lunch-security",
    "lunch-logging",
    "lunch-redis",
    "lunch-search",
    "lunch-order",
    "lunch-member",
    "lunch-menu",
    "lunch-payment",
    "lunch-delivery",
    "lunch-restaurant",
    "lunch-web",
    "lunch-infrastructure",
    "lunch-support"
)