package src.homework2;

    public enum CarsColors {
    AUDI(new String[]{"blue", "red", "green"}),
    BMW (new String[]{"orange", "black", "purple"}),
    KIA (new String[]{"yellow", "gray", "white"}),;

        public String[] getAvailiableColors() {
            return availiableColors;
        }
        public final String[] availiableColors;
    CarsColors(String[] colorsArray) {
        this.availiableColors = colorsArray;
    }
}









