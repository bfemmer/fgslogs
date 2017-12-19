/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bfemmer.fgslogs.model;

/**
 *
 * @author bfemmer
 */
public class SummaryEntity extends WellLogEntity {
    private Summary summary;
    
    public SummaryEntity(String id, String wellLogId, int wellLogNumber) {
        super(id, wellLogId, wellLogNumber);
    }

    /**
     * @return the summary
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(Summary summary) {
        this.summary = summary;
    }
    
}
