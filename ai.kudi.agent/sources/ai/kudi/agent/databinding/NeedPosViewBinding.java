package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class NeedPosViewBinding implements InterfaceC8209a {
    public final KudiButton actionButton;
    public final TextView activateTerminalButton;
    public final TextView needPosMessageView;
    private final ConstraintLayout rootView;
    public final TextView textView58;

    private NeedPosViewBinding(ConstraintLayout constraintLayout, KudiButton kudiButton, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.actionButton = kudiButton;
        this.activateTerminalButton = textView;
        this.needPosMessageView = textView2;
        this.textView58 = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NeedPosViewBinding bind(View view) {
        int $i0 = C0001R.C0003id.actionButton;
        View $r1 = view.findViewById(C0001R.C0003id.actionButton);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.activateTerminalButton;
            View $r12 = view.findViewById(C0001R.C0003id.activateTerminalButton);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.need_pos_message_view;
                View $r13 = view.findViewById(C0001R.C0003id.need_pos_message_view);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.textView58;
                    View $r14 = view.findViewById(C0001R.C0003id.textView58);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        NeedPosViewBinding $r6 = new NeedPosViewBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
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
    public static NeedPosViewBinding inflate(LayoutInflater layoutInflater) {
        NeedPosViewBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NeedPosViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.need_pos_view, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        NeedPosViewBinding $r3 = bind($r2);
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
