package com.sockets.web.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Target(
    @SerialName("namespace")
    val namespace: String?,
    @SerialName("package_name")
    val packageName: String?,
    @SerialName("sha256_cert_fingerprints")
    val sha256CertFingerprints: List<String?>?
)

