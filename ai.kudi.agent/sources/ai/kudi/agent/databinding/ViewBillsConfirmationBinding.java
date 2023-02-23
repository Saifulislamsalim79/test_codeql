package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewBillsConfirmationBinding implements InterfaceC8209a {
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final CheckBox serviceFeeCheckBox;
    public final TextView serviceFeeTextView;
    public final Button submitButton;
    public final TextView textView3;

    private ViewBillsConfirmationBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, CheckBox checkBox, TextView textView, Button button, TextView textView2) {
        this.rootView = constraintLayout;
        this.progressBar = progressBar;
        this.serviceFeeCheckBox = checkBox;
        this.serviceFeeTextView = textView;
        this.submitButton = button;
        this.textView3 = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewBillsConfirmationBinding bind(View view) {
        int $i0 = C0001R.C0003id.progressBar;
        View $r1 = view.findViewById(C0001R.C0003id.progressBar);
        ProgressBar $r2 = (ProgressBar) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.serviceFeeCheckBox;
            View $r12 = view.findViewById(C0001R.C0003id.serviceFeeCheckBox);
            CheckBox $r3 = (CheckBox) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.serviceFeeTextView;
                View $r13 = view.findViewById(C0001R.C0003id.serviceFeeTextView);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.submitButton;
                    View $r14 = view.findViewById(C0001R.C0003id.submitButton);
                    Button button = (Button) $r14;
                    if (button != null) {
                        $i0 = C0001R.C0003id.textView3;
                        View $r15 = view.findViewById(C0001R.C0003id.textView3);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            ViewBillsConfirmationBinding $r7 = new ViewBillsConfirmationBinding($r8, $r2, $r3, $r4, button, textView);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewBillsConfirmationBinding inflate(LayoutInflater layoutInflater) {
        ViewBillsConfirmationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewBillsConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_bills_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewBillsConfirmationBinding $r3 = bind($r2);
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
