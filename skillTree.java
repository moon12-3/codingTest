class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        for(int i = 0; i < skill_trees.length; i++) { 
            int cnt = 0;
            for(int j = 0; j < skill_trees[i].length(); j++) {
                int z;
                for(z = cnt; z < skill.length(); z++) {
                    if(skill_trees[i].charAt(j)==skill.charAt(z)) break;
                }
                if(z==skill.length()) continue;
                else {
                    if(skill.charAt(cnt)==skill_trees[i].charAt(j)) {
                        cnt++;
                        continue;
                    }
                    else {
                        answer--;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
