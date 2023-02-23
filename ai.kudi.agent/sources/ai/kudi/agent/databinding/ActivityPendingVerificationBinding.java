package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityPendingVerificationBinding implements InterfaceC8209a {
    public final FrameLayout contentFrameLayout;
    private final LinearLayout rootView;
    public final Toolbar toolbar;

    private ActivityPendingVerificationBinding(LinearLayout linearLayout, FrameLayout frameLayout, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.contentFrameLayout = frameLayout;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPendingVerificationBinding bind(View view) {
        int $i0 = C0001R.C0003id.contentFrameLayout;
        View $r1 = view.findViewById(C0001R.C0003id.contentFrameLayout);
        FrameLayout $r2 = (FrameLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.toolbar;
            View $r12 = view.findViewById(C0001R.C0003id.toolbar);
            Toolbar $r3 = (Toolbar) $r12;
            if ($r3 != null) {
                LinearLayout $r5 = (LinearLayout) view;
                ActivityPendingVerificationBinding $r4 = new ActivityPendingVerificationBinding($r5, $r2, $r3);
                return $r4;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPendingVerificationBinding inflate(LayoutInflater layoutInflater) {
        ActivityPendingVerificationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPendingVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_pending_verification, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityPendingVerificationBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
