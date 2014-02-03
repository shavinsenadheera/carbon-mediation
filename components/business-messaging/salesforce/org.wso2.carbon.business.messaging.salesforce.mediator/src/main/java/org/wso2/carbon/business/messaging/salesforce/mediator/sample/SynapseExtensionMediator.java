/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.business.messaging.salesforce.mediator.sample;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.soap.SOAPBody;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import javax.xml.namespace.QName;
import java.util.Iterator;

public class SynapseExtensionMediator extends AbstractMediator {
    public boolean mediate(MessageContext synCtx) {
        SOAPBody body = synCtx.getEnvelope().getBody();
        System.out.println("el : " + body);
        synCtx.setProperty(CustomXpathVariableResolver.SALESFORCE, body);
        return true;
    }
}
