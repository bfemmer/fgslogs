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

import java.util.ArrayList;
import java.util.List;

public class Sample {
    private double fromDepth;
    private double toDepth;
    private String rockTypeCode;
    private String rockColorCodeMin;
    private String rockColorCodeMax;
    private int porosity;
    private List<String> porosityCodes;
    private String alterationCode;
    private String crystallinityCode;
    private String grainSizeCode;
    private String grainRangeMin;
    private String grainRangeMax;
    private String roundnessMin;
    private String roundnessMax;
    private String sphericityCode;
    private List<String> grainTypeCodes;
    private String indurationCode;
    private List<String> cementTypeCodes;
    private List<String> sedimentaryCodes;
    private List<Mineral> accessoryMinerals;
    private List<String> otherFeatureCodes;
    private List<String> fossilCodes;
    private String comments;
    
    public Sample() {
        fromDepth = -1;
        toDepth = -1;
        rockTypeCode = "";
        rockColorCodeMin = "";
        rockColorCodeMax = "";
        porosity = -1;
        porosityCodes = new ArrayList<>();
        alterationCode = "";
        crystallinityCode = "";
        grainSizeCode = "";
        grainRangeMin = "";
        grainRangeMax = "";
        roundnessMin = "";
        roundnessMax = "";
        sphericityCode = "";
        grainTypeCodes = new ArrayList<>();
        cementTypeCodes = new ArrayList<>();
        indurationCode = "";
        sedimentaryCodes = new ArrayList<>();
        accessoryMinerals = new ArrayList<>();
        otherFeatureCodes = new ArrayList<>();
        fossilCodes = new ArrayList<>();
        comments = "";
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
     * @return the rockTypeCode
     */
    public String getRockTypeCode() {
        return rockTypeCode;
    }

    /**
     * @param rockTypeCode the rockTypeCode to set
     */
    public void setRockTypeCode(String rockTypeCode) {
        this.rockTypeCode = rockTypeCode;
    }

    /**
     * @return the rockColorCodeMin
     */
    public String getRockColorCodeMin() {
        return rockColorCodeMin;
    }

    /**
     * @param rockColorCode the rockColorCode to set
     */
    public void setRockColorCodeMin(String rockColorCode) {
        this.rockColorCodeMin = rockColorCode;
    }
    
    /**
     * @return the rockColorCodeMax
     */
    public String getRockColorCodeMax() {
        return rockColorCodeMax;
    }

    /**
     * @param rockColorCode the rockColorCode to set
     */
    public void setRockColorCodeMax(String rockColorCode) {
        this.rockColorCodeMax = rockColorCode;
    }

    /**
     * @return the porosity
     */
    public int getPorosity() {
        return porosity;
    }

    /**
     * @param porosity the porosity to set
     */
    public void setPorosity(int porosity) {
        this.porosity = porosity;
    }

    /**
     * @return the porosityCode
     */
    public List<String> getPorosityCodes() {
        return porosityCodes;
    }

    /**
     * @param porosityCodes the porosityCode to set
     */
    public void setPorosityCodes(List<String> porosityCodes) {
        this.porosityCodes = porosityCodes;
    }    

    /**
     * @return the grainSizeCode
     */
    public String getGrainSizeCode() {
        return grainSizeCode;
    }

    /**
     * @param grainSizeCode the grainSizeCode to set
     */
    public void setGrainSizeCode(String grainSizeCode) {
        this.grainSizeCode = grainSizeCode;
    }
    
    /**
     * @return the grainRangeMin
     */
    public String getGrainRangeMin() {
        return grainRangeMin;
    }

    /**
     * @param grainRangeMin the grainRangeMin to set
     */
    public void setGrainRangeMin(String grainRangeMin) {
        this.grainRangeMin = grainRangeMin;
    }

    /**
     * @return the grainRangeMax
     */
    public String getGrainRangeMax() {
        return grainRangeMax;
    }

    /**
     * @param grainRangeMax the grainRangeMax to set
     */
    public void setGrainRangeMax(String grainRangeMax) {
        this.grainRangeMax = grainRangeMax;
    }
    
    /**
     * @return the roundnessMin
     */
    public String getRoundnessMin() {
        return roundnessMin;
    }

    /**
     * @param roundnessMin the roundnessMin to set
     */
    public void setRoundnessMin(String roundnessMin) {
        this.roundnessMin = roundnessMin;
    }

    /**
     * @return the roundnessMax
     */
    public String getRoundnessMax() {
        return roundnessMax;
    }

    /**
     * @param roundnessMax the roundnessMax to set
     */
    public void setRoundnessMax(String roundnessMax) {
        this.roundnessMax = roundnessMax;
    }

    /**
     * @return the sphericityCode
     */
    public String getSphericityCode() {
        return sphericityCode;
    }

    /**
     * @param sphericityCode the sphericityCode to set
     */
    public void setSphericityCode(String sphericityCode) {
        this.sphericityCode = sphericityCode;
    }

    /**
     * @return the grainTypeCodes
     */
    public List<String> getGrainTypeCodes() {
        return grainTypeCodes;
    }

    /**
     * @param grainTypeCodes the grainTypeCodes to set
     */
    public void setGrainTypeCodes(List<String> grainTypeCodes) {
        this.grainTypeCodes = grainTypeCodes;
    }
    
    /**
     * @return the alterationCode
     */
    public String getAlterationCode() {
        return alterationCode;
    }

    /**
     * @param alterationCode the alterationCode to set
     */
    public void setAlterationCode(String alterationCode) {
        this.alterationCode = alterationCode;
    }

    /**
     * @return the crystallinityCode
     */
    public String getCrystallinityCode() {
        return crystallinityCode;
    }

    /**
     * @param crystallinityCode the crystallinityCode to set
     */
    public void setCrystallinityCode(String crystallinityCode) {
        this.crystallinityCode = crystallinityCode;
    }
    
    /**
     * @return the indurationCode
     */
    public String getIndurationCode() {
        return indurationCode;
    }

    /**
     * @param indurationCode the indurationCode to set
     */
    public void setIndurationCode(String indurationCode) {
        this.indurationCode = indurationCode;
    }

    /**
     * @return the cementTypeCodes
     */
    public List<String> getCementTypeCodes() {
        return cementTypeCodes;
    }

    /**
     * @param cementTypeCodes the cementTypeCodes to set
     */
    public void setCementTypeCodes(List<String> cementTypeCodes) {
        this.cementTypeCodes = cementTypeCodes;
    }
    
    /**
     * @return the sedimentaryCodes
     */
    public List<String> getSedimentaryCodes() {
        return sedimentaryCodes;
    }

    /**
     * @param sedimentaryCodes the sedimentaryCodes to set
     */
    public void setSedimentaryCodes(List<String> sedimentaryCodes) {
        this.sedimentaryCodes = sedimentaryCodes;
    }
    
    /**
     * @return the accessoryMinerals
     */
    public List<Mineral> getAccessoryMinerals() {
        return accessoryMinerals;
    }
    
    /**
     * @param accessoryMinerals the accessoryMinerals to set
     */
    public void setAccessoryMinerals(List<Mineral> accessoryMinerals) {
        this.accessoryMinerals = accessoryMinerals;
    }
    
    /**
     * @return the otherFeatureCodes
     */
    public List<String> getOtherFeatureCodes() {
        return otherFeatureCodes;
    }

    /**
     * @param otherFeatureCodes the otherFeatureCodes to set
     */
    public void setOtherFeatureCodes(List<String> otherFeatureCodes) {
        this.otherFeatureCodes = otherFeatureCodes;
    }
    
    /**
     * @return the fossilCodes
     */
    public List<String> getFossilCodes() {
        return fossilCodes;
    }

    /**
     * @param fossilCodes the fossilCodes to set
     */
    public void setFossilCodes(List<String> fossilCodes) {
        this.fossilCodes = fossilCodes;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

}
