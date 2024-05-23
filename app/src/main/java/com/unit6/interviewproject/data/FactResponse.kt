package com.unit6.interviewproject.data

import com.google.gson.annotations.SerializedName

data class FactResponse(
    @SerializedName("status") val status: StatusResponse,
    @SerializedName("_id") val id: String,
    @SerializedName("user") val user: String,
    @SerializedName("text") val text: String,
    @SerializedName("__v") val version: String,
    @SerializedName("source") val source: String,
    @SerializedName("updatedAt") val updatedAt: String,
    @SerializedName("type") val type: String,
    @SerializedName("createdAt") val createdAt: String,
    @SerializedName("deleted") val deleted: Boolean,
    @SerializedName("used") val used: Boolean
) {
    data class StatusResponse(
        @SerializedName("verified") val verified: String,
        @SerializedName("sentCount") val sentCount: Int)
}
