/*
The MIT License (MIT)

Copyright (c) 2017 Bill Femmer

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

import java.util.Comparator;

/**
 *
 * @author bfemmer
 */
public class WellNumberEntity {
    private String wellNumber;
    private int logCount;
    
    public WellNumberEntity() {
        wellNumber = "";
        logCount = 0;
    }
    
    public WellNumberEntity(String wellNumber, int logCount) {
        this.wellNumber = wellNumber;
        this.logCount = logCount;
    }

    /**
     * @return the wellNumber
     */
    public String getWellNumber() {
        return wellNumber;
    }

    /**
     * @param wellNumber the wellNumber to set
     */
    public void setWellNumber(String wellNumber) {
        this.wellNumber = wellNumber;
    }

    /**
     * @return the logCount
     */
    public int getLogCount() {
        return logCount;
    }

    /**
     * @param logCount the logCount to set
     */
    public void setLogCount(int logCount) {
        this.logCount = logCount;
    }
    
    @Override
    public String toString() {
        String value = "W-" + wellNumber;
        if (logCount > 1) {
            value += " (" + String.valueOf(logCount) + " logs)";
        }
        return value;
    }
}

class SortByWellNumber implements Comparator<WellNumberEntity>{
 
    @Override
    public int compare(WellNumberEntity entity1, WellNumberEntity entity2) {
        return entity1.getWellNumber().compareTo(entity2.getWellNumber());
    }
}