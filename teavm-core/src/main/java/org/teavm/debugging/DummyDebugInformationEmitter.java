/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.debugging;

import org.teavm.codegen.LocationProvider;
import org.teavm.model.MethodDescriptor;


/**
 *
 * @author Alexey Andreev
 */
public class DummyDebugInformationEmitter implements DebugInformationEmitter {
    @Override
    public void emitLocation(String fileName, int line) {
    }

    @Override
    public void emitMethod(MethodDescriptor method) {
    }

    @Override
    public void emitClass(String className) {
    }

    @Override
    public void emitVariable(String[] sourceName, String generatedName) {
    }

    @Override
    public void setLocationProvider(LocationProvider locationProvider) {
    }

    @Override
    public void addClass(String className) {
    }

    @Override
    public void addField(String fieldName, String jsName) {
    }
}
