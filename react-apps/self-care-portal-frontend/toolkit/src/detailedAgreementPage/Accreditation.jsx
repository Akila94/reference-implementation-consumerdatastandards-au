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
//Accreditation Details for Accreditated Software Products
import React from 'react';
import CDRLogo from 'AppOverride/src/images/CDRLogo.png';

export const Accreditation = ({ infoLabel, dataRecipientName, applicationName }) => {
  return (
    <>
      <h6>{infoLabel.accreditation.accreditationLabel}</h6>
      <p>
        {dataRecipientName} {infoLabel.accreditation.accreditWebsite} [
        <a href={infoLabel.accreditation.accreditWebsiteLink} target="_blank" rel="noreferrer">
          {/* add website link */}
          {infoLabel.accreditation.accreditWebsiteLinkText}
        </a>
        ]
      </p>
      <div className="accredBox">
        <img id="logo" src={CDRLogo} alt="CDR" />
        <div className="accredInfo">
          <h6>{applicationName}</h6>
          <p>{dataRecipientName}</p>
        </div>
      </div>
    </>
  );
};
