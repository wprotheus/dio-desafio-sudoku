package Model;

public enum GameStatusEnum {
    NON_STARTED("NOT STARTED"),
    INCOMPLETE("INCOMPLETE"),
    COMPLETE("COMPLETE");

    private String label;

    GameStatusEnum(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
