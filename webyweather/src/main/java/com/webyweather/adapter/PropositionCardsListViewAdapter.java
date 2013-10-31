package com.webyweather.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
import com.nostra13.universalimageloader.core.assist.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.webyweather.R;
import com.webyweather.constant.Constants;
import com.webyweather.dto.Proposition;
import com.webyweather.dto.Propositions;

import java.util.List;

/**
 * Project android
 *
 * @autor tair_mustafaiev
 * Date: 5/16/13
 * Time: 10:33 AM
 */
public class PropositionCardsListViewAdapter extends ArrayAdapter<Propositions> {


    private static final String TAG = "com.webyweather.android.adapter.PropositionCardsListViewAdapter";

    private final List<Propositions> cardItems;

    private final Context context;

    private final ImageLoadingListener fadeInDisplayListener;

    private final DisplayImageOptions imageOptions;

    private final ImageLoader imageLoader;

    private int totalHeight;


    public PropositionCardsListViewAdapter(Context context, List<Propositions> cards, ImageLoader loader) {
        super(context, R.layout.proposition_card_layout, cards);
        this.cardItems = cards;
        this.context = context;
        this.imageLoader = loader;
        this.fadeInDisplayListener = new FadeInDisplayListener();
        this.imageOptions = new DisplayImageOptions.Builder()
                .showImageForEmptyUri(R.drawable.no_image)
                .showImageOnFail(R.drawable.no_image)
                .cacheInMemory(true)
                .cacheOnDisc(true)
                .displayer(new RoundedBitmapDisplayer(20))
                .build();
    }

    @Override
    public int getCount() {
        if (cardItems != null) {
            return cardItems.size();
        }
        return 0;
    }

    public int getTotalHeight() {
        return totalHeight;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.proposition_card_layout, parent, false);

        if (cardItems != null && !cardItems.isEmpty()) {
            Proposition item = cardItems.get(position).getProposition();
            if (item != null) {
                TextView desc = (TextView) rowView.findViewById(R.id.description);
                TextView title = (TextView) rowView.findViewById(R.id.title);
                ImageView image = (ImageView) rowView.findViewById(R.id.proposition_image);
                Button shareButton = (Button) rowView.findViewById(R.id.share_button);
                desc.setText(item.getComments());
                title.setText(item.getTitle());
                imageLoader.displayImage(Constants.WEBYWEATHER_SERVICE_URL + item.getImage(), image, imageOptions, fadeInDisplayListener);
            }
            totalHeight = totalHeight + rowView.getHeight();
            return rowView;
        }
        return null;
    }

    private static class FadeInDisplayListener extends SimpleImageLoadingListener {

        @Override
        public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
            if (loadedImage != null) {
                ImageView imageView = (ImageView) view;
                FadeInBitmapDisplayer.animate(imageView, 200);
            }
        }
    }
}
