/*
 * Copyright 2018 Manuel Wrage
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

package com.ivianuu.epoxyktx

/**
 * Global config
 */
object EpoxyKtxPlugins

private var _useAsyncBuilding = true

/**
 * Whether or not the epoxy controllers should be build async
 */
var EpoxyKtxPlugins.useAsyncBuilding: Boolean
    get() = _useAsyncBuilding
    set(value) { _useAsyncBuilding = value }

private var _useAsyncDiffing = true

/**
 * Whether or not the epoxy controllers should be diffed async
 */
var EpoxyKtxPlugins.useAsyncDiffing: Boolean
    get() = _useAsyncDiffing
    set(value) { _useAsyncDiffing = value }