package com.Snigdha.Snigdha.models;
import java.util.List;

public class Grievance {

    private int grievanceId;
    private int grievance_ovrl;
    private List<String> grievanceTopics;  // Use a List to store multiple selected topics
    private String grievance_remarks;
    
    // private int grievance_pid;

    public int getGrievanceId() {
        return grievanceId;
    }

    public void setGrievanceId(int grievanceId) {
        this.grievanceId = grievanceId;
    }

    public int getGrievance_Ovrl() {
        return grievance_ovrl;
    }

    public void setGrievance_Ovrl(int grievance_ovrl) {
        this.grievance_ovrl = grievance_ovrl;

    }

    public List<String> getGrievance_Topic() {
        return grievanceTopics;
    }

    public void setGrievance_Topic(List<String> grievanceTopics) {
        this.grievanceTopics = grievanceTopics;
    }

    public String getGrievance_Remarks() {
        return grievance_remarks;
    }

    public void setGrievance_Remarks(String grievance_remarks) {
        this.grievance_remarks = grievance_remarks;
    }

    // public int getGrievance_Pid() {
    //     return grievance_pid;
    // }

    // public void setGrievance_Pid(int grievance_pid) {
    //     this.grievance_pid = grievance_pid;
    // }
}
