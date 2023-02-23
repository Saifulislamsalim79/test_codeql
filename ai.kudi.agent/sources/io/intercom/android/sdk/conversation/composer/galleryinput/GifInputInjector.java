package io.intercom.android.sdk.conversation.composer.galleryinput;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import com.intercom.composer.ImageLoader;
import com.intercom.input.gallery.GalleryInputDataSource;
import com.intercom.input.gallery.GalleryInputFragment;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e;
/* loaded from: classes.dex */
class GifInputInjector implements GalleryInputFragment.Injector {
    private final GifInputDataSource dataSource;
    private final C10486i requestManager;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GifInputInjector(C10486i c10486i) {
        Injector $r3 = Injector.get();
        FeedbackDialog $r4 = $r3.getApi();
        Injector $r32 = Injector.get();
        MetricTracker $r5 = $r32.getMetricTracker();
        GifInputDataSource $r2 = new GifInputDataSource($r4, $r5);
        this.dataSource = $r2;
        this.requestManager = c10486i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public GalleryInputDataSource getDataSource(GalleryInputFragment galleryInputFragment) {
        GifInputDataSource r2 = this.dataSource;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public String getEmptyViewSubtitle(Resources resources) {
        int $i0 = C10110R.string.intercom_no_gifs_matching_query;
        String $r1 = resources.getString($i0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public String getEmptyViewTitle(Resources resources) {
        int $i0 = C10110R.string.intercom_no_gifs_found;
        String $r1 = resources.getString($i0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public String getErrorViewSubtitle(Resources resources) {
        int $i0 = C10110R.string.intercom_try_again_minute;
        String $r1 = resources.getString($i0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public String getErrorViewTitle(Resources resources) {
        int $i0 = C10110R.string.intercom_gifs_load_error;
        String $r1 = resources.getString($i0);
        return $r1;
    }

    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public View getExpanderButton(ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public ImageLoader getImageLoader(GalleryInputFragment galleryInputFragment) {
        AbstractC10544i $r5 = AbstractC10544i.f24237b;
        AbstractC10742e $r1 = DownscaleOnlyCenterCrop.INSTANCE;
        C10486i $r2 = this.requestManager;
        AbstractC10742e r6 = $r1;
        GalleryImageLoader $r3 = GalleryImageLoader.create($r5, r6, $r2);
        return $r3;
    }

    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public Class getLightBoxFragmentClass(GalleryInputFragment galleryInputFragment) {
        return GifLightBoxFragment.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public View getSearchView(ViewGroup viewGroup) {
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        int $i0 = C10110R.C10113layout.intercom_gif_input_search;
        View $r4 = $r3.inflate($i0, viewGroup, false);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public int getThemeColor(Context context) {
        Injector $r2 = Injector.get();
        Provider $r3 = $r2.getAppConfigProvider();
        Object $r4 = $r3.get();
        AppConfig $r5 = (AppConfig) $r4;
        int $i0 = ColorUtils.primaryOrDarkColor(context, $r5);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public Toolbar getToolbar(ViewGroup viewGroup) {
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        int $i0 = C10110R.C10113layout.intercom_gif_input_toolbar;
        View $r4 = $r3.inflate($i0, viewGroup, false);
        Toolbar $r5 = (Toolbar) $r4;
        int $i02 = C10110R.C10112id.clear_search;
        View $r42 = $r5.findViewById($i02);
        final ImageButton $r6 = (ImageButton) $r42;
        int $i03 = C10110R.C10112id.search_bar;
        View $r43 = $r5.findViewById($i03);
        final EditText $r7 = (EditText) $r43;
        $r7.requestFocus();
        $r7.addTextChangedListener(new TextWatcher() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GifInputInjector.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                ImageButton $r22 = $r6;
                boolean $z0 = TextUtils.isEmpty(editable);
                byte $b0 = $z0 ? (byte) 8 : (byte) 0;
                $r22.setVisibility($b0);
                GifInputInjector $r32 = GifInputInjector.this;
                GifInputDataSource $r44 = $r32.dataSource;
                String $r52 = editable.toString();
                $r44.getImages(0, $r52);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        $r6.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GifInputInjector.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditText $r22 = $r7;
                $r22.setText((CharSequence) null);
            }
        });
        return $r5;
    }
}
