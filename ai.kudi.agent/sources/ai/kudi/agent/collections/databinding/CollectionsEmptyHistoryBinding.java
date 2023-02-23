package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class CollectionsEmptyHistoryBinding implements InterfaceC8209a {
    public final TextView emptyHistoryTextView;
    public final ImageView faceBookView;
    private final ConstraintLayout rootView;
    public final TextView textView19;

    private CollectionsEmptyHistoryBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.rootView = constraintLayout;
        this.emptyHistoryTextView = textView;
        this.faceBookView = imageView;
        this.textView19 = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CollectionsEmptyHistoryBinding bind(View view) {
        int $i0 = R$id.emptyHistoryTextView;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = R$id.faceBookView;
            View $r12 = view.findViewById($i0);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = R$id.textView19;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    CollectionsEmptyHistoryBinding $r5 = new CollectionsEmptyHistoryBinding($r6, $r2, $r3, $r4);
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
    public static CollectionsEmptyHistoryBinding inflate(LayoutInflater layoutInflater) {
        CollectionsEmptyHistoryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CollectionsEmptyHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.collections_empty_history;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        CollectionsEmptyHistoryBinding $r3 = bind($r2);
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
