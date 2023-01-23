package enums;

public enum UserLevel {
    
    SPROUT(99),
    SAPLING(499),
    TREE(999),
    FOREST(4999),
    REDWOODFOREST(5000);
    
    public int leaves;
    
    UserLevel(int leaves){
        this.leaves = leaves;
    }
    
    public static UserLevel getLevel(int score) {
        UserLevel found = SPROUT;
        for (UserLevel rank : values())
            if (rank.leaves <= score)
                found = rank;

        return found;
    }
}
