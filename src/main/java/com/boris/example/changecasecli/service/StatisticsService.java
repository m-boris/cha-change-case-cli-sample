package com.boris.example.changecasecli.service;

import com.boris.example.changecasecli.model.StatisticsReport;

public interface StatisticsService {
    StatisticsReport getStaticsReport(String inputFilePath);

}
