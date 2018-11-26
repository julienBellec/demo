package fr.jbellec.common;

import java.util.Objects;

public class Publication {

    static int generateId = 1;

    private int id;
    private String title;
    private int geoLevel;

    public Publication() {

    }

    public Publication(String title, int geoLevel) {
        this.id = generateId++;
        this.title = title;
        this.geoLevel = geoLevel;
    }

    public static Publication fromArray(String[] infos) {
        return new Publication(Objects.requireNonNull(infos[0]),
                Integer.valueOf(Objects.requireNonNull(infos[1])));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGeoLevel() {
        return geoLevel;
    }

    public void setGeoLevel(int geoLevel) {
        this.geoLevel = geoLevel;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + geoLevel;
        result = prime * result + id;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publication other = (Publication) obj;
        if (geoLevel != other.geoLevel)
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Publication [id=" + id + ", title=" + title + ", geoLevel=" + geoLevel + "]";
    }

}
