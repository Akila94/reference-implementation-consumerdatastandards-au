/**
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.openbanking.cds.account.type.management.endpoint.ceasing.secondary.user.sharing.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * Ceasing Secondary User - BlockedLegalEntityItemDTO.
 */
public class LegalEntityItemUpdateDTO {
    @NotEmpty(message = "Invalid value for \"secondaryUserID\"")
    private String secondaryUserID;

    @NotEmpty(message = "Invalid value for \"accountID\"")
    private String accountID;

    @NotEmpty(message = "Invalid value for \"legalEntityID\"")
    private String legalEntityID;

    @NotEmpty(message = "Invalid value for  \"legalEntitySharingStatus\". " +
            "Must be active or blocked")
    @Pattern(regexp = "^(active|blocked)?$", message = "Invalid value for " +
            "\"legalEntitySharingStatus\". Must be active or blocked")
    private String legalEntitySharingStatus;

    public String getSecondaryUserID() {
        return secondaryUserID;
    }

    public void setSecondaryUserID(String secondaryUserID) {
        this.secondaryUserID = secondaryUserID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getLegalEntityID() {
        return legalEntityID;
    }

    public void setLegalEntityID(String legalEntityID) {
        this.legalEntityID = legalEntityID;
    }

    public String getLegalEntitySharingStatus() {
        return legalEntitySharingStatus;
    }

    public void setLegalEntitySharingStatus(String legalEntitySharingStatus) {
        this.legalEntitySharingStatus = legalEntitySharingStatus;
    }
}
