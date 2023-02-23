package io.intercom.android.sdk.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.WindowUtils;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10783c;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import java.io.IOException;
/* loaded from: classes3.dex */
public class HomeToolbar extends Toolbar {
    private final ImageView backgroundImage;
    private final TextView greeting;
    private final TextView intro;
    private final ImageView logo;

    public HomeToolbar(Context context) {
        this(context, null);
    }

    public void animateIn(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), C10110R.anim.intercom_home_header_slide_in));
    }

    public void closeWallpaperLoader(WallpaperLoader wallpaperLoader) {
        try {
            wallpaperLoader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getContentHeight(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(ScreenUtils.getScreenDimensions(getContext()).x, 1073741824), 0);
        return view.getMeasuredHeight();
    }

    public int getDefaultToolbarHeight(Resources resources) {
        return resources.getDimensionPixelSize(C10110R.dimen.intercom_toolbar_height) + WindowUtils.getStatusBarHeight(resources);
    }

    public void loadWallpaper(WallpaperLoader wallpaperLoader) {
        wallpaperLoader.loadWallpaperInto(this.backgroundImage);
    }

    public void updateContent(AppConfig appConfig, C10486i c10486i) {
        View findViewById = findViewById(C10110R.C10112id.toolbar_content_container);
        findViewById.setVisibility(appConfig.isReceivedFromServer() ? 0 : 8);
        String teamGreeting = appConfig.getTeamGreeting();
        String teamIntro = appConfig.getTeamIntro();
        String messengerLogoUrl = appConfig.getMessengerLogoUrl();
        if (TextUtils.isEmpty(teamGreeting)) {
            this.greeting.setVisibility(8);
        } else {
            this.greeting.setVisibility(0);
            if (!this.greeting.getText().toString().equals(teamGreeting)) {
                this.greeting.setText(teamGreeting);
            }
        }
        if (TextUtils.isEmpty(teamIntro)) {
            this.intro.setVisibility(8);
        } else {
            this.intro.setVisibility(0);
            this.intro.setText(teamIntro);
        }
        if (TextUtils.isEmpty(messengerLogoUrl)) {
            this.logo.setVisibility(8);
        } else {
            this.logo.setVisibility(0);
            C10856g m12144f = new C10856g().m12144f(ImageUtils.getDiskCacheStrategy(messengerLogoUrl));
            C10483h<Drawable> m12977i = c10486i.m12977i(messengerLogoUrl);
            m12977i.m12986u(C10783c.m12343h());
            m12977i.m13004b(m12144f);
            m12977i.m12994l(this.logo);
        }
        setLayoutParams(new AppBarLayout.C4495d(-1, appConfig.isReceivedFromServer() ? getContentHeight(findViewById) : getDefaultToolbarHeight(findViewById.getResources())));
        requestLayout();
    }

    public void updateToolbarColors(AppConfig appConfig) {
        boolean secondaryColorRenderDarkText = appConfig.secondaryColorRenderDarkText();
        ColorUtils.setTextColorWhiteOrBlack(this.intro, secondaryColorRenderDarkText);
        ColorUtils.setTextColorWhiteOrBlack(this.greeting, secondaryColorRenderDarkText);
    }

    public HomeToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = ViewGroup.inflate(context, C10110R.C10113layout.intercom_home_toolbar, this);
        this.greeting = (TextView) inflate.findViewById(C10110R.C10112id.intercom_toolbar_greeting);
        this.intro = (TextView) inflate.findViewById(C10110R.C10112id.intercom_toolbar_intro);
        this.logo = (ImageView) inflate.findViewById(C10110R.C10112id.intercom_toolbar_logo);
        this.backgroundImage = (ImageView) inflate.findViewById(C10110R.C10112id.wallpaper_image);
    }
}
