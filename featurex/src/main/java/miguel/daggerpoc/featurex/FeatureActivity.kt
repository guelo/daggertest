package miguel.daggerpoc.featurex

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.featurex_layout.*
import javax.inject.Inject

class FeatureActivity : AppCompatActivity() {

    @Inject internal lateinit var xDepPublicKt: XDepPublicKt
    @Inject internal lateinit var xDepInternalKt: XDepInternalKt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.featurex_layout)

        Injector.get().inject(this)

        tv2.text = xDepPublicKt.call()
        tv2.text = xDepInternalKt.call()
    }
}