package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewDownloadFilteredTransactionBinding implements InterfaceC8209a {
    public final Button cancelButton;
    public final EditText emailEditText;
    public final ProgressBar emailProgressBar;
    public final TextView emailTextView;
    private final ConstraintLayout rootView;
    public final Button sendButton;

    private ViewDownloadFilteredTransactionBinding(ConstraintLayout constraintLayout, Button button, EditText editText, ProgressBar progressBar, TextView textView, Button button2) {
        this.rootView = constraintLayout;
        this.cancelButton = button;
        this.emailEditText = editText;
        this.emailProgressBar = progressBar;
        this.emailTextView = textView;
        this.sendButton = button2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewDownloadFilteredTransactionBinding bind(View view) {
        int $i0 = C0001R.C0003id.cancel_button;
        View $r1 = view.findViewById(C0001R.C0003id.cancel_button);
        Button $r2 = (Button) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.email_edit_text;
            View $r12 = view.findViewById(C0001R.C0003id.email_edit_text);
            EditText $r3 = (EditText) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.email_progress_bar;
                View $r13 = view.findViewById(C0001R.C0003id.email_progress_bar);
                ProgressBar $r4 = (ProgressBar) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.email_text_view;
                    View $r14 = view.findViewById(C0001R.C0003id.email_text_view);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.send_button;
                        View $r15 = view.findViewById(C0001R.C0003id.send_button);
                        Button button = (Button) $r15;
                        if (button != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            ViewDownloadFilteredTransactionBinding $r7 = new ViewDownloadFilteredTransactionBinding($r8, $r2, $r3, $r4, textView, button);
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
    public static ViewDownloadFilteredTransactionBinding inflate(LayoutInflater layoutInflater) {
        ViewDownloadFilteredTransactionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewDownloadFilteredTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_download_filtered_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewDownloadFilteredTransactionBinding $r3 = bind($r2);
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
