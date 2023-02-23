package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentStepThreeBinding implements InterfaceC8209a {
    public final RecyclerView recyclerViewSummary;
    private final ConstraintLayout rootView;
    public final KudiButton sendButton;

    private FragmentStepThreeBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, KudiButton kudiButton) {
        this.rootView = constraintLayout;
        this.recyclerViewSummary = recyclerView;
        this.sendButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentStepThreeBinding bind(View view) {
        int $i0 = C0001R.C0003id.recyclerView_summary;
        View $r1 = view.findViewById(C0001R.C0003id.recyclerView_summary);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.sendButton;
            View $r12 = view.findViewById(C0001R.C0003id.sendButton);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                FragmentStepThreeBinding $r4 = new FragmentStepThreeBinding($r5, $r2, $r3);
                return $r4;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentStepThreeBinding inflate(LayoutInflater layoutInflater) {
        FragmentStepThreeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentStepThreeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_step_three, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentStepThreeBinding $r3 = bind($r2);
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
