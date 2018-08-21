package miguel.daggerpoc.featurex

import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Subcomponent(modules = [XModule::class])
interface FeatureXComponent {
    fun inject(activity: FeatureActivity)
}

@Module
class XModule {
    @Provides fun xPublicJava(xDepPkgPrivateJava: XDepPkgPrivateJava) = XDepPublicJava(xDepPkgPrivateJava)
}

object Injector {
    fun init(featureXComponent: FeatureXComponent) {
        this.featureXComponent = featureXComponent
    }

    private lateinit var featureXComponent: FeatureXComponent

    fun get() = featureXComponent
}

