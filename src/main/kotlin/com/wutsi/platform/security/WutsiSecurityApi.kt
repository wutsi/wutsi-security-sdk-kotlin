package com.wutsi.platform.security

import com.wutsi.platform.security.dto.CreateApplicationRequest
import com.wutsi.platform.security.dto.CreateApplicationResponse
import com.wutsi.platform.security.dto.CreateKeyResponse
import com.wutsi.platform.security.dto.GetApplicationResponse
import com.wutsi.platform.security.dto.GetKeyResponse
import com.wutsi.platform.security.dto.LoginRequest
import com.wutsi.platform.security.dto.LoginResponse
import com.wutsi.platform.security.dto.SearchScopeResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long

public interface WutsiSecurityApi {
  @RequestLine("GET /v1/keys/{id}")
  @Headers("Content-Type: application/json")
  public fun getKey(@Param("id") id: Long): GetKeyResponse

  @RequestLine("POST /v1/keys/{id}")
  @Headers("Content-Type: application/json")
  public fun createKey(): CreateKeyResponse

  @RequestLine("GET /v1/scopes")
  @Headers("Content-Type: application/json")
  public fun searchScopes(): SearchScopeResponse

  @RequestLine("POST /v1/applications")
  @Headers("Content-Type: application/json")
  public fun createApplication(request: CreateApplicationRequest): CreateApplicationResponse

  @RequestLine("GET /v1/applications/{id}")
  @Headers("Content-Type: application/json")
  public fun getApplication(@Param("id") id: Long): GetApplicationResponse

  @RequestLine("POST /v1/login")
  @Headers("Content-Type: application/json")
  public fun login(request: LoginRequest): LoginResponse
}
