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

import com.bfemmer.fgslogs.model.DatFileParser;
import com.bfemmer.fgslogs.model.FileParser;
import com.bfemmer.fgslogs.model.WellLog;
import com.bfemmer.fgslogs.model.WellLogRepository;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bfemmer
 */
public class DatFileWellLogRepository implements WellLogRepository {
    String filename;
    
    public DatFileWellLogRepository(String filename) {
        this.filename = filename;
    }

    @Override
    public int getWellLogCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getWellLogCountByCounty(String countyCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<WellLog> getAllWellLogs() {
        Reader fileReader;
        FileParser fgslogs = new DatFileParser();
        List<WellLog> wellLogs = new ArrayList<>();
        
        try {
            fileReader = new FileReader(filename);
            wellLogs = fgslogs.parse(fileReader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatFileWellLogRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return wellLogs;
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
}
