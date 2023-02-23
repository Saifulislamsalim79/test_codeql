package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ContentTransactionHelpBinding implements InterfaceC8209a {
    public final ImageView directionIcon;
    private final ConstraintLayout rootView;
    public final KudiTextView titleTextView;

    private ContentTransactionHelpBinding(ConstraintLayout constraintLayout, ImageView imageView, KudiTextView kudiTextView) {
        this.rootView = constraintLayout;
        this.directionIcon = imageView;
        this.titleTextView = kudiTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentTransactionHelpBinding bind(View view) {
        int $i0 = C0214R.C0216id.direction_icon;
        View $r1 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.title_text_view;
            View $r12 = view.findViewById($i0);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                ConstraintLayout $r5 = (ConstraintLayout) view;
                ContentTransactionHelpBinding $r4 = new ContentTransactionHelpBinding($r5, $r2, $r3);
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
    public static ContentTransactionHelpBinding inflate(LayoutInflater layoutInflater) {
        ContentTransactionHelpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentTransactionHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.content_transaction_help;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContentTransactionHelpBinding $r3 = bind($r2);
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
