int[] average_grades(int grades[][], int weights[]) {
    int numStudents = grades.length;
    int[] averages = new int[numStudents];

    for (int x = 0; x < numStudents; x++) {
        int total = 0;
        for (int y = 0; y < grades[x].length; y++) {
            total += grades[x][y] * weights[y];
        }
        averages[x] = total / 100; 
    }
    
    return averages;
}

