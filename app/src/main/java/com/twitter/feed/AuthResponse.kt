package com.twitter.feed

import com.google.gson.annotations.SerializedName

data class AuthResponse(@SerializedName("access_token")
                        val accessToken: String = "",
                        @SerializedName("token_type")
                        val tokenType: String = "")