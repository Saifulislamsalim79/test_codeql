package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.custom.views.CustomBgTextview;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class IncludeBillItemBinding implements InterfaceC8209a {
    public final CustomBgTextview availabilityIndicator;
    public final AppCompatImageView billersImageView;
    public final TextView merchantTextView;
    private final LinearLayout rootView;

    private IncludeBillItemBinding(LinearLayout linearLayout, CustomBgTextview customBgTextview, AppCompatImageView appCompatImageView, TextView textView) {
        this.rootView = linearLayout;
        this.availabilityIndicator = customBgTextview;
        this.billersImageView = appCompatImageView;
        this.merchantTextView = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IncludeBillItemBinding bind(View view) {
        int $i0 = C0038R.C0040id.availability_indicator;
        View $r1 = view.findViewById($i0);
        CustomBgTextview $r2 = (CustomBgTextview) $r1;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.billers_image_view;
            View $r12 = view.findViewById($i0);
            AppCompatImageView $r3 = (AppCompatImageView) $r12;
            if ($r3 != null) {
                $i0 = C0038R.C0040id.merchant_text_view;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    LinearLayout $r6 = (LinearLayout) view;
                    IncludeBillItemBinding $r5 = new IncludeBillItemBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IncludeBillItemBinding inflate(LayoutInflater layoutInflater) {
        IncludeBillItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IncludeBillItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.include_bill_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        IncludeBillItemBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
