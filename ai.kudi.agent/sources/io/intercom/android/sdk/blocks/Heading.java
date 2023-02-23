package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.blockInterfaces.HeadingBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.SubheadingBlock;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
/* loaded from: classes.dex */
class Heading implements HeadingBlock, SubheadingBlock {
    private static final int LARGE_MARGIN_BOTTOM_DP = 32;
    private static final int LARGE_TEXT_SP = 24;
    private static final int MARGIN_BOTTOM_DP = 16;
    private static final int MEDIUM_TEXT_SP = 20;
    private static final int SMALL_TEXT_SP = 15;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    /* renamed from: io.intercom.android.sdk.blocks.Heading$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C101811 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            StyleType[] $r5 = StyleType.values();
            int $i0 = $r5.length;
            int[] $r6 = new int[$i0];
            $SwitchMap$io$intercom$android$sdk$blocks$StyleType = $r6;
            try {
                StyleType $r7 = StyleType.POST;
                int $i02 = $r7.ordinal();
                $r6[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                int[] $r62 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r72 = StyleType.NOTE;
                int $i03 = $r72.ordinal();
                $r62[$i03] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                int[] $r63 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r73 = StyleType.ARTICLE;
                int $i04 = $r73.ordinal();
                $r63[$i04] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                int[] $r64 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r74 = StyleType.CONTAINER_CARD;
                int $i05 = $r74.ordinal();
                $r64[$i05] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                int[] $r65 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r75 = StyleType.CHAT_FULL;
                int $i06 = $r75.ordinal();
                $r65[$i06] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Heading(StyleType styleType, Provider provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void styleAnnouncementHeading(TextView textView, int i, int i2, int i3) {
        float $f0 = i2;
        textView.setTextSize($f0);
        textView.setTextColor(i);
        textView.setLinkTextColor(i);
        MovementMethod r3 = new TrackingLinkMovementMethod();
        MovementMethod r4 = r3;
        textView.setMovementMethod(r4);
        BlockUtils.setLargeLineSpacing(textView);
        BlockUtils.setMarginBottom(textView, i3);
    }

    private void styleChatHeading(TextView textView, int i) {
        textView.setTextSize(15.0f);
        textView.setTextColor(i);
        textView.setLinkTextColor(i);
        BlockUtils.setSmallLineSpacing(textView);
        BlockUtils.setDefaultMarginBottom(textView);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.HeadingBlock
    public View addHeading(Spanned spanned, BlockAlignment blockAlignment, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r4 = viewGroup.getContext();
        TextView r12 = new TextView($r4);
        BlockUtils.createLayoutParams(r12, -2, -2);
        Provider $r6 = this.appConfigProvider;
        Object $r7 = $r6.get();
        AppConfig $r8 = (AppConfig) $r7;
        int $i0 = $r8.getPrimaryColor();
        int[] $r9 = C101811.$SwitchMap$io$intercom$android$sdk$blocks$StyleType;
        StyleType $r10 = this.style;
        int $i1 = $r9[$r10.ordinal()];
        if ($i1 == 1) {
            styleAnnouncementHeading(r12, ColorUtils.lightenColor($i0), 24, 32);
            FontUtils.setRobotoLightTypeface(r12);
        } else if ($i1 == 2) {
            styleAnnouncementHeading(r12, $i0, 24, 32);
        } else if ($i1 == 3) {
            Provider $r62 = this.appConfigProvider;
            Object $r72 = $r62.get();
            AppConfig $r82 = (AppConfig) $r72;
            styleAnnouncementHeading(r12, ColorUtils.primaryOrDarkColor($r4, $r82), 24, 32);
        } else if ($i1 == 4) {
            styleAnnouncementHeading(r12, $i0, 20, 32);
        } else if ($i1 != 5) {
            styleChatHeading(r12, C1335a.m36324d($r4, C10110R.color.intercom_grey_800));
            r12.setTypeface(null, 1);
            MovementMethod r13 = new TrackingLinkMovementMethod();
            MovementMethod r14 = r13;
            r12.setMovementMethod(r14);
        } else {
            styleChatHeading(r12, C1335a.m36324d($r4, C10110R.color.intercom_grey_800));
            r12.setTypeface(null, 1);
        }
        r12.setText(spanned);
        r12.setGravity(blockAlignment.getGravity());
        BlockUtils.setLayoutMarginsAndGravity(r12, blockAlignment.getGravity(), z2);
        return r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.SubheadingBlock
    public View addSubheading(Spanned spanned, BlockAlignment blockAlignment, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r4 = viewGroup.getContext();
        TextView r12 = new TextView($r4);
        BlockUtils.createLayoutParams(r12, -2, -2);
        Provider $r6 = this.appConfigProvider;
        Object $r7 = $r6.get();
        AppConfig $r8 = (AppConfig) $r7;
        int $i0 = $r8.getPrimaryColor();
        int[] $r9 = C101811.$SwitchMap$io$intercom$android$sdk$blocks$StyleType;
        StyleType $r10 = this.style;
        int $i1 = $r9[$r10.ordinal()];
        if ($i1 != 1) {
            if ($i1 != 2) {
                if ($i1 == 3) {
                    Provider $r62 = this.appConfigProvider;
                    Object $r72 = $r62.get();
                    AppConfig $r82 = (AppConfig) $r72;
                    styleAnnouncementHeading(r12, ColorUtils.primaryOrDarkColor($r4, $r82), 15, 16);
                } else if ($i1 != 4) {
                    if ($i1 != 5) {
                        styleChatHeading(r12, $i0);
                        MovementMethod r13 = new TrackingLinkMovementMethod();
                        MovementMethod r14 = r13;
                        r12.setMovementMethod(r14);
                    } else {
                        styleChatHeading(r12, C1335a.m36324d($r4, C10110R.color.intercom_grey_800));
                    }
                }
            }
            styleAnnouncementHeading(r12, $i0, 15, 16);
        } else {
            styleAnnouncementHeading(r12, ColorUtils.lightenColor($i0), 15, 16);
            FontUtils.setRobotoLightTypeface(r12);
        }
        r12.setText(spanned);
        r12.setGravity(blockAlignment.getGravity());
        BlockUtils.setLayoutMarginsAndGravity(r12, blockAlignment.getGravity(), z2);
        return r12;
    }
}
