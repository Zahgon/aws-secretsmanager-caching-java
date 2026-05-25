/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.secretsmanager.caching;

import java.util.concurrent.TimeUnit;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;

/**
 * Cache configuration options such as max cache size, ttl for cached items, etc.
 */
public class SecretCacheConfiguration {

    /**
     * The default cache size.
     */
    public static final int DEFAULT_MAX_CACHE_SIZE = 1024;

    /**
     * The default TTL for an item stored in cache before access causing a refresh.
     */
    public static final long DEFAULT_CACHE_ITEM_TTL = TimeUnit.HOURS.toMillis(1);

    /**
     * The default version stage to use when retrieving secret values.
     */
    public static final String DEFAULT_VERSION_STAGE = "AWSCURRENT";

    /**
     * The default maximum jitter value in milliseconds to use when forcing a refresh.
     * This prevents continuous refreshNow() calls by adding a random sleep.
     */
    public static final long DEFAULT_FORCE_REFRESH_JITTER = 100;

    /**
     * The client this cache instance will use for accessing AWS Secrets Manager.
     */
    private SecretsManagerClient client = null;

    /**
     * Used to hook in-memory cache updates.
     */
    private SecretCacheHook cacheHook = null;

    /**
     * The maximum number of cached secrets to maintain before evicting secrets that
     * have not been accessed recently.
     */
    private int maxCacheSize = DEFAULT_MAX_CACHE_SIZE;

    /**
     * The number of milliseconds that a cached item is considered valid before
     * requiring a refresh of the secret state.  Items that have exceeded this
     * TTL will be refreshed synchronously when requesting the secret value.  If
     * the synchronous refresh failed, the stale secret will be returned.
     */
    private long cacheItemTTL = DEFAULT_CACHE_ITEM_TTL;

    /**
     * The version stage that will be used when requesting the secret values for
     * this cache.
     */
    private String versionStage = DEFAULT_VERSION_STAGE;

    /**
     * When forcing a refresh using the refreshNow method, a random sleep
     * will be performed using this value.  This helps prevent code from
     * executing a refreshNow in a continuous loop without waiting.
     */
    private long forceRefreshJitterMillis = DEFAULT_FORCE_REFRESH_JITTER;

    /**
     * Whether to enable Post-Quantum TLS.
     */
    private boolean postQuantumTlsEnabled = false;

    /**
     * Default constructor for the SecretCacheConfiguration object.
     */
    public SecretCacheConfiguration() {
    }

    /**
     * Returns the AWS Secrets Manager client that is used for requesting secret values.
     *
     * @return The AWS Secrets Manager client.
     */
    @SuppressFBWarnings(value = "EI_EXPOSE_REP")
    public SecretsManagerClient getClient() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the AWS Secrets Manager client that should be used by the cache for requesting
     * secrets.
     *
     * @param client
     *            The AWS Secrets Manager client.
     */
    @SuppressFBWarnings(value = "EI_EXPOSE_REP2")
    public void setClient(SecretsManagerClient client) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the AWS Secrets Manager client that should be used by the cache for requesting
     * secrets.
     *
     * @param client
     *            The AWS Secrets Manager client.
     * @return The updated ClientConfiguration object with the new client setting.
     */
    public SecretCacheConfiguration withClient(SecretsManagerClient client) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the interface used to hook in-memory cache updates.
     *
     * @return The object used to hook in-memory cache updates.
     */
    @SuppressFBWarnings(value = "EI_EXPOSE_REP")
    public SecretCacheHook getCacheHook() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the interface used to hook the in-memory cache.
     *
     * @param cacheHook
     *            The interface used to hook the in-memory cache.
     */
    @SuppressFBWarnings(value = "EI_EXPOSE_REP2")
    public void setCacheHook(SecretCacheHook cacheHook) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the interface used to hook the in-memory cache.
     *
     * @param cacheHook
     *            The interface used to hook in-memory cache.
     * @return The updated ClientConfiguration object with the new setting.
     */
    public SecretCacheConfiguration withCacheHook(SecretCacheHook cacheHook) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the max cache size that should be used for creating the cache.
     *
     * @return The max cache size.
     */
    public int getMaxCacheSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the max cache size.
     *
     * @param maxCacheSize
     *            The max cache size.
     */
    public void setMaxCacheSize(int maxCacheSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the max cache size.
     *
     * @param maxCacheSize
     *            The max cache size.
     * @return The updated ClientConfiguration object with the new max setting.
     */
    public SecretCacheConfiguration withMaxCacheSize(int maxCacheSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the TTL for the cached items.
     *
     * @return The TTL in milliseconds before refreshing cached items.
     */
    public long getCacheItemTTL() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the TTL in milliseconds for the cached items.  Once cached items exceed this
     * TTL, the item will be refreshed using the AWS Secrets Manager client.
     *
     * @param cacheItemTTL
     *            The TTL for cached items before requiring a refresh.
     */
    public void setCacheItemTTL(long cacheItemTTL) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the TTL in milliseconds for the cached items.  Once cached items exceed this
     * TTL, the item will be refreshed using the AWS Secrets Manager client.
     *
     * @param cacheItemTTL
     *            The TTL for cached items before requiring a refresh.
     * @return The updated ClientConfiguration object with the new TTL setting.
     */
    public SecretCacheConfiguration withCacheItemTTL(long cacheItemTTL) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the version stage that is used for requesting secret values.
     *
     * @return The version stage used in requesting secret values.
     */
    public String getVersionStage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the version stage that should be used for requesting secret values
     * from AWS Secrets Manager
     *
     * @param versionStage
     *            The version stage used for requesting secret values.
     */
    public void setVersionStage(String versionStage) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the version stage that should be used for requesting secret values
     * from AWS Secrets Manager
     *
     * @param versionStage
     *            The version stage used for requesting secret values.
     * @return The updated ClientConfiguration object with the new version stage setting.
     */
    public SecretCacheConfiguration withVersionStage(String versionStage) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the refresh jitter that is used when force refreshing secrets.
     *
     * @return The maximum jitter sleep time in milliseconds used with refreshing secrets.
     */
    public long getForceRefreshJitterMillis() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the maximum sleep time in milliseconds between force refresh calls.
     * This value is used to prevent continuous refreshNow() calls in tight loops
     * by adding a random sleep between half the configured value and the full value.
     * The value must be greater than or equal to zero.
     *
     * @param forceRefreshJitterMillis
     *            The maximum sleep time in milliseconds between force refresh calls.
     * @throws IllegalArgumentException if the value is negative
     */
    public void setForceRefreshJitterMillis(long forceRefreshJitterMillis) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the maximum sleep time in milliseconds between force refresh calls.
     * This value is used to prevent continuous refreshNow() calls in tight loops
     * by adding a random sleep between half the configured value and the full value.
     *
     * @param forceRefreshJitterMillis
     *            The maximum sleep time in milliseconds between force refresh calls.
     * @return The updated ClientConfiguration object with the new refresh sleep time.
     * @throws IllegalArgumentException if the value is negative
     */
    public SecretCacheConfiguration withForceRefreshJitterMillis(long forceRefreshJitterMillis) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns whether Post-Quantum TLS is enabled.
     *
     * @return true if Post-Quantum TLS is enabled, false otherwise.
     */
    public boolean isPostQuantumTlsEnabled() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets whether to enable Post-Quantum TLS.
     *
     * <p>Note: This setting is mutually exclusive with providing a custom client via
     * {@link #withClient(SecretsManagerClient)}. If both are specified, an
     * {@link IllegalArgumentException} will be thrown.
     *
     * @param postQuantumTlsEnabled
     *            Whether to enable Post-Quantum TLS.
     */
    public void setPostQuantumTlsEnabled(boolean postQuantumTlsEnabled) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets whether to enable Post-Quantum TLS.
     *
     * <p>Note: This setting is mutually exclusive with providing a custom client via
     * {@link #withClient(SecretsManagerClient)}. If both are specified, an
     * {@link IllegalArgumentException} will be thrown.
     *
     * @param postQuantumTlsEnabled
     *            Whether to enable Post-Quantum TLS.
     * @return The updated SecretCacheConfiguration object with the new PQTLS setting.
     */
    public SecretCacheConfiguration withPostQuantumTlsEnabled(boolean postQuantumTlsEnabled) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
