package com.example.lastheap;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class ProductNdxpro  {


    String code;

    String label;

    String type;

    String detailLabel;

    @JsonIgnore
    int orderNuml;

    String standard;

    public String getStandard() {
        return standard;
    }

    public ProductNdxpro(String code, String label, String type, String detailLabel, int orderNuml, String standard) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.detailLabel = detailLabel;
        this.orderNuml = orderNuml;
        this.standard = standard;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public String getDetailLabel() {
        return detailLabel;
    }

    public int getOrderNuml() {
        return orderNuml;
    }

    @Override
    public String toString() {
        return "ProductNdxpro{" +
                "code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", type='" + type + '\'' +
                ", detailLabel='" + detailLabel + '\'' +
                ", orderNuml=" + orderNuml +
                ", standard='" + standard + '\'' +
                '}';
    }

}

