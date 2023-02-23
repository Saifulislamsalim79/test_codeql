package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentDisplayTermsBinding implements InterfaceC8209a {
    private final FrameLayout rootView;
    public final RecyclerView rvTAndC;

    private FragmentDisplayTermsBinding(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.rvTAndC = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDisplayTermsBinding bind(View view) {
        View $r1 = view.findViewById(C0001R.C0003id.rvTAndC);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            FrameLayout $r4 = (FrameLayout) view;
            FragmentDisplayTermsBinding $r3 = new FragmentDisplayTermsBinding($r4, $r2);
            return $r3;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName(C0001R.C0003id.rvTAndC);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDisplayTermsBinding inflate(LayoutInflater layoutInflater) {
        FragmentDisplayTermsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDisplayTermsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_display_terms, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentDisplayTermsBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        FrameLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public FrameLayout getRoot() {
        FrameLayout r1 = this.rootView;
        return r1;
    }
}
