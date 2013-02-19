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


package com.minderupt.integration.pushmsg;

import org.springframework.integration.Message;
import org.springframework.integration.handler.AbstractMessageHandler;

public class APNSPushMessageSendingMessageHandler extends AbstractMessageHandler {

    private String apnsHost;
    private Integer apnsPort;
    private String certificatePath;


    public APNSPushMessageSendingMessageHandler(String certificatePath, String apnsHost, Integer apnsPort) {

        this.apnsHost = apnsHost;
        this.apnsPort = apnsPort;
        this.certificatePath = certificatePath;

    }


    @Override
    protected void handleMessageInternal(Message<?> message) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getApnsHost() {
        return apnsHost;
    }

    public void setApnsHost(String apnsHost) {
        this.apnsHost = apnsHost;
    }

    public Integer getApnsPort() {
        return apnsPort;
    }

    public void setApnsPort(Integer apnsPort) {
        this.apnsPort = apnsPort;
    }

    public String getCertificatePath() {
        return certificatePath;
    }

    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }
}
