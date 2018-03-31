package ua.ck.zabochen.dagger.dagger.module

import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import ua.ck.zabochen.dagger.dagger.scope.PicassoScope

@Module
class PicassoModule : AnkoLogger {

    @PicassoScope
    @Provides
    fun providePicasso(): Picasso {
        info { "DAGGER => providePicasso()" }
        return Picasso.get()
    }

}