package ua.ck.zabochen.dagger.dagger.module

import android.content.Context
import dagger.Module
import dagger.Provides
import org.jetbrains.anko.AnkoLogger
import ua.ck.zabochen.dagger.dagger.qualifier.ApplicationContext

@Module
class ApplicationContextModule(context: Context) : AnkoLogger {

    private val mContext: Context = context

    @ApplicationContext
    @Provides
    fun provideApplicationContext() = mContext.applicationContext
}