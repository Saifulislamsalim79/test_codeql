package io.intercom.android.sdk.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.LongTermImageLoader;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.com.bumptech.glide.C10486i;
import java.io.IOException;
/* loaded from: classes3.dex */
public class WallpaperLoader {
    private final Provider<AppConfig> appConfigProvider;
    private final LongTermImageLoader imageLoader;
    private final C10486i requestManager;

    WallpaperLoader(LongTermImageLoader longTermImageLoader, Provider<AppConfig> provider, C10486i c10486i) {
        this.imageLoader = longTermImageLoader;
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
    }

    public static WallpaperLoader create(Context context, Provider<AppConfig> provider, C10486i c10486i) {
        return new WallpaperLoader(LongTermImageLoader.newInstance(context), provider, c10486i);
    }

    public void close() throws IOException {
        this.imageLoader.close();
    }

    public void loadWallpaperInto(final ImageView imageView) {
        String wallpaper = this.appConfigProvider.get().getWallpaper();
        if (TextUtils.isEmpty(wallpaper)) {
            return;
        }
        this.imageLoader.loadImage(wallpaper, new LongTermImageLoader.OnImageReadyListener() { // from class: io.intercom.android.sdk.imageloader.WallpaperLoader.1
            @Override // io.intercom.android.sdk.imageloader.LongTermImageLoader.OnImageReadyListener
            public void onImageReady(Bitmap bitmap) {
                Context context = imageView.getContext();
                if (context == null) {
                    return;
                }
                bitmap.setDensity(160);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                BackgroundUtils.setBackground(imageView, bitmapDrawable);
            }
        }, this.requestManager);
    }
}
