package src.homework2;

public enum Brand2 {
    AUDI(new Color2[]{Color2.BLUE, Color2.RED, Color2.GREEN }),
    BMW(new Color2[]{Color2.ORANGE, Color2.BLACK, Color2.PURPLE }),
    KIA(new Color2[]{Color2.YELLOW, Color2.GRAY, Color2.WHITE});
    private final Color2[] colors;
    Brand2(Color2[]colors){
        this.colors = colors;
    }
    public Color2[] getColors() {
            return colors;
    }
}