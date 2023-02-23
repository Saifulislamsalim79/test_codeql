package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class SupportIssueDialogBinding implements InterfaceC8209a {
    public final Button checkStatusButton;
    public final Button continueButton;
    public final TextView message;
    private final ConstraintLayout rootView;
    public final TextView title;
    public final View viewHeader;

    private SupportIssueDialogBinding(ConstraintLayout constraintLayout, Button button, Button button2, TextView textView, TextView textView2, View view) {
        this.rootView = constraintLayout;
        this.checkStatusButton = button;
        this.continueButton = button2;
        this.message = textView;
        this.title = textView2;
        this.viewHeader = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SupportIssueDialogBinding bind(View view) {
        int $i0 = C0001R.C0003id.checkStatusButton;
        View $r1 = view.findViewById(C0001R.C0003id.checkStatusButton);
        Button $r2 = (Button) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.continueButton;
            View $r12 = view.findViewById(C0001R.C0003id.continueButton);
            Button $r3 = (Button) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.message;
                View $r13 = view.findViewById(C0001R.C0003id.message);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.title;
                    View $r14 = view.findViewById(C0001R.C0003id.title);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.viewHeader;
                        View $r15 = view.findViewById(C0001R.C0003id.viewHeader);
                        if ($r15 != null) {
                            SupportIssueDialogBinding $r6 = new SupportIssueDialogBinding((ConstraintLayout) view, $r2, $r3, $r4, textView, $r15);
                            return $r6;
                        }
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
    public static SupportIssueDialogBinding inflate(LayoutInflater layoutInflater) {
        SupportIssueDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SupportIssueDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.support_issue_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SupportIssueDialogBinding $r3 = bind($r2);
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
