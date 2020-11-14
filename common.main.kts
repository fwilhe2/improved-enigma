fun exportVariable(name: String, value: String) = java.io.File(System.getenv("GITHUB_ENV")).appendText("${name}=${value}\n")

fun withGroup(name: String, fn: () -> Unit) {
    println("::group::${name}")
    fn()
    println("::endgroup::")
}

fun getInput(name: String): String {
    return System.getenv("INPUT_${name.replace(" ", "_").toUpperCase()}")
}