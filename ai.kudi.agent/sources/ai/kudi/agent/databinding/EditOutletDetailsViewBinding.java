package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class EditOutletDetailsViewBinding implements InterfaceC8209a {
    public final TextView editProfileView;
    public final ConstraintLayout filledState;
    public final RecyclerView outletMgtProfileRv;
    private final CardView rootView;
    public final KudiTextView textView12;
    public final View view23;

    private EditOutletDetailsViewBinding(CardView cardView, TextView textView, ConstraintLayout constraintLayout, RecyclerView recyclerView, KudiTextView kudiTextView, View view) {
        this.rootView = cardView;
        this.editProfileView = textView;
        this.filledState = constraintLayout;
        this.outletMgtProfileRv = recyclerView;
        this.textView12 = kudiTextView;
        this.view23 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EditOutletDetailsViewBinding bind(View view) {
        int $i0 = C0001R.C0003id.editProfileView;
        View $r1 = view.findViewById(C0001R.C0003id.editProfileView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.filledState;
            View $r12 = view.findViewById(C0001R.C0003id.filledState);
            ConstraintLayout $r3 = (ConstraintLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.outletMgtProfileRv;
                View $r13 = view.findViewById(C0001R.C0003id.outletMgtProfileRv);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.textView12;
                    View $r14 = view.findViewById(C0001R.C0003id.textView12);
                    KudiTextView kudiTextView = (KudiTextView) $r14;
                    if (kudiTextView != null) {
                        $i0 = C0001R.C0003id.view23;
                        View $r15 = view.findViewById(C0001R.C0003id.view23);
                        if ($r15 != null) {
                            EditOutletDetailsViewBinding $r6 = new EditOutletDetailsViewBinding((CardView) view, $r2, $r3, $r4, kudiTextView, $r15);
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
    public static EditOutletDetailsViewBinding inflate(LayoutInflater layoutInflater) {
        EditOutletDetailsViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EditOutletDetailsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.edit_outlet_details_view, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        EditOutletDetailsViewBinding $r3 = bind($r2);
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
    public CardView getRoot() {
        CardView r1 = this.rootView;
        return r1;
    }
}
