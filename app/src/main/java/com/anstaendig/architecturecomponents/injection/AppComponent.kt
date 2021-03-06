package com.anstaendig.architecturecomponents.injection

import android.app.Application
import com.anstaendig.architecturecomponents.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuildersModule::class,
        RepositoryModule::class,
        DatasourceModule::class,
        ViewModelModule::class
))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}
