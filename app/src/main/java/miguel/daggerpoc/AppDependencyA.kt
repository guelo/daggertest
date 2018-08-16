package miguel.daggerpoc

import miguel.daggerpoc.featurex.XDepPublicJava
import miguel.daggerpoc.featurex.XDepPublicKt
import javax.inject.Inject

class AppDependencyA
@Inject
constructor(private val appDepB: AppDependencyB,
            private val xDepPublicJava: XDepPublicJava,
            private val xDepPublicKt: XDepPublicKt) {

    fun callAppB() = appDepB.call()

    fun callXJava() = xDepPublicJava.call()

    fun callXKt() = xDepPublicKt.call()
 }