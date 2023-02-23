package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ContentInboxBinding implements InterfaceC8209a {
    public final KudiTextView amountTextView;
    public final KudiTextView dateTextView;
    public final TextView issueTypeTextView;
    private final ConstraintLayout rootView;
    public final KudiTextView statusTextView;
    public final KudiTextView statusView;
    public final KudiTextView ticketTitleTextView;

    private ContentInboxBinding(ConstraintLayout constraintLayout, KudiTextView kudiTextView, KudiTextView kudiTextView2, TextView textView, KudiTextView kudiTextView3, KudiTextView kudiTextView4, KudiTextView kudiTextView5) {
        this.rootView = constraintLayout;
        this.amountTextView = kudiTextView;
        this.dateTextView = kudiTextView2;
        this.issueTypeTextView = textView;
        this.statusTextView = kudiTextView3;
        this.statusView = kudiTextView4;
        this.ticketTitleTextView = kudiTextView5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentInboxBinding bind(View view) {
        int $i0 = C0001R.C0003id.amountTextView;
        View $r1 = view.findViewById(C0001R.C0003id.amountTextView);
        KudiTextView $r2 = (KudiTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.dateTextView;
            View $r12 = view.findViewById(C0001R.C0003id.dateTextView);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.issueTypeTextView;
                View $r13 = view.findViewById(C0001R.C0003id.issueTypeTextView);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.statusTextView;
                    View $r14 = view.findViewById(C0001R.C0003id.statusTextView);
                    KudiTextView kudiTextView = (KudiTextView) $r14;
                    if (kudiTextView != null) {
                        $i0 = C0001R.C0003id.statusView;
                        View $r15 = view.findViewById(C0001R.C0003id.statusView);
                        KudiTextView kudiTextView2 = (KudiTextView) $r15;
                        if (kudiTextView2 != null) {
                            $i0 = C0001R.C0003id.ticketTitleTextView;
                            View $r16 = view.findViewById(C0001R.C0003id.ticketTitleTextView);
                            KudiTextView kudiTextView3 = (KudiTextView) $r16;
                            if (kudiTextView3 != null) {
                                ConstraintLayout $r9 = (ConstraintLayout) view;
                                ContentInboxBinding $r8 = new ContentInboxBinding($r9, $r2, $r3, textView, kudiTextView, kudiTextView2, kudiTextView3);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentInboxBinding inflate(LayoutInflater layoutInflater) {
        ContentInboxBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentInboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.content_inbox, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContentInboxBinding $r3 = bind($r2);
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
