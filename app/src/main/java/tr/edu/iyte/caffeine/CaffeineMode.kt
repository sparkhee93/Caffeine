package tr.edu.iyte.caffeine

enum class CaffeineMode(val label: String, val min: Int) {
    INACTIVE("Caffeine", 0),
    INFINITE_MINS("\u221E", Int.MAX_VALUE);

    fun next() = when(this) {
        INACTIVE      -> INFINITE_MINS
        INFINITE_MINS -> INACTIVE
    }
}
