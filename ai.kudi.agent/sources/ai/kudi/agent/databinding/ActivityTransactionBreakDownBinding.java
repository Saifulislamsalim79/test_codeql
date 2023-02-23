package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityTransactionBreakDownBinding implements InterfaceC8209a {
    public final RecyclerView breakDownRecyclerview;
    public final TextView errorTextView;
    public final ProgressBar progressBar;
    public final Button retryButton;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;

    private ActivityTransactionBreakDownBinding(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, TextView textView, ProgressBar progressBar, Button button, Toolbar toolbar) {
        this.rootView = coordinatorLayout;
        this.breakDownRecyclerview = recyclerView;
        this.errorTextView = textView;
        this.progressBar = progressBar;
        this.retryButton = button;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionBreakDownBinding bind(View view) {
        int $i0 = C0001R.C0003id.break_down_recyclerview;
        View $r1 = view.findViewById(C0001R.C0003id.break_down_recyclerview);
        RecyclerView $r2 = (RecyclerView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.error_text_view;
            View $r12 = view.findViewById(C0001R.C0003id.error_text_view);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.progress_bar;
                View $r13 = view.findViewById(C0001R.C0003id.progress_bar);
                ProgressBar $r4 = (ProgressBar) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.retry_button;
                    View $r14 = view.findViewById(C0001R.C0003id.retry_button);
                    Button button = (Button) $r14;
                    if (button != null) {
                        $i0 = C0001R.C0003id.toolbar;
                        View $r15 = view.findViewById(C0001R.C0003id.toolbar);
                        Toolbar toolbar = (Toolbar) $r15;
                        if (toolbar != null) {
                            CoordinatorLayout $r8 = (CoordinatorLayout) view;
                            ActivityTransactionBreakDownBinding $r7 = new ActivityTransactionBreakDownBinding($r8, $r2, $r3, $r4, button, toolbar);
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
    public static ActivityTransactionBreakDownBinding inflate(LayoutInflater layoutInflater) {
        ActivityTransactionBreakDownBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityTransactionBreakDownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_transaction_break_down, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityTransactionBreakDownBinding $r3 = bind($r2);
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
    public CoordinatorLayout getRoot() {
        CoordinatorLayout r1 = this.rootView;
        return r1;
    }
}
