package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ResolutionMessagesItemBinding implements InterfaceC8209a {
    public final KudiTextView commentAuthorText;
    public final KudiTextView dateTextView;
    public final KudiTextView resolutionMessageView;
    private final ConstraintLayout rootView;
    public final View view21;

    private ResolutionMessagesItemBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, KudiTextView kudiTextView2, KudiTextView kudiTextView3, View view) {
        this.rootView = constraintLayout;
        this.commentAuthorText = kudiTextView;
        this.dateTextView = kudiTextView2;
        this.resolutionMessageView = kudiTextView3;
        this.view21 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResolutionMessagesItemBinding bind(View view) {
        View $r1;
        int $i0 = C0214R.C0216id.commentAuthorText;
        View $r12 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r12;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.dateTextView;
            View $r13 = view.findViewById($i0);
            KudiTextView $r3 = (KudiTextView) $r13;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.resolutionMessageView;
                View $r14 = view.findViewById($i0);
                KudiTextView $r4 = (KudiTextView) $r14;
                if ($r4 != null && ($r1 = view.findViewById(($i0 = C0214R.C0216id.view21))) != null) {
                    ResolutionMessagesItemBinding $r5 = new ResolutionMessagesItemBinding((ConstraintLayout) view, $r2, $r3, $r4, $r1);
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
    public static ResolutionMessagesItemBinding inflate(LayoutInflater layoutInflater) {
        ResolutionMessagesItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResolutionMessagesItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.resolution_messages_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ResolutionMessagesItemBinding $r3 = bind($r2);
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
