package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.feature_kshock.C0220R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityKShockBinding implements InterfaceC8209a {
    public final EmptyHistoryBinding emptyView;
    public final ProgressBar kshockProgressBar;
    private final ConstraintLayout rootView;
    public final FrameLayout screenContent;

    private ActivityKShockBinding(ConstraintLayout constraintLayout, EmptyHistoryBinding emptyHistoryBinding, ProgressBar progressBar, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.emptyView = emptyHistoryBinding;
        this.kshockProgressBar = progressBar;
        this.screenContent = frameLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityKShockBinding bind(View view) {
        int $i0 = C0220R.C0222id.emptyView;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            EmptyHistoryBinding $r2 = EmptyHistoryBinding.bind($r1);
            $i0 = C0220R.C0222id.kshock_progress_bar;
            ProgressBar $r3 = (ProgressBar) view.findViewById($i0);
            if ($r3 != null) {
                $i0 = C0220R.C0222id.screen_content;
                FrameLayout $r4 = (FrameLayout) view.findViewById($i0);
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    ActivityKShockBinding $r5 = new ActivityKShockBinding($r6, $r2, $r3, $r4);
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
    public static ActivityKShockBinding inflate(LayoutInflater layoutInflater) {
        ActivityKShockBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityKShockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.activity_k_shock;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityKShockBinding $r3 = bind($r2);
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
