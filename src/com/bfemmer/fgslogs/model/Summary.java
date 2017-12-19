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

/**
 *
 * @author bfemmer
 */
public class Summary {
    private double bottomSampleDepth;
    private double totalDepth;
    private double fromDepth;
    private double toDepth;
    private int sampleCount;
    private double elevation;
    private int completionDateYear;
    private int completionDateMonth;
    private int completionDateDay;
    private String ownerDriller;
    private String workedBy;
    
    public Summary() {
        bottomSampleDepth = -1;
        totalDepth = -1;
        fromDepth = -1;
        toDepth = -1;
        elevation = -1;
        sampleCount = 0;
        completionDateYear = -1;
        completionDateMonth = -1;
        completionDateDay = -1;
        ownerDriller = "";
        workedBy = ""; 
    }
    
    /**
     * @return the bottomSampleDepth
     */
    public double getBottomSampleDepth() {
        return bottomSampleDepth;
    }

    /**
     * @param bottomSampleDepth the bottomSampleDepth to set
     */
    public void setBottomSampleDepth(double bottomSampleDepth) {
        this.bottomSampleDepth = bottomSampleDepth;
    }

    /**
     * @return the totalDepth
     */
    public double getTotalDepth() {
        return totalDepth;
    }

    /**
     * @param totalDepth the totalDepth to set
     */
    public void setTotalDepth(double totalDepth) {
        this.totalDepth = totalDepth;
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
     * @return the sampleCount
     */
    public int getSampleCount() {
        return sampleCount;
    }

    /**
     * @param sampleCount the sampleCount to set
     */
    public void setSampleCount(int sampleCount) {
        this.sampleCount = sampleCount;
    }

    /**
     * @return the elevation
     */
    public double getElevation() {
        return elevation;
    }

    /**
     * @param elevation the elevation to set
     */
    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    /**
     * @return the completionDateYear
     */
    public int getCompletionDateYear() {
        return completionDateYear;
    }

    /**
     * @param completionDateYear the completionDateYear to set
     */
    public void setCompletionDateYear(int completionDateYear) {
        this.completionDateYear = completionDateYear;
    }

    /**
     * @return the completionDateMonth
     */
    public int getCompletionDateMonth() {
        return completionDateMonth;
    }

    /**
     * @param completionDateMonth the completionDateMonth to set
     */
    public void setCompletionDateMonth(int completionDateMonth) {
        this.completionDateMonth = completionDateMonth;
    }

    /**
     * @return the completionDateDay
     */
    public int getCompletionDateDay() {
        return completionDateDay;
    }

    /**
     * @param completionDateDay the completionDateDay to set
     */
    public void setCompletionDateDay(int completionDateDay) {
        this.completionDateDay = completionDateDay;
    }

    /**
     * @return the ownerDriller
     */
    public String getOwnerDriller() {
        return ownerDriller;
    }

    /**
     * @param ownerDriller the ownerDriller to set
     */
    public void setOwnerDriller(String ownerDriller) {
        this.ownerDriller = ownerDriller;
    }

    /**
     * @return the workedBy
     */
    public String getWorkedBy() {
        return workedBy;
    }

    /**
     * @param workedBy the workedBy to set
     */
    public void setWorkedBy(String workedBy) {
        this.workedBy = workedBy;
    }
}
