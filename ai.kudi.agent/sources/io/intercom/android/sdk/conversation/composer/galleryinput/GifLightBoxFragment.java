package io.intercom.android.sdk.conversation.composer.galleryinput;

import com.intercom.composer.ImageLoader;
import com.intercom.input.gallery.GalleryLightBoxFragment;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
/* loaded from: classes.dex */
public class GifLightBoxFragment extends GalleryLightBoxFragment {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.input.gallery.GalleryLightBoxFragment
    protected GalleryLightBoxFragment.Injector getInjector(GalleryLightBoxFragment galleryLightBoxFragment) {
        return new GalleryLightBoxFragment.Injector() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GifLightBoxFragment.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.intercom.input.gallery.GalleryLightBoxFragment.Injector
            public ImageLoader getImageLoader(GalleryLightBoxFragment galleryLightBoxFragment2) {
                AbstractC10544i $r1 = AbstractC10544i.f24237b;
                GalleryLightBoxFragment r5 = galleryLightBoxFragment2;
                C10486i $r3 = ComponentCallbacks2C10478c.m13017t(r5);
                GalleryImageLoader $r4 = GalleryImageLoader.create($r1, null, $r3);
                return $r4;
            }
        };
    }
}
