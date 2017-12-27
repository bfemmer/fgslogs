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

package com.bfemmer.fgslogs.viewmodel;

import com.bfemmer.fgslogs.model.Location;

/**
 *
 * @author bfemmer
 */
public class LocationViewModel  {
    private final Location location;
    private final LatLng latLong;
    
    public LocationViewModel(Location location) {
        this.location = location;
        this.latLong = new LatLng(this.getLatitude(), this.getLongitude());
    }
    
    /**
     * @return the countyCode
     */
    public String getCountyCode() {
        return location.getCountyCode();
    }
    
    /**
     * @return the countyCode
     */
    public String getCountyName() {
        LookupCodes codes = new LookupCodes();
        String countyName = codes
                .getCountyCodeMap()
                .get(location.getCountyCode());
        return countyName;
    }

    /**
     * @param countyCode the countyCode to set
     */
    public void setCountyCode(String countyCode) {
        location.setCountyCode(countyCode);
    }

    /**
     * @return the township
     */
    public String getTownship() {
        return location.getTownship();
    }

    /**
     * @param township the township to set
     */
    public void setTownship(String township) {
        location.setTownship(township);
    }

    /**
     * @return the range
     */
    public String getRange() {
        return location.getRange();
    }

    /**
     * @param range the range to set
     */
    public void setRange(String range) {
        location.setRange(range);
    }

    /**
     * @return the section
     */
    public int getSection() {
        return location.getSection();
    }

    /**
     * @param section the section to set
     */
    public void setSection(int section) {
        location.setSection(section);
    }
    
    /**
     * @return the quarterSection
     */
    public String getQuarterSection() {
        return location.getQuarterSection();
    }

    /**
     * @param quarterSection the quarterSection to set
     */
    public void setQuarterSection(String quarterSection) {
        location.setQuarterSection(quarterSection);
    }

    /**
     * @return the latDegrees
     */
    public int getLatDegrees() {
        return location.getLatDegrees();
    }

    /**
     * @param latDegrees the latDegrees to set
     */
    public void setLatDegrees(int latDegrees) {
        location.setLatDegrees(latDegrees);
    }

    /**
     * @return the latMinutes
     */
    public int getLatMinutes() {
        return location.getLatMinutes();
    }

    /**
     * @param latMinutes the latMinutes to set
     */
    public void setLatMinutes(int latMinutes) {
        location.setLatMinutes(latMinutes);
    }

    /**
     * @return the latSeconds
     */
    public int getLatSeconds() {
        return location.getLatSeconds();
    }

    /**
     * @param latSeconds the latSeconds to set
     */
    public void setLatSeconds(int latSeconds) {
        location.setLatSeconds(latSeconds);
    }

    /**
     * @return the lngDegrees
     */
    public int getLngDegrees() {
        return location.getLngDegrees();
    }

    /**
     * @param lngDegrees the lngDegrees to set
     */
    public void setLngDegrees(int lngDegrees) {
        location.setLngDegrees(lngDegrees);
    }

    /**
     * @return the lngMinutes
     */
    public int getLngMinutes() {
        return location.getLngMinutes();
    }

    /**
     * @param lngMinutes the lngMinutes to set
     */
    public void setLngMinutes(int lngMinutes) {
        location.setLngMinutes(lngMinutes);
    }

    /**
     * @return the lngSeconds
     */
    public int getLngSeconds() {
        return location.getLngSeconds();
    }

    /**
     * @param lngSeconds the lngSeconds to set
     */
    public void setLngSeconds(int lngSeconds) {
        location.setLngSeconds(lngSeconds);
    }
    
    public String getPLSSCode() {
        String plssLocation;
        
        plssLocation = "T: " + location.getTownship() + " R: " + location.getRange();
        plssLocation += " S: " + String.format("%02d", location.getSection());
        plssLocation += " " + location.getQuarterSection();
        
        return plssLocation;
    }
    
    public String getDMS() {
        String dmsLocation = getLatDMS() + getLongDMS();
        return dmsLocation;
    }
    
    public String getLatDMS() {
        String dmsLocation;
        
        dmsLocation = String.format("%02d", location.getLatDegrees()) + "D ";
        dmsLocation += String.format("%02d", location.getLatMinutes()) + "M ";
        dmsLocation += String.format("%02d", location.getLatSeconds()) + "S ";
        
        return dmsLocation;
    }
    
    public String getLongDMS() {
        String dmsLocation;
        
        dmsLocation = String.format("%02d", location.getLngDegrees()) + "D ";
        dmsLocation += String.format("%02d", location.getLngMinutes()) + "M ";
        dmsLocation += String.format("%02d", location.getLngSeconds()) + "S";
        
        return dmsLocation;
    }
    
    /**
     * @return the latitude
     */
    public double getLatitude() {
        return com.bfemmer.fgslogs.utility.Math.fromDMStoDegrees(
                location.getLatDegrees(), 
                location.getLatMinutes(), 
                location.getLatSeconds());
    }

    /**
     * @return the longitude
     */
    public double getLongitude() {
        return com.bfemmer.fgslogs.utility.Math.fromDMStoDegrees(
                location.getLngDegrees(), 
                location.getLngMinutes(), 
                location.getLngSeconds());
    }

    /**
     * @return the latLong
     */
    public LatLng getLatLong() {
        return latLong;
    }
}
