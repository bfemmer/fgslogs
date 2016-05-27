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

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bfemmer
 */
public class LookupCodes {
    private Map rockTypeMap;
    private Map porosityCodeMap;
    private Map grainSizeCodeMap;
    private Map roundnessCodeMap;
    private Map sphericityCodeMap;
    private Map grainTypeCodeMap;
    private Map alterationCodeMap;
    private Map crystallinityCodeMap;
    private Map indurationCodeMap;
    private Map cementCodeMap;
    private Map sedimentaryCodeMap;
    private Map featureCodeMap;
    private Map fossilCodeMap;
    private Map colorCodeMap;
    private Map geoLogCodeMap;
    private Map countyCodeMap;
    private Map mineralCodeMap;
    private Map formationCodeMap;
    
    public LookupCodes() {
        rockTypeMap = new HashMap();
        porosityCodeMap = new HashMap();
        grainSizeCodeMap = new HashMap();
        roundnessCodeMap = new HashMap();
        sphericityCodeMap = new HashMap();
        grainTypeCodeMap = new HashMap();
        alterationCodeMap = new HashMap();
        crystallinityCodeMap = new HashMap();
        indurationCodeMap = new HashMap();
        cementCodeMap = new HashMap();
        sedimentaryCodeMap = new HashMap();
        featureCodeMap = new HashMap();
        fossilCodeMap = new HashMap();
        colorCodeMap = new HashMap();
        geoLogCodeMap = new HashMap();
        countyCodeMap = new HashMap();
        mineralCodeMap = new HashMap();
        formationCodeMap = new HashMap();
        
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
        getFormationCodeMap().put("Error", "Incorrect Formation Code");
        getFormationCodeMap().put("000FILL", "Fill");
        getFormationCodeMap().put("000NOPK", "No Pick");
        getFormationCodeMap().put("000NOSM", "No Samples");
        getFormationCodeMap().put("090UDSC", "Undifferentiated Sand and Clay");
        getFormationCodeMap().put("090UDSS", "Undifferentiated Sand, Clay, and Shells");
        getFormationCodeMap().put("111LKFL", "Lake Flirt Marl");
        getFormationCodeMap().put("112ALDG", "Ayers Landing Marl Member of Caloosahatchee Fm.");
        getFormationCodeMap().put("112ANSS", "Anastsia Fm.");
        getFormationCodeMap().put("112BBRC", "Bee Branch Member of Caloosahatchee Fm.");
        getFormationCodeMap().put("112BRDN", "Brandy Wine Fm.");
        getFormationCodeMap().put("112CEMH", "Coffee Mill Hammock Member of the Ft. Thompson Fm.");
        getFormationCodeMap().put("112CLSC", "Caloosahatchee Fm.");
        getFormationCodeMap().put("112FDND", "Ft. Denaud Member of Caloosahatchee Fm.");
        getFormationCodeMap().put("112FTMP", "Fort Thompson Fm.");
        getFormationCodeMap().put("112KLRG", "Key Largo Limestone");
        getFormationCodeMap().put("112LBLL", "La Belle Clay Member of Tamiami Fm.");
        getFormationCodeMap().put("112MIMI", "Miami Limestone");
        getFormationCodeMap().put("112OKKC", "Okaloakoochee Member of Ft. Thompson Fm.");
        getFormationCodeMap().put("112PLSC", "Pleistocene Sands");
        getFormationCodeMap().put("112TRSD", "Terrace Sands");
        getFormationCodeMap().put("121CRNL", "Citronelle Fm");
        getFormationCodeMap().put("121CYPR", "Cypress Head Fm.");
        getFormationCodeMap().put("121NASH", "Nashua");
        getFormationCodeMap().put("121PCPC", "Pliocene- Pleistocene");
        getFormationCodeMap().put("121PLCN", "Pliocene");
        getFormationCodeMap().put("122ALCH", "Alachua Fm.");
        getFormationCodeMap().put("122ALVA", "Alva Clay Member of Tamiami Fm.");
        getFormationCodeMap().put("122AMBF", "Alum Bluff Group");
        getFormationCodeMap().put("122ARCA", "Arcadia Fm.");
        getFormationCodeMap().put("122BCCK", "Bruce Creek Limestone");
        getFormationCodeMap().put("122BKGM", "Buckingham Limestone of Tamiami Fm.");
        getFormationCodeMap().put("122BNVL", "Bone Valley Member of Peace River Fm.");
        getFormationCodeMap().put("122BYSR", "Bayshore Member of Tamiami Fm.");
        getFormationCodeMap().put("122CCTC", "Choctawhatchee Fm.");
        getFormationCodeMap().put("122CHAR", "Charlton Member of Coosawhatchie Fm.");
        getFormationCodeMap().put("122CHPL", "Chipola Fm.");
        getFormationCodeMap().put("122COOS", "Coosawhatchie Fm.");
        getFormationCodeMap().put("122CRLN", "Charlton Fm.");
        getFormationCodeMap().put("122CTTC", "Chattahoochee Fm.");
        getFormationCodeMap().put("122DPLN", "Duplin Marl");
        getFormationCodeMap().put("122ECMB", "Escambia Sand Member of Pensacola Clay");
        getFormationCodeMap().put("122FRPR", "Fort Preston Fm.");
        getFormationCodeMap().put("122HTRN", "Hawthorn Group");
        getFormationCodeMap().put("122ITCL", "Intercoastal Limestone");
        getFormationCodeMap().put("122JKBL", "Jackson Bluff Fm.");
        getFormationCodeMap().put("122LBVL", "Lower Bone Valley");
        getFormationCodeMap().put("122MCKS", "Mudrock Station Member of Tamiami Fm.");
        getFormationCodeMap().put("122MCSK", "Miccosukee Fm.");
        getFormationCodeMap().put("122MKHD", "Markshead Fm.");
        getFormationCodeMap().put("122MOCN", "Miocene");
        getFormationCodeMap().put("122NOCA", "Nocatee Member of Arcadia Fm.");
        getFormationCodeMap().put("122OCHP", "Ochopee Limestone Member of Tamiami Fm.");
        getFormationCodeMap().put("122OKGV", "Oak Grove Sand Member of Shoal River Fm.");
        getFormationCodeMap().put("122ORTN", "Ortona Sand Member of Tamiami Fm.");
        getFormationCodeMap().put("122PCRS", "Pinecrest Sand");
        getFormationCodeMap().put("122PCRV", "Peace River Fm.");
        getFormationCodeMap().put("122PNFM", "Penney Farms Fm.");
        getFormationCodeMap().put("122PSCL", "Pensacola Clay");
        getFormationCodeMap().put("122RDBY", "Red Bay Fm.");
        getFormationCodeMap().put("122SLRV", "Shoal River Fm.");
        getFormationCodeMap().put("122SMRK", "St. Marks Fm.");
        getFormationCodeMap().put("122STAT", "Statenville Fm.");
        getFormationCodeMap().put("122STJO", "St. Joe Limestone");
        getFormationCodeMap().put("122TAMP", "Tampa Member of Arcadia Fm.");
        getFormationCodeMap().put("122TMIM", "Tamiami Fm.");
        getFormationCodeMap().put("122TORR", "Torreya Fm");
        getFormationCodeMap().put("122TRYA", "Torreya Fm.");
        getFormationCodeMap().put("122UBVL", "Upper Bone Valley");
        getFormationCodeMap().put("122YLRV", "Yellow River Fm.");
        getFormationCodeMap().put("123BCTN", "Bucatunna Clay Memebr of Byram Fm.");
        getFormationCodeMap().put("123BYRM", "Byram Fm.");
        getFormationCodeMap().put("123CKHY", "Chickasawhay Limestone");
        getFormationCodeMap().put("123DCCC", "Duncan Church Beds Member of Suwanee Limestone");
        getFormationCodeMap().put("123MRNN", "Marianna Limestone");
        getFormationCodeMap().put("123OLGC", "Oligocene");
        getFormationCodeMap().put("123SWNN", "Suwannee Limestone");
        getFormationCodeMap().put("124AVPK", "Avon Park Fm.");
        getFormationCodeMap().put("124BPNS", "Bumpnose Member of Crystal River Fm.");
        getFormationCodeMap().put("124BSHI", "Bashi Marl Member of Hatchetigbee Fm.");
        getFormationCodeMap().put("124CLBR", "Claiborne");
        getFormationCodeMap().put("124CLRV", "Crystal River Fm.");
        getFormationCodeMap().put("124EOCN", "Eocene");
        getFormationCodeMap().put("124HCGB", "Hatchetigbee");
        getFormationCodeMap().put("124IGLS", "Inglis Fm.");
        getFormationCodeMap().put("124LKCT", "Lake City Limestone");
        getFormationCodeMap().put("124LSBN", "Lisbon Fm.");
        getFormationCodeMap().put("124OCAL", "Ocala Group");
        getFormationCodeMap().put("124OLDM", "Oldsmar Limestone");
        getFormationCodeMap().put("124STNC", "Steinhatchee Dolomite Member of Crystal River Fm.");
        getFormationCodeMap().put("124TLLS", "Tallahassee Limestone");
        getFormationCodeMap().put("124TLLT", "Tallahatta Formation");
        getFormationCodeMap().put("124WLCX", "Wilcox");
        getFormationCodeMap().put("124WLIG", "Williston-Inglis");
        getFormationCodeMap().put("124WLSN", "Williston Fm.");
        getFormationCodeMap().put("125CDRK", "Cedar Keys Limestone");
        getFormationCodeMap().put("125MDWY", "Midway Fm.");
        getFormationCodeMap().put("125PLCN", "Paleocene");
        getFormationCodeMap().put("200MSZC", "Mesozoic");
        getFormationCodeMap().put("210CCJC", "Cretaceous-Jurassic");
        getFormationCodeMap().put("210FPRC", "Fort Pierce Fm.");
        getFormationCodeMap().put("211AKNS", "Atkinson Fm.");
        getFormationCodeMap().put("211ASTN", "Austin Group");
        getFormationCodeMap().put("211CDSD", "Card Sound Dolomite");
        getFormationCodeMap().put("211CRCS", "Upper Cretaceous");
        getFormationCodeMap().put("211EUTW", "Eutaw Fm.");
        getFormationCodeMap().put("211LCRS", "La Crosse Sandstone");
        getFormationCodeMap().put("211LWSN", "Lawson Limestone");
        getFormationCodeMap().put("211NVRR", "Navarro Group");
        getFormationCodeMap().put("211PLOT", "Pilot Sandstone Member of Tulcaloosa Fm.");
        getFormationCodeMap().put("211SELM", "Selma Group");
        getFormationCodeMap().put("211TSCL", "Tuscaloosa Fm.");
        getFormationCodeMap().put("211TYLR", "Taylor Group");
        getFormationCodeMap().put("217BGCP", "Big Cypress Group");
        getFormationCodeMap().put("217CRCS", "Lower Cretaceous");
        getFormationCodeMap().put("217DLRB", "Dollar Bay Fm.");
        getFormationCodeMap().put("217DTZL", "Dantzler Fm.");
        getFormationCodeMap().put("217FKBG", "Fredericksburg Group");
        getFormationCodeMap().put("217FRLK", "Ferry Lake Anhydrite");
        getFormationCodeMap().put("217GLDS", "Glades Group");
        getFormationCodeMap().put("217HSTN", "Hosston Fm.");
        getFormationCodeMap().put("217LKTF", "Lake Trafford Fm.");
        getFormationCodeMap().put("217MRST", "Mooringsport Fm");
        getFormationCodeMap().put("217NPLB", "Naples Bay Group");
        getFormationCodeMap().put("217OCRF", "Ocean Reef Group");
        getFormationCodeMap().put("217PGRD", "Punta Gorda Anhydrite");
        getFormationCodeMap().put("217PLXY", "Paluxy Fm.");
        getFormationCodeMap().put("217PNIS", "Pine Island Fm.");
        getFormationCodeMap().put("217RDSS", "Rodessa Fm.");
        getFormationCodeMap().put("217SDGV", "Sands and Gravels Undifferentiated");
        getFormationCodeMap().put("217SNLD", "Sunniland Limestone");
        getFormationCodeMap().put("217SNRZ", "Roberts Zone of Sunniland Limestone");
        getFormationCodeMap().put("217TRNT", "Trinity Group");
        getFormationCodeMap().put("217WSHT", "Washita Group");
        getFormationCodeMap().put("221CNVL", "Cotton Valley Group ");
        getFormationCodeMap().put("221DNKM", "Denkman Sandstone");
        getFormationCodeMap().put("221HSBK", "Buckner Member of Haynesville Fm.");
        getFormationCodeMap().put("221HSVL", "Haynesville Fm.");
        getFormationCodeMap().put("221JRSC", "Upper Jurassic");
        getFormationCodeMap().put("221LUNN", "Louann Salt");
        getFormationCodeMap().put("221NRPL", "Norphlet Sandstone");
        getFormationCodeMap().put("221SMKV", "Smackover Fm.");
        getFormationCodeMap().put("221WRNR", "Werner Anhydrite");
        getFormationCodeMap().put("230BSLT", "Basalt");
        getFormationCodeMap().put("230DIBS", "Diabase");
        getFormationCodeMap().put("230ELML", "Eagle Mills Formation");
        getFormationCodeMap().put("230RYLT", "Rhyolite");
        getFormationCodeMap().put("230TRSC", "Triassic");
        getFormationCodeMap().put("230TUFF", "Tuff");
        getFormationCodeMap().put("231NWRK", "Newark Group");
        getFormationCodeMap().put("231TRSC", "Upper Triassic");
        getFormationCodeMap().put("300PLZC", "Paleozoic");
        getFormationCodeMap().put("340DVNN", "Devonian");
        getFormationCodeMap().put("350SLRN", "Silurian");
        getFormationCodeMap().put("360ODVC", "Ordovician");
        getFormationCodeMap().put("367ODVC", "Lower Ordovician");
        getFormationCodeMap().put("370CMBR", "Cambrian");
        getFormationCodeMap().put("400BCGR", "Biotitic Granite");
        getFormationCodeMap().put("400GRNT", "Granite");
        getFormationCodeMap().put("400HBDD", "Hornblende Diorite");
        getFormationCodeMap().put("400PCMB", "Precambrian");
    }
    
    private void initializeMineralCodeMap() {
        getMineralCodeMap().put("A", "Anhydrite");
        getMineralCodeMap().put("B", "Chert");
        getMineralCodeMap().put("C", "Clay");
        getMineralCodeMap().put("D", "Dolomite");
        getMineralCodeMap().put("E", "Calcite");
        getMineralCodeMap().put("F", "Feldspar");
        getMineralCodeMap().put("G", "Gypsum");
        getMineralCodeMap().put("H", "Heavy Minerals");
        getMineralCodeMap().put("I", "Iron Stain");
        getMineralCodeMap().put("J", "Mica");
        getMineralCodeMap().put("K", "Glauconite");
        getMineralCodeMap().put("L", "Limestone");
        getMineralCodeMap().put("M", "Calcilutite");
        getMineralCodeMap().put("N", "Manganese Oxide");
        getMineralCodeMap().put("O", "Limonite");
        getMineralCodeMap().put("P", "Pyrite");
        getMineralCodeMap().put("Q", "Quartz");
        getMineralCodeMap().put("R", "Spar");
        getMineralCodeMap().put("S", "Quartz Sand");
        getMineralCodeMap().put("T", "Silt");
        getMineralCodeMap().put("U", "Peat");
        getMineralCodeMap().put("V", "Hematite");
        getMineralCodeMap().put("W", "Plant Remains");
        getMineralCodeMap().put("X", "Phosphatic Gravel");
        getMineralCodeMap().put("Y", "Phosphatic Sand");
        getMineralCodeMap().put("Z", "Shale");
        getMineralCodeMap().put("1", "Shell");
        getMineralCodeMap().put("2", "Organics");
        getMineralCodeMap().put("3", "Silt-Size Dolomite");
        getMineralCodeMap().put("4", "Calcarenite");
    }
    
    private void initializeRockTypeMap() {
        getRockTypeMap().put("A", "Anhydrite");
        getRockTypeMap().put("B", "Chert");
        getRockTypeMap().put("C", "Clay");
        getRockTypeMap().put("D", "Dolostone");
        getRockTypeMap().put("E", "Calcarenite");
        getRockTypeMap().put("F", "Shell Bed");
        getRockTypeMap().put("G", "Gypsum");
        getRockTypeMap().put("H", "Shale");
        getRockTypeMap().put("I", "Silt-Size Dolostone");
        getRockTypeMap().put("J", "Peat");
        getRockTypeMap().put("K", "Chalk");
        getRockTypeMap().put("L", "Limestone");
        getRockTypeMap().put("M", "Calcilutite");
        getRockTypeMap().put("N", "No Sample");
        getRockTypeMap().put("O", "Orthoquartzite");
        getRockTypeMap().put("P", "Phosphate");
        getRockTypeMap().put("Q", "Quartzite");
        getRockTypeMap().put("R", "Gravel");
        getRockTypeMap().put("S", "Sand");
        getRockTypeMap().put("T", "Silt");
        getRockTypeMap().put("U", "Arkose");
        getRockTypeMap().put("V", "As Above");
        getRockTypeMap().put("W", "Sandstone");
        getRockTypeMap().put("X", "Igneous");
        getRockTypeMap().put("Y", "Metamorphic");
        getRockTypeMap().put("Z", "Comments");
        getRockTypeMap().put("1", "Grainstone");
        getRockTypeMap().put("2", "Packstone");
        getRockTypeMap().put("3", "Wackestone");
        getRockTypeMap().put("4", "Mudstone");
    }

    private void initializePorosityCodeMap() {
        getPorosityCodeMap().put("A", "Intragranular");
        getPorosityCodeMap().put("F", "Fracture");
        getPorosityCodeMap().put("I", "Intergranular");
        getPorosityCodeMap().put("L", "Low Permeability");
        getPorosityCodeMap().put("M", "Moldic");
        getPorosityCodeMap().put("N", "Not Observed");
        getPorosityCodeMap().put("P", "Pin Point Vugs");
        getPorosityCodeMap().put("V", "Vugular");
        getPorosityCodeMap().put("X", "Intercrystalline");
        getPorosityCodeMap().put("Y", "Possibly High Permeability");
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
        getIndurationCodeMap().put("G", "Good");
        getIndurationCodeMap().put("M", "Moderate");
        getIndurationCodeMap().put("P", "Poor");
        getIndurationCodeMap().put("U", "Unconsolidated");
    }
    
    private void initializeCementCodeMap() {
        getCementCodeMap().put("A", "Anhydrite");
        getCementCodeMap().put("C", "Clay Matrix");
        getCementCodeMap().put("D", "Dolomite");
        getCementCodeMap().put("G", "Gypsum");
        getCementCodeMap().put("H", "Chalcedony");
        getCementCodeMap().put("I", "Iron");
        getCementCodeMap().put("M", "Calcilutite Matrix");
        getCementCodeMap().put("O", "Organic Matrix");
        getCementCodeMap().put("P", "Phosphate");
        getCementCodeMap().put("Q", "Silicic");
        getCementCodeMap().put("R", "Sparry Calcite");
    }
    
    private void initializeSedimentaryCodeMap() {
        getSedimentaryCodeMap().put("B", "Banded");
        getSedimentaryCodeMap().put("C", "Brecciated");
        getSedimentaryCodeMap().put("D", "Bedded");
        getSedimentaryCodeMap().put("F", "Fissile");
        getSedimentaryCodeMap().put("G", "Graded Bedding");
        getSedimentaryCodeMap().put("I", "Interbedded");
        getSedimentaryCodeMap().put("L", "Laminated");
        getSedimentaryCodeMap().put("M", "Mottled");
        getSedimentaryCodeMap().put("N", "Nodular");
        getSedimentaryCodeMap().put("S", "Streaked");
        getSedimentaryCodeMap().put("T", "Bioturbated");
        getSedimentaryCodeMap().put("V", "Massive");
        getSedimentaryCodeMap().put("X", "Cross-Bedded");
        getSedimentaryCodeMap().put("Y", "Stylolitic");
    }
    
    private void initializeFeatureCodeMap() {
        getFeatureCodeMap().put("A", "Calcareous");
        getFeatureCodeMap().put("B", "Brown Anhydrite Crystals");
        getFeatureCodeMap().put("C", "Coquina");
        getFeatureCodeMap().put("D", "Dolomitic");
        getFeatureCodeMap().put("E", "Poor Sample");
        getFeatureCodeMap().put("F", "Frosted");
        getFeatureCodeMap().put("G", "Granular");
        getFeatureCodeMap().put("H", "High Crystallization");
        getFeatureCodeMap().put("I", "Platy");
        getFeatureCodeMap().put("J", "Plastic");
        getFeatureCodeMap().put("K", "Chalky");
        getFeatureCodeMap().put("L", "Low Recrystallization");
        getFeatureCodeMap().put("M", "Medium Recrystallization");
        getFeatureCodeMap().put("N", "Splintery");
        getFeatureCodeMap().put("P", "Partings");
        getFeatureCodeMap().put("Q", "Speckled");
        getFeatureCodeMap().put("R", "Reefal");
        getFeatureCodeMap().put("S", "Sucrosic");
        getFeatureCodeMap().put("T", "Unwashed Sample");
        getFeatureCodeMap().put("U", "Muddy");
        getFeatureCodeMap().put("V", "Variegated");
        getFeatureCodeMap().put("W", "Weathered");
        getFeatureCodeMap().put("X", "Varved");
        getFeatureCodeMap().put("Y", "Greasy");
        getFeatureCodeMap().put("Z", "Stromatal");
        getFeatureCodeMap().put("0", "Crystalline");
        getFeatureCodeMap().put("1", "Fossiliferous");
    }
    
    private void initializeFossileCodeMap() {
        getFossilCodeMap().put("A", "Algae");
        getFossilCodeMap().put("B", "Bryozoa");
        getFossilCodeMap().put("C", "Coral");
        getFossilCodeMap().put("D", "Brachiopod");
        getFossilCodeMap().put("E", "Echinoid");
        getFossilCodeMap().put("K", "Oolites");
        getFossilCodeMap().put("L", "Miliolids");
        getFossilCodeMap().put("M", "Mollusks");
        getFossilCodeMap().put("N", "Cones");
        getFossilCodeMap().put("O", "Ostracods");
        getFossilCodeMap().put("P", "Plant Remains");
        getFossilCodeMap().put("R", "Rudistids");
        getFossilCodeMap().put("S", "Spicules");
        getFossilCodeMap().put("F", "Benthic Foraminifera");
        getFossilCodeMap().put("G", "Crustacea");
        getFossilCodeMap().put("H", "Plankton Foraminifera");
        getFossilCodeMap().put("I", "Diatoms");
        getFossilCodeMap().put("J", "Barnacles");
        getFossilCodeMap().put("T", "Sharks Teeth");
        getFossilCodeMap().put("U", "No Fossils");
        getFossilCodeMap().put("V", "Vertebrate");
        getFossilCodeMap().put("W", "Worm Traces");
        getFossilCodeMap().put("X", "Fossil Fragments");
        getFossilCodeMap().put("Y", "Fossil Molds");
        getFossilCodeMap().put("Z", "Organics");
    }
    
    private void initializeColorCodeMap() {
        getColorCodeMap().put("1", "Transparent");
        getColorCodeMap().put("2", "Light Greyish Red");
        getColorCodeMap().put("3", "Grayish Red");
        getColorCodeMap().put("4", "Blackish Red");
        getColorCodeMap().put("5", "Moderate Pink");
        getColorCodeMap().put("6", "Moderate Red");
        getColorCodeMap().put("7", "Dark Grayish Red");
        getColorCodeMap().put("8", "Light Red");
        getColorCodeMap().put("9", "Moderate Red");
        getColorCodeMap().put("10", "Very Dark Red");
        getColorCodeMap().put("11", "Grayish Orange Pink");
        getColorCodeMap().put("12", "Light Grayish Red");
        getColorCodeMap().put("13", "Grayish Brown Red");
        getColorCodeMap().put("14", "Dark Brownish Red");
        getColorCodeMap().put("15", "Moderate Orange Pink");
        getColorCodeMap().put("16", "Light Reddish Brown");
        getColorCodeMap().put("17", "Dark Reddish Brown");
        getColorCodeMap().put("18", "Moderate Reddish Orange");
        getColorCodeMap().put("19", "Moderate Reddish Brown");
        getColorCodeMap().put("20", "Grayish Orange Pink");
        getColorCodeMap().put("21", "Light Grayish Brown");
        getColorCodeMap().put("22", "Grayish Brown");
        getColorCodeMap().put("23", "Dark Brown");
        getColorCodeMap().put("24", "Moderate Orange Pink");
        getColorCodeMap().put("25", "Light Brown");
        getColorCodeMap().put("26", "Moderate Brown");
        getColorCodeMap().put("27", "Moderate Brown");
        getColorCodeMap().put("28", "Light Brown");
        getColorCodeMap().put("29", "Very Light Orange");
        getColorCodeMap().put("30", "Grayish Brown");
        getColorCodeMap().put("31", "Dark Yellowish Brown");
        getColorCodeMap().put("32", "Dark Yellowish Brown");
        getColorCodeMap().put("33", "Grayish Orange");
        getColorCodeMap().put("34", "Moderate Yellowish Brown");
        getColorCodeMap().put("35", "Light Yellowish Orange");
        getColorCodeMap().put("36", "Dark Yellowish Orange");
        getColorCodeMap().put("37", "Yellowish Gray");
        getColorCodeMap().put("38", "Light Olive Gray");
        getColorCodeMap().put("39", "Olive Gray");
        getColorCodeMap().put("40", "Grayish Yellow");
        getColorCodeMap().put("41", "Dark Grayish Yellow");
        getColorCodeMap().put("42", "Moderate Olive Brown");
        getColorCodeMap().put("43", "Moderate Yellow");
        getColorCodeMap().put("44", "Light Olive Brown");
        getColorCodeMap().put("45", "Light Greenish Yellow");
        getColorCodeMap().put("46", "Light Olive");
        getColorCodeMap().put("47", "Grayish Olive");
        getColorCodeMap().put("48", "Moderate Greenish Yellow");
        getColorCodeMap().put("49", "Light Olive");
        getColorCodeMap().put("50", "Dark Greenish Yellow");
        getColorCodeMap().put("51", "Light Grayish Green");
        getColorCodeMap().put("52", "Moderate Grayish Green");
        getColorCodeMap().put("53", "Grayish Olive Green");
        getColorCodeMap().put("54", "Moderate Yellowish Green");
        getColorCodeMap().put("55", "Light Yellowish Green");
        getColorCodeMap().put("56", "Grayish Green");
        getColorCodeMap().put("57", "Dark Grayish Green");
        getColorCodeMap().put("58", "Moderate Yellowish Green");
        getColorCodeMap().put("59", "Dark Yellowish Green");
        getColorCodeMap().put("60", "Light Grayish Green");
        getColorCodeMap().put("61", "Grayish Green");
        getColorCodeMap().put("62", "Dark Green");
        getColorCodeMap().put("63", "Light Green");
        getColorCodeMap().put("64", "Light Green");
        getColorCodeMap().put("65", "Moderate Green");
        getColorCodeMap().put("66", "Very Light Green");
        getColorCodeMap().put("67", "Light Grayish Green");
        getColorCodeMap().put("68", "Grayish Green");
        getColorCodeMap().put("69", "Light Blue Green");
        getColorCodeMap().put("70", "Grayish Blue Green");
        getColorCodeMap().put("71", "Grayish Purple");
        getColorCodeMap().put("72", "Very Dark Purple");
        getColorCodeMap().put("73", "Light Reddish Purple");
        getColorCodeMap().put("74", "Grayish Purple Red");
        getColorCodeMap().put("75", "Dark Red Purple");
        getColorCodeMap().put("76", "White");
        getColorCodeMap().put("77", "Very Light Gray");
        getColorCodeMap().put("78", "Light Gray");
        getColorCodeMap().put("79", "Moderate Light Gray");
        getColorCodeMap().put("80", "Moderate Gray");
        getColorCodeMap().put("81", "Moderate Dark Gray");
        getColorCodeMap().put("82", "Dark Gray");
        getColorCodeMap().put("83", "Black");
        getColorCodeMap().put("84", "Light Brownish Gray");
        getColorCodeMap().put("85", "Brownish Gray");
        getColorCodeMap().put("86", "Yellowish Gray");
        getColorCodeMap().put("87", "Light Olive Gray");
        getColorCodeMap().put("88", "Olive Gray");
        getColorCodeMap().put("89", "Pinkish Gray");
        getColorCodeMap().put("90", "Light Greenish Gray");
        getColorCodeMap().put("91", "Greenish Gray");
        getColorCodeMap().put("92", "Dark Greenish Gray");
        getColorCodeMap().put("93", "Greenish Black");
        getColorCodeMap().put("94", "Light Greenish Gray");
        getColorCodeMap().put("95", "Greenish Gray");
        getColorCodeMap().put("96", "Dark Greenish Gray");
        getColorCodeMap().put("97", "Greenish Black");
        getColorCodeMap().put("98", "Light Bluish Gray");
        getColorCodeMap().put("99", "Moderate Bluish Gray");
        getColorCodeMap().put("0A", "Red");
        getColorCodeMap().put("0B", "Dark Red");
        getColorCodeMap().put("0C", "Orangish Red");
        getColorCodeMap().put("0D", "Light Orangish Red");
        getColorCodeMap().put("0E", "Dark Orangish Red");
        getColorCodeMap().put("0F", "Purplish Red");
        getColorCodeMap().put("1A", "Orange");
        getColorCodeMap().put("1B", "Light Orange");
        getColorCodeMap().put("1C", "Dark Orange");
        getColorCodeMap().put("1D", "Reddish Orange");
        getColorCodeMap().put("1E", "Light Reddish Orange");
        getColorCodeMap().put("1F", "Dark Reddish Orange");
        getColorCodeMap().put("2A", "Yellow");
        getColorCodeMap().put("2B", "Light Yellow");
        getColorCodeMap().put("2C", "Dark Yellow");
        getColorCodeMap().put("2D", "Greenish Yellow");
        getColorCodeMap().put("2E", "Cream");
        getColorCodeMap().put("2F", "Buff");
        getColorCodeMap().put("3A", "Green");
        getColorCodeMap().put("3B", "Yellowish Green");
        getColorCodeMap().put("3C", "Bluish Green");
        getColorCodeMap().put("3D", "Dark Bluish Green");
        getColorCodeMap().put("3E", "Olive");
        getColorCodeMap().put("3F", "Dark Olive");
        getColorCodeMap().put("4A", "Blue");
        getColorCodeMap().put("4B", "Light Blue");
        getColorCodeMap().put("4C", "Dark Blue");
        getColorCodeMap().put("4D", "Greenish Blue");
        getColorCodeMap().put("4E", "Light Greenish Blue");
        getColorCodeMap().put("4F", "Dark Greenish Blue");
        getColorCodeMap().put("5A", "Brown");
        getColorCodeMap().put("5B", "Tan");
        getColorCodeMap().put("5C", "Light Tan");
        getColorCodeMap().put("5D", "Dark Tan");
        getColorCodeMap().put("5E", "Reddish Brown");
        getColorCodeMap().put("5F", "Dark Grayish Brown");
        getColorCodeMap().put("6A", "No Code");
        getColorCodeMap().put("6B", "No Code");
        getColorCodeMap().put("6C", "No Code");
        getColorCodeMap().put("6D", "No Code");
        getColorCodeMap().put("6E", "No Code");
        getColorCodeMap().put("6F", "No Code");
        getColorCodeMap().put("7A", "Gray");
        getColorCodeMap().put("7B", "No Code");
        getColorCodeMap().put("7C", "No Code");
        getColorCodeMap().put("7D", "No Code");
        getColorCodeMap().put("7E", "No Code");
        getColorCodeMap().put("7F", "No Code");
        getColorCodeMap().put("8A", "No Code");
        getColorCodeMap().put("8B", "No Code");
        getColorCodeMap().put("8C", "No Code");
        getColorCodeMap().put("8D", "No Code");
        getColorCodeMap().put("8E", "No Code");
        getColorCodeMap().put("8F", "No Code");
        getColorCodeMap().put("9A", "End Of Color List");
    }
    
    private void initializeGeoLogCodeMap() {
        getGeoLogCodeMap().put("A", "Time");
        getGeoLogCodeMap().put("B", "Video");
        getGeoLogCodeMap().put("C", "Caliper");
        getGeoLogCodeMap().put("E", "Electric");
        getGeoLogCodeMap().put("F", "Fluid Conductivity");
        getGeoLogCodeMap().put("G", "Geologist");
        getGeoLogCodeMap().put("H", "Magnetic");
        getGeoLogCodeMap().put("I", "Induction");
        getGeoLogCodeMap().put("J", "Gamma");
        getGeoLogCodeMap().put("K", "Dipmeter");
        getGeoLogCodeMap().put("L", "Laterlog");
        getGeoLogCodeMap().put("M", "Micro Laterlog");
        getGeoLogCodeMap().put("N", "Neutron");
        getGeoLogCodeMap().put("P", "Photo");
        getGeoLogCodeMap().put("Q", "Radio Activity");
        getGeoLogCodeMap().put("S", "Sonic");
        getGeoLogCodeMap().put("T", "Temperature");
        getGeoLogCodeMap().put("U", "Gamma-Gamma");
        getGeoLogCodeMap().put("V", "Fluid Velocity");
        getGeoLogCodeMap().put("Z", "Other");
    }
    
    private void initializeCountyCodeMap() {
        getCountyCodeMap().put("AA", "Alachua");
        getCountyCodeMap().put("BK", "Baker");
        getCountyCodeMap().put("BW", "Broward");
        getCountyCodeMap().put("BF", "Bradford");
        getCountyCodeMap().put("BV", "Brevard");
        getCountyCodeMap().put("BY", "Bay");
        getCountyCodeMap().put("CN", "Calhoun");
        getCountyCodeMap().put("CH", "Charlotte");
        getCountyCodeMap().put("CI", "Citrus");
        getCountyCodeMap().put("CY", "Clay");
        getCountyCodeMap().put("CO", "Columbia");
        getCountyCodeMap().put("CR", "Collier");
        getCountyCodeMap().put("DD", "Dade");
        getCountyCodeMap().put("DS", "Desoto");
        getCountyCodeMap().put("DX", "Dixie");
        getCountyCodeMap().put("DU", "Duval");
        getCountyCodeMap().put("ES", "Escambia");
        getCountyCodeMap().put("FG", "Flagler");
        getCountyCodeMap().put("FK", "Franklin");
        getCountyCodeMap().put("GA", "Gadsden");
        getCountyCodeMap().put("GR", "Gilchrist");
        getCountyCodeMap().put("GL", "Glades");
        getCountyCodeMap().put("GF", "Gulf");
        getCountyCodeMap().put("HD", "Hardee");
        getCountyCodeMap().put("HY", "Hendry");
        getCountyCodeMap().put("HI", "Highlands");
        getCountyCodeMap().put("HL", "Hillsborough");
        getCountyCodeMap().put("HM", "Hamilton");
        getCountyCodeMap().put("HO", "Holmes");
        getCountyCodeMap().put("HR", "Hernando");
        getCountyCodeMap().put("IR", "Indian River");
        getCountyCodeMap().put("JK", "Jackson");
        getCountyCodeMap().put("JF", "Jefferson");
        getCountyCodeMap().put("LF", "Lafayette");
        getCountyCodeMap().put("LB", "Liberty");
        getCountyCodeMap().put("LE", "Lee");
        getCountyCodeMap().put("LK", "Lake");
        getCountyCodeMap().put("LN", "Leon");
        getCountyCodeMap().put("LV", "Levy");
        getCountyCodeMap().put("MD", "Madison");
        getCountyCodeMap().put("MT", "Martin");
        getCountyCodeMap().put("MO", "Monroe");
        getCountyCodeMap().put("MR", "Marion");
        getCountyCodeMap().put("MN", "Manatee");
        getCountyCodeMap().put("NA", "Nassau");
        getCountyCodeMap().put("OE", "Okeechobee");
        getCountyCodeMap().put("OA", "Okaloosa");
        getCountyCodeMap().put("OR", "Orange");
        getCountyCodeMap().put("OS", "Osceola");
        getCountyCodeMap().put("PS", "Pasco");
        getCountyCodeMap().put("PB", "Palm Beach");
        getCountyCodeMap().put("PI", "Pinellas");
        getCountyCodeMap().put("PO", "Polk");
        getCountyCodeMap().put("PU", "Putnam");
        getCountyCodeMap().put("SA", "Sarasota");
        getCountyCodeMap().put("SE", "Seminole");
        getCountyCodeMap().put("SJ", "St Johns");
        getCountyCodeMap().put("SL", "St Lucie");
        getCountyCodeMap().put("SM", "Sumter");
        getCountyCodeMap().put("SR", "Santa Rosa");
        getCountyCodeMap().put("SW", "Suwannee");
        getCountyCodeMap().put("TY", "Taylor");
        getCountyCodeMap().put("UN", "Union");
        getCountyCodeMap().put("VO", "Volusia");
        getCountyCodeMap().put("WK", "Wakulla");
        getCountyCodeMap().put("WL", "Walton");
        getCountyCodeMap().put("WS", "Washington");
        getCountyCodeMap().put("OF", "Offshore");
    }

    /**
     * @return the rockTypeMap
     */
    public Map getRockTypeMap() {
        return rockTypeMap;
    }

    /**
     * @param rockTypeMap the rockTypeMap to set
     */
    public void setRockTypeMap(Map rockTypeMap) {
        this.rockTypeMap = rockTypeMap;
    }

    /**
     * @return the porosityCodeMap
     */
    public Map getPorosityCodeMap() {
        return porosityCodeMap;
    }

    /**
     * @param porosityCodeMap the porosityCodeMap to set
     */
    public void setPorosityCodeMap(Map porosityCodeMap) {
        this.porosityCodeMap = porosityCodeMap;
    }

    /**
     * @return the grainSizeCodeMap
     */
    public Map getGrainSizeCodeMap() {
        return grainSizeCodeMap;
    }

    /**
     * @param grainSizeCodeMap the grainSizeCodeMap to set
     */
    public void setGrainSizeCodeMap(Map grainSizeCodeMap) {
        this.grainSizeCodeMap = grainSizeCodeMap;
    }

    /**
     * @return the roundnessCodeMap
     */
    public Map getRoundnessCodeMap() {
        return roundnessCodeMap;
    }

    /**
     * @param roundnessCodeMap the roundnessCodeMap to set
     */
    public void setRoundnessCodeMap(Map roundnessCodeMap) {
        this.roundnessCodeMap = roundnessCodeMap;
    }

    /**
     * @return the sphericityCodeMap
     */
    public Map getSphericityCodeMap() {
        return sphericityCodeMap;
    }

    /**
     * @param sphericityCodeMap the sphericityCodeMap to set
     */
    public void setSphericityCodeMap(Map sphericityCodeMap) {
        this.sphericityCodeMap = sphericityCodeMap;
    }

    /**
     * @return the grainTypeCodeMap
     */
    public Map getGrainTypeCodeMap() {
        return grainTypeCodeMap;
    }

    /**
     * @param grainTypeCodeMap the grainTypeCodeMap to set
     */
    public void setGrainTypeCodeMap(Map grainTypeCodeMap) {
        this.grainTypeCodeMap = grainTypeCodeMap;
    }

    /**
     * @return the alterationCodeMap
     */
    public Map getAlterationCodeMap() {
        return alterationCodeMap;
    }

    /**
     * @param alterationCodeMap the alterationCodeMap to set
     */
    public void setAlterationCodeMap(Map alterationCodeMap) {
        this.alterationCodeMap = alterationCodeMap;
    }

    /**
     * @return the crystallinityCodeMap
     */
    public Map getCrystallinityCodeMap() {
        return crystallinityCodeMap;
    }

    /**
     * @param crystallinityCodeMap the crystallinityCodeMap to set
     */
    public void setCrystallinityCodeMap(Map crystallinityCodeMap) {
        this.crystallinityCodeMap = crystallinityCodeMap;
    }

    /**
     * @return the indurationCodeMap
     */
    public Map getIndurationCodeMap() {
        return indurationCodeMap;
    }

    /**
     * @param indurationCodeMap the indurationCodeMap to set
     */
    public void setIndurationCodeMap(Map indurationCodeMap) {
        this.indurationCodeMap = indurationCodeMap;
    }

    /**
     * @return the cementCodeMap
     */
    public Map getCementCodeMap() {
        return cementCodeMap;
    }

    /**
     * @param cementCodeMap the cementCodeMap to set
     */
    public void setCementCodeMap(Map cementCodeMap) {
        this.cementCodeMap = cementCodeMap;
    }

    /**
     * @return the sedimentaryCodeMap
     */
    public Map getSedimentaryCodeMap() {
        return sedimentaryCodeMap;
    }

    /**
     * @param sedimentaryCodeMap the sedimentaryCodeMap to set
     */
    public void setSedimentaryCodeMap(Map sedimentaryCodeMap) {
        this.sedimentaryCodeMap = sedimentaryCodeMap;
    }

    /**
     * @return the featureCodeMap
     */
    public Map getFeatureCodeMap() {
        return featureCodeMap;
    }

    /**
     * @param featureCodeMap the featureCodeMap to set
     */
    public void setFeatureCodeMap(Map featureCodeMap) {
        this.featureCodeMap = featureCodeMap;
    }

    /**
     * @return the fossilCodeMap
     */
    public Map getFossilCodeMap() {
        return fossilCodeMap;
    }

    /**
     * @param fossilCodeMap the fossilCodeMap to set
     */
    public void setFossilCodeMap(Map fossilCodeMap) {
        this.fossilCodeMap = fossilCodeMap;
    }

    /**
     * @return the colorCodeMap
     */
    public Map getColorCodeMap() {
        return colorCodeMap;
    }

    /**
     * @param colorCodeMap the colorCodeMap to set
     */
    public void setColorCodeMap(Map colorCodeMap) {
        this.colorCodeMap = colorCodeMap;
    }

    /**
     * @return the geoLogCodeMap
     */
    public Map getGeoLogCodeMap() {
        return geoLogCodeMap;
    }

    /**
     * @param geoLogCodeMap the geoLogCodeMap to set
     */
    public void setGeoLogCodeMap(Map geoLogCodeMap) {
        this.geoLogCodeMap = geoLogCodeMap;
    }

    /**
     * @return the countyCodeMap
     */
    public Map getCountyCodeMap() {
        return countyCodeMap;
    }

    /**
     * @param countyCodeMap the countyCodeMap to set
     */
    public void setCountyCodeMap(Map countyCodeMap) {
        this.countyCodeMap = countyCodeMap;
    }

    /**
     * @return the mineralCodeMap
     */
    public Map getMineralCodeMap() {
        return mineralCodeMap;
    }

    /**
     * @param mineralCodeMap the mineralCodeMap to set
     */
    public void setMineralCodeMap(Map mineralCodeMap) {
        this.mineralCodeMap = mineralCodeMap;
    }

    /**
     * @return the formationCodeMap
     */
    public Map getFormationCodeMap() {
        return formationCodeMap;
    }

    /**
     * @param formationCodeMap the formationCodeMap to set
     */
    public void setFormationCodeMap(Map formationCodeMap) {
        this.formationCodeMap = formationCodeMap;
    }
    
}
