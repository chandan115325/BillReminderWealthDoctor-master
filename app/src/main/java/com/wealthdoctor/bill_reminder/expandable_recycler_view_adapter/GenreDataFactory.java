package com.wealthdoctor.bill_reminder.expandable_recycler_view_adapter;


import com.wealthdoctor.R;

import java.util.Arrays;
import java.util.List;

public class GenreDataFactory {

    public static List<Genre> makeGenres() {
        return Arrays.asList(makeRockGenre(),
                makeJazzGenre(),
                makeClassicGenre(),
                makeSalsaGenre(),
                makeBluegrassGenre());
    }


    public static Genre makeRockGenre() {
        return new Genre("Airtel", makeRockArtists(), R.mipmap.ic_launcher_round);
    }


    public static List<Artist> makeRockArtists() {
        Artist airtel = new Artist("Already Paid", R.id.child_delete, R.id.child_edit, true);
        return Arrays.asList(airtel);
    }

    public static Genre makeJazzGenre() {
        return new Genre("SBI", makeJazzArtists(), R.mipmap.ic_launcher_round);
    }


    public static List<Artist> makeJazzArtists() {
        Artist SBI = new Artist("Already Paid", R.id.child_delete, R.id.child_edit, true);

        return Arrays.asList(SBI);
    }

    public static Genre makeClassicGenre() {
        return new Genre("Axis Bank", makeClassicArtists(), R.mipmap.ic_launcher_round);
    }


    public static List<Artist> makeClassicArtists() {
        Artist AxisBank = new Artist("Already Paid", R.id.child_delete, R.id.child_edit, true);
        return Arrays.asList(AxisBank);
    }

    public static Genre makeSalsaGenre() {
        return new Genre("BMTC", makeSalsaArtists(), R.mipmap.ic_launcher_round);
    }


    public static List<Artist> makeSalsaArtists() {
        Artist BMTC = new Artist("Already Paid", R.id.child_delete, R.id.child_edit, true);
        return Arrays.asList(BMTC);
    }

    public static Genre makeBluegrassGenre() {
        return new Genre("BSNL", makeBluegrassArtists(), R.mipmap.ic_launcher_round);
    }


    public static List<Artist> makeBluegrassArtists() {
        Artist BSNL = new Artist("Already Paid", R.id.child_delete, R.id.child_edit, true);
        return Arrays.asList(BSNL);
    }

}

