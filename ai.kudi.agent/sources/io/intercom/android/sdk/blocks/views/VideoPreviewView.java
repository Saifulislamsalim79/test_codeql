package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.engine.GlideException;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10783c;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10855f;
import io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h;
/* loaded from: classes.dex */
public class VideoPreviewView extends RelativeLayout {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 48;
    private final ProgressBar loadingSpinner;
    private final ImageView playButton;
    private final ImageView thumbnailImageView;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VideoPreviewView(Context context, Provider provider, StyleType styleType) {
        super(context);
        BlockUtils.createLayoutParams(this, -2, -2);
        BlockUtils.setDefaultMarginBottom(this);
        ImageView $r4 = getVideoImageView(context);
        this.thumbnailImageView = $r4;
        ImageView $r42 = getPlayButtonView(context);
        this.playButton = $r42;
        ProgressBar $r5 = getLoadingSpinner();
        this.loadingSpinner = $r5;
        ImageView $r43 = this.thumbnailImageView;
        addView($r43);
        ImageView $r44 = this.playButton;
        addView($r44);
        ProgressBar $r52 = this.loadingSpinner;
        addView($r52);
        Object $r6 = provider.get();
        AppConfig $r7 = (AppConfig) $r6;
        int $i0 = $r7.getPrimaryColor();
        int $i1 = $i0;
        StyleType $r8 = StyleType.POST;
        $i1 = styleType == $r8 ? ColorUtils.lightenColor($i0) : $i1;
        ImageView $r45 = this.playButton;
        PorterDuff.Mode $r9 = PorterDuff.Mode.SRC_ATOP;
        $r45.setColorFilter($i1, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ProgressBar getLoadingSpinner() {
        Context $r1 = getContext();
        int $i0 = C10110R.C10113layout.intercom_progress_bar;
        View $r2 = View.inflate($r1, $i0, null);
        int $i02 = C10110R.C10112id.progressBar;
        ProgressBar $r3 = (ProgressBar) $r2.findViewById($i02);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ImageView getPlayButtonView(Context context) {
        int $i0 = ScreenUtils.dpToPx(48.0f, context);
        RelativeLayout.LayoutParams $r2 = new RelativeLayout.LayoutParams($i0, $i0);
        $r2.addRule(13);
        ImageView $r3 = new ImageView(context);
        $r3.setLayoutParams($r2);
        ImageView.ScaleType $r4 = ImageView.ScaleType.CENTER;
        $r3.setScaleType($r4);
        $r3.setImageResource(C10110R.C10111drawable.intercom_play_arrow);
        $r3.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        $r3.setBackgroundResource(C10110R.C10111drawable.intercom_solid_circle);
        $r3.setVisibility(8);
        $r3.setId(C10110R.C10112id.intercom_video_thumbnail_play_button);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ImageView getVideoImageView(Context context) {
        RelativeLayout.LayoutParams $r1 = new RelativeLayout.LayoutParams(-2, -2);
        ImageView $r3 = new ImageView(context);
        $r3.setLayoutParams($r1);
        $r3.setAdjustViewBounds(true);
        ImageView.ScaleType $r4 = ImageView.ScaleType.CENTER_CROP;
        $r3.setScaleType($r4);
        int $i0 = C10110R.C10112id.intercom_video_thumbnail;
        $r3.setId($i0);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateThumbnailAspectRatio() {
        ImageView $r1 = this.thumbnailImageView;
        ViewGroup.LayoutParams $r2 = $r1.getLayoutParams();
        ImageView $r12 = this.thumbnailImageView;
        int $i0 = $r12.getWidth();
        $r2.height = ($i0 * 3) / 4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void displayThumbnail(String str, C10486i c10486i) {
        ProgressBar $r3 = this.loadingSpinner;
        $r3.setVisibility(0);
        ImageView $r4 = this.thumbnailImageView;
        $r4.setVisibility(4);
        C10483h $r5 = c10486i.m12977i(str);
        C10856g $r6 = new C10856g();
        int $i0 = C10110R.C10111drawable.intercom_video_thumbnail_fallback;
        C10856g $r62 = $r6.m12155Y($i0);
        int $i02 = C10110R.C10111drawable.intercom_video_thumbnail_fallback;
        $r5.m13004b($r62.m12137j($i02));
        C10783c $r7 = C10783c.m12343h();
        $r5.m12986u($r7);
        $r5.m12993n(new InterfaceC10855f<Drawable>() { // from class: io.intercom.android.sdk.blocks.views.VideoPreviewView.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
            public boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC10869h<Drawable> interfaceC10869h, boolean z) {
                VideoPreviewView $r42 = VideoPreviewView.this;
                ProgressBar $r52 = $r42.loadingSpinner;
                $r52.setVisibility(8);
                VideoPreviewView $r43 = VideoPreviewView.this;
                ImageView $r63 = $r43.thumbnailImageView;
                $r63.setVisibility(0);
                VideoPreviewView $r44 = VideoPreviewView.this;
                $r44.updateThumbnailAspectRatio();
                VideoPreviewView $r45 = VideoPreviewView.this;
                ImageView $r64 = $r45.playButton;
                $r64.setVisibility(8);
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: onResourceReady  reason: avoid collision after fix types in other method */
            public boolean onResourceReady2(Drawable drawable, Object obj, InterfaceC10869h interfaceC10869h, EnumC10507a enumC10507a, boolean z) {
                VideoPreviewView $r52 = VideoPreviewView.this;
                ProgressBar $r63 = $r52.loadingSpinner;
                $r63.setVisibility(8);
                VideoPreviewView $r53 = VideoPreviewView.this;
                ImageView $r72 = $r53.thumbnailImageView;
                $r72.setVisibility(0);
                VideoPreviewView $r54 = VideoPreviewView.this;
                $r54.updateThumbnailAspectRatio();
                VideoPreviewView $r55 = VideoPreviewView.this;
                ImageView $r73 = $r55.thumbnailImageView;
                Context $r8 = $r73.getContext();
                int $i03 = C10110R.color.intercom_semi_transparent;
                int $i04 = C1335a.m36324d($r8, $i03);
                VideoPreviewView $r56 = VideoPreviewView.this;
                ImageView $r74 = $r56.thumbnailImageView;
                PorterDuff.Mode $r9 = PorterDuff.Mode.DARKEN;
                $r74.setColorFilter($i04, $r9);
                VideoPreviewView $r57 = VideoPreviewView.this;
                ImageView $r75 = $r57.playButton;
                $r75.setVisibility(0);
                return false;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.com.bumptech.glide.p412p.InterfaceC10855f
            public /* bridge */ /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, InterfaceC10869h<Drawable> interfaceC10869h, EnumC10507a enumC10507a, boolean z) {
                Drawable $r52 = drawable;
                boolean $z0 = onResourceReady2($r52, obj, (InterfaceC10869h) interfaceC10869h, enumC10507a, z);
                return $z0;
            }
        });
        ImageView $r42 = this.thumbnailImageView;
        $r5.m12994l($r42);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ImageView getThumbnailImageView() {
        ImageView r1 = this.thumbnailImageView;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showFailedImage() {
        ImageView $r1 = this.thumbnailImageView;
        $r1.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.views.VideoPreviewView.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public void run() {
                VideoPreviewView $r12 = VideoPreviewView.this;
                ImageView $r2 = $r12.thumbnailImageView;
                VideoPreviewView $r13 = VideoPreviewView.this;
                Context $r3 = $r13.getContext();
                int $i0 = C10110R.C10111drawable.intercom_video_thumbnail_fallback;
                Drawable $r4 = C1335a.m36322f($r3, $i0);
                BackgroundUtils.setBackground($r2, $r4);
            }
        });
    }
}
