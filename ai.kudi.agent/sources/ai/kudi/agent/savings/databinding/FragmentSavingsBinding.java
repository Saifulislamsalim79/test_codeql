package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSavingsBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final RecyclerView rvSavingsTransactionView;
    public final ShimmerFrameLayout shimmerLoader;
    public final TextView tvNoTransaction;
    public final TextView tvTotalSavedHeader;
    public final TextView tvTotalSavingBalance;

    private FragmentSavingsBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.rvSavingsTransactionView = recyclerView;
        this.shimmerLoader = shimmerFrameLayout;
        this.tvNoTransaction = textView;
        this.tvTotalSavedHeader = textView2;
        this.tvTotalSavingBalance = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingsBinding bind(View view) {
        int $i0 = C0456R.C0458id.rvSavingsTransactionView;
        View $r1 = view.findViewById($i0);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.shimmer_loader;
            View $r12 = view.findViewById($i0);
            ShimmerFrameLayout $r3 = (ShimmerFrameLayout) $r12;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.tvNoTransaction;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0456R.C0458id.tvTotalSavedHeader;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0456R.C0458id.tvTotalSavingBalance;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            FragmentSavingsBinding $r7 = new FragmentSavingsBinding((ConstraintLayout) view, $r2, $r3, $r4, textView, textView2);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingsBinding inflate(LayoutInflater layoutInflater) {
        FragmentSavingsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.fragment_savings;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSavingsBinding $r3 = bind($r2);
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
