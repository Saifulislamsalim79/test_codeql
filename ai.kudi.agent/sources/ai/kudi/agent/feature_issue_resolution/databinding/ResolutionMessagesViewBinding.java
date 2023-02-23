package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ResolutionMessagesViewBinding implements InterfaceC8209a {
    public final KudiTextView emptyResolutionText;
    public final ImageView emptyResolutionView;
    public final RecyclerView resolutionMessagesRecyclerView;
    private final ConstraintLayout rootView;
    public final KudiTextView textView21;
    public final View view20;

    private ResolutionMessagesViewBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, ImageView imageView, RecyclerView recyclerView, KudiTextView kudiTextView2, View view) {
        this.rootView = constraintLayout;
        this.emptyResolutionText = kudiTextView;
        this.emptyResolutionView = imageView;
        this.resolutionMessagesRecyclerView = recyclerView;
        this.textView21 = kudiTextView2;
        this.view20 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResolutionMessagesViewBinding bind(View view) {
        View $r1;
        int $i0 = C0214R.C0216id.emptyResolutionText;
        View $r12 = view.findViewById($i0);
        KudiTextView $r2 = (KudiTextView) $r12;
        if ($r2 != null) {
            $i0 = C0214R.C0216id.emptyResolutionView;
            View $r13 = view.findViewById($i0);
            ImageView $r3 = (ImageView) $r13;
            if ($r3 != null) {
                $i0 = C0214R.C0216id.resolutionMessagesRecyclerView;
                View $r14 = view.findViewById($i0);
                RecyclerView $r4 = (RecyclerView) $r14;
                if ($r4 != null) {
                    $i0 = C0214R.C0216id.textView21;
                    View $r15 = view.findViewById($i0);
                    KudiTextView kudiTextView = (KudiTextView) $r15;
                    if (kudiTextView != null && ($r1 = view.findViewById(($i0 = C0214R.C0216id.view20))) != null) {
                        ResolutionMessagesViewBinding $r6 = new ResolutionMessagesViewBinding((ConstraintLayout) view, $r2, $r3, $r4, kudiTextView, $r1);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResolutionMessagesViewBinding inflate(LayoutInflater layoutInflater) {
        ResolutionMessagesViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ResolutionMessagesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.resolution_messages_view;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ResolutionMessagesViewBinding $r3 = bind($r2);
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
