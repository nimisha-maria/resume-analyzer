package resumeanalyzer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import resumeanalyzer.dto.AnalysisRequest;
import resumeanalyzer.entity.Analysis;
import resumeanalyzer.repository.AnalysisRepository;

@Service
public class AnalysisService {

    @Autowired
    private AnalysisRepository analysisRepository;

    public String saveAnalysis(AnalysisRequest request) {

        Analysis analysis = new Analysis();

        analysis.setUserEmail("test@gmail.com");

        analysis.setResumeText(request.getResumeText());
        analysis.setJobDescription(request.getJobDescription());

        analysis.setResultJson("{\"status\":\"saved\"}");

        analysisRepository.save(analysis);

        return "Analysis saved successfully!";
    }
}
