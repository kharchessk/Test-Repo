package com.example.gitdemo;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommitInfoController {
 
    @Value("${git.branch}")
    private String branch;
 
    @Value("${git.commit.id}")
    private String commitId;    
    
    @Value("${git.build.time}")
    private String buildTime;
    
    @Value("${git.commit.user.name}")
    private String commitUserName;
    
    @Value("${git.commit.user.email}")
    private String commitUserEmail;    
    
    @Value("${git.commit.time}")
    private String commitTime;
    
    @Value("${git.build.user.name}")
    private String buildUserName;
    
    @Value("${git.build.user.email}")
    private String buildUserEmail;
    
    @Value("${git.build.version}")
    private String buildVersion; 
   
    @RequestMapping("/commitId")
    public Map<String, String> getCommitId() {
        Map<String, String> result = new HashMap<>();        
        result.put("Commit branch", branch);
        result.put("Commit id", commitId);
        result.put("Commit Time", commitTime);
        result.put("Commit User Name",commitUserName);
        result.put("Commit User Email",commitUserEmail);
        result.put("Build User Name",buildUserName);
        result.put("Build User Email",buildUserEmail);
        result.put("Build Time",buildTime);
        result.put("Build Version",buildVersion);
        return result;
    }
}