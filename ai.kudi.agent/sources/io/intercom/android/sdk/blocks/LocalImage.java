package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.blocks.blockInterfaces.LocalImageBlock;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.transforms.RoundedCornersTransform;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.views.ProgressFrameLayout;
import io.intercom.android.sdk.views.ResizableImageView;
import io.intercom.android.sdk.views.UploadProgressBar;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.load.engine.GlideException;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10783c;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10855f;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LocalImage extends Image implements LocalImageBlock {
    private final C10486i requestManager;
    private final Twig twig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LocalImage(StyleType styleType, C10486i c10486i) {
        super(styleType);
        Twig $r2 = LumberMill.getLogger();
        this.twig = $r2;
        this.requestManager = c10486i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.LocalImageBlock
    public View addImage(String str, int i, int i2, BlockAlignment blockAlignment, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r5 = viewGroup.getContext();
        float $f0 = i;
        int $i0 = ScreenUtils.dpToPx($f0, $r5);
        float $f02 = i2;
        int $i1 = ScreenUtils.dpToPx($f02, $r5);
        ProgressFrameLayout r20 = new ProgressFrameLayout($r5);
        ProgressFrameLayout $r10 = r20;
        BlockUtils.createLayoutParams($r10, -2, -2);
        ProgressFrameLayout $r102 = r20;
        BlockUtils.setDefaultMarginBottom($r102);
        final ResizableImageView r21 = new ResizableImageView($r5);
        ResizableImageView $r103 = r21;
        BlockUtils.createLayoutParams($r103, -2, -2);
        ResizableImageView r28 = r21;
        r28.setAdjustViewBounds(true);
        ImageView.ScaleType $r7 = ImageView.ScaleType.FIT_START;
        ResizableImageView r282 = r21;
        r282.setScaleType($r7);
        ProgressFrameLayout r29 = r20;
        ResizableImageView $r104 = r21;
        r29.addView($r104);
        C10486i $r8 = this.requestManager;
        C10483h $r9 = $r8.m12977i(str);
        setImageViewBounds($i0, $i1, r21, $r9);
        ProgressFrameLayout r292 = r20;
        View $r105 = r292.getChildAt(0);
        Resources $r11 = $r5.getResources();
        boolean $z1 = $r105 instanceof UploadProgressBar;
        if ($z1) {
            int $i02 = C10110R.dimen.intercom_local_image_upload_size;
            int $i03 = $r11.getDimensionPixelSize($i02);
            FrameLayout.LayoutParams r22 = new FrameLayout.LayoutParams($i03, $i03, 17);
            $r105.setLayoutParams(r22);
            $r105.bringToFront();
            r20.uploadStarted();
        }
        ResizableImageView r283 = r21;
        setBackground(r283);
        ColorMatrix r23 = new ColorMatrix();
        r23.setSaturation(0.0f);
        ColorFilter r24 = new ColorMatrixColorFilter(r23);
        ResizableImageView r284 = r21;
        r284.setColorFilter(r24);
        C10856g r25 = new C10856g();
        int $i04 = C10110R.dimen.intercom_image_rounded_corners;
        RoundedCornersTransform r26 = new RoundedCornersTransform($r11.getDimensionPixelSize($i04));
        C10856g $r15 = r25.m12133l0(r26);
        AbstractC10544i $r17 = ImageUtils.getDiskCacheStrategy(str);
        $r9.m13004b($r15.m12144f($r17));
        C10783c $r18 = C10783c.m12343h();
        $r9.m12986u($r18);
        $r9.m12993n(new InterfaceC10855f<Drawable>() { // from class: io.intercom.android.sdk.blocks.LocalImage.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
            public boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC10869h<Drawable> interfaceC10869h, boolean z3) {
                LocalImage $r52 = LocalImage.this;
                Twig $r1 = $r52.twig;
                $r1.internal("images", "FAILURE");
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: onResourceReady  reason: avoid collision after fix types in other method */
            public boolean onResourceReady2(Drawable drawable, Object obj, InterfaceC10869h interfaceC10869h, EnumC10507a enumC10507a, boolean z3) {
                LocalImage $r6 = LocalImage.this;
                Twig $r2 = $r6.twig;
                $r2.internal("images", "SUCCESS");
                ResizableImageView $r72 = r21;
                $r72.setBackgroundResource(17170445);
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
            public /* bridge */ /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, InterfaceC10869h<Drawable> interfaceC10869h, EnumC10507a enumC10507a, boolean z3) {
                Drawable $r52 = drawable;
                boolean $z0 = onResourceReady2($r52, obj, (InterfaceC10869h) interfaceC10869h, enumC10507a, z3);
                return $z0;
            }
        });
        ResizableImageView r285 = r21;
        $r9.m12994l(r285);
        int $i05 = blockAlignment.getGravity();
        ProgressFrameLayout $r106 = r20;
        BlockUtils.setLayoutMarginsAndGravity($r106, $i05, z2);
        ProgressFrameLayout $r107 = r20;
        return $r107;
    }
}
