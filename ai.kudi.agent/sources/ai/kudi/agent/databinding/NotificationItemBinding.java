package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class NotificationItemBinding implements InterfaceC8209a {
    public final ConstraintLayout constraintLayout;
    public final KudiTextView messageView;
    private final ConstraintLayout rootView;
    public final KudiTextView timeView;
    public final KudiTextView typeView;

    private NotificationItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, KudiTextView kudiTextView, KudiTextView kudiTextView2, KudiTextView kudiTextView3) {
        this.rootView = constraintLayout;
        this.constraintLayout = constraintLayout2;
        this.messageView = kudiTextView;
        this.timeView = kudiTextView2;
        this.typeView = kudiTextView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NotificationItemBinding bind(View view) {
        ConstraintLayout $r1 = (ConstraintLayout) view;
        int $i0 = C0001R.C0003id.messageView;
        View $r2 = view.findViewById(C0001R.C0003id.messageView);
        KudiTextView $r3 = (KudiTextView) $r2;
        if ($r3 != null) {
            $i0 = C0001R.C0003id.timeView;
            View $r22 = view.findViewById(C0001R.C0003id.timeView);
            KudiTextView $r4 = (KudiTextView) $r22;
            if ($r4 != null) {
                $i0 = C0001R.C0003id.typeView;
                View $r23 = view.findViewById(C0001R.C0003id.typeView);
                KudiTextView kudiTextView = (KudiTextView) $r23;
                if (kudiTextView != null) {
                    NotificationItemBinding $r6 = new NotificationItemBinding($r1, $r1, $r3, $r4, kudiTextView);
                    return $r6;
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
    public static NotificationItemBinding inflate(LayoutInflater layoutInflater) {
        NotificationItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NotificationItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.notification_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        NotificationItemBinding $r3 = bind($r2);
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
