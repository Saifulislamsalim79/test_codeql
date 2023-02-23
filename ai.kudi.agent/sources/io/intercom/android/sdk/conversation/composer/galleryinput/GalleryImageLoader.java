package io.intercom.android.sdk.conversation.composer.galleryinput;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.content.C1335a;
import com.intercom.composer.ImageLoader;
import com.intercom.input.gallery.GalleryImage;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.EnumC10508b;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.load.engine.GlideException;
import io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10783c;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10855f;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
/* loaded from: classes.dex */
class GalleryImageLoader implements ImageLoader {
    private static final float GIF_SIZE_MULTIPLIER = 0.5f;
    private final AbstractC10544i diskCacheStrategy;
    private final C10486i requestManager;
    private final AbstractC10742e transformation;

    GalleryImageLoader(AbstractC10544i abstractC10544i, AbstractC10742e abstractC10742e, C10486i c10486i) {
        this.diskCacheStrategy = abstractC10544i;
        this.transformation = abstractC10742e;
        this.requestManager = c10486i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GalleryImageLoader create(AbstractC10544i abstractC10544i, AbstractC10742e abstractC10742e, C10486i c10486i) {
        GalleryImageLoader $r3 = new GalleryImageLoader(abstractC10544i, abstractC10742e, c10486i);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Bitmap getBitmapFromDrawable(Drawable drawable) {
        boolean $z0 = drawable instanceof BitmapDrawable;
        if ($z0) {
            BitmapDrawable $r3 = (BitmapDrawable) drawable;
            Bitmap $r1 = $r3.getBitmap();
            return $r1;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void logErrorMessageForUrl(Exception exc, String str) {
        Twig $r3 = LumberMill.getLogger();
        String $r2 = "Failed to load image for URL: " + str + " - ";
        if (exc == null) {
            Object[] $r5 = new Object[0];
            $r3.m13068e($r2 + "no error message, data probably failed to decode", $r5);
            return;
        }
        Object[] $r52 = new Object[0];
        $r3.m13068e($r2 + exc.getMessage(), $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.composer.ImageLoader
    public void clear(ImageView imageView) {
        C10486i $r2 = this.requestManager;
        $r2.m12982d(imageView);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.composer.ImageLoader
    public Bitmap getBitmapFromView(ImageView imageView) {
        Drawable $r2 = imageView.getDrawable();
        boolean $z0 = $r2 instanceof TransitionDrawable;
        if ($z0) {
            TransitionDrawable $r3 = (TransitionDrawable) $r2;
            int $i0 = $r3.getNumberOfLayers();
            for (int $i02 = $i0 - 1; $i02 >= 0; $i02--) {
                Bitmap $r4 = getBitmapFromDrawable($r3.getDrawable($i02));
                if ($r4 != null) {
                    return $r4;
                }
            }
            return null;
        }
        return getBitmapFromDrawable($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.intercom.composer.ImageLoader
    public void loadImageIntoView(GalleryImage galleryImage, ImageView imageView) {
        boolean $z0 = TextUtils.isEmpty(galleryImage.getPreviewPath());
        final String $r3 = $z0 ? galleryImage.getPath() : galleryImage.getPreviewPath();
        Context $r4 = imageView.getContext();
        C10856g $r5 = new C10856g();
        AbstractC10544i $r6 = this.diskCacheStrategy;
        C10856g $r52 = $r5.m12144f($r6);
        int $i0 = C10110R.color.intercom_search_bg_grey;
        ColorDrawable $r7 = new ColorDrawable(C1335a.m36324d($r4, $i0));
        C10856g $r53 = $r52.m12153a0($r7);
        C10856g $r8 = $r53;
        AbstractC10742e $r9 = this.transformation;
        if ($r9 != null) {
            $r8 = $r53.m12133l0($r9);
        }
        C10486i $r10 = this.requestManager;
        C10483h $r11 = $r10.m12977i($r3);
        boolean $z02 = ImageUtils.isGif($r3);
        if ($z02) {
            C10856g $r54 = $r8.m12138i0(GIF_SIZE_MULTIPLIER);
            EnumC10508b $r12 = EnumC10508b.PREFER_RGB_565;
            $r8 = $r54.m12134l($r12);
        }
        $r11.m13004b($r8);
        C10783c $r13 = C10783c.m12343h();
        $r11.m12986u($r13);
        $r11.m12993n(new InterfaceC10855f<Drawable>() { // from class: io.intercom.android.sdk.conversation.composer.galleryinput.GalleryImageLoader.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
            public boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC10869h<Drawable> interfaceC10869h, boolean z) {
                GalleryImageLoader $r42 = GalleryImageLoader.this;
                String $r55 = $r3;
                GlideException r6 = glideException;
                $r42.logErrorMessageForUrl(r6, $r55);
                return false;
            }

            /* renamed from: onResourceReady  reason: avoid collision after fix types in other method */
            public boolean onResourceReady2(Drawable drawable, Object obj, InterfaceC10869h interfaceC10869h, EnumC10507a enumC10507a, boolean z) {
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
            public /* bridge */ /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, InterfaceC10869h<Drawable> interfaceC10869h, EnumC10507a enumC10507a, boolean z) {
                Drawable $r55 = drawable;
                boolean $z03 = onResourceReady2($r55, obj, (InterfaceC10869h) interfaceC10869h, enumC10507a, z);
                return $z03;
            }
        });
        $r11.m12994l(imageView);
    }
}
