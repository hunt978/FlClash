package com.initialsoft.flclash

import android.app.Application
import android.content.Context
import com.initialsoft.flclash.common.GlobalState

class FlClashApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        GlobalState.init(this)
    }
}
