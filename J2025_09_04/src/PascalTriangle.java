import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ret = new ArrayList<>();
        //处理第一行
        list.add(1);
        ret.add(list);

        for (int i = 1; i < numRows; i++) {
            //处理每一行第一个元素为1
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            //中间
            List<Integer> preRow = ret.get(i - 1);
            for (int j = 1; j < i; j++) {
                //[i][j] = [i-1][j-1] + [i-1][j]
                int val = preRow.get(j - 1) + preRow.get(j);
                curRow.add(val);

            }

            //处理最后一个
            curRow.add(1);
            ret.add(curRow);

        }
        return ret;
    }
}
