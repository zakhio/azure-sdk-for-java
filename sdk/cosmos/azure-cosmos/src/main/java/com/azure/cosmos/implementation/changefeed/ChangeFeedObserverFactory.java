// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.changefeed;

/**
 * Factory class used to create instance(s) of {@link ChangeFeedObserver}.
 */
public interface ChangeFeedObserverFactory<T> {
    /**
     * Creates an instance of a {@link ChangeFeedObserver}.
     *
     * @return an instance of a {@link ChangeFeedObserver}.
     */
    ChangeFeedObserver<T> createObserver();
}
