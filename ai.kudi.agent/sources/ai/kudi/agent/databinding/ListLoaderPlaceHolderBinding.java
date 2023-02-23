package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ListLoaderPlaceHolderBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final View view15;
    public final View view16;
    public final View view8;

    private ListLoaderPlaceHolderBinding(ConstraintLayout constraintLayout, View view, View view2, View view3) {
        this.rootView = constraintLayout;
        this.view15 = view;
        this.view16 = view2;
        this.view8 = view3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListLoaderPlaceHolderBinding bind(View view) {
        int $i0 = C0001R.C0003id.view15;
        View $r1 = view.findViewById(C0001R.C0003id.view15);
        if ($r1 != null) {
            $i0 = C0001R.C0003id.view16;
            View $r2 = view.findViewById(C0001R.C0003id.view16);
            if ($r2 != null) {
                $i0 = C0001R.C0003id.view8;
                View $r3 = view.findViewById(C0001R.C0003id.view8);
                if ($r3 != null) {
                    ConstraintLayout $r5 = (ConstraintLayout) view;
                    ListLoaderPlaceHolderBinding $r4 = new ListLoaderPlaceHolderBinding($r5, $r1, $r2, $r3);
                    return $r4;
                }
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
    public static ListLoaderPlaceHolderBinding inflate(LayoutInflater layoutInflater) {
        ListLoaderPlaceHolderBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ListLoaderPlaceHolderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.list_loader_place_holder, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ListLoaderPlaceHolderBinding $r3 = bind($r2);
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
