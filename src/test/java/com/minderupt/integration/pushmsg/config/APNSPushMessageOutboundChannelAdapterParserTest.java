/*
 * Copyright 2002-2011 the original author or authors.
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


package com.minderupt.integration.pushmsg.config;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.w3c.dom.Element;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class APNSPushMessageOutboundChannelAdapterParserTest extends APNSPushMessageOutboundChannelAdapterParser {


    @Test
    public void testGetBeanDefinitionFromElementWithApnsHostPortCertificatePathBasicTest() throws Exception {

        Element element = mock(Element.class);
        when(element.getAttribute(ParserConstants.ATTRIBUTE_NAME_APNS_HOST)).thenReturn("apns.test.host.com");
        when(element.getAttribute(ParserConstants.ATTRIBUTE_NAME_APNS_PORT)).thenReturn("9160");
        when(element.getAttribute(ParserConstants.ATTRIBUTE_NAME_CERTIFICATE_PATH)).thenReturn("/path/to/certificate");

        ParserContext parserContext = new ParserContext(mock(XmlReaderContext.class), mock(BeanDefinitionParserDelegate.class));

        BeanDefinition beanDefinition = parseConsumer(element, parserContext);
        assertNotNull(beanDefinition);
        assertEquals("/path/to/certificate", beanDefinition.getConstructorArgumentValues().getArgumentValue(0, String.class).getValue());
        assertEquals("apns.test.host.com", beanDefinition.getConstructorArgumentValues().getArgumentValue(1, String.class).getValue());
        assertEquals(9160, beanDefinition.getConstructorArgumentValues().getArgumentValue(2, Integer.class).getValue());


    }


}
