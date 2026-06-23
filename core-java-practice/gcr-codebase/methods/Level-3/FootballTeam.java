class FootballTeam {
    public int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        FootballTeam obj = new FootballTeam();
        int[] heights = obj.generateHeights(11);

        System.out.println("Player Heights:");

        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nMean Height = " + obj.findMeanHeight(heights));
        System.out.println("Shortest Height = " + obj.findShortestHeight(heights));
        System.out.println("Tallest Height = " + obj.findTallestHeight(heights));
    }
}