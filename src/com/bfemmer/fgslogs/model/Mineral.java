/*
The MIT License (MIT)

Copyright (c) 2016 Bill Femmer

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.bfemmer.fgslogs.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bfemmer
 */
public class Mineral {
    private int percentage;
    private String code;
    private Map mineralCodeMap;
    
    public Mineral() {
        percentage = 0;
        code = "";
        mineralCodeMap = new HashMap();
        
        initializeMineralCodeMap();
    }
    
    private void initializeMineralCodeMap() {
        mineralCodeMap.put("A", "Anhydrite");
        mineralCodeMap.put("B", "Chert");
        mineralCodeMap.put("C", "Clay");
        mineralCodeMap.put("D", "Dolomite");
        mineralCodeMap.put("E", "Calcite");
        mineralCodeMap.put("F", "Feldspar");
        mineralCodeMap.put("G", "Gypsum");
        mineralCodeMap.put("H", "Heavy Minerals");
        mineralCodeMap.put("I", "Iron Stain");
        mineralCodeMap.put("J", "Mica");
        mineralCodeMap.put("K", "Glauconite");
        mineralCodeMap.put("L", "Limestone");
        mineralCodeMap.put("M", "Calcilutite");
        mineralCodeMap.put("N", "Manganese Oxide");
        mineralCodeMap.put("O", "Limonite");
        mineralCodeMap.put("P", "Pyrite");
        mineralCodeMap.put("Q", "Quartz");
        mineralCodeMap.put("R", "Spar");
        mineralCodeMap.put("S", "Quartz Sand");
        mineralCodeMap.put("T", "Silt");
        mineralCodeMap.put("U", "Peat");
        mineralCodeMap.put("V", "Hematite");
        mineralCodeMap.put("W", "Plant Remains");
        mineralCodeMap.put("X", "Phosphatic Gravel");
        mineralCodeMap.put("Y", "Phosphatic Sand");
        mineralCodeMap.put("Z", "Shale");
        mineralCodeMap.put("1", "Shell");
        mineralCodeMap.put("2", "Organics");
        mineralCodeMap.put("3", "Silt-Size Dolomite");
        mineralCodeMap.put("4", "Calcarenite");
    }
    

    /**
     * @return the percentage
     */
    public int getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    /**
     * 
     * @return the description from the lookup hash map
     */
    public String getDescription() {
        return (String)mineralCodeMap.get(code);
    }
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    
}
