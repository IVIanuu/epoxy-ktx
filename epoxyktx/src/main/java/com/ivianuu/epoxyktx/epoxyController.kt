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

import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.Typed2EpoxyController
import com.airbnb.epoxy.Typed3EpoxyController
import com.airbnb.epoxy.Typed4EpoxyController
import com.airbnb.epoxy.TypedEpoxyController

fun epoxyController(
    asyncBuilding: Boolean = EpoxyKtxPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyKtxPlugins.useAsyncDiffing,
    buildModels: EpoxyController.() -> Unit
): EpoxyController {
    return object : EpoxyController(handler(asyncBuilding), handler(asyncDiffing)) {
        override fun buildModels() {
            buildModels.invoke(this)
        }
    }
}

fun <T> typedEpoxyController(
    asyncBuilding: Boolean = EpoxyKtxPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyKtxPlugins.useAsyncDiffing,
    buildModels: TypedEpoxyController<T>.(data: T) -> Unit
): TypedEpoxyController<T> {
    return object : TypedEpoxyController<T>(handler(asyncBuilding), handler(asyncDiffing)) {
        override fun buildModels(data: T) {
            buildModels.invoke(this, data)
        }
    }
}

fun <T, U> typed2EpoxyController(
    asyncBuilding: Boolean = EpoxyKtxPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyKtxPlugins.useAsyncDiffing,
    buildModels: Typed2EpoxyController<T, U>.(data1: T, data2: U) -> Unit
): Typed2EpoxyController<T, U> {
    return object : Typed2EpoxyController<T, U>(handler(asyncBuilding), handler(asyncDiffing)) {
        override fun buildModels(data1: T, data2: U) {
            buildModels.invoke(this, data1, data2)
        }
    }
}

fun <T, U, V> typed3EpoxyController(
    asyncBuilding: Boolean = EpoxyKtxPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyKtxPlugins.useAsyncDiffing,
    buildModels: Typed3EpoxyController<T, U, V>.(data1: T, data2: U, data3: V) -> Unit
): Typed3EpoxyController<T, U, V> {
    return object : Typed3EpoxyController<T, U, V>(handler(asyncBuilding), handler(asyncDiffing)) {
        override fun buildModels(data1: T, data2: U, data3: V) {
            buildModels.invoke(this, data1, data2, data3)
        }
    }
}

fun <T, U, V, W> typed4EpoxyController(
    asyncBuilding: Boolean = EpoxyKtxPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyKtxPlugins.useAsyncDiffing,
    buildModels: Typed4EpoxyController<T, U, V, W>.(data1: T, data2: U, data3: V, data4: W) -> Unit
): Typed4EpoxyController<T, U, V, W> {
    return object : Typed4EpoxyController<T, U, V, W>(handler(asyncBuilding), handler(asyncDiffing)) {
        override fun buildModels(data1: T, data2: U, data3: V, data4: W) {
            buildModels.invoke(this, data1, data2, data3, data4)
        }
    }
}

fun <T> collectionEpoxyController(
    asyncBuilding: Boolean = EpoxyKtxPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyKtxPlugins.useAsyncDiffing,
    buildModel: EpoxyController.(item: T) -> Unit
): TypedEpoxyController<Collection<T>> {
    return typedEpoxyController(asyncBuilding, asyncDiffing) { data ->
        data.forEach { buildModel.invoke(this, it) }
    }
}