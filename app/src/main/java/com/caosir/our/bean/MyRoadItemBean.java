package com.caosir.our.bean;

/**
 * 创建人: caosir
 * 创建时间：2017/8/1
 * 修改人：
 * 修改时间：
 * 类说明：
 */

public class MyRoadItemBean {
    public static final int TYPE_MYROAD = 1;
    public static final int TYPE_TIME = 0;

    public String getTime() {
        return time;
    }

    private int type ;
    private String title1 ;
    private String title2 ;
    private int typeImage;
    private int myRoadImage;
    private String time ;

    public MyRoadItemBean(int type, String title1, String title2, int typeImage, int myRoadImage) {
        this.type = type;
        this.title1 = title1;
        this.title2 = title2;
        this.typeImage = typeImage;
        this.myRoadImage = myRoadImage;
    }

    public MyRoadItemBean(int type, String time) {
        this.type = type;
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
    }

    public int getTypeImage() {
        return typeImage;
    }

    public int getMyRoadImage() {
        return myRoadImage;
    }
}
