package miguel.daggerpoc.featurex

import javax.inject.Inject

class XDepPublicKt
@Inject
internal constructor(private val xDepInternalKt: XDepInternalKt) {

    fun call() = "XDepPublicKt called " + xDepInternalKt.call()

}