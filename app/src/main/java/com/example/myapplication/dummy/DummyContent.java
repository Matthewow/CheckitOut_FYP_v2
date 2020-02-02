package com.example.myapplication.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DummyContent {

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 6;

    static {
        // Add some sample items.
        for (int i = 0; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        if (position == 1)
            return new DummyItem(String.valueOf(position), "FCN8", makeDetails(position));
        if (position == 2)
            return new DummyItem(String.valueOf(position), "FCN8s", makeDetails(position));
        if (position == 3)
            return new DummyItem(String.valueOf(position), "SegNet", makeDetails(position));
        if (position == 4)
            return new DummyItem(String.valueOf(position), "UNet++", makeDetails(position));
        if (position == 5)
            return new DummyItem(String.valueOf(position), "Ours", makeDetails(position));
        if (position == 6)
            return new DummyItem(String.valueOf(position), "GT", makeDetails(position));

        return new DummyItem(String.valueOf(position), "Some NN", makeDetails(position));

    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("The result of Neural Network ").append(position).append(" is ");
        return builder.toString();
    }

    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
