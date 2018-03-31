package ua.ck.zabochen.dagger.view.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import ua.ck.zabochen.dagger.R
import ua.ck.zabochen.dagger.dagger.component.AppComponent
import ua.ck.zabochen.dagger.dagger.component.DaggerAppComponent
import ua.ck.zabochen.dagger.dagger.component.DaggerPicassoComponent
import ua.ck.zabochen.dagger.dagger.component.PicassoComponent
import ua.ck.zabochen.dagger.dagger.module.ApplicationContextModule

class MainActivity : AppCompatActivity() {

    private val image: ImageView by lazy { findViewById<ImageView>(R.id.activityMain_imageView) }
    private lateinit var appComponent: AppComponent
    private lateinit var picassoComponent: PicassoComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectionAppComponent()
        setUi()
    }

    private fun injectionAppComponent() {
        appComponent = DaggerAppComponent.builder()
                .applicationContextModule(ApplicationContextModule(this))
                .build()
    }

    private fun injectionPicassoComponent() {
        picassoComponent = DaggerPicassoComponent.builder().build()
    }

    private fun setUi() {
        // Layout
        setContentView(R.layout.activity_main)

        val picasso = appComponent.getPicassoApp()
        picasso.load("https://www.gettyimages.ca/gi-resources/images/Homepage/Hero/UK/CMS_Creative_164657191_Kingfisher.jpg")
                .into(image)

    }

}
