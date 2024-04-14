public interface Button {
    int MAX_MONTHS=24;
    String ARCHITECTURE="x64";

    String systemType(String type);
    double pixelsPerInch(int length, int width, double diagonal);
}
