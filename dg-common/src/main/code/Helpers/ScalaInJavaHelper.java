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

package Helpers;

import scala.collection.JavaConverters;

import java.util.LinkedList;

/**
 * Helpers to use Scala code in Java.
 */
public class ScalaInJavaHelper {
    /**
     * Convert a Java LinkedList to a Scala Iterable.
     * @param linkedList Java LinkedList to convert
     * @return Scala Iterable
     */
    public static scala.collection.Iterable linkedListToScalaIterable(LinkedList<?> linkedList) {
        return JavaConverters.asScalaIterableConverter(linkedList).asScala();
    }
}
