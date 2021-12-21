package com.techoffice.Services.entity;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * To create ID generator sequence "HUM_GENERIC_LOOKUP_VALUES_ID_SEQ_GEN":
 * CREATE SEQUENCE "HUM_GENERIC_LOOKUP_VALUES_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({
              @NamedQuery(name = "HumGenericLookupValues.findAll", query = "select o from HumGenericLookupValues o") })
@Table(name = "HUM_GENERIC_LOOKUP_VALUES")
@SequenceGenerator(name = "HumGenericLookupValues_Id_Seq_Gen", sequenceName = "HUM_GENERIC_LOOKUP_VALUES_SEQ",
                   allocationSize = 1, initialValue = 1)
public class HumGenericLookupValues implements Serializable {
    private static final long serialVersionUID = -186678996894227133L;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HumGenericLookupValues_Id_Seq_Gen")
    private Long id;
    @Column(name = "VALUE_CODE", length = 100)
    private String valueCode;
    @Column(name = "VALUE_TITLE", length = 150)
    private String valueTitle;
    @ManyToOne
    @JoinColumn(name = "GENERIC_LOOKUP_ID")
    private HumGenericLookup humGenericLookup;

    public HumGenericLookupValues() {
    }

    


    public Long getId() {
        return id;
    }

    public String getValueCode() {
        return valueCode;
    }

    public void setValueCode(String valueCode) {
        this.valueCode = valueCode;
    }

    public String getValueTitle() {
        return valueTitle;
    }

    public void setValueTitle(String valueTitle) {
        this.valueTitle = valueTitle;
    }

    public HumGenericLookup getHumGenericLookup() {
        return humGenericLookup;
    }

    public void setHumGenericLookup(HumGenericLookup humGenericLookup) {
        this.humGenericLookup = humGenericLookup;
    }
}
