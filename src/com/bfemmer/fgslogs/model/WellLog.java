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
    private Location location;
    private List<Formation> formations;
    private List<Sample> samples;
    
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
        location = new Location();
        formations = new ArrayList<>();
        samples = new ArrayList<>();
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
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return the formations
     */
    public List<Formation> getFormations() {
        return formations;
    }

    /**
     * @param formations the formation to set
     */
    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }

    /**
     * @return the sample
     */
    public List<Sample> getSamples() {
        return samples;
    }

    /**
     * @param sample the sample to set
     */
    public void setSamples(List<Sample> sample) {
        this.samples = sample;
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
            "        <TD align=\"right\"> <font color=\"blue\">" + codes.getCountyCodeMap().get(location.getCountyCode()) + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>PLSS: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + location.getPLSSCode() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Latitude: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + location.getLatDMS() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Longitude: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + location.getLongDMS() + "</FONT></TD>\n" +
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
        
        formationHtml = formations.stream().map((formation) -> "      <TR>\n" +
            "        <TD align=\"right\">" + String.valueOf(formation.getFromDepth()) + "</TD>\n" +
            "        <TD align=\"right\">" + (-1.0 == formation.getToDepth() ? "" : String.valueOf(formation.getToDepth())) + "</TD>\n" +
            "        <TD>" + formation.getFormationCode() + "</TD>\n" +
            "        <TD>" + codes.getFormationCodeMap().get(formation.getFormationCode()) + "</TD>\n" +
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
        LookupCodes codes = new LookupCodes();
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
                
        for (Sample sample : samples) {
            temp = "";
            
            temp += "        <TD valign=\"top\" align=\"right\">" + String.format("%.2f", sample.getFromDepth()) + "</TD>\n" +
            "        <TD valign=\"top\" align=\"right\">" + String.format("%.2f", sample.getToDepth()) + "</TD>\n" +
            "        <TD>" + codes.getRockTypeMap().get(sample.getRockTypeCode());
            
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
                temp += "; " + codes.getColorCodeMap().get(sample.getRockColorCodeMin());
                String x = sample.getRockColorCodeMax();
                if (!sample.getRockColorCodeMax().equals("")) {
                    temp += " to " + codes.getColorCodeMap().get(sample.getRockColorCodeMax());
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
    
    private String getPorosityAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        int count = 0;
        
        if (sample.getPorosity() != -1) {
            temp = String.valueOf(sample.getPorosity()) + "% Porosity";
        }

        if (sample.getPorosityCodes().size() > 0) {
            if (sample.getPorosity() != -1) temp += ": ";
            
            for (String code : sample.getPorosityCodes()) {
                if (count++ > 0) temp += ", ";
                temp += codes.getPorosityCodeMap().get(code);
            }
        }

        return temp;
    }
    
    private String getAlterationAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        
        if (!sample.getAlterationCode().equals("")) {
            temp += codes.getAlterationCodeMap().get(sample.getAlterationCode());
            temp += " Altered";
        }

        return temp;
    }
    
    private String getCrystallinityAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        
        if (!sample.getCrystallinityCode().equals("")) {
            temp += "Crystallinity: ";
            temp += codes.getCrystallinityCodeMap().get(sample.getCrystallinityCode());
        }

        return temp;
    }
    
    private String getGrainTypesAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        int count = 0;
        
        if (sample.getGrainTypeCodes().size() > 0) {
            temp = "Grain Type(s): ";
            for (String code : sample.getGrainTypeCodes()) {
                if (count++ > 0) temp += ", ";
                temp += codes.getGrainTypeCodeMap().get(code);
            }
        }

        return temp;
    }
    
    private String getGrainSizeAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        
        if (!sample.getGrainSizeCode().equals("")) {
            temp = "Grain Size: ";
            temp += codes.getGrainSizeCodeMap().get(sample.getGrainSizeCode());
        }

        return temp;
    }
    
    private String getRangeAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        
        if (!sample.getGrainRangeMin().equals("")) {
            temp = "Range: ";
            temp += codes.getGrainSizeCodeMap().get(sample.getGrainRangeMin());
        }

        if (!sample.getGrainRangeMax().equals("")) {
            temp += " to ";
            temp += codes.getGrainSizeCodeMap().get(sample.getGrainRangeMax());
        }

        return temp;
    }
    
    private String getRoundnessAndSphericityAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        
        if (!sample.getRoundnessMin().equals("")) {
            temp = "Roundness: ";
            temp += codes.getRoundnessCodeMap().get(sample.getRoundnessMin());
        }
        
        if (!sample.getRoundnessMax().equals("")) {
            temp += " to ";
            temp += codes.getRoundnessCodeMap().get(sample.getRoundnessMax());
        }
        
        if (!sample.getSphericityCode().equals("")) {
            if (!sample.getRoundnessMin().equals("")) temp += "; ";
            temp += codes.getSphericityCodeMap().get(sample.getSphericityCode());
            temp += " Sphericity";
        }

        return temp;
    }
    
    private String getIndurationAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        
        if (!sample.getIndurationCode().equals("")) {
            temp += codes.getIndurationCodeMap().get(sample.getIndurationCode());
            temp += " Induration";
        }

        return temp;
    }
    
    private String getCementTypesAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        int count = 0;
        
        if (sample.getCementTypeCodes().size() > 0) {
            temp = "Cement Type(s): ";
            for (String code : sample.getCementTypeCodes()) {
                if (count++ > 0) temp += ", ";
                temp += codes.getCementCodeMap().get(code);
            }
        }

        return temp;
    }
    
    private String getSedimentaryAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        int count = 0;
        
        if (sample.getSedimentaryCodes().size() > 0) {
            temp = "Sedimentary: ";
            for (String code : sample.getSedimentaryCodes()) {
                if (count++ > 0) temp += ", ";
                temp += codes.getSedimentaryCodeMap().get(code);
            }
        }

        return temp;
    }
    
    private String getAccessoryMineralsAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        int count = 0;
        
        if (sample.getAccessoryMinerals().size() > 0) {
            temp = "Accessory Minerals(s): ";
            for (Mineral mineral : sample.getAccessoryMinerals()) {
                if (count++ > 0) temp += ", ";
                temp += codes.getMineralCodeMap().get(mineral.getCode());
                temp += " (";
                temp += String.valueOf(String.format("%.2f", mineral.getPercentage()));
                temp += "%)";
            }
        }

        return temp;
    }
    
    private String getFossilsAsRecord(Sample sample) {
        String temp = "";
        LookupCodes codes = new LookupCodes();
        int count = 0;
        
        if (sample.getFossilCodes().size() > 0) {
            temp = "Fossil(s): ";
            for (String code : sample.getFossilCodes()) {
                if (count++ > 0) temp += ", ";
                temp += codes.getFossilCodeMap().get(code);
            }
        }

        return temp;
    }
    
    private String getCommentsAsRecord(Sample sample) {
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
