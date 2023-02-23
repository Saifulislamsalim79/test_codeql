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
public final class SelectPosFragmentBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final RecyclerView rvPosType;
    public final KudiButton startButton;

    private SelectPosFragmentBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, KudiButton kudiButton) {
        this.rootView = constraintLayout;
        this.rvPosType = recyclerView;
        this.startButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectPosFragmentBinding bind(View view) {
        int $i0 = C0001R.C0003id.rvPosType;
        View $r1 = view.findViewById(C0001R.C0003id.rvPosType);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.startButton;
            View $r12 = view.findViewById(C0001R.C0003id.startButton);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                SelectPosFragmentBinding $r4 = new SelectPosFragmentBinding($r5, $r2, $r3);
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
    public static SelectPosFragmentBinding inflate(LayoutInflater layoutInflater) {
        SelectPosFragmentBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectPosFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.select_pos_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SelectPosFragmentBinding $r3 = bind($r2);
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
