package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityInboxBinding implements InterfaceC8209a {
    public final FrameLayout inboxContainerFrameLayout;
    private final ConstraintLayout rootView;

    private ActivityInboxBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.inboxContainerFrameLayout = frameLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityInboxBinding bind(View view) {
        View $r1 = view.findViewById(C0001R.C0003id.inboxContainerFrameLayout);
        FrameLayout $r2 = (FrameLayout) $r1;
        if ($r2 != null) {
            ConstraintLayout $r4 = (ConstraintLayout) view;
            ActivityInboxBinding $r3 = new ActivityInboxBinding($r4, $r2);
            return $r3;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName(C0001R.C0003id.inboxContainerFrameLayout);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityInboxBinding inflate(LayoutInflater layoutInflater) {
        ActivityInboxBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityInboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_inbox, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityInboxBinding $r3 = bind($r2);
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
