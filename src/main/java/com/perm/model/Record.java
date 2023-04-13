package com.perm.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Record {

    private String caseNumber;
    private String caseStatus;
    private Date receivedDate;
    private Date decisionDate;

    @Override
    public String toString() {
        return "Record{" +
                "caseNumber='" + caseNumber + '\'' +
                ", caseStatus='" + caseStatus + '\'' +
                ", receivedDate=" + receivedDate +
                ", decisionDate=" + decisionDate +
                '}';
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public Date getDecisionDate() {
        return decisionDate;
    }

    public Record(String caseNumber, String caseStatus, Date receivedDate, Date decisionDate) {
        this.caseNumber = caseNumber;
        this.caseStatus = caseStatus;
        this.receivedDate = receivedDate;
        this.decisionDate = decisionDate;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public void setDecisionDate(Date decisionDate) {
        this.decisionDate = decisionDate;
    }
}