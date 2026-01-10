class Solution {
    public String simplifyPath(String path) {
        String[] p = path.split("/");
        List<String> dirs = new ArrayList<>();

        for (int i = 0; i < p.length; i++) {
            if (p[i].equals("") || p[i].equals(".")) {
                continue;
            } else if (p[i].equals("..")) {
                if (!dirs.isEmpty()) {
                    dirs.remove(dirs.size() - 1);
                }
            } else {
                dirs.add(p[i]);
            }
        }

        if (dirs.isEmpty()) return "/";

        StringBuilder result = new StringBuilder();
        for (String dir : dirs) {
            result.append("/").append(dir);
        }

        return result.toString();
    }
}
