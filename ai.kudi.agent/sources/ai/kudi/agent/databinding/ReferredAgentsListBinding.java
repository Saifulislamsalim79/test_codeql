package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.custom.views.CustomBgTextview;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ReferredAgentsListBinding implements InterfaceC8209a {
    public final ProgressBar bottomReferralProgressBar;
    public final KudiTextView emptyReferral;
    public final CustomBgTextview filterAction;
    public final ConstraintLayout header;
    public final TextView headerTitle;
    public final ProgressBar referralProgressBar;
    public final RecyclerView referralRecyclerView;
    private final ConstraintLayout rootView;

    private ReferredAgentsListBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, KudiTextView kudiTextView, CustomBgTextview customBgTextview, ConstraintLayout constraintLayout2, TextView textView, ProgressBar progressBar2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.bottomReferralProgressBar = progressBar;
        this.emptyReferral = kudiTextView;
        this.filterAction = customBgTextview;
        this.header = constraintLayout2;
        this.headerTitle = textView;
        this.referralProgressBar = progressBar2;
        this.referralRecyclerView = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ReferredAgentsListBinding bind(View view) {
        int $i0 = C0001R.C0003id.bottomReferralProgressBar;
        View $r1 = view.findViewById(C0001R.C0003id.bottomReferralProgressBar);
        ProgressBar $r2 = (ProgressBar) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.emptyReferral;
            View $r12 = view.findViewById(C0001R.C0003id.emptyReferral);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.filterAction;
                View $r13 = view.findViewById(C0001R.C0003id.filterAction);
                CustomBgTextview customBgTextview = (CustomBgTextview) $r13;
                if (customBgTextview != null) {
                    $i0 = C0001R.C0003id.header;
                    View $r14 = view.findViewById(C0001R.C0003id.header);
                    ConstraintLayout constraintLayout = (ConstraintLayout) $r14;
                    if (constraintLayout != null) {
                        $i0 = C0001R.C0003id.header_title;
                        View $r15 = view.findViewById(C0001R.C0003id.header_title);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.referralProgressBar;
                            View $r16 = view.findViewById(C0001R.C0003id.referralProgressBar);
                            ProgressBar progressBar = (ProgressBar) $r16;
                            if (progressBar != null) {
                                $i0 = C0001R.C0003id.referralRecyclerView;
                                View $r17 = view.findViewById(C0001R.C0003id.referralRecyclerView);
                                RecyclerView $r8 = (RecyclerView) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    ReferredAgentsListBinding $r9 = new ReferredAgentsListBinding($r10, $r2, $r3, customBgTextview, constraintLayout, textView, progressBar, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ReferredAgentsListBinding inflate(LayoutInflater layoutInflater) {
        ReferredAgentsListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ReferredAgentsListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.referred_agents_list, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ReferredAgentsListBinding $r3 = bind($r2);
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
