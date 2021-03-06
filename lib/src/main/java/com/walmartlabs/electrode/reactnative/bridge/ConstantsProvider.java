/*
 * Copyright 2017 WalmartLabs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.walmartlabs.electrode.reactnative.bridge;

import androidx.annotation.Nullable;

import java.util.Map;

public interface ConstantsProvider {
    /**
     * Returns the constant values exposed to JavaScript.
     * <p>
     * Its implementation is not required but is very useful to key pre-defined values that need to be communicated from JavaScript to Java in sync
     *
     * @return Map
     */
    @Nullable
    Map<String, Object> getConstants();
}
