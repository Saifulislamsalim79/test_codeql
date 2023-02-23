package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutKtaItemBinding implements InterfaceC8209a {
    public final TextView ktaAccountNameView;
    public final TextView ktaAccountNoView;
    public final TextView ktaBankView;
    public final TextView ktaCopyView;
    public final View ktaItemDivider;
    private final ConstraintLayout rootView;

    private LayoutKtaItemBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.rootView = constraintLayout;
        this.ktaAccountNameView = textView;
        this.ktaAccountNoView = textView2;
        this.ktaBankView = textView3;
        this.ktaCopyView = textView4;
        this.ktaItemDivider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutKtaItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.ktaAccountNameView;
        View $r1 = view.findViewById(C0001R.C0003id.ktaAccountNameView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.ktaAccountNoView;
            View $r12 = view.findViewById(C0001R.C0003id.ktaAccountNoView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.ktaBankView;
                View $r13 = view.findViewById(C0001R.C0003id.ktaBankView);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.ktaCopyView;
                    View $r14 = view.findViewById(C0001R.C0003id.ktaCopyView);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.kta_item_divider;
                        View $r15 = view.findViewById(C0001R.C0003id.kta_item_divider);
                        if ($r15 != null) {
                            LayoutKtaItemBinding $r6 = new LayoutKtaItemBinding((ConstraintLayout) view, $r2, $r3, $r4, textView, $r15);
                            return $r6;
                        }
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
    public static LayoutKtaItemBinding inflate(LayoutInflater layoutInflater) {
        LayoutKtaItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutKtaItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.layout_kta_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutKtaItemBinding $r3 = bind($r2);
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
