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

import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.EpoxyTouchHelper
import kotlin.reflect.KClass

inline fun <reified U : EpoxyModel<*>> EpoxyTouchHelper.DragBuilder3.withTarget(): EpoxyTouchHelper.DragBuilder4<U> =
    withTarget(U::class)

inline fun <reified U : EpoxyModel<*>> EpoxyTouchHelper.DragBuilder3.withTarget(targetModelClass: KClass<U>): EpoxyTouchHelper.DragBuilder4<U> =
    withTarget(targetModelClass.java)

fun EpoxyTouchHelper.DragBuilder3.withTargets(
    vararg targetModelClasses: KClass<out EpoxyModel<*>>
): EpoxyTouchHelper.DragBuilder4<EpoxyModel<*>> =
    withTargets(*targetModelClasses.toList().map { it.java }.toTypedArray())

// todo maybe add extension for andCallbacks

inline fun <reified U : EpoxyModel<*>> EpoxyTouchHelper.SwipeBuilder2.withTarget(): EpoxyTouchHelper.SwipeBuilder3<U> =
    withTarget(U::class)

inline fun <reified U : EpoxyModel<*>> EpoxyTouchHelper.SwipeBuilder2.withTarget(targetModelClass: KClass<U>): EpoxyTouchHelper.SwipeBuilder3<U> =
    withTarget(targetModelClass.java)

fun EpoxyTouchHelper.SwipeBuilder2.withTargets(
    vararg targetModelClasses: KClass<out EpoxyModel<*>>
): EpoxyTouchHelper.SwipeBuilder3<EpoxyModel<*>> =
    withTargets(*targetModelClasses.toList().map { it.java }.toTypedArray())