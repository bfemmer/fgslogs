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

import java.util.HashMap;

/**
 *
 * @author bfemmer
 */
public class LookupCodes {
    private HashMap<String,String> rockTypeMap;
    private HashMap<String,String> porosityCodeMap;
    private HashMap<String,String> grainSizeCodeMap;
    private HashMap<String,String> roundnessCodeMap;
    private HashMap<String,String> sphericityCodeMap;
    private HashMap<String,String> grainTypeCodeMap;
    private HashMap<String,String> alterationCodeMap;
    private HashMap<String,String> crystallinityCodeMap;
    private HashMap<String,String> indurationCodeMap;
    private HashMap<String,String> cementCodeMap;
    private HashMap<String,String> sedimentaryCodeMap;
    private HashMap<String,String> featureCodeMap;
    private HashMap<String,String> fossilCodeMap;
    private HashMap<String,String> colorCodeMap;
    private HashMap<String,String> geoLogCodeMap;
    private HashMap<String,String> countyCodeMap;
    private HashMap<String,String> mineralCodeMap;
    private HashMap<String,String> formationCodeMap;
    
    public LookupCodes() {
        rockTypeMap = new HashMap<>();
        porosityCodeMap = new HashMap<>();
        grainSizeCodeMap = new HashMap<>();
        roundnessCodeMap = new HashMap<>();
        sphericityCodeMap = new HashMap<>();
        grainTypeCodeMap = new HashMap<>();
        alterationCodeMap = new HashMap<>();
        crystallinityCodeMap = new HashMap<>();
        indurationCodeMap = new HashMap<>();
        cementCodeMap = new HashMap<>();
        sedimentaryCodeMap = new HashMap<>();
        featureCodeMap = new HashMap<>();
        fossilCodeMap = new HashMap<>();
        colorCodeMap = new HashMap<>();
        geoLogCodeMap = new HashMap<>();
        countyCodeMap = new HashMap<>();
        mineralCodeMap = new HashMap<>();
        formationCodeMap = new HashMap<>();
        
        initializeRockTypeMap();
        initializePorosityCodeMap();
        initializeGrainSizeCodeMap();
        initializeRoundnessCodeMap();
        initializeSphericityCodeMap();
        initializeGrainTypeCodeMap();
        initializeAlterationCodeMap();
        initializeCrystallinityCodeMap();
        initializeIndurationCodeMap();
        initializeCementCodeMap();
        initializeSedimentaryCodeMap();
        initializeFeatureCodeMap();
        initializeFossileCodeMap();
        initializeColorCodeMap();
        initializeGeoLogCodeMap();
        initializeCountyCodeMap();
        initializeMineralCodeMap();
        initializeFormationCodeMap();
    }
    
    private void initializeFormationCodeMap() {
        formationCodeMap.put("Error", "Incorrect Formation Code");
        formationCodeMap.put("000FILL", "Fill");
        formationCodeMap.put("000NOPK", "No Pick");
        formationCodeMap.put("000NOSM", "No Samples");
        formationCodeMap.put("090UDSC", "Undifferentiated Sand and Clay");
        formationCodeMap.put("090UDSS", "Undifferentiated Sand, Clay, and Shells");
        formationCodeMap.put("111LKFL", "Lake Flirt Marl");
        formationCodeMap.put("112ALDG", "Ayers Landing Marl Member of Caloosahatchee Fm.");
        formationCodeMap.put("112ANSS", "Anastsia Fm.");
        formationCodeMap.put("112BBRC", "Bee Branch Member of Caloosahatchee Fm.");
        formationCodeMap.put("112BRDN", "Brandy Wine Fm.");
        formationCodeMap.put("112CEMH", "Coffee Mill Hammock Member of the Ft. Thompson Fm.");
        formationCodeMap.put("112CLSC", "Caloosahatchee Fm.");
        formationCodeMap.put("112FDND", "Ft. Denaud Member of Caloosahatchee Fm.");
        formationCodeMap.put("112FTMP", "Fort Thompson Fm.");
        formationCodeMap.put("112KLRG", "Key Largo Limestone");
        formationCodeMap.put("112LBLL", "La Belle Clay Member of Tamiami Fm.");
        formationCodeMap.put("112MIMI", "Miami Limestone");
        formationCodeMap.put("112OKKC", "Okaloakoochee Member of Ft. Thompson Fm.");
        formationCodeMap.put("112PLSC", "Pleistocene Sands");
        formationCodeMap.put("112TRSD", "Terrace Sands");
        formationCodeMap.put("121CRNL", "Citronelle Fm");
        formationCodeMap.put("121CYPR", "Cypress Head Fm.");
        formationCodeMap.put("121NASH", "Nashua");
        formationCodeMap.put("121PCPC", "Pliocene- Pleistocene");
        formationCodeMap.put("121PLCN", "Pliocene");
        formationCodeMap.put("122ALCH", "Alachua Fm.");
        formationCodeMap.put("122ALVA", "Alva Clay Member of Tamiami Fm.");
        formationCodeMap.put("122AMBF", "Alum Bluff Group");
        formationCodeMap.put("122ARCA", "Arcadia Fm.");
        formationCodeMap.put("122BCCK", "Bruce Creek Limestone");
        formationCodeMap.put("122BKGM", "Buckingham Limestone of Tamiami Fm.");
        formationCodeMap.put("122BNVL", "Bone Valley Member of Peace River Fm.");
        formationCodeMap.put("122BYSR", "Bayshore Member of Tamiami Fm.");
        formationCodeMap.put("122CCTC", "Choctawhatchee Fm.");
        formationCodeMap.put("122CHAR", "Charlton Member of Coosawhatchie Fm.");
        formationCodeMap.put("122CHPL", "Chipola Fm.");
        formationCodeMap.put("122COOS", "Coosawhatchie Fm.");
        formationCodeMap.put("122CRLN", "Charlton Fm.");
        formationCodeMap.put("122CTTC", "Chattahoochee Fm.");
        formationCodeMap.put("122DPLN", "Duplin Marl");
        formationCodeMap.put("122ECMB", "Escambia Sand Member of Pensacola Clay");
        formationCodeMap.put("122FRPR", "Fort Preston Fm.");
        formationCodeMap.put("122HTRN", "Hawthorn Group");
        formationCodeMap.put("122ITCL", "Intercoastal Limestone");
        formationCodeMap.put("122JKBL", "Jackson Bluff Fm.");
        formationCodeMap.put("122LBVL", "Lower Bone Valley");
        formationCodeMap.put("122MCKS", "Mudrock Station Member of Tamiami Fm.");
        formationCodeMap.put("122MCSK", "Miccosukee Fm.");
        formationCodeMap.put("122MKHD", "Markshead Fm.");
        formationCodeMap.put("122MOCN", "Miocene");
        formationCodeMap.put("122NOCA", "Nocatee Member of Arcadia Fm.");
        formationCodeMap.put("122OCHP", "Ochopee Limestone Member of Tamiami Fm.");
        formationCodeMap.put("122OKGV", "Oak Grove Sand Member of Shoal River Fm.");
        formationCodeMap.put("122ORTN", "Ortona Sand Member of Tamiami Fm.");
        formationCodeMap.put("122PCRS", "Pinecrest Sand");
        formationCodeMap.put("122PCRV", "Peace River Fm.");
        formationCodeMap.put("122PNFM", "Penney Farms Fm.");
        formationCodeMap.put("122PSCL", "Pensacola Clay");
        formationCodeMap.put("122RDBY", "Red Bay Fm.");
        formationCodeMap.put("122SLRV", "Shoal River Fm.");
        formationCodeMap.put("122SMRK", "St. Marks Fm.");
        formationCodeMap.put("122STAT", "Statenville Fm.");
        formationCodeMap.put("122STJO", "St. Joe Limestone");
        formationCodeMap.put("122TAMP", "Tampa Member of Arcadia Fm.");
        formationCodeMap.put("122TMIM", "Tamiami Fm.");
        formationCodeMap.put("122TORR", "Torreya Fm");
        formationCodeMap.put("122TRYA", "Torreya Fm.");
        formationCodeMap.put("122UBVL", "Upper Bone Valley");
        formationCodeMap.put("122YLRV", "Yellow River Fm.");
        formationCodeMap.put("123BCTN", "Bucatunna Clay Memebr of Byram Fm.");
        formationCodeMap.put("123BYRM", "Byram Fm.");
        formationCodeMap.put("123CKHY", "Chickasawhay Limestone");
        formationCodeMap.put("123DCCC", "Duncan Church Beds Member of Suwanee Limestone");
        formationCodeMap.put("123MRNN", "Marianna Limestone");
        formationCodeMap.put("123OLGC", "Oligocene");
        formationCodeMap.put("123SWNN", "Suwannee Limestone");
        formationCodeMap.put("124AVPK", "Avon Park Fm.");
        formationCodeMap.put("124BPNS", "Bumpnose Member of Crystal River Fm.");
        formationCodeMap.put("124BSHI", "Bashi Marl Member of Hatchetigbee Fm.");
        formationCodeMap.put("124CLBR", "Claiborne");
        formationCodeMap.put("124CLRV", "Crystal River Fm.");
        formationCodeMap.put("124EOCN", "Eocene");
        formationCodeMap.put("124HCGB", "Hatchetigbee");
        formationCodeMap.put("124IGLS", "Inglis Fm.");
        formationCodeMap.put("124LKCT", "Lake City Limestone");
        formationCodeMap.put("124LSBN", "Lisbon Fm.");
        formationCodeMap.put("124OCAL", "Ocala Group");
        formationCodeMap.put("124OLDM", "Oldsmar Limestone");
        formationCodeMap.put("124STNC", "Steinhatchee Dolomite Member of Crystal River Fm.");
        formationCodeMap.put("124TLLS", "Tallahassee Limestone");
        formationCodeMap.put("124TLLT", "Tallahatta Formation");
        formationCodeMap.put("124WLCX", "Wilcox");
        formationCodeMap.put("124WLIG", "Williston-Inglis");
        formationCodeMap.put("124WLSN", "Williston Fm.");
        formationCodeMap.put("125CDRK", "Cedar Keys Limestone");
        formationCodeMap.put("125MDWY", "Midway Fm.");
        formationCodeMap.put("125PLCN", "Paleocene");
        formationCodeMap.put("200MSZC", "Mesozoic");
        formationCodeMap.put("210CCJC", "Cretaceous-Jurassic");
        formationCodeMap.put("210FPRC", "Fort Pierce Fm.");
        formationCodeMap.put("211AKNS", "Atkinson Fm.");
        formationCodeMap.put("211ASTN", "Austin Group");
        formationCodeMap.put("211CDSD", "Card Sound Dolomite");
        formationCodeMap.put("211CRCS", "Upper Cretaceous");
        formationCodeMap.put("211EUTW", "Eutaw Fm.");
        formationCodeMap.put("211LCRS", "La Crosse Sandstone");
        formationCodeMap.put("211LWSN", "Lawson Limestone");
        formationCodeMap.put("211NVRR", "Navarro Group");
        formationCodeMap.put("211PLOT", "Pilot Sandstone Member of Tulcaloosa Fm.");
        formationCodeMap.put("211SELM", "Selma Group");
        formationCodeMap.put("211TSCL", "Tuscaloosa Fm.");
        formationCodeMap.put("211TYLR", "Taylor Group");
        formationCodeMap.put("217BGCP", "Big Cypress Group");
        formationCodeMap.put("217CRCS", "Lower Cretaceous");
        formationCodeMap.put("217DLRB", "Dollar Bay Fm.");
        formationCodeMap.put("217DTZL", "Dantzler Fm.");
        formationCodeMap.put("217FKBG", "Fredericksburg Group");
        formationCodeMap.put("217FRLK", "Ferry Lake Anhydrite");
        formationCodeMap.put("217GLDS", "Glades Group");
        formationCodeMap.put("217HSTN", "Hosston Fm.");
        formationCodeMap.put("217LKTF", "Lake Trafford Fm.");
        formationCodeMap.put("217MRST", "Mooringsport Fm");
        formationCodeMap.put("217NPLB", "Naples Bay Group");
        formationCodeMap.put("217OCRF", "Ocean Reef Group");
        formationCodeMap.put("217PGRD", "Punta Gorda Anhydrite");
        formationCodeMap.put("217PLXY", "Paluxy Fm.");
        formationCodeMap.put("217PNIS", "Pine Island Fm.");
        formationCodeMap.put("217RDSS", "Rodessa Fm.");
        formationCodeMap.put("217SDGV", "Sands and Gravels Undifferentiated");
        formationCodeMap.put("217SNLD", "Sunniland Limestone");
        formationCodeMap.put("217SNRZ", "Roberts Zone of Sunniland Limestone");
        formationCodeMap.put("217TRNT", "Trinity Group");
        formationCodeMap.put("217WSHT", "Washita Group");
        formationCodeMap.put("221CNVL", "Cotton Valley Group ");
        formationCodeMap.put("221DNKM", "Denkman Sandstone");
        formationCodeMap.put("221HSBK", "Buckner Member of Haynesville Fm.");
        formationCodeMap.put("221HSVL", "Haynesville Fm.");
        formationCodeMap.put("221JRSC", "Upper Jurassic");
        formationCodeMap.put("221LUNN", "Louann Salt");
        formationCodeMap.put("221NRPL", "Norphlet Sandstone");
        formationCodeMap.put("221SMKV", "Smackover Fm.");
        formationCodeMap.put("221WRNR", "Werner Anhydrite");
        formationCodeMap.put("230BSLT", "Basalt");
        formationCodeMap.put("230DIBS", "Diabase");
        formationCodeMap.put("230ELML", "Eagle Mills Formation");
        formationCodeMap.put("230RYLT", "Rhyolite");
        formationCodeMap.put("230TRSC", "Triassic");
        formationCodeMap.put("230TUFF", "Tuff");
        formationCodeMap.put("231NWRK", "Newark Group");
        formationCodeMap.put("231TRSC", "Upper Triassic");
        formationCodeMap.put("300PLZC", "Paleozoic");
        formationCodeMap.put("340DVNN", "Devonian");
        formationCodeMap.put("350SLRN", "Silurian");
        formationCodeMap.put("360ODVC", "Ordovician");
        formationCodeMap.put("367ODVC", "Lower Ordovician");
        formationCodeMap.put("370CMBR", "Cambrian");
        formationCodeMap.put("400BCGR", "Biotitic Granite");
        formationCodeMap.put("400GRNT", "Granite");
        formationCodeMap.put("400HBDD", "Hornblende Diorite");
        formationCodeMap.put("400PCMB", "Precambrian");
    }
    
    private void initializeMineralCodeMap() {
        mineralCodeMap.put("A", "Anhydrite");
        mineralCodeMap.put("B", "Chert");
        mineralCodeMap.put("C", "Clay");
        mineralCodeMap.put("D", "Dolomite");
        mineralCodeMap.put("E", "Calcite");
        mineralCodeMap.put("F", "Feldspar");
        mineralCodeMap.put("G", "Gypsum");
        mineralCodeMap.put("H", "Heavy Minerals");
        mineralCodeMap.put("I", "Iron Stain");
        mineralCodeMap.put("J", "Mica");
        mineralCodeMap.put("K", "Glauconite");
        mineralCodeMap.put("L", "Limestone");
        mineralCodeMap.put("M", "Calcilutite");
        mineralCodeMap.put("N", "Manganese Oxide");
        mineralCodeMap.put("O", "Limonite");
        mineralCodeMap.put("P", "Pyrite");
        mineralCodeMap.put("Q", "Quartz");
        mineralCodeMap.put("R", "Spar");
        mineralCodeMap.put("S", "Quartz Sand");
        mineralCodeMap.put("T", "Silt");
        mineralCodeMap.put("U", "Peat");
        mineralCodeMap.put("V", "Hematite");
        mineralCodeMap.put("W", "Plant Remains");
        mineralCodeMap.put("X", "Phosphatic Gravel");
        mineralCodeMap.put("Y", "Phosphatic Sand");
        mineralCodeMap.put("Z", "Shale");
        mineralCodeMap.put("1", "Shell");
        mineralCodeMap.put("2", "Organics");
        mineralCodeMap.put("3", "Silt-Size Dolomite");
        mineralCodeMap.put("4", "Calcarenite");
    }
    
    private void initializeRockTypeMap() {
        rockTypeMap.put("A", "Anhydrite");
        rockTypeMap.put("B", "Chert");
        rockTypeMap.put("C", "Clay");
        rockTypeMap.put("D", "Dolostone");
        rockTypeMap.put("E", "Calcarenite");
        rockTypeMap.put("F", "Shell Bed");
        rockTypeMap.put("G", "Gypsum");
        rockTypeMap.put("H", "Shale");
        rockTypeMap.put("I", "Silt-Size Dolostone");
        rockTypeMap.put("J", "Peat");
        rockTypeMap.put("K", "Chalk");
        rockTypeMap.put("L", "Limestone");
        rockTypeMap.put("M", "Calcilutite");
        rockTypeMap.put("N", "No Sample");
        rockTypeMap.put("O", "Orthoquartzite");
        rockTypeMap.put("P", "Phosphate");
        rockTypeMap.put("Q", "Quartzite");
        rockTypeMap.put("R", "Gravel");
        rockTypeMap.put("S", "Sand");
        rockTypeMap.put("T", "Silt");
        rockTypeMap.put("U", "Arkose");
        rockTypeMap.put("V", "As Above");
        rockTypeMap.put("W", "Sandstone");
        rockTypeMap.put("X", "Igneous");
        rockTypeMap.put("Y", "Metamorphic");
        rockTypeMap.put("Z", "Comments");
        rockTypeMap.put("1", "Grainstone");
        rockTypeMap.put("2", "Packstone");
        rockTypeMap.put("3", "Wackestone");
        rockTypeMap.put("4", "Mudstone");
    }

    private void initializePorosityCodeMap() {
        porosityCodeMap.put("A", "Intragranular");
        porosityCodeMap.put("F", "Fracture");
        porosityCodeMap.put("I", "Intergranular");
        porosityCodeMap.put("L", "Low Permeability");
        porosityCodeMap.put("M", "Moldic");
        porosityCodeMap.put("N", "Not Observed");
        porosityCodeMap.put("P", "Pin Point Vugs");
        porosityCodeMap.put("V", "Vugular");
        porosityCodeMap.put("X", "Intercrystalline");
        porosityCodeMap.put("Y", "Possibly High Permeability");
    }
    
    private void initializeGrainSizeCodeMap() {
        getGrainSizeCodeMap().put("C", "Coarse");
        getGrainSizeCodeMap().put("F", "Fine");
        getGrainSizeCodeMap().put("G", "Granule");
        getGrainSizeCodeMap().put("L", "Very Course");
        getGrainSizeCodeMap().put("M", "Medium");
        getGrainSizeCodeMap().put("O", "Microcrystalline");
        getGrainSizeCodeMap().put("R", "Gravel");
        getGrainSizeCodeMap().put("T", "Lithographic");
        getGrainSizeCodeMap().put("V", "Very Fine");
        getGrainSizeCodeMap().put("X", "Cryptocrystalline");
    }
    
    private void initializeRoundnessCodeMap() {
        getRoundnessCodeMap().put("A", "Angular");
        getRoundnessCodeMap().put("R", "Rounded");
        getRoundnessCodeMap().put("S", "Sub-Angular");
        getRoundnessCodeMap().put("U", "Sub-Rounded");
        getRoundnessCodeMap().put("W", "Well-Rounded");
    }
    
    private void initializeSphericityCodeMap() {
        getSphericityCodeMap().put("H", "High");
        getSphericityCodeMap().put("L", "Low");
        getSphericityCodeMap().put("M", "Medium");
    }
    
    private void initializeGrainTypeCodeMap() {
        getGrainTypeCodeMap().put("B", "Biogenic");
        getGrainTypeCodeMap().put("C", "Crystals");
        getGrainTypeCodeMap().put("I", "Intraclasts");
        getGrainTypeCodeMap().put("M", "Calcilutite");
        getGrainTypeCodeMap().put("O", "Oolite");
        getGrainTypeCodeMap().put("P", "Pellet");
        getGrainTypeCodeMap().put("S", "Skeletal");
        getGrainTypeCodeMap().put("X", "Oolite Clast");
        getGrainTypeCodeMap().put("Y", "Pellet Cast");
        getGrainTypeCodeMap().put("Z", "Skeletal Cast");
    }
    
    private void initializeAlterationCodeMap() {
        getAlterationCodeMap().put("C", "90 - 100%");
        getAlterationCodeMap().put("H", "50 - 90%");
        getAlterationCodeMap().put("M", "10 - 50%");
        getAlterationCodeMap().put("L", "0 - 10%");
    }
    
    private void initializeCrystallinityCodeMap() {
        getCrystallinityCodeMap().put("E", "Euhedral");
        getCrystallinityCodeMap().put("S", "Subhedral");
        getCrystallinityCodeMap().put("A", "Anhedral");
        getCrystallinityCodeMap().put("F", "Fibrous");
    }
    
    private void initializeIndurationCodeMap() {
        indurationCodeMap.put("G", "Good");
        indurationCodeMap.put("M", "Moderate");
        indurationCodeMap.put("P", "Poor");
        indurationCodeMap.put("U", "Unconsolidated");
    }
    
    private void initializeCementCodeMap() {
        cementCodeMap.put("A", "Anhydrite");
        cementCodeMap.put("C", "Clay Matrix");
        cementCodeMap.put("D", "Dolomite");
        cementCodeMap.put("G", "Gypsum");
        cementCodeMap.put("H", "Chalcedony");
        cementCodeMap.put("I", "Iron");
        cementCodeMap.put("M", "Calcilutite Matrix");
        cementCodeMap.put("O", "Organic Matrix");
        cementCodeMap.put("P", "Phosphate");
        cementCodeMap.put("Q", "Silicic");
        cementCodeMap.put("R", "Sparry Calcite");
    }
    
    private void initializeSedimentaryCodeMap() {
        sedimentaryCodeMap.put("B", "Banded");
        sedimentaryCodeMap.put("C", "Brecciated");
        sedimentaryCodeMap.put("D", "Bedded");
        sedimentaryCodeMap.put("F", "Fissile");
        sedimentaryCodeMap.put("G", "Graded Bedding");
        sedimentaryCodeMap.put("I", "Interbedded");
        sedimentaryCodeMap.put("L", "Laminated");
        sedimentaryCodeMap.put("M", "Mottled");
        sedimentaryCodeMap.put("N", "Nodular");
        sedimentaryCodeMap.put("S", "Streaked");
        sedimentaryCodeMap.put("T", "Bioturbated");
        sedimentaryCodeMap.put("V", "Massive");
        sedimentaryCodeMap.put("X", "Cross-Bedded");
        sedimentaryCodeMap.put("Y", "Stylolitic");
    }
    
    private void initializeFeatureCodeMap() {
        featureCodeMap.put("A", "Calcareous");
        featureCodeMap.put("B", "Brown Anhydrite Crystals");
        featureCodeMap.put("C", "Coquina");
        featureCodeMap.put("D", "Dolomitic");
        featureCodeMap.put("E", "Poor Sample");
        featureCodeMap.put("F", "Frosted");
        featureCodeMap.put("G", "Granular");
        featureCodeMap.put("H", "High Crystallization");
        featureCodeMap.put("I", "Platy");
        featureCodeMap.put("J", "Plastic");
        featureCodeMap.put("K", "Chalky");
        featureCodeMap.put("L", "Low Recrystallization");
        featureCodeMap.put("M", "Medium Recrystallization");
        featureCodeMap.put("N", "Splintery");
        featureCodeMap.put("P", "Partings");
        featureCodeMap.put("Q", "Speckled");
        featureCodeMap.put("R", "Reefal");
        featureCodeMap.put("S", "Sucrosic");
        featureCodeMap.put("T", "Unwashed Sample");
        featureCodeMap.put("U", "Muddy");
        featureCodeMap.put("V", "Variegated");
        featureCodeMap.put("W", "Weathered");
        featureCodeMap.put("X", "Varved");
        featureCodeMap.put("Y", "Greasy");
        featureCodeMap.put("Z", "Stromatal");
        featureCodeMap.put("0", "Crystalline");
        featureCodeMap.put("1", "Fossiliferous");
    }
    
    private void initializeFossileCodeMap() {
        fossilCodeMap.put("A", "Algae");
        fossilCodeMap.put("B", "Bryozoa");
        fossilCodeMap.put("C", "Coral");
        fossilCodeMap.put("D", "Brachiopod");
        fossilCodeMap.put("E", "Echinoid");
        fossilCodeMap.put("K", "Oolites");
        fossilCodeMap.put("L", "Miliolids");
        fossilCodeMap.put("M", "Mollusks");
        fossilCodeMap.put("N", "Cones");
        fossilCodeMap.put("O", "Ostracods");
        fossilCodeMap.put("P", "Plant Remains");
        fossilCodeMap.put("R", "Rudistids");
        fossilCodeMap.put("S", "Spicules");
        fossilCodeMap.put("F", "Benthic Foraminifera");
        fossilCodeMap.put("G", "Crustacea");
        fossilCodeMap.put("H", "Plankton Foraminifera");
        fossilCodeMap.put("I", "Diatoms");
        fossilCodeMap.put("J", "Barnacles");
        fossilCodeMap.put("T", "Sharks Teeth");
        fossilCodeMap.put("U", "No Fossils");
        fossilCodeMap.put("V", "Vertebrate");
        fossilCodeMap.put("W", "Worm Traces");
        fossilCodeMap.put("X", "Fossil Fragments");
        fossilCodeMap.put("Y", "Fossil Molds");
        fossilCodeMap.put("Z", "Organics");
    }
    
    private void initializeColorCodeMap() {
        colorCodeMap.put("1", "Transparent");
        colorCodeMap.put("2", "Light Greyish Red");
        colorCodeMap.put("3", "Grayish Red");
        colorCodeMap.put("4", "Blackish Red");
        colorCodeMap.put("5", "Moderate Pink");
        colorCodeMap.put("6", "Moderate Red");
        colorCodeMap.put("7", "Dark Grayish Red");
        colorCodeMap.put("8", "Light Red");
        colorCodeMap.put("9", "Moderate Red");
        colorCodeMap.put("10", "Very Dark Red");
        colorCodeMap.put("11", "Grayish Orange Pink");
        colorCodeMap.put("12", "Light Grayish Red");
        colorCodeMap.put("13", "Grayish Brown Red");
        colorCodeMap.put("14", "Dark Brownish Red");
        colorCodeMap.put("15", "Moderate Orange Pink");
        colorCodeMap.put("16", "Light Reddish Brown");
        colorCodeMap.put("17", "Dark Reddish Brown");
        colorCodeMap.put("18", "Moderate Reddish Orange");
        colorCodeMap.put("19", "Moderate Reddish Brown");
        colorCodeMap.put("20", "Grayish Orange Pink");
        colorCodeMap.put("21", "Light Grayish Brown");
        colorCodeMap.put("22", "Grayish Brown");
        colorCodeMap.put("23", "Dark Brown");
        colorCodeMap.put("24", "Moderate Orange Pink");
        colorCodeMap.put("25", "Light Brown");
        colorCodeMap.put("26", "Moderate Brown");
        colorCodeMap.put("27", "Moderate Brown");
        colorCodeMap.put("28", "Light Brown");
        colorCodeMap.put("29", "Very Light Orange");
        colorCodeMap.put("30", "Grayish Brown");
        colorCodeMap.put("31", "Dark Yellowish Brown");
        colorCodeMap.put("32", "Dark Yellowish Brown");
        colorCodeMap.put("33", "Grayish Orange");
        colorCodeMap.put("34", "Moderate Yellowish Brown");
        colorCodeMap.put("35", "Light Yellowish Orange");
        colorCodeMap.put("36", "Dark Yellowish Orange");
        colorCodeMap.put("37", "Yellowish Gray");
        colorCodeMap.put("38", "Light Olive Gray");
        colorCodeMap.put("39", "Olive Gray");
        colorCodeMap.put("40", "Grayish Yellow");
        colorCodeMap.put("41", "Dark Grayish Yellow");
        colorCodeMap.put("42", "Moderate Olive Brown");
        colorCodeMap.put("43", "Moderate Yellow");
        colorCodeMap.put("44", "Light Olive Brown");
        colorCodeMap.put("45", "Light Greenish Yellow");
        colorCodeMap.put("46", "Light Olive");
        colorCodeMap.put("47", "Grayish Olive");
        colorCodeMap.put("48", "Moderate Greenish Yellow");
        colorCodeMap.put("49", "Light Olive");
        colorCodeMap.put("50", "Dark Greenish Yellow");
        colorCodeMap.put("51", "Light Grayish Green");
        colorCodeMap.put("52", "Moderate Grayish Green");
        colorCodeMap.put("53", "Grayish Olive Green");
        colorCodeMap.put("54", "Moderate Yellowish Green");
        colorCodeMap.put("55", "Light Yellowish Green");
        colorCodeMap.put("56", "Grayish Green");
        colorCodeMap.put("57", "Dark Grayish Green");
        colorCodeMap.put("58", "Moderate Yellowish Green");
        colorCodeMap.put("59", "Dark Yellowish Green");
        colorCodeMap.put("60", "Light Grayish Green");
        colorCodeMap.put("61", "Grayish Green");
        colorCodeMap.put("62", "Dark Green");
        colorCodeMap.put("63", "Light Green");
        colorCodeMap.put("64", "Light Green");
        colorCodeMap.put("65", "Moderate Green");
        colorCodeMap.put("66", "Very Light Green");
        colorCodeMap.put("67", "Light Grayish Green");
        colorCodeMap.put("68", "Grayish Green");
        colorCodeMap.put("69", "Light Blue Green");
        colorCodeMap.put("70", "Grayish Blue Green");
        colorCodeMap.put("71", "Grayish Purple");
        colorCodeMap.put("72", "Very Dark Purple");
        colorCodeMap.put("73", "Light Reddish Purple");
        colorCodeMap.put("74", "Grayish Purple Red");
        colorCodeMap.put("75", "Dark Red Purple");
        colorCodeMap.put("76", "White");
        colorCodeMap.put("77", "Very Light Gray");
        colorCodeMap.put("78", "Light Gray");
        colorCodeMap.put("79", "Moderate Light Gray");
        colorCodeMap.put("80", "Moderate Gray");
        colorCodeMap.put("81", "Moderate Dark Gray");
        colorCodeMap.put("82", "Dark Gray");
        colorCodeMap.put("83", "Black");
        colorCodeMap.put("84", "Light Brownish Gray");
        colorCodeMap.put("85", "Brownish Gray");
        colorCodeMap.put("86", "Yellowish Gray");
        colorCodeMap.put("87", "Light Olive Gray");
        colorCodeMap.put("88", "Olive Gray");
        colorCodeMap.put("89", "Pinkish Gray");
        colorCodeMap.put("90", "Light Greenish Gray");
        colorCodeMap.put("91", "Greenish Gray");
        colorCodeMap.put("92", "Dark Greenish Gray");
        colorCodeMap.put("93", "Greenish Black");
        colorCodeMap.put("94", "Light Greenish Gray");
        colorCodeMap.put("95", "Greenish Gray");
        colorCodeMap.put("96", "Dark Greenish Gray");
        colorCodeMap.put("97", "Greenish Black");
        colorCodeMap.put("98", "Light Bluish Gray");
        colorCodeMap.put("99", "Moderate Bluish Gray");
        colorCodeMap.put("0A", "Red");
        colorCodeMap.put("0B", "Dark Red");
        colorCodeMap.put("0C", "Orangish Red");
        colorCodeMap.put("0D", "Light Orangish Red");
        colorCodeMap.put("0E", "Dark Orangish Red");
        colorCodeMap.put("0F", "Purplish Red");
        colorCodeMap.put("1A", "Orange");
        colorCodeMap.put("1B", "Light Orange");
        colorCodeMap.put("1C", "Dark Orange");
        colorCodeMap.put("1D", "Reddish Orange");
        colorCodeMap.put("1E", "Light Reddish Orange");
        colorCodeMap.put("1F", "Dark Reddish Orange");
        colorCodeMap.put("2A", "Yellow");
        colorCodeMap.put("2B", "Light Yellow");
        colorCodeMap.put("2C", "Dark Yellow");
        colorCodeMap.put("2D", "Greenish Yellow");
        colorCodeMap.put("2E", "Cream");
        colorCodeMap.put("2F", "Buff");
        colorCodeMap.put("3A", "Green");
        colorCodeMap.put("3B", "Yellowish Green");
        colorCodeMap.put("3C", "Bluish Green");
        colorCodeMap.put("3D", "Dark Bluish Green");
        colorCodeMap.put("3E", "Olive");
        colorCodeMap.put("3F", "Dark Olive");
        colorCodeMap.put("4A", "Blue");
        colorCodeMap.put("4B", "Light Blue");
        colorCodeMap.put("4C", "Dark Blue");
        colorCodeMap.put("4D", "Greenish Blue");
        colorCodeMap.put("4E", "Light Greenish Blue");
        colorCodeMap.put("4F", "Dark Greenish Blue");
        colorCodeMap.put("5A", "Brown");
        colorCodeMap.put("5B", "Tan");
        colorCodeMap.put("5C", "Light Tan");
        colorCodeMap.put("5D", "Dark Tan");
        colorCodeMap.put("5E", "Reddish Brown");
        colorCodeMap.put("5F", "Dark Grayish Brown");
        colorCodeMap.put("6A", "No Code");
        colorCodeMap.put("6B", "No Code");
        colorCodeMap.put("6C", "No Code");
        colorCodeMap.put("6D", "No Code");
        colorCodeMap.put("6E", "No Code");
        colorCodeMap.put("6F", "No Code");
        colorCodeMap.put("7A", "Gray");
        colorCodeMap.put("7B", "No Code");
        colorCodeMap.put("7C", "No Code");
        colorCodeMap.put("7D", "No Code");
        colorCodeMap.put("7E", "No Code");
        colorCodeMap.put("7F", "No Code");
        colorCodeMap.put("8A", "No Code");
        colorCodeMap.put("8B", "No Code");
        colorCodeMap.put("8C", "No Code");
        colorCodeMap.put("8D", "No Code");
        colorCodeMap.put("8E", "No Code");
        colorCodeMap.put("8F", "No Code");
        colorCodeMap.put("9A", "End Of Color List");
    }
    
    private void initializeGeoLogCodeMap() {
        geoLogCodeMap.put("A", "Time");
        geoLogCodeMap.put("B", "Video");
        geoLogCodeMap.put("C", "Caliper");
        geoLogCodeMap.put("E", "Electric");
        geoLogCodeMap.put("F", "Fluid Conductivity");
        geoLogCodeMap.put("G", "Geologist");
        geoLogCodeMap.put("H", "Magnetic");
        geoLogCodeMap.put("I", "Induction");
        geoLogCodeMap.put("J", "Gamma");
        geoLogCodeMap.put("K", "Dipmeter");
        geoLogCodeMap.put("L", "Laterlog");
        geoLogCodeMap.put("M", "Micro Laterlog");
        geoLogCodeMap.put("N", "Neutron");
        geoLogCodeMap.put("P", "Photo");
        geoLogCodeMap.put("Q", "Radio Activity");
        geoLogCodeMap.put("S", "Sonic");
        geoLogCodeMap.put("T", "Temperature");
        geoLogCodeMap.put("U", "Gamma-Gamma");
        geoLogCodeMap.put("V", "Fluid Velocity");
        geoLogCodeMap.put("Z", "Other");
    }
    
    private void initializeCountyCodeMap() {
        countyCodeMap.put("AA", "Alachua");
        countyCodeMap.put("BK", "Baker");
        countyCodeMap.put("BW", "Broward");
        countyCodeMap.put("BF", "Bradford");
        countyCodeMap.put("BV", "Brevard");
        countyCodeMap.put("BY", "Bay");
        countyCodeMap.put("CN", "Calhoun");
        countyCodeMap.put("CH", "Charlotte");
        countyCodeMap.put("CI", "Citrus");
        countyCodeMap.put("CY", "Clay");
        countyCodeMap.put("CO", "Columbia");
        countyCodeMap.put("CR", "Collier");
        countyCodeMap.put("DD", "Dade");
        countyCodeMap.put("DS", "Desoto");
        countyCodeMap.put("DX", "Dixie");
        countyCodeMap.put("DU", "Duval");
        countyCodeMap.put("ES", "Escambia");
        countyCodeMap.put("FG", "Flagler");
        countyCodeMap.put("FK", "Franklin");
        countyCodeMap.put("GA", "Gadsden");
        countyCodeMap.put("GR", "Gilchrist");
        countyCodeMap.put("GL", "Glades");
        countyCodeMap.put("GF", "Gulf");
        countyCodeMap.put("HD", "Hardee");
        countyCodeMap.put("HY", "Hendry");
        countyCodeMap.put("HI", "Highlands");
        countyCodeMap.put("HL", "Hillsborough");
        countyCodeMap.put("HM", "Hamilton");
        countyCodeMap.put("HO", "Holmes");
        countyCodeMap.put("HR", "Hernando");
        countyCodeMap.put("IR", "Indian River");
        countyCodeMap.put("JK", "Jackson");
        countyCodeMap.put("JF", "Jefferson");
        countyCodeMap.put("LF", "Lafayette");
        countyCodeMap.put("LB", "Liberty");
        countyCodeMap.put("LE", "Lee");
        countyCodeMap.put("LK", "Lake");
        countyCodeMap.put("LN", "Leon");
        countyCodeMap.put("LV", "Levy");
        countyCodeMap.put("MD", "Madison");
        countyCodeMap.put("MT", "Martin");
        countyCodeMap.put("MO", "Monroe");
        countyCodeMap.put("MR", "Marion");
        countyCodeMap.put("MN", "Manatee");
        countyCodeMap.put("NA", "Nassau");
        countyCodeMap.put("OE", "Okeechobee");
        countyCodeMap.put("OA", "Okaloosa");
        countyCodeMap.put("OR", "Orange");
        countyCodeMap.put("OS", "Osceola");
        countyCodeMap.put("PS", "Pasco");
        countyCodeMap.put("PB", "Palm Beach");
        countyCodeMap.put("PI", "Pinellas");
        countyCodeMap.put("PO", "Polk");
        countyCodeMap.put("PU", "Putnam");
        countyCodeMap.put("SA", "Sarasota");
        countyCodeMap.put("SE", "Seminole");
        countyCodeMap.put("SJ", "St Johns");
        countyCodeMap.put("SL", "St Lucie");
        countyCodeMap.put("SM", "Sumter");
        countyCodeMap.put("SR", "Santa Rosa");
        countyCodeMap.put("SW", "Suwannee");
        countyCodeMap.put("TY", "Taylor");
        countyCodeMap.put("UN", "Union");
        countyCodeMap.put("VO", "Volusia");
        countyCodeMap.put("WK", "Wakulla");
        countyCodeMap.put("WL", "Walton");
        countyCodeMap.put("WS", "Washington");
        countyCodeMap.put("OF", "Offshore");
    }

    /**
     * @return the rockTypeMap
     */
    public HashMap<String, String> getRockTypeMap() {
        return rockTypeMap;
    }

    /**
     * @param rockTypeMap the rockTypeMap to set
     */
    public void setRockTypeMap(HashMap<String, String> rockTypeMap) {
        this.rockTypeMap = rockTypeMap;
    }

    /**
     * @return the porosityCodeMap
     */
    public HashMap<String, String> getPorosityCodeMap() {
        return porosityCodeMap;
    }

    /**
     * @param porosityCodeMap the porosityCodeMap to set
     */
    public void setPorosityCodeMap(HashMap<String, String> porosityCodeMap) {
        this.porosityCodeMap = porosityCodeMap;
    }

    /**
     * @return the grainSizeCodeMap
     */
    public HashMap<String, String> getGrainSizeCodeMap() {
        return grainSizeCodeMap;
    }

    /**
     * @param grainSizeCodeMap the grainSizeCodeMap to set
     */
    public void setGrainSizeCodeMap(HashMap<String, String> grainSizeCodeMap) {
        this.grainSizeCodeMap = grainSizeCodeMap;
    }

    /**
     * @return the roundnessCodeMap
     */
    public HashMap<String, String> getRoundnessCodeMap() {
        return roundnessCodeMap;
    }

    /**
     * @param roundnessCodeMap the roundnessCodeMap to set
     */
    public void setRoundnessCodeMap(HashMap<String, String> roundnessCodeMap) {
        this.roundnessCodeMap = roundnessCodeMap;
    }

    /**
     * @return the sphericityCodeMap
     */
    public HashMap<String, String> getSphericityCodeMap() {
        return sphericityCodeMap;
    }

    /**
     * @param sphericityCodeMap the sphericityCodeMap to set
     */
    public void setSphericityCodeMap(HashMap<String, String> sphericityCodeMap) {
        this.sphericityCodeMap = sphericityCodeMap;
    }

    /**
     * @return the grainTypeCodeMap
     */
    public HashMap<String, String> getGrainTypeCodeMap() {
        return grainTypeCodeMap;
    }

    /**
     * @param grainTypeCodeMap the grainTypeCodeMap to set
     */
    public void setGrainTypeCodeMap(HashMap<String, String> grainTypeCodeMap) {
        this.grainTypeCodeMap = grainTypeCodeMap;
    }

    /**
     * @return the alterationCodeMap
     */
    public HashMap<String, String> getAlterationCodeMap() {
        return alterationCodeMap;
    }

    /**
     * @param alterationCodeMap the alterationCodeMap to set
     */
    public void setAlterationCodeMap(HashMap<String, String> alterationCodeMap) {
        this.alterationCodeMap = alterationCodeMap;
    }

    /**
     * @return the crystallinityCodeMap
     */
    public HashMap<String, String> getCrystallinityCodeMap() {
        return crystallinityCodeMap;
    }

    /**
     * @param crystallinityCodeMap the crystallinityCodeMap to set
     */
    public void setCrystallinityCodeMap(HashMap<String, String> crystallinityCodeMap) {
        this.crystallinityCodeMap = crystallinityCodeMap;
    }

    /**
     * @return the indurationCodeMap
     */
    public HashMap<String, String> getIndurationCodeMap() {
        return indurationCodeMap;
    }

    /**
     * @param indurationCodeMap the indurationCodeMap to set
     */
    public void setIndurationCodeMap(HashMap<String, String> indurationCodeMap) {
        this.indurationCodeMap = indurationCodeMap;
    }

    /**
     * @return the cementCodeMap
     */
    public HashMap<String, String> getCementCodeMap() {
        return cementCodeMap;
    }

    /**
     * @param cementCodeMap the cementCodeMap to set
     */
    public void setCementCodeMap(HashMap<String, String> cementCodeMap) {
        this.cementCodeMap = cementCodeMap;
    }

    /**
     * @return the sedimentaryCodeMap
     */
    public HashMap<String, String> getSedimentaryCodeMap() {
        return sedimentaryCodeMap;
    }

    /**
     * @param sedimentaryCodeMap the sedimentaryCodeMap to set
     */
    public void setSedimentaryCodeMap(HashMap<String, String> sedimentaryCodeMap) {
        this.sedimentaryCodeMap = sedimentaryCodeMap;
    }

    /**
     * @return the featureCodeMap
     */
    public HashMap<String, String> getFeatureCodeMap() {
        return featureCodeMap;
    }

    /**
     * @param featureCodeMap the featureCodeMap to set
     */
    public void setFeatureCodeMap(HashMap<String, String> featureCodeMap) {
        this.featureCodeMap = featureCodeMap;
    }

    /**
     * @return the fossilCodeMap
     */
    public HashMap<String, String> getFossilCodeMap() {
        return fossilCodeMap;
    }

    /**
     * @param fossilCodeMap the fossilCodeMap to set
     */
    public void setFossilCodeMap(HashMap<String, String> fossilCodeMap) {
        this.fossilCodeMap = fossilCodeMap;
    }

    /**
     * @return the colorCodeMap
     */
    public HashMap<String, String> getColorCodeMap() {
        return colorCodeMap;
    }

    /**
     * @param colorCodeMap the colorCodeMap to set
     */
    public void setColorCodeMap(HashMap<String, String> colorCodeMap) {
        this.colorCodeMap = colorCodeMap;
    }

    /**
     * @return the geoLogCodeMap
     */
    public HashMap<String, String> getGeoLogCodeMap() {
        return geoLogCodeMap;
    }

    /**
     * @param geoLogCodeMap the geoLogCodeMap to set
     */
    public void setGeoLogCodeMap(HashMap<String, String> geoLogCodeMap) {
        this.geoLogCodeMap = geoLogCodeMap;
    }

    /**
     * @return the countyCodeMap
     */
    public HashMap<String, String> getCountyCodeMap() {
        return countyCodeMap;
    }

    /**
     * @param countyCodeMap the countyCodeMap to set
     */
    public void setCountyCodeMap(HashMap<String, String> countyCodeMap) {
        this.countyCodeMap = countyCodeMap;
    }

    /**
     * @return the mineralCodeMap
     */
    public HashMap<String, String> getMineralCodeMap() {
        return mineralCodeMap;
    }

    /**
     * @param mineralCodeMap the mineralCodeMap to set
     */
    public void setMineralCodeMap(HashMap<String, String> mineralCodeMap) {
        this.mineralCodeMap = mineralCodeMap;
    }

    /**
     * @return the formationCodeMap
     */
    public HashMap<String, String> getFormationCodeMap() {
        return formationCodeMap;
    }

    /**
     * @param formationCodeMap the formationCodeMap to set
     */
    public void setFormationCodeMap(HashMap<String, String> formationCodeMap) {
        this.formationCodeMap = formationCodeMap;
    }
}
