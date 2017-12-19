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

package com.bfemmer.fgslogs.utility;

import com.bfemmer.fgslogs.model.WellLog;
import com.bfemmer.fgslogs.viewmodel.LookupCodes;
import com.bfemmer.fgslogs.viewmodel.MineralViewModel;
import com.bfemmer.fgslogs.viewmodel.SampleViewModel;

/**
 *
 * @author bemmer
 */
public class Html {
    private WellLog wellLog;
    
    public static String getHtmlReport(WellLog wellLog) {
        String html = createHtmlHeader();
        html = addSummaryAndLocationSectionToHtml(wellLog, html);
        html = addOwnerDrillerSectionToHtml(wellLog, html);
        html = addWorkedBySectionToHtml(wellLog, html);
        html = addFormationSectionToHtml(wellLog, html);
        html = addSampleSectionToHtml(wellLog, html);
        html = addHtmlFooter(wellLog, html);
        return html;
    }
    
    private static String createHtmlHeader() {
        String html = "<html lang=\"en\">\n" +
            "<head>\n" +
            "  <meta charset=\"utf-8\">\n" +
            "\n" +
            "  <title>Lithologic Well Log</title>\n" +
            "</head>\n" +
            "<body>\n";
                
        return html;
    }
    
    private static String addSummaryAndLocationSectionToHtml(WellLog wellLog, String html) {
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
            "        <TD align=\"right\"> <font color=\"blue\">W-" + wellLog.getWellLogNumber() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Total Depth (ft): </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + String.valueOf(wellLog.getTotalDepth()) + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD colspan=\"2\" align=\"center\"> <font color=\"blue\">" + String.valueOf(wellLog.getSampleCount()) + "</FONT> <i>sample(s) from</i> <font color=\"blue\">" + String.valueOf(wellLog.getFromDepth()) + "</FONT> <i>to</i> <font color=\"blue\">" + String.valueOf(wellLog.getToDepth()) + "</FONT> ft</TD>" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD></TD>" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Completion Date (YYMMDD): </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + getCompletionDate(wellLog) + "</FONT></TD>" +
            "      </TR>\n" +
            "    </TABLE></TD>\n" +
            "    <TD align=\"right\"><TABLE>\n" +
            "      <TR>\n" +
            "        <TD colspan=\"2\" align=\"center\"><b>Location Data</b></TD>" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>County: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + wellLog.getLocationEntity().getLocation().getCountyName() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>PLSS: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + wellLog.getLocationEntity().getLocation().getPLSSCode() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Latitude: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + wellLog.getLocationEntity().getLocation().getLatDMS() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Longitude: </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + wellLog.getLocationEntity().getLocation().getLongDMS() + "</FONT></TD>\n" +
            "      </TR>\n" +
            "      <TR>\n" +
            "        <TD><i>Elevation (ft): </i></TD>" +
            "        <TD align=\"right\"> <font color=\"blue\">" + String.valueOf(wellLog.getElevation()) + "</FONT></TD>\n" +
            "      </TR>\n" +
            "    </TABLE></TD>\n" +
            "  </TR>\n" +
            "</TABLE>\n";
                
        return html + temp;
    }
    
    private static String addOwnerDrillerSectionToHtml(WellLog wellLog, String html) {
        String temp;
        
        temp = "<CENTER>" +
            "<TABLE WIDTH=\"550\">\n" +
            "  <TR>\n" +
            "    <TD colspan=\"2\" align=\"left\"><i>Owner/Driller: </i> <font size=\"2\" color=\"blue\">" + wellLog.getOwnerDriller() + "</FONT></TD>\n" +
            "  </TR>\n" +
            "</TABLE>\n" +
            "</CENTER>\n";
        return html + temp;
    }
    
    private static String addWorkedBySectionToHtml(WellLog wellLog, String html) {
        String temp;
        
        temp = "<CENTER>" +
            "<TABLE WIDTH=\"550\">\n" +
            "  <TR>\n" +
            "    <TD colspan=\"2\" align=\"left\"><i>Worked By: </i> <font size=\"2\" color=\"blue\">" + wellLog.getWorkedBy() + "</FONT></TD>\n" +
            "  </TR>\n" +
            "</TABLE>\n" +
            "</CENTER>\n";
        return html + temp;
    }
    
    private static String addFormationSectionToHtml(WellLog wellLog, String html) {
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
        
        formationHtml = wellLog.getFormationEntity().getFormations().stream().map((formation) -> "      <TR>\n" +
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
    
    private static String addSampleSectionToHtml(WellLog wellLog, String html) {
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
                
        for (SampleViewModel sample : wellLog.getSampleEntity().getSamples()) {
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
    
    private static String addHtmlFooter(WellLog wellLog, String html) {
        String temp = "</BODY>" +
            "</HTML>";
        return html + temp;
    }
    
    private static String getPorosityAsRecord(SampleViewModel sample) {
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
    
    private static String getAlterationAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getAlterationCode().equals("")) {
            temp += sample.getAlteration();
            temp += " Altered";
        }

        return temp;
    }
    
    private static String getCrystallinityAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getCrystallinityCode().equals("")) {
            temp += "Crystallinity: ";
            temp += sample.getCrystallinity();
        }

        return temp;
    }
    
    private static String getGrainTypesAsRecord(SampleViewModel sample) {
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
    
    private static String getGrainSizeAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getGrainSizeCode().equals("")) {
            temp = "Grain Size: ";
            temp += sample.getGrainSize();
        }

        return temp;
    }
    
    private static String getRangeAsRecord(SampleViewModel sample) {
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
    
    private static String getRoundnessAndSphericityAsRecord(SampleViewModel sample) {
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
    
    private static String getIndurationAsRecord(SampleViewModel sample) {
        String temp = "";
        
        if (!sample.getIndurationCode().equals("")) {
            temp += sample.getInduration();
            temp += " Induration";
        }

        return temp;
    }
    
    private static String getCementTypesAsRecord(SampleViewModel sample) {
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
    
    private static String getSedimentaryAsRecord(SampleViewModel sample) {
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
    
    private static String getAccessoryMineralsAsRecord(SampleViewModel sample) {
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
    
    private static String getFossilsAsRecord(SampleViewModel sample) {
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
    
    private static String getCommentsAsRecord(SampleViewModel sample) {
        String temp = "";
                
        if (!sample.getComments().isEmpty()) {
            temp = "Comment(s): " + sample.getComments();
        }

        return temp;
    }
    
    private static String getCompletionDate(WellLog wellLog) {
        String completionDate;
        
        completionDate = String.format("%02d", wellLog.getCompletionDateDay());
        completionDate += String.format("%02d", wellLog.getCompletionDateMonth());
        completionDate += String.format("%02d", wellLog.getCompletionDateDay());
            
        return completionDate;
    }
}
