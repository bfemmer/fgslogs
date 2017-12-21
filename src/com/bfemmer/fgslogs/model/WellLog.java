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

public class WellLog {
    private String id;
    private String wellLogNumber;
    
    private SummaryEntity summaryEntity;
    private LocationEntity locationEntity;
    private FormationEntity formationEntity;
    private SampleEntity sampleEntity;
    
    /**
     * Constructor
     */
    public WellLog() {
        
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the wellLogNumber
     */
    public String getWellLogNumber() {
        return wellLogNumber;
    }

    /**
     * @param wellLogNumber the wellLogNumber to set
     */
    public void setWellLogNumber(String wellLogNumber) {
        this.wellLogNumber = wellLogNumber;
    }

    /**
     * @return the summaryEntity
     */
    public SummaryEntity getSummaryEntity() {
        return summaryEntity;
    }

    /**
     * @param summaryEntity the summaryEntity to set
     */
    public void setSummaryEntity(SummaryEntity summaryEntity) {
        this.summaryEntity = summaryEntity;
    }

    /**
     * @return the locationEntity
     */
    public LocationEntity getLocationEntity() {
        return locationEntity;
    }

    /**
     * @param locationEntity the location to set
     */
    public void setLocationEntity(LocationEntity locationEntity) {
        this.locationEntity = locationEntity;
    }

    /**
     * @return the formationEntity
     */
    public FormationEntity getFormationEntity() {
        return formationEntity;
    }

    /**
     * @param formationEntity the formationEntity to set
     */
    public void setFormationEntity(FormationEntity formationEntity) {
        this.formationEntity = formationEntity;
    }

    /**
     * @return the sampleEntity
     */
    public SampleEntity getSampleEntity() {
        return sampleEntity;
    }

    /**
     * @param sampleEntity the sample to set
     */
    public void setSampleEntity(SampleEntity sampleEntity) {
        this.sampleEntity = sampleEntity;
    }
 
    @Override
    public String toString() {
        return "W-" + String.valueOf(wellLogNumber);
    }
}
