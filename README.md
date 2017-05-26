# Nuni
App para aprender Kotlin


## Algunas cosas que vamos desubriendo:
### Anko
https://github.com/Kotlin/anko

#### Para usarlo:
Gradle-based project

Anko has a meta-dependency which plugs in all available features (including Commons, Layouts, SQLite) into your project at once:

dependencies {
    compile "org.jetbrains.anko:anko:$anko_version"
}

If you only need some of the features, you can reference any of Anko's parts:
dependencies {
    // Anko Commons
    compile "org.jetbrains.anko:anko-commons:$anko_version"

    // Anko Layouts
    compile "org.jetbrains.anko:anko-sdk25:$anko_version" // sdk15, sdk19, sdk21, sdk23 are also available
    compile "org.jetbrains.anko:anko-appcompat-v7:$anko_version"

    // Coroutine listeners for Anko Layouts
    compile "org.jetbrains.anko:anko-sdk25-coroutines:$anko_version"
    compile "org.jetbrains.anko:anko-appcompat-v7-couroutines:$anko_version"

    // Anko SQLite
    compile "org.jetbrains.anko:anko-sqlite:$anko_version"
}
