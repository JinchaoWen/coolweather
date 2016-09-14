package com.coolweather.app.model;

/**
 * Created by dell on 2016/9/12.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId(){
        return id;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setId(int id){
        this.id = id;
    }
}
