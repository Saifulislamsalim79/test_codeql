package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentOverdueLoansListBinding implements InterfaceC8209a {
    public final LinearLayout emptyView;
    public final RecyclerView overdueLoansListRv;
    public final ProgressBar progressBar;
    private final NestedScrollView rootView;
    public final TextView subHeaderText;

    private FragmentOverdueLoansListBinding(NestedScrollView nestedScrollView, LinearLayout linearLayout, RecyclerView recyclerView, ProgressBar progressBar, TextView textView) {
        this.rootView = nestedScrollView;
        this.emptyView = linearLayout;
        this.overdueLoansListRv = recyclerView;
        this.progressBar = progressBar;
        this.subHeaderText = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOverdueLoansListBinding bind(View view) {
        int $i0 = C0220R.C0222id.empty_view;
        View $r1 = view.findViewById($i0);
        LinearLayout $r2 = (LinearLayout) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.overdue_loans_list_rv;
            View $r12 = view.findViewById($i0);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                $i0 = C0220R.C0222id.progress_bar;
                View $r13 = view.findViewById($i0);
                ProgressBar $r4 = (ProgressBar) $r13;
                if ($r4 != null) {
                    $i0 = C0220R.C0222id.sub_header_text;
                    View $r14 = view.findViewById($i0);
                    TextView $r5 = (TextView) $r14;
                    if ($r5 != null) {
                        FragmentOverdueLoansListBinding $r6 = new FragmentOverdueLoansListBinding((NestedScrollView) view, $r2, $r3, $r4, $r5);
                        return $r6;
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
    public static FragmentOverdueLoansListBinding inflate(LayoutInflater layoutInflater) {
        FragmentOverdueLoansListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentOverdueLoansListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_overdue_loans_list;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentOverdueLoansListBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
