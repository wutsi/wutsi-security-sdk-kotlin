package com.wutsi.platform.security.dto

import kotlin.String

public data class AuthenticationRequest(
  public val type: String = "",
  public val apiKey: String? = null,
  public val phoneNumber: String = "",
  public val mfaToken: String = "",
  public val verificationCode: String = ""
)
