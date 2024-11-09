package test;

public class HinhTamGiacV {
    public static float chuVi(float canhA, float cachB) {
        float canhHuyen = (float) Math.sqrt(canhA * canhA + cachB * cachB);
        return canhA + cachB + canhHuyen;
    }

    public static float dienTich(float canhA, float cachB) {
        return 0.5f * canhA * cachB;
    }

}
