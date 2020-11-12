package com.example.ca1_20344;

public class Model {

    String teaName;
    String teaDetail;
    int teaPic;


    public Model(String teaName, String teaDetail, int teaPic) {
        this.teaName = teaName;
        this.teaDetail = teaDetail;
        this.teaPic = teaPic;
    }


    public String getTeaName() {
        return teaName;
    }

    public String getTeaDetail() {
        return teaDetail;
    }

    public int getTeaPic() {
        return teaPic;
    }


}
