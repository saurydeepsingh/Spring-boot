package com.example.jobapplication.job.application.Service;

import com.example.jobapplication.job.application.Repository.jobRepo;
import com.example.jobapplication.job.application.model.jobppost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jobservice {
    List<jobppost> post=new ArrayList<>(
            Arrays.asList(
                    new jobppost(1,"PythonDeveloper","build in hight techonolog","2 year of experience"),
                    new jobppost(2,"JavaDeveloper","build in hight techonolog","5 year of experience"),
                    new jobppost(3,"c++Developer","build in hight techonolog","3 year of experience"),
                    new jobppost(4,"JavaScript","build in hight techonolog","1 year of experience")

            )

    );

    @Autowired
    private jobRepo Repo;
   public void addjob(jobppost jobpost){
       Repo.save(jobpost);

   }
   public List<jobppost> getalljob(){
       return Repo.findAll();
   }
   public jobppost getjob(int postid){
       return Repo.findById(postid).orElse("null");
   }

   public void updatejob(jobppost jobpost){
       Repo.save(jobpost);
   }

   public void deletejob(int postid){
       Repo.delete(postid);
   }

}
