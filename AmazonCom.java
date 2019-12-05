import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;


class AmazonCom
{
    public static void main(String[] args) {
        List<String> competitors = new ArrayList<>();
        competitors.add("newshop");
        competitors.add("shopnow");
        competitors.add("afshion");
        competitors.add("fashionbeats");
        competitors.add("mymarket");
        competitors.add("tcellular");

        List<String> reviews = new ArrayList<>();
        reviews.add("newshop is a providing good services in the city, everyone; everyone should use newshop");
        reviews.add("best services by newshop");
        reviews.add("fashionbeats has great services in the city");
        reviews.add("I am proud to have fashionbeats");
        reviews.add("mymarket has awesome services");
        reviews.add("Thanks Newshop for the quick delivery");

        process(6,2,6,competitors,reviews).forEach(System.out::println);;
    }

    private static List<String> process(int numOfCompetitors, int topNCompetitiors, int numOfReviews, List<String> competitors, List<String> reviews)
    {

        Map<String,Integer> compCount = new HashMap<>();

        for(String review: reviews)
        {
            for(String competitor : competitors)
            {
                if(review.toLowerCase().contains(competitor.toLowerCase()))
                {
                    int count = compCount.getOrDefault(competitor, 0);
                    compCount.put(competitor, count+1);

                    break;
                }
            }
        }

        return compCount.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .limit(topNCompetitiors)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
    }
}