package ai.kudi.agent.bills.viewHolders;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.data.AdvertItemTag;
import ai.kudi.agent.bills.data.models.AdvertModel;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.savings.p024ui.SavingsActivity;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
/* compiled from: AdvertViewHolder.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m10421d2 = {"bindViewHolder", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "listOfAdvert", "", "Lai/kudi/agent/bills/data/models/AdvertModel;", "position", "", "app_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AdvertViewHolderKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void bindViewHolder(final Context context, View view, final List list, final int i) {
        int $i2;
        int $i22;
        int $i3;
        int $i23;
        Log_OC.getArray(context, "context");
        Log_OC.getArray(list, "listOfAdvert");
        if (view != null) {
            View $r4 = view.findViewById(C0001R.C0003id.imageView_item_image);
            Log_OC.loadImage($r4, "view.findViewById(R.id.imageView_item_image)");
            ImageView $r5 = (ImageView) $r4;
            View $r42 = view.findViewById(C0001R.C0003id.textView_item_title);
            Log_OC.loadImage($r42, "view.findViewById(R.id.textView_item_title)");
            TextView $r6 = (TextView) $r42;
            View $r43 = view.findViewById(C0001R.C0003id.textView_item_description);
            Log_OC.loadImage($r43, "view.findViewById(R.id.textView_item_description)");
            TextView $r7 = (TextView) $r43;
            Object $r8 = list.get(i);
            String $r10 = ((AdvertModel) $r8).getDescription();
            SpannableString $r3 = new SpannableString($r10);
            Object $r82 = list.get(i);
            AdvertModel $r9 = (AdvertModel) $r82;
            String $r11 = $r9.getTextToBold();
            Object $r83 = list.get(i);
            AdvertModel $r92 = (AdvertModel) $r83;
            String $r12 = $r92.getClickable();
            Object $r84 = list.get(i);
            AdvertModel $r93 = (AdvertModel) $r84;
            int $i1 = $r93.getTextColor();
            Object $r85 = list.get(i);
            AdvertModel $r94 = (AdvertModel) $r85;
            int $i24 = $r94.getIconRes();
            Object $r86 = list.get(i);
            AdvertModel $r95 = (AdvertModel) $r86;
            String $r13 = $r95.getTitle();
            Object $r87 = list.get(i);
            AdvertModel $r96 = (AdvertModel) $r87;
            final AdvertItemTag $r14 = $r96.getTag();
            $r5.setImageResource($i24);
            $r6.setText($r13);
            if ($r11 != null) {
                $i22 = C13277t.m5404W($r10, $r11, 0, false, 6, null);
                $i3 = C13277t.m5404W($r10, $r11, 0, false, 6, null);
                int $i4 = $r11.length();
                SpannableString $r15 = StringExtKt.boldSpan($r10, $i22, $i3 + $i4, $r3);
                String $r102 = $r15.toString();
                Log_OC.loadImage($r102, "boldSpannedDescription.toString()");
                $i23 = C13277t.m5404W($r15, $r12, 0, false, 6, null);
                int $i32 = $r15.length();
                AdvertViewHolderKt$bindViewHolder$clickableSpannedText$1 $r16 = new AdvertViewHolderKt$bindViewHolder$clickableSpannedText$1($r14, context, list, i);
                $r7.setText(StringExtKt.clickableSpan($r102, $i23, $i32, $i1, context, $r3, $r16));
            } else {
                $i2 = C13277t.m5404W($r3, $r12, 0, false, 6, null);
                int $i33 = $r10.length();
                String $r122 = $r3.toString();
                Log_OC.loadImage($r122, "spannableString.toString()");
                AdvertViewHolderKt$bindViewHolder$clickableSpannedText$2 $r17 = new AdvertViewHolderKt$bindViewHolder$clickableSpannedText$2($r14, context);
                $r7.setText(StringExtKt.clickableSpan($r122, $i2, $i33, $i1, context, $r3, $r17));
            }
            MovementMethod $r18 = LinkMovementMethod.getInstance();
            $r7.setMovementMethod($r18);
            view.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.viewHolders.g
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AdvertItemTag $r2 = AdvertItemTag.this;
                    Context $r32 = context;
                    List $r44 = list;
                    int $i0 = i;
                    AdvertViewHolderKt.m39106bindViewHolder$lambda0($r2, $r32, $r44, $i0, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: bindViewHolder$lambda-0  reason: not valid java name */
    public static final void m39106bindViewHolder$lambda0(AdvertItemTag advertItemTag, Context context, List list, int i, View view) {
        Log_OC.getArray(advertItemTag, "$tag");
        Log_OC.getArray(context, "$context");
        Log_OC.getArray(list, "$listOfAdvert");
        AdvertItemTag $r4 = AdvertItemTag.KSHOCK_ELIGIBLE;
        if (advertItemTag == $r4) {
            AdvertViewHolderKt$bindViewHolder$1$1 $r5 = new AdvertViewHolderKt$bindViewHolder$1$1(list, i);
            ContextExtKt.launchActivity$default(context, false, KShockActivity.class, (InterfaceC11767l) $r5, 1, (Object) null);
        }
        AdvertItemTag $r42 = AdvertItemTag.KSHOCK_INELIGIBLE;
        if (advertItemTag == $r42) {
            AdvertViewHolderKt$bindViewHolder$1$2 $r6 = AdvertViewHolderKt$bindViewHolder$1$2.INSTANCE;
            ContextExtKt.launchActivity$default(context, false, KShockActivity.class, (InterfaceC11767l) $r6, 1, (Object) null);
        }
        AdvertItemTag $r43 = AdvertItemTag.SAVINGS;
        if (advertItemTag == $r43) {
            ContextExtKt.launchActivity$default(context, false, SavingsActivity.class, (InterfaceC11767l) null, 5, (Object) null);
        }
    }
}
