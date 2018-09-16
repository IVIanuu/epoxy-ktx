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

import androidx.recyclerview.widget.RecyclerView
import com.airbnb.epoxy.EpoxyAdapter
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.Typed2EpoxyController
import com.airbnb.epoxy.Typed3EpoxyController
import com.airbnb.epoxy.Typed4EpoxyController
import com.airbnb.epoxy.TypedEpoxyController

fun RecyclerView.setEpoxyController(epoxyController: EpoxyController) {
    adapter = epoxyController.adapter
}

fun RecyclerView.setEpoxyControllerAndBuild(epoxyController: EpoxyController) {
    setEpoxyController(epoxyController)
    epoxyController.requestModelBuild()
}

fun RecyclerView.setEpoxyController(
    asyncBuilding: Boolean = EpoxyPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyPlugins.useAsyncDiffing,
    buildModels: EpoxyController.() -> Unit
) = setEpoxyControllerInternal(epoxyController(asyncBuilding, asyncDiffing, buildModels))

fun RecyclerView.setEpoxyControllerAndBuild(
    asyncBuilding: Boolean = EpoxyPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyPlugins.useAsyncDiffing,
    buildModels: EpoxyController.() -> Unit
) = setEpoxyControllerAndBuildInternal(epoxyController(asyncBuilding, asyncDiffing, buildModels))

fun <T> RecyclerView.setTypedEpoxyController(
    asyncBuilding: Boolean = EpoxyPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyPlugins.useAsyncDiffing,
    buildModels: TypedEpoxyController<T>.(data: T) -> Unit
) = setEpoxyControllerInternal(typedEpoxyController(asyncBuilding, asyncDiffing, buildModels))

fun <T, U> RecyclerView.setTyped2EpoxyController(
    asyncBuilding: Boolean = EpoxyPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyPlugins.useAsyncDiffing,
    buildModels: Typed2EpoxyController<T, U>.(data1: T, data2: U) -> Unit
) = setEpoxyControllerInternal(typed2EpoxyController(asyncBuilding, asyncDiffing, buildModels))

fun <T, U, V> RecyclerView.setTyped3EpoxyController(
    asyncBuilding: Boolean = EpoxyPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyPlugins.useAsyncDiffing,
    buildModels: Typed3EpoxyController<T, U, V>.(data1: T, data2: U, data3: V) -> Unit
) = setEpoxyControllerInternal(typed3EpoxyController(asyncBuilding, asyncDiffing, buildModels))

fun <T, U, V, W> RecyclerView.setTyped4EpoxyController(
    asyncBuilding: Boolean = EpoxyPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyPlugins.useAsyncDiffing,
    buildModels: Typed4EpoxyController<T, U, V, W>.(data1: T, data2: U, data3: V, data4: W) -> Unit
) = setEpoxyControllerInternal(typed4EpoxyController(asyncBuilding, asyncDiffing, buildModels))

fun <T> RecyclerView.setCollectionEpoxyController(
    asyncBuilding: Boolean = EpoxyPlugins.useAsyncBuilding,
    asyncDiffing: Boolean = EpoxyPlugins.useAsyncDiffing,
    buildModel: EpoxyController.(item: T) -> Unit
) = setEpoxyControllerInternal(collectionEpoxyController(asyncBuilding, asyncDiffing, buildModel))

private fun <T : EpoxyController> RecyclerView.setEpoxyControllerInternal(epoxyController: T): T {
    setEpoxyController(epoxyController)
    return epoxyController
}

private fun <T : EpoxyController> RecyclerView.setEpoxyControllerAndBuildInternal(epoxyController: T): T {
    setEpoxyControllerAndBuild(epoxyController)
    return epoxyController
}