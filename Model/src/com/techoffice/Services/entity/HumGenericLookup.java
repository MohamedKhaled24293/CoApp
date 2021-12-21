package com.techoffice.Services.entity;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * To create ID generator sequence "HUM_GENERIC_LOOKUP_ID_SEQ_GEN":
 * CREATE SEQUENCE "HUM_GENERIC_LOOKUP_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@NamedQueries({ @NamedQuery(name = "HumGenericLookup.findAll", query = "select o from HumGenericLookup o") })
@Table(name = "HUM_GENERIC_LOOKUP")
@SequenceGenerator(name = "HumGenericLookup_Id_Seq_Gen", sequenceName = "HUM_GENERIC_LOOKUP_ID_SEQ",
                   allocationSize = 1, initialValue = 1)
public class HumGenericLookup implements Serializable {
    private static final long serialVersionUID = 5748853805997446818L;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HumGenericLookup_Id_Seq_Gen")
    private Long id;
    @Column(name = "LOOKUP_DESCRIPTION")
    private String lookupDescription;
    @Column(name = "LOOKUP_NAME", length = 100)
    private String lookupName;
    @OneToMany(mappedBy = "humGenericLookup", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<HumGenericLookupValues> humGenericLookupValuesList;

    public HumGenericLookup() {
    }

    public HumGenericLookup(Long id, String lookupDescription, String lookupName) {
        this.id = id;
        this.lookupDescription = lookupDescription;
        this.lookupName = lookupName;
    }

    public Long getId() {
        return id;
    }

    public String getLookupDescription() {
        return lookupDescription;
    }

    public void setLookupDescription(String lookupDescription) {
        this.lookupDescription = lookupDescription;
    }

    public String getLookupName() {
        return lookupName;
    }

    public void setLookupName(String lookupName) {
        this.lookupName = lookupName;
    }

    public List<HumGenericLookupValues> getHumGenericLookupValuesList() {
        return humGenericLookupValuesList;
    }

    public void setHumGenericLookupValuesList(List<HumGenericLookupValues> humGenericLookupValuesList) {
        this.humGenericLookupValuesList = humGenericLookupValuesList;
    }

    public HumGenericLookupValues addHumGenericLookupValues(HumGenericLookupValues humGenericLookupValues) {
        getHumGenericLookupValuesList().add(humGenericLookupValues);
        humGenericLookupValues.setHumGenericLookup(this);
        return humGenericLookupValues;
    }

    public HumGenericLookupValues removeHumGenericLookupValues(HumGenericLookupValues humGenericLookupValues) {
        getHumGenericLookupValuesList().remove(humGenericLookupValues);
        humGenericLookupValues.setHumGenericLookup(null);
        return humGenericLookupValues;
    }
}
