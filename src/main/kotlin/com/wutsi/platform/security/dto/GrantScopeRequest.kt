package com.wutsi.platform.security.dto

import kotlin.String
import kotlin.collections.List

public data class GrantScopeRequest(
  public val scopeNames: List<String> = emptyList()
)
