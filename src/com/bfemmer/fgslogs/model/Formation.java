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

public class Formation {
    private int wellLogNumber;
    private double fromDepth;
    private double toDepth;
    private String formationCode;
    private String formationName;
    
    public Formation() {
        fromDepth = -1;
        toDepth = -1;
        formationCode = "";
        formationName = "";
    }
    
    public Formation(double fromDepth, double toDepth, String formationCode,
            String formationName) {
        this.fromDepth = fromDepth;
        this.toDepth = toDepth;
        this.formationCode = formationCode;
        this.formationName = formationName;
    }

    /**
     * @return the fromDepth
     */
    public double getFromDepth() {
        return fromDepth;
    }

    /**
     * @param fromDepth the fromDepth to set
     */
    public void setFromDepth(double fromDepth) {
        this.fromDepth = fromDepth;
    }

    /**
     * @return the toDepth
     */
    public double getToDepth() {
        return toDepth;
    }

    /**
     * @param toDepth the toDepth to set
     */
    public void setToDepth(double toDepth) {
        this.toDepth = toDepth;
    }

    /**
     * @return the formationCode
     */
    public String getFormationCode() {
        return formationCode;
    }
    
    /**
     * @param formationCode the formationCode to set
     */
    public void setFormationCode(String formationCode) {
        this.formationCode = formationCode;
    }
    
    /**
     * @return the formationName
     */
    public String getFormationName() {
        return formationName;
    }
    
    /**
     * @param formationName the formationName to set
     */
    public void setFormationName(String formationName) {
        this.formationName = formationName;
    }

    /**
     * @return the wellLogNumber
     */
    public int getWellLogNumber() {
        return wellLogNumber;
    }

    /**
     * @param wellLogNumber the wellLogNumber to set
     */
    public void setWellLogNumber(int wellLogNumber) {
        this.wellLogNumber = wellLogNumber;
    }
    
}
