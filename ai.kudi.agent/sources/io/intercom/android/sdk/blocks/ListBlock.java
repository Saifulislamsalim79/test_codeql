package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.blockInterfaces.OrderedListBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.UnorderedListBlock;
import io.intercom.android.sdk.commons.utilities.HtmlCompat;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.spans.OrderedListSpan;
import io.intercom.android.sdk.spans.UnorderedListSpan;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
import java.util.List;
/* loaded from: classes.dex */
class ListBlock implements OrderedListBlock, UnorderedListBlock {
    private static final int LARGE_TEXT_SIZE_SP = 16;
    private static final int SMALL_TEXT_SIZE_SP = 14;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.blocks.ListBlock$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C101851 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            StyleType[] $r6 = StyleType.values();
            int $i0 = $r6.length;
            int[] $r7 = new int[$i0];
            $SwitchMap$io$intercom$android$sdk$blocks$StyleType = $r7;
            try {
                StyleType $r8 = StyleType.ADMIN;
                int $i02 = $r8.ordinal();
                $r7[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                int[] $r72 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r82 = StyleType.ARTICLE;
                int $i03 = $r82.ordinal();
                $r72[$i03] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                int[] $r73 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r83 = StyleType.NOTE;
                int $i04 = $r83.ordinal();
                $r73[$i04] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                int[] $r74 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r84 = StyleType.CONTAINER_CARD;
                int $i05 = $r84.ordinal();
                $r74[$i05] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                int[] $r75 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r85 = StyleType.POST;
                int $i06 = $r85.ordinal();
                $r75[$i06] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                int[] $r76 = $SwitchMap$io$intercom$android$sdk$blocks$StyleType;
                StyleType $r86 = StyleType.CHAT_FULL;
                int $i07 = $r86.ordinal();
                $r76[$i07] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListBlock(StyleType styleType, Provider provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TextView getListStyledTextView(Context context) {
        TextView r9 = new TextView(context);
        Provider $r3 = this.appConfigProvider;
        Object $r4 = $r3.get();
        AppConfig $r5 = (AppConfig) $r4;
        int $i0 = $r5.getPrimaryColor();
        r9.setLinkTextColor($i0);
        BlockUtils.createLayoutParams(r9, -2, -2);
        BlockUtils.setMarginLeft(r9, 4);
        int[] $r6 = C101851.$SwitchMap$io$intercom$android$sdk$blocks$StyleType;
        StyleType $r7 = this.style;
        int $i02 = $r7.ordinal();
        switch ($r6[$i02]) {
            case 1:
                int $i03 = C10110R.color.intercom_grey_800;
                styleAsChatList(r9, C1335a.m36324d(context, $i03));
                MovementMethod r10 = new TrackingLinkMovementMethod();
                MovementMethod r11 = r10;
                r9.setMovementMethod(r11);
                return r9;
            case 2:
            case 3:
            case 4:
                int $i04 = C10110R.color.intercom_grey_700;
                styleAsAnnouncementList(r9, C1335a.m36324d(context, $i04));
                MovementMethod r102 = new TrackingLinkMovementMethod();
                MovementMethod r112 = r102;
                r9.setMovementMethod(r112);
                return r9;
            case 5:
                int $i05 = C10110R.color.intercom_white;
                styleAsAnnouncementList(r9, C1335a.m36324d(context, $i05));
                MovementMethod r103 = new TrackingLinkMovementMethod();
                MovementMethod r113 = r103;
                r9.setMovementMethod(r113);
                return r9;
            case 6:
                int $i06 = C10110R.color.intercom_grey_800;
                styleAsChatList(r9, C1335a.m36324d(context, $i06));
                return r9;
            default:
                int $i07 = C10110R.color.intercom_white;
                styleAsChatList(r9, C1335a.m36324d(context, $i07));
                MovementMethod r104 = new TrackingLinkMovementMethod();
                MovementMethod r114 = r104;
                r9.setMovementMethod(r114);
                return r9;
        }
    }

    private void styleAsAnnouncementList(TextView textView, int i) {
        textView.setTextSize(16.0f);
        textView.setTextColor(i);
        BlockUtils.setMarginBottom(textView, 16);
        BlockUtils.setLargeLineSpacing(textView);
    }

    private void styleAsChatList(TextView textView, int i) {
        textView.setTextSize(14.0f);
        textView.setTextColor(i);
        BlockUtils.setDefaultMarginBottom(textView);
        BlockUtils.setSmallLineSpacing(textView);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.OrderedListBlock
    public View addOrderedList(List list, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r3 = viewGroup.getContext();
        TextView $r4 = getListStyledTextView($r3);
        Resources $r5 = viewGroup.getResources();
        int $i0 = C10110R.dimen.intercom_list_indentation;
        float $f0 = $r5.getDimension($i0);
        int $i02 = (int) $f0;
        int $i1 = list.size();
        Object $r6 = "";
        int $i2 = 0;
        while ($i2 < $i1) {
            Object $r7 = list.get($i2);
            String $r8 = (String) $r7;
            boolean $z1 = $r8.isEmpty();
            if (!$z1) {
                int $i3 = $i1 - 1;
                String $r9 = $i2 < $i3 ? "<br />" : "";
                Spanned $r11 = HtmlCompat.fromHtml($r8 + $r9);
                SpannableString r17 = new SpannableString($r11);
                StringBuilder r16 = new StringBuilder();
                int $i32 = $i2 + 1;
                r16.append($i32);
                r16.append(".");
                OrderedListSpan r18 = new OrderedListSpan($i02, r16.toString());
                int $i33 = $r11.length();
                r17.setSpan(r18, 0, $i33, 0);
                Object[] $r14 = {$r6, r17};
                CharSequence[] r19 = (CharSequence[]) $r14;
                $r6 = TextUtils.concat(r19);
            }
            $i2++;
        }
        CharSequence $r15 = (CharSequence) $r6;
        $r4.setText($r15);
        BlockUtils.setLayoutMarginsAndGravity($r4, 3, z2);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.UnorderedListBlock
    public View addUnorderedList(List list, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r3 = viewGroup.getContext();
        TextView $r4 = getListStyledTextView($r3);
        Resources $r5 = viewGroup.getResources();
        int $i0 = C10110R.dimen.intercom_list_indentation;
        float $f0 = $r5.getDimension($i0);
        int $i02 = (int) $f0;
        int $i1 = list.size();
        Object $r6 = "";
        int $i2 = 0;
        while ($i2 < $i1) {
            Object $r7 = list.get($i2);
            String $r8 = (String) $r7;
            boolean $z1 = $r8.isEmpty();
            if (!$z1) {
                int $i3 = $i1 - 1;
                String $r9 = $i2 < $i3 ? "<br />" : "";
                Spanned $r11 = HtmlCompat.fromHtml($r8 + $r9);
                SpannableString r17 = new SpannableString($r11);
                UnorderedListSpan r18 = new UnorderedListSpan($i02, $r3);
                int $i32 = $r11.length();
                r17.setSpan(r18, 0, $i32, 0);
                Object[] $r14 = {$r6, r17};
                CharSequence[] r19 = (CharSequence[]) $r14;
                $r6 = TextUtils.concat(r19);
            }
            $i2++;
        }
        CharSequence $r15 = (CharSequence) $r6;
        $r4.setText($r15);
        BlockUtils.setLayoutMarginsAndGravity($r4, 3, z2);
        return $r4;
    }
}
