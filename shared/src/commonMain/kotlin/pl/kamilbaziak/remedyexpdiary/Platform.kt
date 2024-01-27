package pl.kamilbaziak.remedyexpdiary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform