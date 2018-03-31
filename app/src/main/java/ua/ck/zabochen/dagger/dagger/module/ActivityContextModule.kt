package ua.ck.zabochen.dagger.dagger.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ua.ck.zabochen.dagger.dagger.qualifier.ActivityContext

@Module
class ActivityContextModule(context: Context) {

    private val mContext: Context = context

    @ActivityContext
    @Provides
    fun provideActivityContext() = mContext

}