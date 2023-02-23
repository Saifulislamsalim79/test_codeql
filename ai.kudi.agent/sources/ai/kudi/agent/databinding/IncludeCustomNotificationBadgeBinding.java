package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class IncludeCustomNotificationBadgeBinding implements InterfaceC8209a {
    public final TextView badgeCount;
    private final ConstraintLayout rootView;
    public final AppCompatImageView userProfile;

    private IncludeCustomNotificationBadgeBinding(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.badgeCount = textView;
        this.userProfile = appCompatImageView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IncludeCustomNotificationBadgeBinding bind(View view) {
        int $i0 = C0001R.C0003id.badgeCount;
        View $r1 = view.findViewById(C0001R.C0003id.badgeCount);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.userProfile;
            View $r12 = view.findViewById(C0001R.C0003id.userProfile);
            AppCompatImageView $r3 = (AppCompatImageView) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                IncludeCustomNotificationBadgeBinding $r4 = new IncludeCustomNotificationBadgeBinding($r5, $r2, $r3);
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
    public static IncludeCustomNotificationBadgeBinding inflate(LayoutInflater layoutInflater) {
        IncludeCustomNotificationBadgeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IncludeCustomNotificationBadgeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.include_custom_notification_badge, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        IncludeCustomNotificationBadgeBinding $r3 = bind($r2);
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
