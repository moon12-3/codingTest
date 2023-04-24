class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
            int a = 0;
            for(int j = 0; j < photo[i].length; j++) {
                for(int z = 0; z < name.length; z++) {
                    if(name[z].equals(photo[i][j])) {
                        a+=yearning[z];
                        break;
                    }
                }
            }
            answer[i] = a;
        }
        return answer;
    }
}
