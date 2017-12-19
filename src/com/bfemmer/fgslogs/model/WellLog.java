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

import com.bfemmer.fgslogs.viewmodel.LocationViewModel;
import com.bfemmer.fgslogs.viewmodel.LookupCodes;
import com.bfemmer.fgslogs.viewmodel.MineralViewModel;
import com.bfemmer.fgslogs.viewmodel.SampleViewModel;

public class WellLog {
    private String id;
    private int wellLogNumber;
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
    private LocationEntity locationEntity;
    private FormationEntity formationEntity;
    private SampleEntity sampleEntity;
    
    /**
     * Constructor
     */
    public WellLog() {
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
    public int getWellLogNumber() {
        return wellLogNumber;
    }

    /**
     * @param wellLogNumber the wellLogNumber to set
     */
    public void setWellLogNumber(int wellLogNumber) {
        this.wellLogNumber = wellLogNumber;
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
 
    public String toHtml() {
        String html = createHtmlHeader();
        html = addSummaryAndLocationSectionToHtml(html);
        html = addOwnerDrillerSectionToHtml(html);
        html = addWorkedBySectionToHtml(html);
        html = addFormationSectionToHtml(html);
        html = addSampleSectionToHtml(html);
        html = addHtmlFooter(html);
        return html;
    }
    
    public String createHtmlHeader() {
        String html = "<html lang=\"en\">\n" +
            "<head>\n" +
            "  <meta charset=\"utf-8\">\n" +
            "\n" +
            "  <title>Lithologic Well Log</title>\n" +
            "</head>\n" +
            "<body>\n";
                
        return html;
    }
    
    public String addSummaryAndLocationSectionToHtml(String html) {
        LookupCodes codes = new LookupCodes();
        String temp;
        
        temp = "  <CENTER>" +
            "<TABLE WIDTH=\"550\">\n" +
            "  <TR>\n" +
            "    <TD colspan=\"2\" align=\"center\"><b>Lithology Well Log</b></TD>\n" +
            "  </TR>\n" +
            "  <TR>\n" +
            "    <TD><TABLE>\n" +
            "      <TR>\n" +
            "        <TD colspan=\"2\" align=\"center\"><b>Summary Information</b></TD>" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Well Number: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">W-" + wellLogNumber + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Total Depth (ft): </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + String.valueOf(totalDepth) + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD colspan=\"2\" align=\"center\"> <font color=\"blue\">" + String.valueOf(sampleCount) + "</FONT> <i>sample(s) from</i> <font color=\"blue\">" + String.valueOf(fromDepth) + "</FONT> <i>to</i> <font color=\"blue\">" + String.valueOf(toDepth) + "</FONT> ft</TD>" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD></TD>" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Completion Date (YYMMDD): </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + getCompletionDate() + "</FONT></TD>" +
            "      </TR>\n" +
            "    </TABLE></TD>\n" +
            "    <TD align=\"right\"><TABLE>\n" +
            "      <TR>\n" +
            "        <TD colspan=\"2\" align=\"center\"><b>Location Data</b></TD>" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>County: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + locationEntity.getLocation().getCountyName() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>PLSS: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + locationEntity.getLocation().getPLSSCode() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Latitude: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + locationEntity.getLocation().getLatDMS() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Longitude: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + locationEntity.getLocation().getLongDMS() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Elevation (ft): </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + String.valueOf(elevation) + "</FONT></TD>\n" +
            "      </TR>\n" +
            "    </TABLE></TD>\n" +
            "  </TR>\n" +
            "</TABLE>\n";
                
        return html + temp;
    }
    
    public String addOwnerDrillerSectionToHtml(String html) {
        String temp;
        
        temp = "<CENTER>" +
            "<TABLE WIDTH=\"550\">\n" +
            "  <TR>\n" +
            "    <TD colspan=\"2\" align=\"left\"><i>Owner/Driller: </i> <font size=\"2\" color=\"blue\">" + ownerDriller + "</FONT></TD>\n" +
            "  </TR>\n" +
            "</TABLE>\n" +
            "</CENTER>\n";
        return html + temp;
    }
    
    public String addWorkedBySectionToHtml(String html) {
        String temp;
        
        temp = "<CENTER>" +
            "<TABLE WIDTH=\"550\">\n" +
            "  <TR>\n" +
            "    <TD colspan=\"2\" align=\"left\"><i>Worked By: </i> <font size=\"2\" color=\"blue\">" + workedBy + "</FONT></TD>\n" +
            "  </TR>\n" +
            "</TABLE>\n" +
            "</CENTER>\n";
        return html + temp;
    }
    
    public String addFormationSectionToHtml(String html) {
        LookupCodes codes = new LookupCodes();
        String beginHtml;
        String formationHtml = "";
        String endHtml;
        
        beginHtml = "<CENTER>" +
            "<TABLE WIDTH=\"550\">\n" +
            "  <TR>\n" +
            "    <TD align=\"center\"><b>Formations</b></TD>\n" +
            "  </TR>\n" +
            "  <TR>\n" +
            "    <TD align=\"center\">\n" +
            "      <TABLE>\n";
        
        formationHtml = formationEntity.getFormations().stream().map((formation) -> "      <TR>\n" +
            "        <TD align=\"right\">" + String.valueOf(formation.getFromDepth()) + "</TD>\n" +
            "        <TD align=\"right\">" + (-1.0 == formation.getToDepth() ? "" : String.valueOf(formation.getToDepth())) + "</TD>\n" +
            "        <TD>" + formation.getFormationCode() + "</TD>\n" +
            "        <TD>" + formation.getFormationName() + "</TD>\n" +
            "      </TR>\n").reduce(formationHtml, String::concat);
        

        endHtml = "      </TABLE>\n" +
            "    </TD>\n" +
            "  </TR>\n" +
            "</TABLE>\n" +
            "  </TR>\n" +
            "</TABLE>\n" +
            "</CENTER>\n";
        
        return html + beginHtml + formationHtml + endHtml;
    }
    
    public String addSampleSectionToHtml(String html) {
        String beginHtml;
        String sampleHtml = "";
        String endHtml;
        String temp;
        
        beginHtml = "<CENTER>" +
            "<TABLE WIDTH=\"550\">\n" +
            "  <TR>\n" +
            "    <TD align=\"center\"><b>Samples</b></TD>\n" +
            "  </TR>\n" +
            "  <TR>\n" +
            "    <TD align=\"center\">\n" +
            "      <TABLE>\n";
                
        for (SampleViewModel sample : sampleEntity.getSamples()) {
            temp = "";
            
            temp += "        <TD valign=\"top\" align=\"right\">" + String.format("%.2f", sample.getFromDepth()) + "</TD>\n" +
            "        <TD valign=\"top\" align=\"right\">" + String.format("%.2f", sample.getToDepth()) + "</TD>\n" +
            "        <TD>" + sample.getRockType();
            
            // Process "As Above"
            if (sample.getRockTypeCode().equals("V")) {
                temp += "        </TD></TR>\n";
                sampleHtml += temp;
                continue;
            }
            
            // Process "No Sample"
            if (sample.getRockTypeCode().equals("N")) {
                temp += "        </TD></TR>\n";
                sampleHtml += temp;
                continue;
            }
            
            // Process rock colors on line 1
            if (!sample.getRockColorCodeMin().equals("")) {
                temp += "; " + sample.getRockColorMin();
                String x = sample.getRockColorCodeMax();
                if (!sample.getRockColorCodeMax().equals("")) {
                    temp += " to " + sample.getRockColorMax();
                }
            }
            
            sampleHtml += temp;
            
            temp = getPorosityAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getAlterationAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getCrystallinityAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getGrainTypesAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getGrainSizeAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getRangeAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getRoundnessAndSphericityAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getIndurationAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getCementTypesAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getSedimentaryAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getAccessoryMineralsAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getFossilsAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = getCommentsAsRecord(sample);
            if (temp.length() > 0) {
                temp = "\n<br>" + temp;
                sampleHtml += temp;
            }
            
            temp = "        </TD>\n" +
            "      </TR>\n";
            
            sampleHtml += temp;
        }
        
        endHtml = "      </TABLE>\n" +
            "    </TD>\n" +
            "  </TR>\n" +
            "</TABLE>\n" +
            "  </TR>\n" +
            "</TABLE>\n" +
            "</CENTER>\n";
        
        return html + beginHtml + sampleHtml + endHtml;
    }
    
    public String addHtmlFooter(String html) {
        String temp = "</BODY>" +
            "</HTML>";
        return html + temp;
    }
    
    private String getPorosityAsRecord(SampleViewModel sample) {
        String temp = "";
        int count = 0;
        
        if (sample.getPorosity() != -1) {
            temp = String.valueOf(sample.getPorosity()) + "% Porosity";
        }

        if (sample.getPorosityCodes().size() > 0) {
            if (sample.getPorosity() != -1) temp += ": ";
            
            for (String value : sample.getPorosityValues()) {
                if (count++ > 0) temp += ", ";
                temp += value;
            }
        }

        return temp;
    }
    
    private String getAlterationAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getAlterationCode().equals("")) {
            temp += sample.getAlteration();
            temp += " Altered";
        }

        return temp;
    }
    
    private String getCrystallinityAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getCrystallinityCode().equals("")) {
            temp += "Crystallinity: ";
            temp += sample.getCrystallinity();
        }

        return temp;
    }
    
    private String getGrainTypesAsRecord(SampleViewModel sample) {
        String temp = "";
        int count = 0;
        
        if (sample.getGrainTypeCodes().size() > 0) {
            temp = "Grain Type(s): ";
            for (String grainType : sample.getGrainTypes()) {
                if (count++ > 0) temp += ", ";
                temp += grainType;
            }
        }

        return temp;
    }
    
    private String getGrainSizeAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getGrainSizeCode().equals("")) {
            temp = "Grain Size: ";
            temp += sample.getGrainSize();
        }

        return temp;
    }
    
    private String getRangeAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getGrainRangeCodeMin().equals("")) {
            temp = "Range: ";
            temp += sample.getGrainRangeMin();
        }

        if (!sample.getGrainRangeCodeMax().equals("")) {
            temp += " to ";
            temp += sample.getGrainRangeMax();
        }

        return temp;
    }
    
    private String getRoundnessAndSphericityAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getRoundnessCodeMin().equals("")) {
            temp = "Roundness: ";
            temp += sample.getRoundnessMin();
        }
        
        if (!sample.getRoundnessCodeMax().equals("")) {
            temp += " to ";
            temp += sample.getRoundnessMax();
        }
        
        if (!sample.getSphericityCode().equals("")) {
            if (!sample.getRoundnessCodeMin().equals("")) temp += "; ";
            temp += sample.getSphericity();
            temp += " Sphericity";
        }

        return temp;
    }
    
    private String getIndurationAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getIndurationCode().equals("")) {
            temp += sample.getInduration();
            temp += " Induration";
        }

        return temp;
    }
    
    private String getCementTypesAsRecord(SampleViewModel sample) {
        String temp = "";
        int count = 0;
        
        if (sample.getCementTypeCodes().size() > 0) {
            temp = "Cement Type(s): ";
            for (String cementType : sample.getCementTypes()) {
                if (count++ > 0) temp += ", ";
                temp += cementType;
            }
        }

        return temp;
    }
    
    private String getSedimentaryAsRecord(SampleViewModel sample) {
        String temp = "";
        int count = 0;
        
        if (sample.getSedimentaryCodes().size() > 0) {
            temp = "Sedimentary: ";
            for (String value : sample.getSedimentaryValues()) {
                if (count++ > 0) temp += ", ";
                temp += value;
            }
        }

        return temp;
    }
    
    private String getAccessoryMineralsAsRecord(SampleViewModel sample) {
        String temp = "";
        int count = 0;
        
        if (sample.getAccessoryMineralCodes().size() > 0) {
            temp = "Accessory Minerals(s): ";
            for (MineralViewModel mineral : sample.getAccessoryMinerals()) {
                if (count++ > 0) temp += ", ";
                temp += mineral.getName();
                temp += " (";
                temp += String.valueOf(String.format("%.2f", mineral.getPercentage()));
                temp += "%)";
            }
        }

        return temp;
    }
    
    private String getFossilsAsRecord(SampleViewModel sample) {
        String temp = "";
        int count = 0;
        
        if (sample.getFossilCodes().size() > 0) {
            temp = "Fossil(s): ";
            for (String fossil : sample.getFossils()) {
                if (count++ > 0) temp += ", ";
                temp += fossil;
            }
        }

        return temp;
    }
    
    private String getCommentsAsRecord(SampleViewModel sample) {
        String temp = "";
                
        if (!sample.getComments().isEmpty()) {
            temp = "Comment(s): " + sample.getComments();
        }

        return temp;
    }
    
    public String getCompletionDate() {
        String completionDate;
        
        completionDate = String.format("%02d", completionDateYear);
        completionDate += String.format("%02d", completionDateMonth);
        completionDate += String.format("%02d", completionDateDay);
            
        return completionDate;
    }
    
    @Override
    public String toString() {
        return "W-" + String.valueOf(wellLogNumber);
    }
}
