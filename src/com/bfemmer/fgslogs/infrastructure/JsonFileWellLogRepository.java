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

package com.bfemmer.fgslogs.infrastructure;

import com.bfemmer.fgslogs.controller.WellLogController;
import com.bfemmer.fgslogs.model.FormationEntity;
import com.bfemmer.fgslogs.model.LocationEntity;
import com.bfemmer.fgslogs.model.SummaryEntity;
import com.bfemmer.fgslogs.model.WellLog;
import com.bfemmer.fgslogs.model.WellLogEntity;
import com.bfemmer.fgslogs.model.WellLogRepository;
import com.bfemmer.fgslogs.model.WellNumberEntity;
import com.bfemmer.fgslogs.viewmodel.LatLng;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bfemmer
 */
public class JsonFileWellLogRepository implements WellLogRepository {
    private final String directory;
    private static final String SUMMARY_DIRECTORY_NAME = "summary";
    private static final String LOCATION_DIRECTORY_NAME = "location";
    private static final String FORMATION_DIRECTORY_NAME = "formation";
    private static final String SAMPLE_DIRECTORY_NAME = "sample";
    
    public JsonFileWellLogRepository(String directory) {
        this.directory = directory;
    }
    
    /**
     * Returns list of well logs within a json file
     * 
     * @param filename json file
     * @return 
     */
    @Override
    public List<WellLog> getAllWellLogs(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<WellNumberEntity> getWellNumbersByFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<WellNumberEntity> getWellNumbersByCounty(String county) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WellLog getWellLogById(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<WellLog> getWellLogByWellNumber(String wellNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public LatLng getLatLngByWellNumber(String wellNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveWellLog(WellLog wellLog) {
        String county = wellLog.getLocationEntity().getLocation().getCountyName();
        
        try {
            saveEntity(wellLog.getSummaryEntity(), county);
            saveEntity(wellLog.getLocationEntity(), county);
            saveEntity(wellLog.getFormationEntity(), county);
            saveEntity(wellLog.getSampleEntity(), county);
        } catch (IOException ex) {
            Logger.getLogger(JsonFileWellLogRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Saves a list of well logs
     * 
     * @param wellLogs 
     */
    @Override
    public void saveWellLogs(List<WellLog> wellLogs) {
        wellLogs.forEach((wellLog) -> {
            saveWellLog(wellLog);
        });
    }
    
    /**
     * Saves WellLogEntity object as multiple json files in the county folder
     * 
     * @param object a WellLogEntity object
     * @param county a Florida county
     * @throws IOException 
     */
    private void saveEntity(Object object, String county) throws IOException {
        String filename;
        String filenamePath;
        String objectDirectory;
        ObjectMapper mapper;
        
        // Only care about instances of WellLogEntity
        if (!(object instanceof WellLogEntity)) {
            return;
        }
        
        // Use the UUID as the filename for the json data
        filename = ((WellLogEntity)object).getId();
        
        // Build the path down to the folder labeled with the well log number
        objectDirectory = directory 
                    + File.separator
                    + county
                    + File.separator 
                    + ((WellLogEntity)object).getWellNumber();

        // Add on the subdirectory based on the specific instance
        if (object instanceof SummaryEntity) {
            objectDirectory += File.separator + SUMMARY_DIRECTORY_NAME;
        }
        else if (object instanceof LocationEntity) {
            objectDirectory += File.separator + LOCATION_DIRECTORY_NAME;
        }
        else if (object instanceof FormationEntity) {
            objectDirectory += File.separator + FORMATION_DIRECTORY_NAME;
        }
        else {
            objectDirectory += File.separator + SAMPLE_DIRECTORY_NAME;
        }

        // Create directory
        Files.createDirectories(Paths.get(objectDirectory));
        
        // Append json filename to directory just created
        filenamePath = objectDirectory + 
            File.separator +
            filename + ".json";
        
        mapper = new ObjectMapper();
                
        // Write object to JSON in file
        try {
            mapper.writeValue(new File(filenamePath), object);
        } catch (IOException ex) {
            Logger.getLogger(WellLogController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
