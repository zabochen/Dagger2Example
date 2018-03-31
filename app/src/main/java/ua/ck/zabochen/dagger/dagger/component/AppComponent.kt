package ua.ck.zabochen.dagger.dagger.component

import android.content.Context
import com.squareup.picasso.Picasso
import dagger.Component
import ua.ck.zabochen.dagger.dagger.module.ApplicationContextModule
import ua.ck.zabochen.dagger.dagger.module.PicassoAppModule

@Component(modules = [ApplicationContextModule::class, PicassoAppModule::class])
interface AppComponent {

    fun getApplicationContext(): Context
    fun getPicassoApp(): Picasso

}