package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ContentConfirmDialogBinding implements InterfaceC8209a {
    public final TextView body;
    public final AppCompatButton cancelButton;
    public final KudiButton okayButton;
    private final CardView rootView;
    public final TextView title;

    private ContentConfirmDialogBinding(CardView cardView, TextView textView, AppCompatButton appCompatButton, KudiButton kudiButton, TextView textView2) {
        this.rootView = cardView;
        this.body = textView;
        this.cancelButton = appCompatButton;
        this.okayButton = kudiButton;
        this.title = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentConfirmDialogBinding bind(View view) {
        int $i0 = C0038R.C0040id.body;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.cancel_button;
            View $r12 = view.findViewById($i0);
            AppCompatButton $r3 = (AppCompatButton) $r12;
            if ($r3 != null) {
                $i0 = C0038R.C0040id.okay_button;
                View $r13 = view.findViewById($i0);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    $i0 = C0038R.C0040id.title;
                    View $r14 = view.findViewById($i0);
                    TextView $r5 = (TextView) $r14;
                    if ($r5 != null) {
                        ContentConfirmDialogBinding $r6 = new ContentConfirmDialogBinding((CardView) view, $r2, $r3, $r4, $r5);
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
    public static ContentConfirmDialogBinding inflate(LayoutInflater layoutInflater) {
        ContentConfirmDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentConfirmDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.content_confirm_dialog;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContentConfirmDialogBinding $r3 = bind($r2);
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
    public CardView getRoot() {
        CardView r1 = this.rootView;
        return r1;
    }
}
