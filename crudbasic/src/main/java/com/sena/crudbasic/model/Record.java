package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "record")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_record")
    private int id;

    @Column(name = "online")
    private String online;

    @OneToOne // una feria tiene un único registro
    @JoinColumn(name = "id_fair", unique = true, nullable = false)
    private Fair fair;

    @OneToOne // una charla tiene un único registro
    @JoinColumn(name = "id_chat", unique = true, nullable = false)
    private Chat chat;

    @OneToOne // un visitante tiene un único registro
    @JoinColumn(name = "id_visitor", unique = true, nullable = false)
    private Visitor visitor;

    @OneToOne // un ponente tiene un único registro
    @JoinColumn(name = "id_speaker", unique = true, nullable = false)
    private Speaker speaker;

    @OneToOne // una empresa tiene un único registro
    @JoinColumn(name = "id_company", unique = true, nullable = false)
    private Company company;

    @OneToOne // una demostración tiene un único registro
    @JoinColumn(name = "id_demostration", unique = true, nullable = false)
    private Demostration demostration;

    public int getId() {
        return id;
    }

    public String getOnline() {
        return online;
    }

    public Fair getFair() {
        return fair;
    }

    public Chat getChat() {
        return chat;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Company getCompany() {
        return company;
    }

    public Demostration getDemostration() {
        return demostration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public void setFair(Fair fair) {
        this.fair = fair;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setDemostration(Demostration demostration) {
        this.demostration = demostration;
    }
}
