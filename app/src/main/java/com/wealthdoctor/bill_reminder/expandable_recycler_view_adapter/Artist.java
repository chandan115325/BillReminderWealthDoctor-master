package com.wealthdoctor.bill_reminder.expandable_recycler_view_adapter;

import android.os.Parcel;
import android.os.Parcelable;

public class Artist implements Parcelable {

    private String name;
    private int delete;
    private int edit;
    private boolean isFavorite;

    public Artist( String name,int delete, int edit, boolean isFavorite) {
        this.name = name;
        this.isFavorite = isFavorite;
        this.delete = delete;
        this.edit = edit;
    }



    protected Artist(Parcel in) {
        name = in.readString();
        delete = in.readInt();
        edit = in.readInt();
        isFavorite = in.readByte() != 0;
    }

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    public int getEdit() {
        return edit;
    }

    public void setEdit(int edit) {
        this.edit = edit;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(delete);
        dest.writeInt(edit);
        dest.writeByte((byte) (isFavorite ? 1 : 0));
    }



    public String getName() {
        return name;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;

        Artist artist = (Artist) o;

        if (isFavorite() != artist.isFavorite()) return false;
        return getName() != null ? getName().equals(artist.getName()) : artist.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (isFavorite() ? 1 : 0);
        return result;
    }



}

