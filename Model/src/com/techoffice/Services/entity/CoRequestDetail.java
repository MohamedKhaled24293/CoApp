package com.techoffice.Services.entity;

import java.io.Serializable;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * To create ID generator sequence "CO_REQUEST_DETAIL_ID_SEQ_GEN":
 * CREATE SEQUENCE "CO_REQUEST_DETAIL_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "CoRequestDetail.findAll", query = "select o from CoRequestDetail o") })
@Table(name = "CO_REQUEST_DETAIL")
@SequenceGenerator(name = "CoRequestDetail_Id_Seq_Gen", sequenceName = "CO_REQUEST_DETAIL_ID_SEQ_GEN",
                   allocationSize = 50, initialValue = 50)
public class CoRequestDetail implements Serializable {
    @Temporal(TemporalType.DATE)
    @Column(name = "ACTION_DATE")
    private Date actionDate;
    @Column(name = "ACTION_ORDER", nullable = false)
    private Long actionOrder;
    @Column(name = "APPOINTMENT_TYPE")
    private Long appointmentType;
    @Column(name = "ASSIGNATION_ID")
    private Long assignationId;
    @Column(name = "CO_REQUEST_ID")
    private Long coRequestId;
    @Column(name = "CREATED_BY", length = 155)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "DECISION_ID", nullable = false)
    private Long decisionId;
    @Column(name = "EXTERNAL_ENTITY_ID")
    private Long externalEntityId;
    @Column(name = "FROM_ENTITY_ID")
    private Long fromEntityId;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CoRequestDetail_Id_Seq_Gen")
    private Long id;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_APPOINTMENT_DATE")
    private Date lastAppointmentDate;
    private String message;
    private String notes;
    @Column(name = "OTHER_ASSIGNATION", length = 500)
    private String otherAssignation;
    @Column(name = "REASONS_OF_REJECT", length = 500)
    private String reasonsOfReject;
    @Column(name = "REASONS_OF_SAVE", length = 500)
    private String reasonsOfSave;
    @Column(name = "RELATED_TO_APPOINTMENT", length = 1)
    private String relatedToAppointment;
    @Column(name = "REPLY_MESSAGE")
    private String replyMessage;
    @Column(name = "STATUS_ID")
    private Long statusId;
    @Column(name = "TO_ENTITY_ID")
    private Long toEntityId;
    @Column(name = "UPDATED_BY", length = 155)
    private String updatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    @Column(name = "USER_ID")
    private Long userId;

    public CoRequestDetail() {
    }

    public CoRequestDetail(Date actionDate, Long actionOrder, Long appointmentType,
                           Long assignationId, Long coRequestId, String createdBy, Date createdDate,
                           Long decisionId, Long externalEntityId, Long fromEntityId, Long id,
                           Date lastAppointmentDate, String message, String notes, String otherAssignation,
                           String reasonsOfReject, String reasonsOfSave, String relatedToAppointment,
                           String replyMessage, Long statusId, Long toEntityId, String updatedBy,
                           Date updatedDate, Long userId) {
        this.actionDate = actionDate;
        this.actionOrder = actionOrder;
        this.appointmentType = appointmentType;
        this.assignationId = assignationId;
        this.coRequestId = coRequestId;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.decisionId = decisionId;
        this.externalEntityId = externalEntityId;
        this.fromEntityId = fromEntityId;
        this.id = id;
        this.lastAppointmentDate = lastAppointmentDate;
        this.message = message;
        this.notes = notes;
        this.otherAssignation = otherAssignation;
        this.reasonsOfReject = reasonsOfReject;
        this.reasonsOfSave = reasonsOfSave;
        this.relatedToAppointment = relatedToAppointment;
        this.replyMessage = replyMessage;
        this.statusId = statusId;
        this.toEntityId = toEntityId;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
        this.userId = userId;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public Long getActionOrder() {
        return actionOrder;
    }

    public void setActionOrder(Long actionOrder) {
        this.actionOrder = actionOrder;
    }

    public Long getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(Long appointmentType) {
        this.appointmentType = appointmentType;
    }

    public Long getAssignationId() {
        return assignationId;
    }

    public void setAssignationId(Long assignationId) {
        this.assignationId = assignationId;
    }

    public Long getCoRequestId() {
        return coRequestId;
    }

    public void setCoRequestId(Long coRequestId) {
        this.coRequestId = coRequestId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(Long decisionId) {
        this.decisionId = decisionId;
    }

    public Long getExternalEntityId() {
        return externalEntityId;
    }

    public void setExternalEntityId(Long externalEntityId) {
        this.externalEntityId = externalEntityId;
    }

    public Long getFromEntityId() {
        return fromEntityId;
    }

    public void setFromEntityId(Long fromEntityId) {
        this.fromEntityId = fromEntityId;
    }

    public Long getId() {
        return id;
    }

    public Date getLastAppointmentDate() {
        return lastAppointmentDate;
    }

    public void setLastAppointmentDate(Date lastAppointmentDate) {
        this.lastAppointmentDate = lastAppointmentDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOtherAssignation() {
        return otherAssignation;
    }

    public void setOtherAssignation(String otherAssignation) {
        this.otherAssignation = otherAssignation;
    }

    public String getReasonsOfReject() {
        return reasonsOfReject;
    }

    public void setReasonsOfReject(String reasonsOfReject) {
        this.reasonsOfReject = reasonsOfReject;
    }

    public String getReasonsOfSave() {
        return reasonsOfSave;
    }

    public void setReasonsOfSave(String reasonsOfSave) {
        this.reasonsOfSave = reasonsOfSave;
    }

    public String getRelatedToAppointment() {
        return relatedToAppointment;
    }

    public void setRelatedToAppointment(String relatedToAppointment) {
        this.relatedToAppointment = relatedToAppointment;
    }

    public String getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        this.replyMessage = replyMessage;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getToEntityId() {
        return toEntityId;
    }

    public void setToEntityId(Long toEntityId) {
        this.toEntityId = toEntityId;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
