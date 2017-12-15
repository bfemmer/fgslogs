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

package com.bfemmer.fgslogs.modelview;

import com.bfemmer.fgslogs.model.Mineral;
import com.bfemmer.fgslogs.model.Sample;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bfemmer
 */
public class SampleView {
    private final int wellLogNumber;
    private final String rockType;
    private final String rockColorMin;
    private final String rockColorMax;
    private List<String> porosityValues;
    private final String alteration;
    private final String crystallinity;
    private final String grainSize;
    private final String grainRangeMin;
    private final String grainRangeMax;
    private final String roundnessMin;
    private final String roundnessMax;
    private final String sphericity;
    private final List<String> grainTypes;
    private final String induration;
    private List<String> cementTypes;
    private List<String> sedimentaryValues;
    private List<MineralView> accessoryMinerals;
    private List<String> otherFeatures;
    private List<String> fossils;
    private final Sample sample;
    
    public SampleView(int wellLogNumber, Sample sample) {
        this.wellLogNumber = wellLogNumber;
        this.sample = sample;
        
        LookupCodes codes = new LookupCodes();
        rockType = codes.getRockTypeMap().get(this.sample.getRockTypeCode());
        rockColorMin = codes.getColorCodeMap().get(this.sample.getRockColorCodeMin());
        rockColorMax = codes.getColorCodeMap().get(this.sample.getRockColorCodeMax());
        
        porosityValues = new ArrayList<>();
        sample.getPorosityCodes().forEach((value) -> {
            porosityValues.add(codes.getPorosityCodeMap().get(value));
        });
               
        alteration = codes.getAlterationCodeMap().get(this.sample.getAlterationCode());
        crystallinity = codes.getCrystallinityCodeMap().get(this.sample.getCrystallinityCode());
        grainSize = codes.getGrainSizeCodeMap().get(this.sample.getGrainSizeCode());
        grainRangeMin = codes.getGrainSizeCodeMap().get(this.sample.getGrainRangeCodeMin());
        grainRangeMax = codes.getGrainSizeCodeMap().get(this.sample.getGrainRangeCodeMax());
        roundnessMin = codes.getRoundnessCodeMap().get(this.sample.getRoundnessCodeMin());
        roundnessMax = codes.getRoundnessCodeMap().get(this.sample.getRoundnessCodeMax());
        sphericity = codes.getSphericityCodeMap().get(this.sample.getSphericityCode());
        
        grainTypes = new ArrayList<>();
        sample.getGrainTypeCodes().forEach((value) -> {
            grainTypes.add(codes.getGrainTypeCodeMap().get(value));
        });
        
        induration = codes.getIndurationCodeMap().get(this.sample.getIndurationCode());
        
        cementTypes = new ArrayList<>();
        sample.getCementTypeCodes().forEach((value) -> {
            cementTypes.add(codes.getCementCodeMap().get(value));
        });
        
        sedimentaryValues = new ArrayList<>();
        sample.getSedimentaryCodes().forEach((value) -> {
            sedimentaryValues.add(codes.getSedimentaryCodeMap().get(value));
        });
        
        accessoryMinerals = new ArrayList<>();
        sample.getAccessoryMineralCodes().forEach((mineral) -> {
            MineralView mineralView = new MineralView(mineral);
            accessoryMinerals.add(mineralView);
        });
        
        otherFeatures = new ArrayList<>();
        sample.getOtherFeatureCodes().forEach((value) -> {
            otherFeatures.add(codes.getFeatureCodeMap().get(value));
        });
        
        fossils = new ArrayList<>();
        sample.getFossilCodes().forEach((value) -> {
            fossils.add(codes.getFossilCodeMap().get(value));
        });
    }
    
    /**
     * @return the fromDepth
     */
    public double getFromDepth() {
        return sample.getFromDepth();
    }

    /**
     * @return the toDepth
     */
    public double getToDepth() {
        return sample.getToDepth();
    }

    /**
     * @return the rockTypeCode
     */
    public String getRockTypeCode() {
        return sample.getRockTypeCode();
    }

    /**
     * @return the rockTypeCode
     */
    public String getRockType() {
        return rockType;
    }

    /**
     * @return the rockColorCodeMin
     */
    public String getRockColorCodeMin() {
        return sample.getRockColorCodeMin();
    }
    
    /**
     * @return the rockColorMin
     */
    public String getRockColorMin() {
        return rockColorMin;
    }

    /**
     * @return the rockColorCodeMax
     */
    public String getRockColorCodeMax() {
        return sample.getRockColorCodeMax();
    }
    
    /**
     * @return the rockColorMax
     */
    public String getRockColorMax() {
        return rockColorMax;
    }

    /**
     * @return the porosity
     */
    public int getPorosity() {
        return sample.getPorosity();
    }

    /**
     * @return the porosityCode
     */
    public List<String> getPorosityCodes() {
        return sample.getPorosityCodes();
    }
    
    /**
     * @return the porosityValues
     */
    public List<String> getPorosityValues() {
        return porosityValues;
    }

    /**
     * @return the grainSizeCode
     */
    public String getGrainSizeCode() {
        return sample.getGrainSizeCode();
    }
    
    /**
     * @return the grainSize
     */
    public String getGrainSize() {
        return grainSize;
    }

    /**
     * @return the grainRangeCodeMin
     */
    public String getGrainRangeCodeMin() {
        return sample.getGrainRangeCodeMin();
    }
    
    /**
     * @return the grainRangeMin
     */
    public String getGrainRangeMin() {
        return grainRangeMin;
    }

    /**
     * @return the grainRangeCodeMax
     */
    public String getGrainRangeCodeMax() {
        return sample.getGrainRangeCodeMax();
    }
    
    /**
     * @return the grainRangeMax
     */
    public String getGrainRangeMax() {
        return grainRangeMax;
    }

    /**
     * @return the roundnessCodeMin
     */
    public String getRoundnessCodeMin() {
        return sample.getRoundnessCodeMin();
    }
    
    /**
     * @return the roundnessMin
     */
    public String getRoundnessMin() {
        return roundnessMin;
    }

    /**
     * @return the roundnessCodeMax
     */
    public String getRoundnessCodeMax() {
        return sample.getRoundnessCodeMax();
    }
    
    /**
     * @return the roundnessMax
     */
    public String getRoundnessMax() {
        return roundnessMax;
    }

    /**
     * @return the sphericityCode
     */
    public String getSphericityCode() {
        return sample.getSphericityCode();
    }
    
    /**
     * @return the sphericity
     */
    public String getSphericity() {
        return sphericity;
    }

    /**
     * @return the grainTypeCodes
     */
    public List<String> getGrainTypeCodes() {
        return sample.getGrainTypeCodes();
    }
    
    /**
     * @return the grainTypes
     */
    public List<String> getGrainTypes() {
        return grainTypes;
    }

    /**
     * @return the alterationCode
     */
    public String getAlterationCode() {
        return sample.getAlterationCode();
    }
    
    /**
     * @return the alterationCode
     */
    public String getAlteration() {
        return alteration;
    }

    /**
     * @return the crystallinityCode
     */
    public String getCrystallinityCode() {
        return sample.getCrystallinityCode();
    }
    
    /**
     * @return the crystallinity
     */
    public String getCrystallinity() {
        return crystallinity;
    }

    /**
     * @return the indurationCode
     */
    public String getIndurationCode() {
        return sample.getIndurationCode();
    }
    
    /**
     * @return the induration
     */
    public String getInduration() {
        return induration;
    }

    /**
     * @return the cementTypeCodes
     */
    public List<String> getCementTypeCodes() {
        return sample.getCementTypeCodes();
    }
    
    /**
     * @return the cementTypes
     */
    public List<String> getCementTypes() {
        return cementTypes;
    }

    /**
     * @return the sedimentaryCodes
     */
    public List<String> getSedimentaryCodes() {
        return sample.getSedimentaryCodes();
    }
    
    /**
     * @return the sedimentaryValues
     */
    public List<String> getSedimentaryValues() {
        return sedimentaryValues;
    }

    /**
     * @return the accessoryMinerals
     */
    public List<Mineral> getAccessoryMineralCodes() {
        return sample.getAccessoryMineralCodes();
    }
    
    /**
     * @return the accessoryMinerals
     */
    public List<MineralView> getAccessoryMinerals() {
        return accessoryMinerals;
    }
    
    /**
     * @return the otherFeatureCodes
     */
    public List<String> getOtherFeatureCodes() {
        return sample.getOtherFeatureCodes();
    }
    
    /**
     * @return the otherFeatures
     */
    public List<String> getOtherFeatures() {
        return otherFeatures;
    }

    /**
     * @return the fossilCodes
     */
    public List<String> getFossilCodes() {
        return sample.getFossilCodes();
    }
    
    /**
     * @return the fossils
     */
    public List<String> getFossils() {
        return fossils;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return sample.getComments();
    }

    /**
     * @return the wellLogNumber
     */
    public int getWellLogNumber() {
        return wellLogNumber;
    }
}
