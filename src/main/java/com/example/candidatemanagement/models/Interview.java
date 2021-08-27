package com.example.candidatemanagement.models;

import com.example.candidatemanagement.models.enums.InterviewStatus;
import com.example.candidatemanagement.models.enums.Rating;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
public class Interview {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Candidate candidate;
    private Date date;
    private String positionInterviewed;
    private String positionRecomended;
    private InterviewStatus interviewStatus;
    private Rating rating;
    private String strengths;
    private String weaknesses;
    private String comments;
    @OneToMany(mappedBy = "interview", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<InterviewFeedback> interviewFeedbacks;
    @OneToMany(mappedBy = "interview", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Interviewer> interviewers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPositionInterviewed() {
        return positionInterviewed;
    }

    public void setPositionInterviewed(String positionInterviewed) {
        this.positionInterviewed = positionInterviewed;
    }

    public String getPositionRecomended() {
        return positionRecomended;
    }

    public void setPositionRecomended(String positionRecomended) {
        this.positionRecomended = positionRecomended;
    }

    public InterviewStatus getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(InterviewStatus interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Set<InterviewFeedback> getInterviewFeedbacks() { return this.interviewFeedbacks; }

    public Set<Interviewer> getInterviewers() { return this.interviewers; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interview interview = (Interview) o;
        return id.equals(interview.id) && date.equals(interview.date) && positionInterviewed.equals(interview.positionInterviewed) && positionRecomended.equals(interview.positionRecomended) && interviewStatus == interview.interviewStatus && rating == interview.rating && strengths.equals(interview.strengths) && weaknesses.equals(interview.weaknesses) && comments.equals(interview.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, positionInterviewed, positionRecomended, interviewStatus, rating, strengths, weaknesses, comments);
    }
}
