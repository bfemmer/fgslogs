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

package com.bfemmer.fgslogs.applicationservice;

import com.bfemmer.fgslogs.model.WellLog;
import com.bfemmer.fgslogs.model.WellLogRepository;
import java.util.List;

/**
 *
 * @author bfemmer
 */
public class WellLogApplicationService {
    private final WellLogRepository wellLogRepository;
    
    public WellLogApplicationService(WellLogRepository wellLogRepository) {
        this.wellLogRepository = wellLogRepository;
    }
    
    public int getWellLogCount() {
        return wellLogRepository.getWellLogCount();
    }
    
    public int getWellLogCountForCounty(String countyCode) {
        return wellLogRepository.getWellLogCount();
    }
    
    public List<WellLog> getAllWellLogs() {
        return wellLogRepository.getAllWellLogs();
    }
    
    public List<String> getAllWellNumbers() {
        return wellLogRepository.getAllWellNumbers();
    }
    
    public List<String> getWellNumbersForCounty(String countyCode) {
        return wellLogRepository.getWellNumbersForCounty(countyCode);
    }
    
    public WellLog getWellLogForWellNumber(int wellNumber) {
        return wellLogRepository.getWellLogForWellNumber(wellNumber);
    }
}