package GeniusSport;

import java.util.*;

public class Pagination {
    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemPerPage, int pageNumber) {
        final int parameter = sortParameter;
        if(items == null || items.size() == 0) {
            return new ArrayList<String>();
        }

        class Sort implements Comparator<List<String>> {
            public int compare(List<String> obj1, List<String> obj2) {
                if (parameter == 0)
                    return (obj1.get(parameter)).compareTo(obj2.get(parameter));
                else
                    return Integer.valueOf(obj1.get(parameter)).compareTo(Integer.valueOf(obj2.get(parameter)));
            }
        }

        class SortReverse implements Comparator<List<String>> {
            public int compare(List<String> obj1, List<String> obj2) {
                if (parameter == 0)
                    return (obj2.get(parameter)).compareTo(obj1.get(parameter));
                else
                    return Integer.valueOf(obj2.get(parameter)).compareTo(Integer.valueOf(obj1.get(parameter)));
            }
        }

        if(sortOrder == 0)
            Collections.sort(items, new Sort());
        else
            Collections.sort(items, new SortReverse());

        int offset = 0;
        if(pageNumber != 0)
            offset = (pageNumber - 1) * itemPerPage + 1;


        List resultItems = new ArrayList();
        int total = offset + itemPerPage;
        for (int i = offset; i < total; i++) {
            resultItems.add(items.get(i).get(0));
        }

        return resultItems;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("owjevtkuyv", "58584272", "62930912"));
        items.add(Arrays.asList("rpaqgbjxik","9425650", "96088250"));
        items.add(Arrays.asList("dfbkasyqcn", "37469674", "46363902"));
        items.add(Arrays.asList("vjrrisdfxe" ,"18666489", "88046739"));
        System.out.print(fetchItemsToDisplay(items, 2, 1, 2, 0));
    }
}
