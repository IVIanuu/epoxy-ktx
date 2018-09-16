package com.ivianuu.epoxyktx.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.epoxy.EpoxyRecyclerView
import com.ivianuu.epoxyktx.setEpoxyControllerAndBuild

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EpoxyRecyclerView(this)

        val recyclerView = RecyclerView(this)

        val epoxyController = recyclerView.setEpoxyControllerAndBuild {

        }
    }
}
