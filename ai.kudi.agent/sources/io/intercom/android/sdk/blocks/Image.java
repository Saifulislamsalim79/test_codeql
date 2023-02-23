package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.widget.ImageView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.views.ResizableImageView;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.p412p.C10856g;
/* loaded from: classes.dex */
class Image {
    private final StyleType style;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.blocks.Image$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C101821 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            StyleType[] $r8 = StyleType.values();
            int $i0 = $r8.length;
            int[] $r9 = new int[$i0];
            $SwitchMap$io$intercom$android$sdk$blocks$StyleType = $r9;
            try {
                StyleType $r10 = StyleType.USER;
                int $i02 = $r10.ordinal();
                $r9[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                int[] $r92 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r102 = StyleType.ADMIN;
                int $i03 = $r102.ordinal();
                $r92[$i03] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                int[] $r93 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r103 = StyleType.PREVIEW;
                int $i04 = $r103.ordinal();
                $r93[$i04] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                int[] $r94 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r104 = StyleType.POST;
                int $i05 = $r104.ordinal();
                $r94[$i05] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                int[] $r95 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r105 = StyleType.ARTICLE;
                int $i06 = $r105.ordinal();
                $r95[$i06] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                int[] $r96 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r106 = StyleType.NOTE;
                int $i07 = $r106.ordinal();
                $r96[$i07] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                int[] $r97 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r107 = StyleType.CONTAINER_CARD;
                int $i08 = $r107.ordinal();
                $r97[$i08] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                int[] $r98 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r108 = StyleType.CHAT_FULL;
                int $i09 = $r108.ordinal();
                $r98[$i09] = 8;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Image(StyleType styleType) {
        this.style = styleType;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int calculateChatFullPadding(Context context) {
        Resources $r2 = context.getResources();
        int $i0 = C10110R.dimen.intercom_chat_overlay_width;
        float $f0 = $r2.getDimension($i0);
        int $i02 = C10110R.dimen.intercom_chat_overlay_padding_right;
        float $f1 = $r2.getDimension($i02);
        int $i03 = C10110R.dimen.intercom_chat_overlay_text_margin_left;
        float $f2 = $r2.getDimension($i03);
        int $i04 = C10110R.dimen.intercom_chat_overlay_text_padding_left;
        float $f3 = $r2.getDimension($i04);
        int $i05 = C10110R.dimen.intercom_chat_overlay_text_padding_right;
        float $f4 = $r2.getDimension($i05);
        float $f32 = $f1 + $f2 + $f3 + $f4;
        Point $r3 = ScreenUtils.getScreenDimensions(context);
        int $i06 = $r3.x;
        float $f42 = $i06;
        int $i07 = (int) ($f42 - ($f0 - $f32));
        return $i07;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int getTotalViewPadding(Context context) {
        Resources $r2 = context.getResources();
        int[] $r3 = C101821.$SwitchMap$io$intercom$android$sdk$blocks$StyleType;
        StyleType $r4 = this.style;
        int $i0 = $r4.ordinal();
        switch ($r3[$i0]) {
            case 1:
            case 2:
            case 3:
                int $i02 = C10110R.dimen.intercom_avatar_size;
                float $f1 = $r2.getDimension($i02);
                int $i03 = C10110R.dimen.intercom_conversation_row_icon_spacer;
                float $f3 = $r2.getDimension($i03);
                int $i04 = C10110R.dimen.intercom_conversation_row_margin;
                float $f0 = $r2.getDimension($i04);
                int $i05 = C10110R.dimen.intercom_cell_horizontal_padding;
                float $f2 = $r2.getDimension($i05);
                int $i06 = (int) ($f1 + $f3 + $f0 + ($f2 * 3.0f));
                return $i06;
            case 4:
                int $i07 = C10110R.dimen.intercom_cell_content_padding;
                float $f22 = $r2.getDimension($i07);
                int $i08 = C10110R.dimen.intercom_post_cell_padding;
                float $f02 = $r2.getDimension($i08);
                int $i09 = (int) ($f22 + $f02);
                return $i09 * 2;
            case 5:
            case 6:
                int $i010 = C10110R.dimen.intercom_cell_content_padding;
                float $f03 = $r2.getDimension($i010);
                int $i011 = C10110R.dimen.intercom_note_cell_padding;
                float $f12 = $r2.getDimension($i011);
                int $i012 = C10110R.dimen.intercom_note_layout_margin;
                float $f23 = $r2.getDimension($i012);
                int $i013 = (int) ($f03 + $f12 + $f23);
                return $i013 * 2;
            case 7:
                int $i014 = C10110R.dimen.intercom_cell_content_padding;
                float $f04 = $r2.getDimension($i014);
                int $i015 = C10110R.dimen.intercom_note_cell_padding;
                float $f13 = $r2.getDimension($i015);
                int $i016 = C10110R.dimen.intercom_note_layout_margin;
                float $f24 = $r2.getDimension($i016);
                int $i017 = (int) ($f04 + $f13 + $f24);
                return $i017 * 2;
            case 8:
                int $i018 = calculateChatFullPadding(context);
                return $i018;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public StyleType getStyle() {
        StyleType r1 = this.style;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setBackground(ImageView imageView) {
        int $i0 = C10110R.C10111drawable.intercom_rounded_image_preview;
        imageView.setBackgroundResource($i0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setImageViewBounds(int i, int i2, ResizableImageView resizableImageView, C10483h c10483h) {
        ResizableImageView r7 = resizableImageView;
        Context $r3 = r7.getContext();
        int $i2 = getTotalViewPadding($r3);
        resizableImageView.setTotalViewPadding($i2);
        resizableImageView.setDisplayImageDimensions(i, i2);
        Point $r4 = resizableImageView.getImageDimens();
        int $i0 = $r4.x;
        if ($i0 > 0) {
            int $i02 = $r4.y;
            if ($i02 > 0) {
                C10856g r6 = new C10856g();
                int $i03 = $r4.x;
                int $i1 = $r4.y;
                C10856g $r5 = r6.m12156X($i03, $i1);
                c10483h.m13004b($r5);
            }
        }
    }
}
