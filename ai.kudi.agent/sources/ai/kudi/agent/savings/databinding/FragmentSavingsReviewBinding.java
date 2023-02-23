package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSavingsReviewBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;
    public final RecyclerView rvSavingsReview;
    public final KudiButton startButton;
    public final TextView textView9;
    public final TextView tvReviewMessage;

    private FragmentSavingsReviewBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, KudiButton kudiButton, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.rvSavingsReview = recyclerView;
        this.startButton = kudiButton;
        this.textView9 = textView;
        this.tvReviewMessage = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingsReviewBinding bind(View view) {
        int $i0 = C0456R.C0458id.rvSavingsReview;
        View $r1 = view.findViewById($i0);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.startButton;
            View $r12 = view.findViewById($i0);
            KudiButton $r3 = (KudiButton) $r12;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.textView9;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0456R.C0458id.tvReviewMessage;
                    View $r14 = view.findViewById($i0);
                    TextView $r5 = (TextView) $r14;
                    if ($r5 != null) {
                        FragmentSavingsReviewBinding $r6 = new FragmentSavingsReviewBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
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
    public static FragmentSavingsReviewBinding inflate(LayoutInflater layoutInflater) {
        FragmentSavingsReviewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSavingsReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.fragment_savings_review;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSavingsReviewBinding $r3 = bind($r2);
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
