/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites.models;

import java.util.ArrayList;

/**
* Parameters supplied to the Create Web Site operation.
*/
public class WebSiteCreateParameters {
    private WebSiteComputeMode computeMode;
    
    /**
    * Optional. The compute mode for the web site. This value should be Shared
    * for the Free or Paid Shared offerings or Dedicated for the Standard
    * offering. The default value is Shared. If you set ComputeMode to
    * Dedicated, you must specify a value for the ServerFarm element.
    * @return The ComputeMode value.
    */
    public WebSiteComputeMode getComputeMode() {
        return this.computeMode;
    }
    
    /**
    * Optional. The compute mode for the web site. This value should be Shared
    * for the Free or Paid Shared offerings or Dedicated for the Standard
    * offering. The default value is Shared. If you set ComputeMode to
    * Dedicated, you must specify a value for the ServerFarm element.
    * @param computeModeValue The ComputeMode value.
    */
    public void setComputeMode(final WebSiteComputeMode computeModeValue) {
        this.computeMode = computeModeValue;
    }
    
    private ArrayList<String> hostNames;
    
    /**
    * Optional. The fully qualified domain name for web site. Only one host
    * name can be specified in the azurewebsites.net domain. The host name
    * should match the name of the web site. Custom domains can only be
    * specified for Shared or Standard web sites.
    * @return The HostNames value.
    */
    public ArrayList<String> getHostNames() {
        return this.hostNames;
    }
    
    /**
    * Optional. The fully qualified domain name for web site. Only one host
    * name can be specified in the azurewebsites.net domain. The host name
    * should match the name of the web site. Custom domains can only be
    * specified for Shared or Standard web sites.
    * @param hostNamesValue The HostNames value.
    */
    public void setHostNames(final ArrayList<String> hostNamesValue) {
        this.hostNames = hostNamesValue;
    }
    
    private String name;
    
    /**
    * Required. The name of the web site. This should match the host name in
    * the default domain.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. The name of the web site. This should match the host name in
    * the default domain.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String serverFarm;
    
    /**
    * Optional. The name of the Server Farm associated with this web site. This
    * is a required value for Standard mode.
    * @return The ServerFarm value.
    */
    public String getServerFarm() {
        return this.serverFarm;
    }
    
    /**
    * Optional. The name of the Server Farm associated with this web site. This
    * is a required value for Standard mode.
    * @param serverFarmValue The ServerFarm value.
    */
    public void setServerFarm(final String serverFarmValue) {
        this.serverFarm = serverFarmValue;
    }
    
    private WebSiteMode siteMode;
    
    /**
    * Optional. The web site mode. This value is Limited for the Free offering
    * and Basic for the Paid and Shared offerings. The default value is
    * Limited. Note: Standard mode does not use the SiteMode setting; it uses
    * the ComputeMode setting. For more information, see Upgrade or Downgrade
    * a Web Site.
    * @return The SiteMode value.
    */
    public WebSiteMode getSiteMode() {
        return this.siteMode;
    }
    
    /**
    * Optional. The web site mode. This value is Limited for the Free offering
    * and Basic for the Paid and Shared offerings. The default value is
    * Limited. Note: Standard mode does not use the SiteMode setting; it uses
    * the ComputeMode setting. For more information, see Upgrade or Downgrade
    * a Web Site.
    * @param siteModeValue The SiteMode value.
    */
    public void setSiteMode(final WebSiteMode siteModeValue) {
        this.siteMode = siteModeValue;
    }
    
    private WebSiteCreateParameters.WebSpaceDetails webSpace;
    
    /**
    * Optional. Information about the web space to create.
    * @return The WebSpace value.
    */
    public WebSiteCreateParameters.WebSpaceDetails getWebSpace() {
        return this.webSpace;
    }
    
    /**
    * Optional. Information about the web space to create.
    * @param webSpaceValue The WebSpace value.
    */
    public void setWebSpace(final WebSiteCreateParameters.WebSpaceDetails webSpaceValue) {
        this.webSpace = webSpaceValue;
    }
    
    private String webSpaceName;
    
    /**
    * Required. The name of the web space.
    * @return The WebSpaceName value.
    */
    public String getWebSpaceName() {
        return this.webSpaceName;
    }
    
    /**
    * Required. The name of the web space.
    * @param webSpaceNameValue The WebSpaceName value.
    */
    public void setWebSpaceName(final String webSpaceNameValue) {
        this.webSpaceName = webSpaceNameValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteCreateParameters class.
    *
    */
    public WebSiteCreateParameters() {
        this.hostNames = new ArrayList<String>();
    }
    
    /**
    * Information about the web space to create.
    */
    public static class WebSpaceDetails {
        private String geoRegion;
        
        /**
        * Required. The geographical region of the web space that will be
        * created.
        * @return The GeoRegion value.
        */
        public String getGeoRegion() {
            return this.geoRegion;
        }
        
        /**
        * Required. The geographical region of the web space that will be
        * created.
        * @param geoRegionValue The GeoRegion value.
        */
        public void setGeoRegion(final String geoRegionValue) {
            this.geoRegion = geoRegionValue;
        }
        
        private String name;
        
        /**
        * Required. The name of the web space.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Required. The name of the web space.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private String plan;
        
        /**
        * Required. The web space plan. This value must be VirtualDedicatedPlan.
        * @return The Plan value.
        */
        public String getPlan() {
            return this.plan;
        }
        
        /**
        * Required. The web space plan. This value must be VirtualDedicatedPlan.
        * @param planValue The Plan value.
        */
        public void setPlan(final String planValue) {
            this.plan = planValue;
        }
    }
}
