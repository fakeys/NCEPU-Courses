import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word {
    public static void main(String args[]) {
        String text = "Abstract This paper presents an overview of the field of recommender systems and describes the current generation of recommendation methods that are usually classified into the following three main categories: content-based, collaborative, and hybrid recommendation approaches. This paper also describes various limitations of current recommendation methods and discusses possible extensions that can improve recommendation capabilities and make recommender systems applicable to an even broader range of applications. These extensions include, among others, an improvement of understanding of users and items, incorporation of the contextual information into the recommendation process, support for multcriteria ratings, and a provision of more flexible and less intrusive types of recommendations.";
        String[] str = text.split("\\s+");
        Result[] res = new Result[str.length];
        List<Result> list = new ArrayList<Result>();
        for(int i=0;i<str.length;i++) {
            int count = 0;
            res[i] = new Result();
            res[i].setWord(str[i]);
            for(String d:str) {
                if (res[i].getWord().equals(d))
                    res[i].setTimes(++count);
            }
        }
        for(int i=0;i<str.length;i++)
            for(int j=str.length-1;j>i;j--)
                if(res[i].getWord().equals(res[j].getWord()))
                    res[j].setWord(" ");
        Collections.addAll(list, res);
        Collections.reverse(list);
        Collections.sort(list);
        for(int i=str.length-1;i>=0;i--)
            if (!list.get(i).getWord().equals(" "))
            System.out.println(list.get(i).getWord() + ":" + list.get(i).getTimes());
    }
}

