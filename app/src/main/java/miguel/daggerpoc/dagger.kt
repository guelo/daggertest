package miguel.daggerpoc

import android.annotation.SuppressLint
import android.content.Context
import dagger.Component
import dagger.Module
import dagger.Provides
import miguel.daggerpoc.featurex.FeatureXComponent
import miguel.daggerpoc.featurex.Injector
import javax.inject.Singleton

@SuppressLint("StaticFieldLeak")
object Injector {
    private lateinit var appContext: Context
    private lateinit var appComponent: AppComponent

    fun get() = appComponent

    fun init(appContext: Context) {
        this.appContext = appContext

        initAppComponent()
        initFeatureXComponent()
    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(appContext))
                .build()
    }

    private fun initFeatureXComponent() {
        Injector.init(appComponent.featureXComponent())
    }

}

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)

    fun featureXComponent(): FeatureXComponent
}

@Module
class AppModule(private val appContext: Context) {
    @Provides
    fun appContext(): Context = appContext
}
