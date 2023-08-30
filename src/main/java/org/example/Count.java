package org.example;

public class Count {

    private static int totalCount = 0; // Statische Variable
    private int instanceCount = 0;     // Instanzielle Variable

    public Count() {
        totalCount++;
        instanceCount++;
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Count.totalCount = totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }
}
