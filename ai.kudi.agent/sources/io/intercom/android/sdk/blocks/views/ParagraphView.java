package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.blocks.BlockAlignment;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
/* loaded from: classes.dex */
public class ParagraphView extends AppCompatTextView {
    private static final int DEFAULT_LINE_SPACING_DP = 2;
    private static final int POST_BOTTOM_MARGIN_DP = 24;
    private static final int POST_LINE_SPACING_DP = 4;

    /* renamed from: io.intercom.android.sdk.blocks.views.ParagraphView$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C102161 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            StyleType[] $r7 = StyleType.values();
            int $i0 = $r7.length;
            int[] $r8 = new int[$i0];
            $SwitchMap$io$intercom$android$sdk$blocks$StyleType = $r8;
            try {
                StyleType $r9 = StyleType.ADMIN;
                int $i02 = $r9.ordinal();
                $r8[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                int[] $r82 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r92 = StyleType.ARTICLE;
                int $i03 = $r92.ordinal();
                $r82[$i03] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                int[] $r83 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r93 = StyleType.NOTE;
                int $i04 = $r93.ordinal();
                $r83[$i04] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                int[] $r84 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r94 = StyleType.CONTAINER_CARD;
                int $i05 = $r94.ordinal();
                $r84[$i05] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                int[] $r85 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r95 = StyleType.POST;
                int $i06 = $r95.ordinal();
                $r85[$i06] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                int[] $r86 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r96 = StyleType.CHAT_FULL;
                int $i07 = $r96.ordinal();
                $r86[$i07] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                int[] $r87 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r97 = StyleType.USER;
                int $i08 = $r97.ordinal();
                $r87[$i08] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ParagraphView(Context context, StyleType styleType, BlockAlignment blockAlignment, AppConfig appConfig) {
        super(context);
        ParagraphView r11 = this;
        BlockUtils.createLayoutParams(r11, -2, -2);
        ParagraphView r112 = this;
        BlockUtils.setDefaultMarginBottom(r112);
        int $i0 = ScreenUtils.dpToPx(2.0f, context);
        float $f0 = $i0;
        ParagraphView r12 = this;
        r12.setLineSpacing($f0, 1.0f);
        ParagraphView r122 = this;
        r122.setTextSize(16.0f);
        ParagraphView r123 = this;
        r123.setTextIsSelectable(false);
        TextUtils.TruncateAt $r6 = TextUtils.TruncateAt.END;
        ParagraphView r124 = this;
        r124.setEllipsize($r6);
        ParagraphView r125 = this;
        r125.setScrollContainer(false);
        ParagraphView r126 = this;
        r126.setFocusable(false);
        ParagraphView r127 = this;
        r127.setClickable(false);
        ParagraphView r128 = this;
        r128.setLongClickable(false);
        int $i02 = blockAlignment.getGravity();
        ParagraphView r129 = this;
        r129.setGravity($i02);
        ParagraphView r1210 = this;
        ViewGroup.LayoutParams $r7 = r1210.getLayoutParams();
        ViewGroup.MarginLayoutParams $r8 = (ViewGroup.MarginLayoutParams) $r7;
        int $i03 = appConfig.getPrimaryColor();
        int[] $r2 = C102161.$SwitchMap$io$intercom$android$sdk$blocks$StyleType;
        int $i1 = styleType.ordinal();
        switch ($r2[$i1]) {
            case 1:
                MovementMethod r10 = new TrackingLinkMovementMethod();
                ParagraphView r1211 = this;
                MovementMethod r13 = r10;
                r1211.setMovementMethod(r13);
                int $i12 = C10110R.color.intercom_grey_800;
                ParagraphView r1212 = this;
                r1212.setTextColor(C1335a.m36324d(context, $i12));
                ParagraphView r1213 = this;
                r1213.setLinkTextColor($i03);
                return;
            case 2:
                MovementMethod r102 = new TrackingLinkMovementMethod();
                ParagraphView r1214 = this;
                MovementMethod r132 = r102;
                r1214.setMovementMethod(r132);
                int $i04 = C10110R.color.intercom_grey_700;
                ParagraphView r1215 = this;
                r1215.setTextColor(C1335a.m36324d(context, $i04));
                int $i05 = ColorUtils.primaryOrDarkColor(context, appConfig);
                ParagraphView r1216 = this;
                r1216.setLinkTextColor($i05);
                return;
            case 3:
            case 4:
                MovementMethod r103 = new TrackingLinkMovementMethod();
                ParagraphView r1217 = this;
                MovementMethod r133 = r103;
                r1217.setMovementMethod(r133);
                int $i13 = C10110R.color.intercom_grey_700;
                ParagraphView r1218 = this;
                r1218.setTextColor(C1335a.m36324d(context, $i13));
                ParagraphView r1219 = this;
                r1219.setLinkTextColor($i03);
                return;
            case 5:
                int $i14 = ScreenUtils.dpToPx(24.0f, context);
                $r8.bottomMargin = $i14;
                MovementMethod r104 = new TrackingLinkMovementMethod();
                ParagraphView r1220 = this;
                MovementMethod r134 = r104;
                r1220.setMovementMethod(r134);
                int $i15 = ScreenUtils.dpToPx(4.0f, context);
                float $f02 = $i15;
                ParagraphView r1221 = this;
                r1221.setLineSpacing($f02, 1.0f);
                int $i16 = C10110R.color.intercom_white;
                ParagraphView r1222 = this;
                r1222.setTextColor(C1335a.m36324d(context, $i16));
                ParagraphView r1223 = this;
                r1223.setLinkTextColor(ColorUtils.lightenColor($i03));
                return;
            case 6:
                ParagraphView r1224 = this;
                r1224.setTextSize(14.0f);
                int $i17 = C10110R.color.intercom_grey_600;
                ParagraphView r1225 = this;
                r1225.setTextColor(C1335a.m36324d(context, $i17));
                ParagraphView r1226 = this;
                r1226.setLinkTextColor($i03);
                return;
            default:
                MovementMethod r105 = new TrackingLinkMovementMethod();
                ParagraphView r1227 = this;
                MovementMethod r135 = r105;
                r1227.setMovementMethod(r135);
                ParagraphView r1228 = this;
                r1228.setIncludeFontPadding(false);
                boolean $z0 = appConfig.primaryColorRenderDarkText();
                ParagraphView r1229 = this;
                ColorUtils.setTextColorWhiteOrDark(r1229, $z0);
                return;
        }
    }
}
