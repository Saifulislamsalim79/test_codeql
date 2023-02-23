package io.intercom.android.sdk.conversation.composer.galleryinput;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import com.intercom.composer.ImageLoader;
import com.intercom.input.gallery.GalleryInputDataSource;
import com.intercom.input.gallery.GalleryInputFragment;
import com.intercom.input.gallery.LocalImagesDataSource;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e;
/* loaded from: classes.dex */
class LocalGalleryInputInjector implements GalleryInputFragment.Injector {
    private final C10486i requestManager;

    public LocalGalleryInputInjector(C10486i c10486i) {
        this.requestManager = c10486i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public GalleryInputDataSource getDataSource(GalleryInputFragment galleryInputFragment) {
        GalleryInputDataSource $r1 = LocalImagesDataSource.create(galleryInputFragment);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public String getEmptyViewSubtitle(Resources resources) {
        int $i0 = C10110R.string.intercom_no_photos_on_device;
        String $r1 = resources.getString($i0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public String getEmptyViewTitle(Resources resources) {
        int $i0 = C10110R.string.intercom_no_photos;
        String $r1 = resources.getString($i0);
        return $r1;
    }

    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public String getErrorViewSubtitle(Resources resources) {
        return null;
    }

    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public String getErrorViewTitle(Resources resources) {
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public View getExpanderButton(ViewGroup viewGroup) {
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        int $i0 = C10110R.C10113layout.intercom_expander_button;
        View $r4 = $r3.inflate($i0, viewGroup, false);
        ImageButton $r5 = (ImageButton) $r4;
        Context $r22 = $r5.getContext();
        int $i02 = getThemeColor($r22);
        $r5.setColorFilter($i02);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public ImageLoader getImageLoader(GalleryInputFragment galleryInputFragment) {
        AbstractC10544i $r5 = AbstractC10544i.f24236a;
        AbstractC10742e $r1 = DownscaleOnlyCenterCrop.INSTANCE;
        C10486i $r2 = this.requestManager;
        AbstractC10742e r6 = $r1;
        GalleryImageLoader $r3 = GalleryImageLoader.create($r5, r6, $r2);
        return $r3;
    }

    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public Class getLightBoxFragmentClass(GalleryInputFragment galleryInputFragment) {
        return LocalGalleryLightBoxFragment.class;
    }

    @Override // com.intercom.input.gallery.GalleryInputFragment.Injector
    public View getSearchView(ViewGroup viewGroup) {
        return null;
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
        int $i0 = C10110R.C10113layout.intercom_gallery_input_toolbar;
        View $r4 = $r3.inflate($i0, viewGroup, false);
        Toolbar $r5 = (Toolbar) $r4;
        return $r5;
    }
}
