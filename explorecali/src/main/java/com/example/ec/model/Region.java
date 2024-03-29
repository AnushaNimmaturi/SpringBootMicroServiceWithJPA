package com.example.ec.model;

public enum Region {
    Central_Coast("Central Coast"),
    Southern_California("Southern California"),
    Northern_California("Northern California"),
    Varies("Varies");

    private String label;
    private Region(String label){
        this.label = label;
    }
    public static Region findByLabel(String byLabel){
        for(Region region: Region.values()) {
            if (region.label.equalsIgnoreCase(byLabel)) {
                return region;
            }
        }
        return null;
    }
}
