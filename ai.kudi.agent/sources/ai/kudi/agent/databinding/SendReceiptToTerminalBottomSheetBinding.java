package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class SendReceiptToTerminalBottomSheetBinding implements InterfaceC8209a {
    public final ImageView cancelButton;
    public final TextView closeButton;
    public final TextView completeButton;
    public final KudiTextView descriptionTextView;
    public final ImageView iconView;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final TextView titleTextView;

    private SendReceiptToTerminalBottomSheetBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, KudiTextView kudiTextView, ImageView imageView2, ProgressBar progressBar, TextView textView3) {
        this.rootView = constraintLayout;
        this.cancelButton = imageView;
        this.closeButton = textView;
        this.completeButton = textView2;
        this.descriptionTextView = kudiTextView;
        this.iconView = imageView2;
        this.progressBar = progressBar;
        this.titleTextView = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SendReceiptToTerminalBottomSheetBinding bind(View view) {
        int $i0 = C0001R.C0003id.cancelButton;
        View $r1 = view.findViewById(C0001R.C0003id.cancelButton);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.close_button;
            View $r12 = view.findViewById(C0001R.C0003id.close_button);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.complete_button;
                View $r13 = view.findViewById(C0001R.C0003id.complete_button);
                TextView textView = (TextView) $r13;
                if (textView != null) {
                    $i0 = C0001R.C0003id.description_text_view;
                    View $r14 = view.findViewById(C0001R.C0003id.description_text_view);
                    KudiTextView kudiTextView = (KudiTextView) $r14;
                    if (kudiTextView != null) {
                        $i0 = C0001R.C0003id.icon_view;
                        View $r15 = view.findViewById(C0001R.C0003id.icon_view);
                        ImageView imageView = (ImageView) $r15;
                        if (imageView != null) {
                            $i0 = C0001R.C0003id.progress_bar;
                            View $r16 = view.findViewById(C0001R.C0003id.progress_bar);
                            ProgressBar progressBar = (ProgressBar) $r16;
                            if (progressBar != null) {
                                $i0 = C0001R.C0003id.title_text_view;
                                View $r17 = view.findViewById(C0001R.C0003id.title_text_view);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    ConstraintLayout $r10 = (ConstraintLayout) view;
                                    SendReceiptToTerminalBottomSheetBinding $r9 = new SendReceiptToTerminalBottomSheetBinding($r10, $r2, $r3, textView, kudiTextView, imageView, progressBar, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SendReceiptToTerminalBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        SendReceiptToTerminalBottomSheetBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SendReceiptToTerminalBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.send_receipt_to_terminal_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SendReceiptToTerminalBottomSheetBinding $r3 = bind($r2);
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
