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
    
    @Override
    public List<WellLog> getAllWellLogs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getAllWellNumbers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getWellNumbersByCounty(String countyCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WellLog> getWellLogByWellNumber(int wellNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WellLog getWellLogById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SaveWellLog(WellLog wellLog) {
        
        try {
            saveEntity(wellLog.getWellLogNumber());
            saveEntity(wellLog.getSummaryEntity());
            saveEntity(wellLog.getLocationEntity());
            saveEntity(wellLog.getFormationEntity());
            saveEntity(wellLog.getSampleEntity());
        } catch (IOException ex) {
            Logger.getLogger(JsonFileWellLogRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void saveEntity(Object object) throws IOException {
        String filename;
        String filenamePath;
        String objectDirectory;
        ObjectMapper mapper;
        
        if (object instanceof WellLogEntity) {
            filename = ((WellLogEntity)object).getId();
            
            if (object instanceof SummaryEntity) {
                objectDirectory = directory + File.separator + 
                SUMMARY_DIRECTORY_NAME;
            }
            else if (object instanceof LocationEntity) {
                objectDirectory = directory + File.separator + 
                LOCATION_DIRECTORY_NAME;
            }
            else if (object instanceof FormationEntity) {
                objectDirectory = directory + File.separator + 
                FORMATION_DIRECTORY_NAME;
            }
            else {
                objectDirectory = directory + File.separator + 
                SAMPLE_DIRECTORY_NAME;
            }
            
            filenamePath = objectDirectory + 
                File.separator +
                filename + ".json";
        }
        else {
            objectDirectory = directory;
            filename = ((String)object);
            filenamePath = objectDirectory + 
                File.separator +
                filename;
        }

        // Create directory
        Files.createDirectories(Paths.get(objectDirectory));
        
        mapper = new ObjectMapper();
                
        // Write object to JSON in file
        try {
            mapper.writeValue(new File(filenamePath), object);
        } catch (IOException ex) {
            Logger.getLogger(WellLogController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
