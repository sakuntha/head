/*
 * Copyright (c) 2005-2011 Grameen Foundation USA
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * See also http://www.apache.org/licenses/LICENSE-2.0.html for an
 * explanation of the license and how it is applied.
 */
package org.mifos.platform.rest.controller;

import java.lang.reflect.Method;

import javassist.Modifier;

import junit.framework.Assert;

import org.junit.Test;
import org.mifos.platform.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;

public class RESTControllerConvensionTest {

    @Test
    public void testConvension() throws Exception {
        for(Class<?> clazz : ClassUtils.getClasses("org.mifos.platform.rest.ui.controller", "RESTController")) {
            verifyMethods(clazz);
        }
    }

    private void verifyMethods(Class<?> clazz) {
        for(Method method : clazz.getMethods()) {
            if(method.isAnnotationPresent(RequestMapping.class)) {
                Assert.assertFalse("Method should not be final, cglib Spring AOP can not intercept "
                                  + clazz.getName() +"."+ method.getName(),
                                  Modifier.isFinal(method.getModifiers()));
            }
        }
    }

}
