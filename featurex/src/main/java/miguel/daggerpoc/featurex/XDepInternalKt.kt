package miguel.daggerpoc.featurex

import android.content.Context
import javax.inject.Inject

internal class XDepInternalKt
@Inject constructor(private val appContext: Context) {
    fun call() = "XDepInternalKt called with $appContext"
}
