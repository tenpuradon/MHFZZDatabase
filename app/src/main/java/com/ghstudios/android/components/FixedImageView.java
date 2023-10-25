package com.ghstudios.android.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Mark on 3/2/2015.
 */
public class FixedImageView extends ImageView {

    public FixedImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    public FixedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public FixedImageView(Context context) {
        super(context);

    }

    @Override
    public void requestLayout() {
        /*
         * Do nothing here
         */
    }
}