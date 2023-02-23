package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.keypad.PinpadView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAmountInputBinding implements InterfaceC8209a {
    public final RecyclerView amountSuggestionRecyclerView;
    public final ConstraintLayout containerAcctDetail;
    public final FloatingActionButton fabNext;
    public final View footer;
    public final ProgressBar ivLoader;
    public final PinpadView keyboard;
    private final ConstraintLayout rootView;
    public final TextView tvAccountName;
    public final TextView tvAcctDetail;
    public final TextView tvAmount;
    public final TextView tvDesc;
    public final TextView tvEdit;
    public final TextView tvEnterAmtLabel;

    private FragmentAmountInputBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, FloatingActionButton floatingActionButton, View view, ProgressBar progressBar, PinpadView pinpadView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.amountSuggestionRecyclerView = recyclerView;
        this.containerAcctDetail = constraintLayout2;
        this.fabNext = floatingActionButton;
        this.footer = view;
        this.ivLoader = progressBar;
        this.keyboard = pinpadView;
        this.tvAccountName = textView;
        this.tvAcctDetail = textView2;
        this.tvAmount = textView3;
        this.tvDesc = textView4;
        this.tvEdit = textView5;
        this.tvEnterAmtLabel = textView6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAmountInputBinding bind(View view) {
        int $i0 = C0001R.C0003id.amountSuggestionRecyclerView;
        View $r1 = view.findViewById(C0001R.C0003id.amountSuggestionRecyclerView);
        RecyclerView recyclerView = (RecyclerView) $r1;
        if (recyclerView != null) {
            $i0 = C0001R.C0003id.container_acct_detail;
            View $r12 = view.findViewById(C0001R.C0003id.container_acct_detail);
            ConstraintLayout constraintLayout = (ConstraintLayout) $r12;
            if (constraintLayout != null) {
                $i0 = C0001R.C0003id.fab_next;
                View $r13 = view.findViewById(C0001R.C0003id.fab_next);
                FloatingActionButton floatingActionButton = (FloatingActionButton) $r13;
                if (floatingActionButton != null) {
                    $i0 = C0001R.C0003id.footer;
                    View $r14 = view.findViewById(C0001R.C0003id.footer);
                    if ($r14 != null) {
                        $i0 = C0001R.C0003id.iv_loader;
                        View $r5 = view.findViewById(C0001R.C0003id.iv_loader);
                        ProgressBar progressBar = (ProgressBar) $r5;
                        if (progressBar != null) {
                            $i0 = C0001R.C0003id.keyboard;
                            View $r52 = view.findViewById(C0001R.C0003id.keyboard);
                            PinpadView pinpadView = (PinpadView) $r52;
                            if (pinpadView != null) {
                                $i0 = C0001R.C0003id.tv_account_name;
                                View $r53 = view.findViewById(C0001R.C0003id.tv_account_name);
                                TextView $r8 = (TextView) $r53;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.tv_acct_detail;
                                    View $r54 = view.findViewById(C0001R.C0003id.tv_acct_detail);
                                    TextView $r9 = (TextView) $r54;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.tv_amount;
                                        View $r55 = view.findViewById(C0001R.C0003id.tv_amount);
                                        TextView $r10 = (TextView) $r55;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.tv_desc;
                                            View $r56 = view.findViewById(C0001R.C0003id.tv_desc);
                                            TextView $r11 = (TextView) $r56;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.tv_edit;
                                                View $r57 = view.findViewById(C0001R.C0003id.tv_edit);
                                                TextView $r122 = (TextView) $r57;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.tv_enter_amt_label;
                                                    View $r58 = view.findViewById(C0001R.C0003id.tv_enter_amt_label);
                                                    TextView $r132 = (TextView) $r58;
                                                    if ($r132 != null) {
                                                        ConstraintLayout $r15 = (ConstraintLayout) view;
                                                        FragmentAmountInputBinding $r142 = new FragmentAmountInputBinding($r15, recyclerView, constraintLayout, floatingActionButton, $r14, progressBar, pinpadView, $r8, $r9, $r10, $r11, $r122, $r132);
                                                        return $r142;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r16 = view.getResources();
        String $r17 = $r16.getResourceName($i0);
        NullPointerException $r18 = new NullPointerException("Missing required view with ID: ".concat($r17));
        throw $r18;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAmountInputBinding inflate(LayoutInflater layoutInflater) {
        FragmentAmountInputBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAmountInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_amount_input, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAmountInputBinding $r3 = bind($r2);
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
