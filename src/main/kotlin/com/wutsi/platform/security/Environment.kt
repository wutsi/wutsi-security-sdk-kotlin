package com.wutsi.platform.security

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-security-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-security-server-prod.herokuapp.com"),
  ;
}
