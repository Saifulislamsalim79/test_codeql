package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewUsersAuthDialogBinding implements InterfaceC8209a {
    public final Button authorizeButton;
    public final TextView errorTextView;
    public final TextView instructionTextView;
    public final ProgressBar loadingProgressBar;
    public final TextInputEditText passwordEditText;
    public final TextInputLayout passwordEditTextLayout;
    private final LinearLayout rootView;

    private ViewUsersAuthDialogBinding(LinearLayout linearLayout, Button button, TextView textView, TextView textView2, ProgressBar progressBar, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.rootView = linearLayout;
        this.authorizeButton = button;
        this.errorTextView = textView;
        this.instructionTextView = textView2;
        this.loadingProgressBar = progressBar;
        this.passwordEditText = textInputEditText;
        this.passwordEditTextLayout = textInputLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersAuthDialogBinding bind(View view) {
        int $i0 = C0001R.C0003id.authorizeButton;
        View $r1 = view.findViewById(C0001R.C0003id.authorizeButton);
        Button $r2 = (Button) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.errorTextView;
            View $r12 = view.findViewById(C0001R.C0003id.errorTextView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.instructionTextView;
                View $r13 = view.findViewById(C0001R.C0003id.instructionTextView);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.loadingProgressBar;
                    View $r14 = view.findViewById(C0001R.C0003id.loadingProgressBar);
                    ProgressBar progressBar = (ProgressBar) $r14;
                    if (progressBar != null) {
                        $i0 = C0001R.C0003id.passwordEditText;
                        View $r15 = view.findViewById(C0001R.C0003id.passwordEditText);
                        TextInputEditText textInputEditText = (TextInputEditText) $r15;
                        if (textInputEditText != null) {
                            $i0 = C0001R.C0003id.passwordEditTextLayout;
                            View $r16 = view.findViewById(C0001R.C0003id.passwordEditTextLayout);
                            TextInputLayout textInputLayout = (TextInputLayout) $r16;
                            if (textInputLayout != null) {
                                LinearLayout $r9 = (LinearLayout) view;
                                ViewUsersAuthDialogBinding $r8 = new ViewUsersAuthDialogBinding($r9, $r2, $r3, textView, progressBar, textInputEditText, textInputLayout);
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
    public static ViewUsersAuthDialogBinding inflate(LayoutInflater layoutInflater) {
        ViewUsersAuthDialogBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewUsersAuthDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_users_auth_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewUsersAuthDialogBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
