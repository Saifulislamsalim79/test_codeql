package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class LayoutOverdueLoanStatusItemBinding implements InterfaceC8209a {
    public final RecyclerView loanStatusRv;
    private final RecyclerView rootView;

    private LayoutOverdueLoanStatusItemBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.loanStatusRv = recyclerView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutOverdueLoanStatusItemBinding bind(View view) {
        if (view == null) {
            NullPointerException $r3 = new NullPointerException("rootView");
            throw $r3;
        }
        RecyclerView $r1 = (RecyclerView) view;
        LayoutOverdueLoanStatusItemBinding $r2 = new LayoutOverdueLoanStatusItemBinding($r1, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutOverdueLoanStatusItemBinding inflate(LayoutInflater layoutInflater) {
        LayoutOverdueLoanStatusItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LayoutOverdueLoanStatusItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.layout_overdue_loan_status_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        LayoutOverdueLoanStatusItemBinding $r3 = bind($r2);
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
    public RecyclerView getRoot() {
        RecyclerView r1 = this.rootView;
        return r1;
    }
}
