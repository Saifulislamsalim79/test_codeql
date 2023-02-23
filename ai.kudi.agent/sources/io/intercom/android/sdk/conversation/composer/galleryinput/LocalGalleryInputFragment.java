package io.intercom.android.sdk.conversation.composer.galleryinput;

import com.intercom.input.gallery.GalleryInputFragment;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
/* loaded from: classes.dex */
public class LocalGalleryInputFragment extends GalleryInputFragment {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryInputFragment
    protected GalleryInputFragment.Injector getInjector(GalleryInputFragment galleryInputFragment) {
        LocalGalleryInputFragment r5 = this;
        C10486i $r1 = ComponentCallbacks2C10478c.m13017t(r5);
        LocalGalleryInputInjector r4 = new LocalGalleryInputInjector($r1);
        return r4;
    }
}
