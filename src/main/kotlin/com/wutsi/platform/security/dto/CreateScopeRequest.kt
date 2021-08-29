package com.wutsi.platform.security.dto

import kotlin.Int
import kotlin.String

public data class CreateScopeRequest(
  public val name: String = "",
  public val description: String = "",
  public val securityLevel: Int = 0
)
