package com.company;

import java.util.Scanner;

public class Dogs extends Pet {
    private boolean LikesWalks;
    private boolean canFetch;
    private String coatType;
    private Scanner input = new Scanner(System.in);

//    public Dogs(boolean likesWalks, boolean canFetch, String coatType) {
//        LikesWalks = likesWalks;
//        this.canFetch = canFetch;
//        this.coatType = coatType;
//        System.out.println("what is your digs name?");
//        setPetName(input.nextLine());
//        System.out.println("Does" + getPetName() + "Like to take walks? True or False");
//        setLikesWalks(input.nextBoolean()):
//    }

    public Dogs(boolean likesWalks, boolean canFetch, String coatType) {
        LikesWalks = likesWalks;
        this.canFetch = canFetch;
        this.coatType = coatType;

    }

    public boolean isLikesWalks() {

        return LikesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        LikesWalks = likesWalks;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }
}
