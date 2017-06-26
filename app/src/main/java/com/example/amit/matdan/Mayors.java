package com.example.amit.matdan;

/**
 * Created by Amit Kumar on 6/23/2017.
 */
public class Mayors {
    private  String name;
    private String   partyname;
    private  int icon;

    public Mayors(String name , String partyname, int icon)
    {
        this.name = name;
        this.partyname = partyname;
        this.icon  = icon;
    }

    public String getName() {  return name;}

    public void setName(String name) {   this.name = name;}

    public String getPartyname() { return partyname;}

    public void setPartyname(String partyname) { this.partyname = partyname;}

    public int getIcon() {  return icon; }

    public void setIcon(int icon) {  this.icon = icon;}

}
