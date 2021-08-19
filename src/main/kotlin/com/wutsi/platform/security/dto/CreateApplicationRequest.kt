package com.wutsi.platform.security.dto

import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class CreateApplicationRequest(
  public val name: String = "",
  public val title: String = "",
  public val description: String? = null,
  public val securityLevel: Int = 0,
  public val configUrl: String? = null,
  public val homeUrl: String? = null,
  public val scopeNames: List<String> = emptyList()
)
