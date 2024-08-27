package extendstest;

public class CaptionEx {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();

        // 채널, 색상, 전원 여부
        cTv.setChannel(11);
        cTv.setColor("black");
        cTv.power();

        cTv.channelUp();
        System.out.println("현재 체널 : " + cTv.getChannel());

        cTv.dispalyCation("안녕하세요");
        cTv.setCaption(true);
        cTv.dispalyCation("Hello World");
    }
}
