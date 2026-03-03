package org.ap.utils;
public class GradeCalculator {

    public static double calculate(GradeKey[] key, Grade[] grades) {
        double weightedSum = 0;
        double activeWeight = 0;

        for (int i = 0; i < key.length; i++) {
            String currentCategory = key[i].getCategory();
            double weight = key[i].getWeightage();
            double categorySum = 0;
            int count = 0;

            // Calculate the average for the current category
            for (int j = 0; j < grades.length; j++) {
                if (grades[j].category.equalsIgnoreCase(currentCategory)) {
                    categorySum += grades[j].getPercentage();
                    count++;
                }
            }

            // Only factor in the weight if there are actually grades in this category
            if (count > 0) {
                double categoryAverage = categorySum / count;
                weightedSum += (categoryAverage * weight / 100);
                activeWeight += weight;
            }
        }

        return (weightedSum / activeWeight) * 100;
    }
}


