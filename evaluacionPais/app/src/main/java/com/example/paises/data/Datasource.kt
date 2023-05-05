/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.paises.data
import com.example.paises.R
import com.example.paises.model.Pais
/**
 * [Datasource] generates a list of [Pais]
 */
class Datasource() {
    fun loadPaises(): List<Pais> {
        return listOf<Pais>(
            Pais(R.string.pais1, R.drawable.image1),
            Pais(R.string.pais2, R.drawable.image2),
            Pais(R.string.pais3, R.drawable.image3),
            Pais(R.string.pais4, R.drawable.image4),
            Pais(R.string.pais5, R.drawable.image5))
    }
}
