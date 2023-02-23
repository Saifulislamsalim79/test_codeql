package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.savings.C0456R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivitySavingsBinding implements InterfaceC8209a {
    public final ErrorLayoutBinding errorLayout;
    public final FrameLayout flSavingsContainer;
    public final ProgressBar loader;
    private final ConstraintLayout rootView;

    private ActivitySavingsBinding(ConstraintLayout constraintLayout, ErrorLayoutBinding errorLayoutBinding, FrameLayout frameLayout, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.errorLayout = errorLayoutBinding;
        this.flSavingsContainer = frameLayout;
        this.loader = progressBar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivitySavingsBinding bind(View view) {
        int $i0 = C0456R.C0458id.errorLayout;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            ErrorLayoutBinding $r2 = ErrorLayoutBinding.bind($r1);
            $i0 = C0456R.C0458id.flSavingsContainer;
            FrameLayout $r3 = (FrameLayout) view.findViewById($i0);
            if ($r3 != null) {
                $i0 = C0456R.C0458id.loader;
                ProgressBar $r4 = (ProgressBar) view.findViewById($i0);
                if ($r4 != null) {
                    ConstraintLayout $r6 = (ConstraintLayout) view;
                    ActivitySavingsBinding $r5 = new ActivitySavingsBinding($r6, $r2, $r3, $r4);
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
    public static ActivitySavingsBinding inflate(LayoutInflater layoutInflater) {
        ActivitySavingsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivitySavingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.activity_savings;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivitySavingsBinding $r3 = bind($r2);
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
