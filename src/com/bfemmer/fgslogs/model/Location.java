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

public class Location {
    private String countyCode;
    private String township;
    private String range;
    private int section;
    private String quarterSection;
    private int latDegrees;
    private int latMinutes;
    private int latSeconds;
    private int lngDegrees;
    private int lngMinutes;
    private int lngSeconds;

    public Location() {
        countyCode = "";
        township = "";
        range = "";
        section = 0;
        quarterSection = "";
        latDegrees = 0;
        latMinutes = 0;
        latSeconds = 0;
        lngDegrees = 0;
        lngMinutes = 0;
        lngSeconds = 0;
    }
    
    /**
     * @return the countyCode
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * @param countyCode the countyCode to set
     */
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    /**
     * @return the township
     */
    public String getTownship() {
        return township;
    }

    /**
     * @param township the township to set
     */
    public void setTownship(String township) {
        this.township = township;
    }

    /**
     * @return the range
     */
    public String getRange() {
        return range;
    }

    /**
     * @param range the range to set
     */
    public void setRange(String range) {
        this.range = range;
    }

    /**
     * @return the section
     */
    public int getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(int section) {
        this.section = section;
    }
    
    /**
     * @return the quarterSection
     */
    public String getQuarterSection() {
        return quarterSection;
    }

    /**
     * @param quarterSection the quarterSection to set
     */
    public void setQuarterSection(String quarterSection) {
        this.quarterSection = quarterSection;
    }

    /**
     * @return the latDegrees
     */
    public int getLatDegrees() {
        return latDegrees;
    }

    /**
     * @param latDegrees the latDegrees to set
     */
    public void setLatDegrees(int latDegrees) {
        this.latDegrees = latDegrees;
    }

    /**
     * @return the latMinutes
     */
    public int getLatMinutes() {
        return latMinutes;
    }

    /**
     * @param latMinutes the latMinutes to set
     */
    public void setLatMinutes(int latMinutes) {
        this.latMinutes = latMinutes;
    }

    /**
     * @return the latSeconds
     */
    public int getLatSeconds() {
        return latSeconds;
    }

    /**
     * @param latSeconds the latSeconds to set
     */
    public void setLatSeconds(int latSeconds) {
        this.latSeconds = latSeconds;
    }

    /**
     * @return the lngDegrees
     */
    public int getLngDegrees() {
        return lngDegrees;
    }

    /**
     * @param lngDegrees the lngDegrees to set
     */
    public void setLngDegrees(int lngDegrees) {
        this.lngDegrees = lngDegrees;
    }

    /**
     * @return the lngMinutes
     */
    public int getLngMinutes() {
        return lngMinutes;
    }

    /**
     * @param lngMinutes the lngMinutes to set
     */
    public void setLngMinutes(int lngMinutes) {
        this.lngMinutes = lngMinutes;
    }

    /**
     * @return the lngSeconds
     */
    public int getLngSeconds() {
        return lngSeconds;
    }

    /**
     * @param lngSeconds the lngSeconds to set
     */
    public void setLngSeconds(int lngSeconds) {
        this.lngSeconds = lngSeconds;
    }
}
