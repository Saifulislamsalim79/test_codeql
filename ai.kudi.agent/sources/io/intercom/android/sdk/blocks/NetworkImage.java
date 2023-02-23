package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.blocks.blockInterfaces.ImageBlock;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.transforms.RoundedCornersTransform;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.views.ResizableImageView;
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
public class NetworkImage extends Image implements ImageBlock {
    private static final int PROGRESSBAR_DIAMETER_DP = 40;
    private final ImageClickListener listener;
    private final C10486i requestManager;
    private final Twig twig;
    private final UploadingImageCache uploadingImageCache;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NetworkImage(StyleType styleType, UploadingImageCache uploadingImageCache, ImageClickListener imageClickListener, C10486i c10486i) {
        super(styleType);
        Twig $r4 = LumberMill.getLogger();
        this.twig = $r4;
        this.uploadingImageCache = uploadingImageCache;
        this.listener = imageClickListener;
        this.requestManager = c10486i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void loadImageFromUrl(final String str, final String str2, final Context context, final int $i0, final int i, final ResizableImageView resizableImageView, final ProgressBar progressBar) {
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            ResizableImageView r26 = resizableImageView;
            hideLoadingState(progressBar, r26);
            resizableImageView.setImageResource(C10110R.C10111drawable.intercom_error);
            return;
        }
        C10486i $r7 = this.requestManager;
        C10483h $r8 = $r7.m12977i(str);
        setImageViewBounds($i0, i, resizableImageView, $r8);
        UploadingImageCache $r9 = this.uploadingImageCache;
        String $r10 = $r9.getLocalImagePathForRemoteUrl(str);
        Resources $r11 = context.getResources();
        C10856g $r15 = new C10856g();
        int $i2 = C10110R.dimen.intercom_image_rounded_corners;
        RoundedCornersTransform r22 = new RoundedCornersTransform($r11.getDimensionPixelSize($i2));
        C10856g $r12 = $r15.m12133l0(r22);
        int $i22 = C10110R.C10111drawable.intercom_error;
        C10856g $r122 = $r12.m12137j($i22);
        AbstractC10544i $r14 = ImageUtils.getDiskCacheStrategy(str);
        C10856g $r123 = $r122.m12144f($r14);
        C10856g $r152 = $r123;
        boolean $z02 = TextUtils.isEmpty($r10);
        if (!$z02) {
            BitmapFactory.Options r23 = new BitmapFactory.Options();
            DisplayMetrics $r17 = $r11.getDisplayMetrics();
            int $i23 = getSampleSize($i0, i, $r17);
            r23.inSampleSize = $i23;
            Bitmap $r18 = BitmapFactory.decodeFile($r10, r23);
            BitmapDrawable r24 = new BitmapDrawable($r11, $r18);
            ColorFilter $r20 = ColorUtils.newGreyscaleFilter();
            r24.setColorFilter($r20);
            $r152 = $r123.m12153a0(r24).m12141h();
        }
        $r8.m13004b($r152);
        C10783c $r21 = C10783c.m12343h();
        $r8.m12986u($r21);
        $r8.m12993n(new InterfaceC10855f<Drawable>() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
            public boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC10869h<Drawable> interfaceC10869h, boolean z) {
                NetworkImage $r5 = NetworkImage.this;
                ProgressBar $r6 = progressBar;
                ImageView $r72 = resizableImageView;
                ImageView r8 = $r72;
                $r5.hideLoadingState($r6, r8);
                NetworkImage $r52 = NetworkImage.this;
                Twig $r1 = $r52.twig;
                $r1.internal("images", "FAILURE");
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: onResourceReady  reason: avoid collision after fix types in other method */
            public boolean onResourceReady2(Drawable drawable, Object obj, InterfaceC10869h interfaceC10869h, EnumC10507a enumC10507a, boolean z) {
                NetworkImage $r5 = NetworkImage.this;
                Twig $r6 = $r5.twig;
                $r6.internal("images", "SUCCESS");
                NetworkImage $r52 = NetworkImage.this;
                ProgressBar $r72 = progressBar;
                ImageView $r82 = resizableImageView;
                ImageView r13 = $r82;
                $r52.hideLoadingState($r72, r13);
                NetworkImage $r53 = NetworkImage.this;
                StyleType $r92 = $r53.getStyle();
                StyleType $r102 = StyleType.CHAT_FULL;
                if ($r92 != $r102) {
                    ImageView $r83 = resizableImageView;
                    ImageView r132 = $r83;
                    r132.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.NetworkImage.1.1
                        /* JADX WARN: Can't parse signature for local variable: 
                        java.lang.NullPointerException
                         */
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            C101871 $r4 = C101871.this;
                            Context $r54 = context;
                            Object $r62 = $r54.getSystemService("input_method");
                            InputMethodManager $r73 = (InputMethodManager) $r62;
                            IBinder $r84 = view.getWindowToken();
                            $r73.hideSoftInputFromWindow($r84, 0);
                            C101871 $r42 = C101871.this;
                            NetworkImage $r93 = NetworkImage.this;
                            ImageClickListener $r103 = $r93.listener;
                            C101871 $r43 = C101871.this;
                            String $r112 = str;
                            String $r113 = str2;
                            ImageView $r2 = resizableImageView;
                            int $i02 = $i0;
                            int $i03 = i;
                            ImageView r12 = $r2;
                            $r103.onImageClicked($r112, $r113, r12, $i02, $i03);
                        }
                    });
                    return false;
                }
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
            public /* bridge */ /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, InterfaceC10869h<Drawable> interfaceC10869h, EnumC10507a enumC10507a, boolean z) {
                Drawable $r5 = drawable;
                boolean $z03 = onResourceReady2($r5, obj, (InterfaceC10869h) interfaceC10869h, enumC10507a, z);
                return $z03;
            }
        });
        ResizableImageView r262 = resizableImageView;
        $r8.m12994l(r262);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.ImageBlock
    public View addImage(String str, String str2, int i, int i2, BlockAlignment blockAlignment, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r8 = viewGroup.getContext();
        float $f0 = i;
        int $i0 = ScreenUtils.dpToPx($f0, $r8);
        float $f02 = i2;
        int $i1 = ScreenUtils.dpToPx($f02, $r8);
        FrameLayout r12 = new FrameLayout($r8);
        BlockUtils.createLayoutParams(r12, -2, -2);
        BlockUtils.setDefaultMarginBottom(r12);
        ResizableImageView r13 = new ResizableImageView($r8);
        if (Build.VERSION.SDK_INT >= 21) {
            ResizableImageView r16 = r13;
            r16.setTransitionName(LightBoxActivity.TRANSITION_KEY);
        }
        ViewGroup.LayoutParams r14 = new FrameLayout.LayoutParams(-2, -2);
        ResizableImageView r162 = r13;
        r162.setLayoutParams(r14);
        ResizableImageView r163 = r13;
        r163.setAdjustViewBounds(true);
        ImageView.ScaleType $r10 = ImageView.ScaleType.FIT_START;
        ResizableImageView r164 = r13;
        r164.setScaleType($r10);
        ResizableImageView r165 = r13;
        setBackground(r165);
        ProgressBar r15 = new ProgressBar($r8);
        int $i2 = ScreenUtils.dpToPx(40.0f, $r8);
        FrameLayout.LayoutParams r142 = new FrameLayout.LayoutParams($i2, $i2, 17);
        r15.setLayoutParams(r142);
        Drawable $r11 = C1335a.m36322f($r8, C10110R.C10111drawable.intercom_progress_wheel);
        r15.setIndeterminateDrawable($r11);
        r15.setIndeterminate(true);
        ResizableImageView r17 = r13;
        r12.addView(r17);
        r12.addView(r15);
        loadImageFromUrl(str, str2, $r8, $i0, $i1, r13, r15);
        int $i02 = blockAlignment.getGravity();
        BlockUtils.setLayoutMarginsAndGravity(r12, $i02, z2);
        return r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    int getSampleSize(int i, int i2, DisplayMetrics displayMetrics) {
        int $i2 = displayMetrics.widthPixels;
        if (i <= $i2) {
            int $i22 = displayMetrics.heightPixels;
            if (i2 <= $i22) {
                return 1;
            }
        }
        int $i23 = displayMetrics.widthPixels;
        double $d0 = $i23;
        int $i1 = Math.max(i2, i);
        double $d1 = $i1;
        Double.isNaN($d0);
        Double.isNaN($d1);
        int $i12 = (int) Math.ceil(Math.log($d0 / $d1) / Math.log(0.5d));
        return (int) Math.pow(2.0d, $i12);
    }

    void hideLoadingState(ProgressBar progressBar, ImageView imageView) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
            imageView.setBackgroundResource(17170445);
        }
    }
}
