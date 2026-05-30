package resumeanalyzer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import resumeanalyzer.dto.AnalysisRequest;
import resumeanalyzer.service.AnalysisService;

@RestController
@RequestMapping("/analysis")
public class AnalysisController {

    @Autowired
    private AnalysisService analysisService;

    @PostMapping
    public String saveAnalysis(@RequestBody AnalysisRequest request) {

        return analysisService.saveAnalysis(request);
    }
}
