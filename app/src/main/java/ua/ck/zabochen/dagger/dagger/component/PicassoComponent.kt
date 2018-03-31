package ua.ck.zabochen.dagger.dagger.component

import com.squareup.picasso.Picasso
import dagger.Component
import ua.ck.zabochen.dagger.dagger.module.PicassoModule
import ua.ck.zabochen.dagger.dagger.scope.PicassoScope

@PicassoScope
@Component(modules = [PicassoModule::class])
interface PicassoComponent {

    fun getPicassoSingleton(): Picasso

}