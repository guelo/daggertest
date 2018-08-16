package miguel.daggerpoc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import miguel.daggerpoc.featurex.FeatureActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject internal lateinit var dependencyA: AppDependencyA

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Injector.get().inject(this)

        button_start.setOnClickListener {
            startActivity(Intent(this, FeatureActivity::class.java))
        }

        textView1.text = "${dependencyA.callAppB()} \n\n ${dependencyA.callXJava()} \n\n ${dependencyA.callXKt()}"

    }
}
