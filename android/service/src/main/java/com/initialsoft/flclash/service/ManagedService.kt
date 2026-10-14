package com.initialsoft.flclash.service

import android.app.Service
import com.initialsoft.flclash.common.BroadcastAction
import com.initialsoft.flclash.common.GlobalState
import com.initialsoft.flclash.common.sendBroadcast

interface ManagedService {
    fun start()

    fun stop()
}

internal fun Service.notifyVpnStartRequested() {
    GlobalState.log("VPN start requested")
    BroadcastAction.VPN_START_REQUESTED.sendBroadcast()
}

internal fun Service.notifyVpnRevoked() {
    GlobalState.log("VPN permission revoked")
    BroadcastAction.VPN_REVOKED.sendBroadcast()
}
