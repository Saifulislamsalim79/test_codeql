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
public final class LayoutRecentTransfersListItemBinding implements InterfaceC8209a {
    public final TextView accountName;
    public final TextView bankDetails;
    public final TextView header;
    private final ConstraintLayout rootView;
    public final View sideImage;

    private LayoutRecentTransfersListItemBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = constraintLayout;
        this.accountName = textView;
        this.bankDetails = textView2;
        this.header = textView3;
        this.sideImage = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutRecentTransfersListItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountName;
        View $r1 = view.findViewById(C0001R.C0003id.accountName);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.bankDetails;
            View $r12 = view.findViewById(C0001R.C0003id.bankDetails);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.header;
                View $r13 = view.findViewById(C0001R.C0003id.header);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.side_image;
                    View $r14 = view.findViewById(C0001R.C0003id.side_image);
                    if ($r14 != null) {
                        LayoutRecentTransfersListItemBinding $r5 = new LayoutRecentTransfersListItemBinding((ConstraintLayout) view, $r2, $r3, $r4, $r14);
                        return $r5;
                    }
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
    public static LayoutRecentTransfersListItemBinding inflate(LayoutInflater layoutInflater) {
        LayoutRecentTransfersListItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutRecentTransfersListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.layout_recent_transfers_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutRecentTransfersListItemBinding $r3 = bind($r2);
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
