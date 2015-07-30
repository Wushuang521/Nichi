
package com.zrc.android.activity;

import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.zrc.android.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.title_main_activity);
        
        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        ClipDrawable clipDrawable = (ClipDrawable) imageView.getBackground();
        // The default level is 0, which is fully clipped so the image is not visible. 
        // When the level is 10,000, the image is not clipped and completely visible.
        clipDrawable.setLevel(clipDrawable.getLevel() + 8000);
    }
}
