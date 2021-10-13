package com.wutsi.platform.security

import com.wutsi.platform.security.dto.AuthenticationRequest
import com.wutsi.platform.security.dto.AuthenticationResponse
import com.wutsi.platform.security.dto.CreateApplicationRequest
import com.wutsi.platform.security.dto.CreateApplicationResponse
import com.wutsi.platform.security.dto.CreateKeyResponse
import com.wutsi.platform.security.dto.CreateScopeRequest
import com.wutsi.platform.security.dto.CreateScopeResponse
import com.wutsi.platform.security.dto.GetApplicationResponse
import com.wutsi.platform.security.dto.GetKeyResponse
import com.wutsi.platform.security.dto.GrantScopeRequest
import com.wutsi.platform.security.dto.SearchApplicationResponse
import com.wutsi.platform.security.dto.SearchScopeResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface WutsiSecurityApi {
  @RequestLine("POST /v1/keys")
  @Headers(value=["Content-Type: application/json"])
  public fun createKey(): CreateKeyResponse

  @RequestLine("GET /v1/keys/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getKey(@Param("id") id: Long): GetKeyResponse

  @RequestLine("GET /v1/scopes")
  @Headers(value=["Content-Type: application/json"])
  public fun searchScopes(): SearchScopeResponse

  @RequestLine("POST /v1/scopes")
  @Headers(value=["Content-Type: application/json"])
  public fun createScope(request: CreateScopeRequest): CreateScopeResponse

  @RequestLine("GET /v1/applications?name={name}&limit={limit}&offset={offset}")
  @Headers(value=["Content-Type: application/json"])
  public fun searchApplications(
    @Param("name") name: String? = null,
    @Param("limit") limit: Int = 20,
    @Param("offset") offset: Int = 0
  ): SearchApplicationResponse

  @RequestLine("POST /v1/applications")
  @Headers(value=["Content-Type: application/json"])
  public fun createApplication(request: CreateApplicationRequest): CreateApplicationResponse

  @RequestLine("GET /v1/applications/me")
  @Headers(value=["X-Api-Key: {X-Api-Key}","Content-Type: application/json"])
  public fun application(@Param("X-Api-Key") xApiKey: String): GetApplicationResponse

  @RequestLine("GET /v1/applications/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getApplication(@Param("id") id: Long): GetApplicationResponse

  @RequestLine("POST /v1/applications/{id}/scopes")
  @Headers(value=["Content-Type: application/json"])
  public fun grantScopes(@Param("id") id: Long, request: GrantScopeRequest): Unit

  @RequestLine("POST /v1/auth")
  @Headers(value=["Content-Type: application/json"])
  public fun authenticate(request: AuthenticationRequest): AuthenticationResponse
}
