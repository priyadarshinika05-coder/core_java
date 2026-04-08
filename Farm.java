class Farm {

    String farmName;
    String location;
    int numberOfAnimals;
    int numberOfCrops;
    String ownerName;
    double areaInAcres;
    boolean hasTractor;
    boolean hasIrrigationSystem;
    int establishedYear;
    String farmType;

   
    public boolean plantCrop(String cropName) {
        System.out.println("Crop Planted: " + cropName);
        return true;
    }

    public boolean harvestCrop(String cropName) {
        System.out.println("Crop Harvested: " + cropName);
        return true;
    }

    public boolean feedAnimals(String animalName) {
        System.out.println("Animal Fed: " + animalName);
        return true;
    }

    public boolean waterCrops(boolean status) {
        System.out.println("Crops Watered: " + status);
        return status;
    }

    public boolean sellProduce(String produceName) {
        System.out.println("Produce Sold: " + produceName);
        return true;
    }

    public boolean buySeeds(String seedName) {
        System.out.println("Seeds Bought: " + seedName);
        return true;
    }

    public boolean maintainTractor(boolean status) {
        System.out.println("Tractor Maintained: " + status);
        return status;
    }

    public boolean hireWorker(String workerName) {
        System.out.println("Worker Hired: " + workerName);
        return true;
    }

    public boolean manageFences(boolean status) {
        System.out.println("Fences Maintained: " + status);
        return status;
    }

    public String assignTask(String taskName) {
        System.out.println("Task Assigned: " + taskName);
        return taskName;
    }
}