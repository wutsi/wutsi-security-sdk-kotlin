package com.wutsi.platform.security.dto

import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String

public data class AuthenticationResponse(
  public val id: Long = 0,
  public val type: String = "",
  public val expires: OffsetDateTime = OffsetDateTime.now(),
  public val accessToken: String = ""
)
