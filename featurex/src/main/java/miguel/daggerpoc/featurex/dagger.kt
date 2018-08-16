package miguel.daggerpoc.featurex

import dagger.Subcomponent

@Subcomponent
interface FeatureXComponent {
    fun inject(activity: FeatureActivity)
}

object Injector {
    fun init(featureXComponent: FeatureXComponent) {
        this.featureXComponent = featureXComponent
    }

    private lateinit var featureXComponent: FeatureXComponent

    fun get() = featureXComponent
}

