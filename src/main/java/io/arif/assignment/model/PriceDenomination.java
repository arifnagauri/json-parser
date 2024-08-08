package io.arif.assignment.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PriceDenomination {
    CRORE("Cr"),
    LAKH("L"),
    THOUSAND("T");

    private final String pd;

    PriceDenomination(final String pd) {
        this.pd = pd;
    }

    @JsonValue
    public String getValue() {
        return pd;
    }

    @Override
    public String toString() {
        return pd;
    }
}
