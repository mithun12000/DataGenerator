/*
 * Copyright 2015 DataGenerator Contributors
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

package Graph

import NodeData.DisplayableData

import scala.beans.BeanProperty

/**
 * Describes the creation of an orphaned node, not linked to any other nodes in the graph
 * @param dataToAdd
 * @tparam T
 */
class AddNewOrphanedNodeDescription[+T <: DisplayableData](@BeanProperty val dataToAdd: T) extends EdgeCreationDescription[T]