package Enum;

public enum XepLoai {
    gioi("giỏi"),       //0
    kha("khá"),        //1
    tb("trung bình"),         //2
    yeu("yếu"),        //3
    duoihoc("bị đuổi học");    //4

    private String msg;
    XepLoai(String msg) {
        this.msg = msg;
    }
    String des(){
        return this.msg;
    }
}
