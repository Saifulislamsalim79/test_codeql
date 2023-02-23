package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class EmptyHistoryBinding implements InterfaceC8209a {
    public final KudiTextView emptyHistoryTextView;
    public final ImageView faceBookView;
    private final ConstraintLayout rootView;
    public final KudiTextView textView19;

    private EmptyHistoryBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, ImageView imageView, KudiTextView kudiTextView2) {
        this.rootView = constraintLayout;
        this.emptyHistoryTextView = kudiTextView;
        this.faceBookView = imageView;
        this.textView19 = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EmptyHistoryBinding bind(View view) {
        int $i0 = C0038R.C0040id.emptyHistoryTextView;
        View $r1 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.faceBookView;
            View $r12 = view.findViewById($i0);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0038R.C0040id.textView19;
                View $r13 = view.findViewById($i0);
                KudiTextView $r4 = (KudiTextView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    EmptyHistoryBinding $r5 = new EmptyHistoryBinding($r6, $r2, $r3, $r4);
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
    public static EmptyHistoryBinding inflate(LayoutInflater layoutInflater) {
        EmptyHistoryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EmptyHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.empty_history;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        EmptyHistoryBinding $r3 = bind($r2);
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
