package miguel.daggerpoc

import miguel.daggerpoc.featurex.XDepPublicKt
import javax.inject.Inject

class AppDependencyB
@Inject
constructor(private val xDepPublicKt: XDepPublicKt){
    fun call() = xDepPublicKt.call()
}