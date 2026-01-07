package io.rebble.libpebblecommon.connection

import io.rebble.libpebblecommon.services.appmessage.AppMessageDictionary
import io.rebble.libpebblecommon.services.appmessage.AppMessageResult
import kotlin.uuid.Uuid

interface AppSender {
    suspend fun sendMessage(pebbleDictionary: AppMessageDictionary): AppMessageResult
    fun isAllowedToCommunicate(pkg: String): Boolean
    val uuid: Uuid
}