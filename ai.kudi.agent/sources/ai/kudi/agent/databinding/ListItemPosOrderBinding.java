package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ListItemPosOrderBinding implements InterfaceC8209a {
    public final TextView posAmountText;
    public final ImageView posIcon;
    public final TextView posOrderTimeText;
    public final TextView posOrderTitle;
    private final ConstraintLayout rootView;

    private ListItemPosOrderBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.posAmountText = textView;
        this.posIcon = imageView;
        this.posOrderTimeText = textView2;
        this.posOrderTitle = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemPosOrderBinding bind(View view) {
        int $i0 = C0001R.C0003id.pos_amount_text;
        View $r1 = view.findViewById(C0001R.C0003id.pos_amount_text);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.pos_icon;
            View $r12 = view.findViewById(C0001R.C0003id.pos_icon);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.pos_order_time_text;
                View $r13 = view.findViewById(C0001R.C0003id.pos_order_time_text);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.pos_order_title;
                    View $r14 = view.findViewById(C0001R.C0003id.pos_order_title);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        ListItemPosOrderBinding $r6 = new ListItemPosOrderBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemPosOrderBinding inflate(LayoutInflater layoutInflater) {
        ListItemPosOrderBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListItemPosOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.list_item_pos_order, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ListItemPosOrderBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
