package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityCashWithdrawalOptionBinding implements InterfaceC8209a {
    public final FrameLayout contentFrameLayout;
    public final ViewLoaderBinding loader;
    private final FrameLayout rootView;
    public final Toolbar toolbar;

    private ActivityCashWithdrawalOptionBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ViewLoaderBinding viewLoaderBinding, Toolbar toolbar) {
        this.rootView = frameLayout;
        this.contentFrameLayout = frameLayout2;
        this.loader = viewLoaderBinding;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityCashWithdrawalOptionBinding bind(View view) {
        int $i0 = C0001R.C0003id.contentFrameLayout;
        FrameLayout $r2 = (FrameLayout) view.findViewById(C0001R.C0003id.contentFrameLayout);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.loader;
            View $r1 = view.findViewById(C0001R.C0003id.loader);
            if ($r1 != null) {
                ViewLoaderBinding $r3 = ViewLoaderBinding.bind($r1);
                Toolbar $r4 = (Toolbar) view.findViewById(C0001R.C0003id.toolbar);
                if ($r4 != null) {
                    FrameLayout $r6 = (FrameLayout) view;
                    ActivityCashWithdrawalOptionBinding $r5 = new ActivityCashWithdrawalOptionBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
                $i0 = C0001R.C0003id.toolbar;
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
    public static ActivityCashWithdrawalOptionBinding inflate(LayoutInflater layoutInflater) {
        ActivityCashWithdrawalOptionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityCashWithdrawalOptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_cash_withdrawal_option, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityCashWithdrawalOptionBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        FrameLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public FrameLayout getRoot() {
        FrameLayout r1 = this.rootView;
        return r1;
    }
}
