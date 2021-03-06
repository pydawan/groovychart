/*
 *
 * Copyright 2006 Sun Microsystems, Inc.
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
 *
 * DefaultContourDatasetBuilder.java
 *
 * Created on December 7, 2006, 3:19 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.thecoderscorner.groovychart.dataset.series.xyz;

import java.util.Map;
import com.thecoderscorner.groovychart.dataset.BaseDatasetBuilder;
import org.jfree.data.contour.DefaultContourDataset;
import org.jfree.data.general.Dataset;

/**
 *
 * @author jclarke
 */
public class DefaultContourDatasetBuilder extends BaseDatasetBuilder {
    
    /** Creates a new instance of DefaultContourDatasetBuilder */
    public DefaultContourDatasetBuilder() {
    }
    
    public Dataset getDataset() {
        return getXyzDataset();
    }    

    /**
     * Holds value of property xyzDataset.
     */
    private DefaultContourDataset xyzDataset;

    /**
     * Getter for property xyzDataset.
     * @return Value of property xyzDataset.
     */
    public DefaultContourDataset getXyzDataset() {
        return this.xyzDataset;
    }

    /**
     * Setter for property xyzDataset.
     * @param xyzDataset New value of property xyzDataset.
     */
    public void setXyzDataset(DefaultContourDataset xyzDataset) {
        this.xyzDataset = xyzDataset;
    }

    public void processNode(Object name, Map map, Object value) throws Exception {
        if(value != null && value instanceof DefaultContourDataset) {
            this.xyzDataset = (DefaultContourDataset)value;
        }else {
            // TODO
        }          
    }
}
